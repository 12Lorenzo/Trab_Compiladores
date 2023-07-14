package br.ufscar.dc.compiladores.alguma.semantico;

import br.ufscar.dc.compiladores.alguma.semantico.AlgumaBaseListener;
import br.ufscar.dc.compiladores.alguma.semantico.TabelaSimbolos.TipoAlguma;

import br.ufscar.dc.compiladores.alguma.semantico.AlgumaParser.CmdAtribuicaoContext;
import br.ufscar.dc.compiladores.alguma.semantico.AlgumaParser.CmdLeiaContext;
import br.ufscar.dc.compiladores.alguma.semantico.AlgumaParser.Declaracao_constanteContext;
import br.ufscar.dc.compiladores.alguma.semantico.AlgumaParser.Declaracao_globalContext;
import br.ufscar.dc.compiladores.alguma.semantico.AlgumaParser.Declaracao_localContext;
import br.ufscar.dc.compiladores.alguma.semantico.AlgumaParser.Declaracao_tipoContext;
import br.ufscar.dc.compiladores.alguma.semantico.AlgumaParser.Declaracao_variavelContext;
import br.ufscar.dc.compiladores.alguma.semantico.AlgumaParser.IdentificadorContext;
import br.ufscar.dc.compiladores.alguma.semantico.AlgumaParser.ProgramaContext;
import br.ufscar.dc.compiladores.alguma.semantico.AlgumaParser.Tipo_basico_identContext;

import br.ufscar.dc.compiladores.alguma.semantico.AlgumaParser;

public class AlgumaSemantico extends AlgumaBaseVisitor{
    TabelaSimbolos tabela;
    Escopo escopos = new Escopo();

    @Override
    public Object visitPrograma(ProgramaContext ctx) {
        return super.visitPrograma(ctx);
    }

    @Override
    public Object visitDeclaracao_constante(Declaracao_constanteContext ctx) {
        TabelaSimbolos escopoAtual = escopos.getEscopo();
        if (escopoAtual.existe(ctx.IDENT().getText())) {
            AlgumaSemanticoUtil.adicionarErroSemantico(ctx.start, "constante" + ctx.IDENT().getText()
                    + " ja declarado anteriormente");
        } else {
            TabelaSimbolos.TipoAlguma tipo = TabelaSimbolos.TipoAlguma.INTEIRO;
            switch(ctx.tipo_basico().getText()) {
               case "literal": 
                        tipo = TabelaSimbolos.TipoAlguma.LITERAL;
                        break;
               case "inteiro": 
                        tipo = TabelaSimbolos.TipoAlguma.INTEIRO;
                        break;
               case "real": 
                        tipo = TabelaSimbolos.TipoAlguma.REAL;
                        break;
               case "logico": 
                        tipo = TabelaSimbolos.TipoAlguma.LOGICO;
                        break;
            }
            escopoAtual.adicionar(ctx.IDENT().getText(), tipo);
        }

        return super.visitDeclaracao_constante(ctx);
    }

    @Override
    public Object visitDeclaracao_tipo(Declaracao_tipoContext ctx) {
        TabelaSimbolos escopoAtual = escopos.getEscopo();
        if (escopoAtual.existe(ctx.IDENT().getText())) {
             AlgumaSemanticoUtil.adicionarErroSemantico(ctx.start, "tipo " + ctx.IDENT().getText()
                    + " declarado duas vezes num mesmo escopo");
        } else {
            escopoAtual.adicionar(ctx.IDENT().getText(), TabelaSimbolos.TipoAlguma.TIPO);
        }
        return super.visitDeclaracao_tipo(ctx);
    }

