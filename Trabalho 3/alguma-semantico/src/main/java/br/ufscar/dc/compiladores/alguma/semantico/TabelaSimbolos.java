package br.ufscar.dc.compiladores.alguma.semantico;

import java.util.HashMap;
import java.util.Map;

public class TabelaSimbolos {
    public enum TipoAlguma {
        //Tipo de variavel
        INTEIRO,
        REAL,
        LITERAL,
        LOGICO,
        TIPO,
        //Estruturas
        FUNCAO,
        PROCEDIMENTO,
        PONTEIRO, 
        IDENT,
        INVALIDO
    }
    
    class EntradaTabelaDeSimbolos {
        private TipoAlguma tipo;

        public EntradaTabelaDeSimbolos(String nome, TipoAlguma tipo) {
            this.tipo = tipo;
        }

        public EntradaTabelaDeSimbolos(TipoAlguma tipo) {
            this.tipo = tipo;
        }
    }
    
    private final Map<String, EntradaTabelaDeSimbolos> tabela;
    
    public TabelaSimbolos() {
        this.tabela = new HashMap<>();
    }
    
    public void adicionar(String nome, TipoAlguma tipo) {
        EntradaTabelaDeSimbolos ets = new EntradaTabelaDeSimbolos(tipo);
        tabela.put(nome, ets);
    }
    
    public boolean existe(String nome) {
        return tabela.containsKey(nome);
    }
    
    public TipoAlguma verificar(String nome) {
        return tabela.get(nome).tipo;
    }
}
