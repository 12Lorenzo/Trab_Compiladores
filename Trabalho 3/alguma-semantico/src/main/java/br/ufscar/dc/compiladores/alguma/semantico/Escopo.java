package br.ufscar.dc.compiladores.alguma.semantico;

import java.util.LinkedList;
import java.util.List;

public class Escopo {
    private LinkedList<TabelaSimbolos> pilha; //empilhando tabelas

    public Escopo(){
        pilha = new LinkedList<>();
        criar();
    }

    public void criar(){
        pilha.push(new TabelaSimbolos());
    }

    public TabelaSimbolos getEscopo(){
        return pilha.peek();
    }

    public List<TabelaSimbolos> getPilha(){
        return pilha;
    }

    public void dropEscopo(){
        pilha.pop();
    }
}