    @Override
    public Object visitDeclaracao_variavel(Declaracao_variavelContext ctx) {
        TabelaSimbolos escopoAtual = escopos.getEscopo();
        for (IdentificadorContext id : ctx.variavel().identificador()) {
            if (escopoAtual.existe(id.getText())) {
                AlgumaSemanticoUtil.adicionarErroSemantico(id.start, "identificador " + id.getText()
                        + " ja declarado anteriormente");
            } else {
                TabelaSimbolos.TipoAlguma tipo = TabelaSimbolos.TipoAlguma.INTEIRO;
                switch(ctx.variavel().tipo().getText()) {
                case "literal": 
                            tipo = TabelaSimbolos.TipoAlguma.LITERAL;
                            break;
                case "inteiro": 
                            tipo = TabelaSimbolos.TipoAlguma.INTEIRO;
                            break;
                case "real": 
                            tipo = TabelaSimbolos.TipoAlguma.REAL;
                            break;
                case "logico": 
                            tipo = TabelaSimbolos.TipoAlguma.LOGICO;
                            break;
                }
                escopoAtual.adicionar(id.getText(), tipo);
            }
        }
        return super.visitDeclaracao_variavel(ctx);
    }

    @Override
    public Object visitDeclaracao_global(Declaracao_globalContext ctx) {
         TabelaSimbolos escopoAtual = escopos.getEscopo();
        if (escopoAtual.existe(ctx.IDENT().getText())) {
            AlgumaSemanticoUtil.adicionarErroSemantico(ctx.start, ctx.IDENT().getText()
                    + " ja declarado anteriormente");
        } else {
            escopoAtual.adicionar(ctx.IDENT().getText(), TabelaSimbolos.TipoAlguma.TIPO);
        }
        return super.visitDeclaracao_global(ctx);
    }


    @Override
    public Object visitTipo_basico_ident(Tipo_basico_identContext ctx) {
        if(ctx.IDENT() != null){
            for(TabelaSimbolos escopo : escopos.getPilha()) {
                if(!escopo.existe(ctx.IDENT().getText())) {
                    AlgumaSemanticoUtil.adicionarErroSemantico(ctx.start, "tipo " + ctx.IDENT().getText()
                            + " nao declarado");
                }
            }
        }
        return super.visitTipo_basico_ident(ctx);
    }

    @Override
    public Object visitIdentificador(IdentificadorContext ctx) {
        for(TabelaSimbolos escopo : escopos.getPilha()) {
            if(!escopo.existe(ctx.IDENT(0).getText())) {
                AlgumaSemanticoUtil.adicionarErroSemantico(ctx.start, "identificador " + ctx.IDENT(0).getText()
                        + " nao declarado");
            }
        }
        return super.visitIdentificador(ctx);
    }

    @Override
    public Object visitCmdAtribuicao(CmdAtribuicaoContext ctx) {
        TabelaSimbolos.TipoAlguma tipoExpressao = AlgumaSemanticoUtil.verificarTipo(escopos, ctx.expressao());
        boolean error = false;
        String nomeVar = ctx.identificador().getText();
        if (tipoExpressao != TabelaSimbolos.TipoAlguma.INVALIDO) {
            for(TabelaSimbolos escopo : escopos.getPilha()){
                if (escopo.existe(nomeVar))  {
                    TabelaSimbolos.TipoAlguma tipoVariavel = AlgumaSemanticoUtil.verificarTipo(escopos, nomeVar);
                    Boolean varNumeric = tipoVariavel == TabelaSimbolos.TipoAlguma.REAL || tipoVariavel == TabelaSimbolos.TipoAlguma.INTEIRO;
                    Boolean expNumeric = tipoExpressao == TabelaSimbolos.TipoAlguma.REAL || tipoExpressao == TabelaSimbolos.TipoAlguma.INTEIRO;
                    if  (!(varNumeric && expNumeric) && tipoVariavel != tipoExpressao && tipoExpressao != TabelaSimbolos.TipoAlguma.INVALIDO) {
                        error = true;
                    }
                } 
            }
        } else{
            error = true;
        }

        if(error)
            AlgumaSemanticoUtil.adicionarErroSemantico(ctx.identificador().start, "atribuicao nao compativel para " + nomeVar );

        return super.visitCmdAtribuicao(ctx);
    }
}
