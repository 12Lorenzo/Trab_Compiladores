package br.ufscar.dc.compiladores.alguma.semantico;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import java.io.PrintWriter;
import java.util.BitSet;

public class MyCustomErrorListener implements ANTLRErrorListener {
   PrintWriter pw;
   boolean sintError = false;
   public MyCustomErrorListener(PrintWriter pw) {
       this.pw = pw;    
   }

    @Override
    public void	reportAmbiguity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, boolean exact, BitSet ambigAlts, ATNConfigSet configs) {
       
    }
    
    @Override
    public void reportAttemptingFullContext(Parser recognizer, DFA dfa, int startIndex, int stopIndex, BitSet conflictingAlts, ATNConfigSet configs) {
        
    }

    @Override
    public void reportContextSensitivity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, int prediction, ATNConfigSet configs) {
        
    }

    @Override
    public void	syntaxError(Recognizer<?,?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        // Colocar o tratamento de erro customizado

        if(sintError == false){
            Token t = (Token) offendingSymbol;

            String Text = t.getText();

            if (Text == "<EOF>"){
                Text = "EOF";
            }

            pw.println("Linha "+line+": erro sintatico proximo a "+ t.getText());
            sintError = true;
        }
    }
}