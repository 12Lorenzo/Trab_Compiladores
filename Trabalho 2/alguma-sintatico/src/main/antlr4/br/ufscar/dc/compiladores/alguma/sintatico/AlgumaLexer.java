// Generated from Alguma.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AlgumaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ALGORITMO=1, FIM_ALGORITMO=2, DECLARE=3, CONSTANTE=4, LOGICO=5, TRUE=6, 
		FALSE=7, LITERAL=8, INTEIRO=9, REAL=10, AND=11, OR=12, NOT=13, IF=14, 
		ENDIF=15, THEN=16, ELSE=17, CASO=18, FIM_CASO=19, SEJA=20, PARA=21, FIM_PARA=22, 
		ATE=23, FACA=24, WHILE=25, ENDWHILE=26, REGISTRO=27, FIM_REGISTRO=28, 
		PROCEDIMENTO=29, FIM_PROCEDIMENTO=30, FUNCAO=31, FIM_FUNCAO=32, RETORNE=33, 
		ESCREVA=34, TIPO=35, VAR=36, LEIA=37, DELIM=38, ABREPAR=39, FECHAPAR=40, 
		ABRECHAVE=41, FECHACHAVE=42, VIRGULA=43, ASPAS=44, MENOR=45, MENORIGUAL=46, 
		MAIOR=47, MAIORIGUAL=48, IGUAL=49, DIFERENTE=50, INTERVALO=51, SOMA=52, 
		SUBTRACAO=53, MULTIPLICACAO=54, DIVISAO=55, MOD=56, ATRIBUICAO=57, PONTEIRO=58, 
		ENDERECO=59, PONTO=60, NUM_INT=61, NUM_REAL=62, IDENT=63, CADEIA=64, CADEIA_NAO_FECHADA=65, 
		WS=66, COMENTARIO=67, COMENTARIO_NAO_FECHADO=68, ERRO=69;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ALGORITMO", "FIM_ALGORITMO", "DECLARE", "CONSTANTE", "LOGICO", "TRUE", 
			"FALSE", "LITERAL", "INTEIRO", "REAL", "AND", "OR", "NOT", "IF", "ENDIF", 
			"THEN", "ELSE", "CASO", "FIM_CASO", "SEJA", "PARA", "FIM_PARA", "ATE", 
			"FACA", "WHILE", "ENDWHILE", "REGISTRO", "FIM_REGISTRO", "PROCEDIMENTO", 
			"FIM_PROCEDIMENTO", "FUNCAO", "FIM_FUNCAO", "RETORNE", "ESCREVA", "TIPO", 
			"VAR", "LEIA", "DELIM", "ABREPAR", "FECHAPAR", "ABRECHAVE", "FECHACHAVE", 
			"VIRGULA", "ASPAS", "MENOR", "MENORIGUAL", "MAIOR", "MAIORIGUAL", "IGUAL", 
			"DIFERENTE", "INTERVALO", "SOMA", "SUBTRACAO", "MULTIPLICACAO", "DIVISAO", 
			"MOD", "ATRIBUICAO", "PONTEIRO", "ENDERECO", "PONTO", "NUM_INT", "NUM_REAL", 
			"IDENT", "CADEIA", "CADEIA_NAO_FECHADA", "WS", "COMENTARIO", "COMENTARIO_NAO_FECHADO", 
			"ERRO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'algoritmo'", "'fim_algoritmo'", "'declare'", "'constante'", "'logico'", 
			"'verdadeiro'", "'falso'", "'literal'", "'inteiro'", "'real'", "'e'", 
			"'ou'", "'nao'", "'se'", "'fim_se'", "'entao'", "'senao'", "'caso'", 
			"'fim_caso'", "'seja'", "'para'", "'fim_para'", "'ate'", "'faca'", "'enquanto'", 
			"'fim_enquanto'", "'registro'", "'fim_registro'", "'procedimento'", "'fim_procedimento'", 
			"'funcao'", "'fim_funcao'", "'retorne'", "'escreva'", "'tipo'", "'var'", 
			"'leia'", "':'", "'('", "')'", "'['", "']'", "','", "'\"'", "'<'", "'<='", 
			"'>'", "'>='", "'='", "'<>'", "'..'", "'+'", "'-'", "'*'", "'/'", "'%'", 
			"'<-'", "'^'", "'&'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ALGORITMO", "FIM_ALGORITMO", "DECLARE", "CONSTANTE", "LOGICO", 
			"TRUE", "FALSE", "LITERAL", "INTEIRO", "REAL", "AND", "OR", "NOT", "IF", 
			"ENDIF", "THEN", "ELSE", "CASO", "FIM_CASO", "SEJA", "PARA", "FIM_PARA", 
			"ATE", "FACA", "WHILE", "ENDWHILE", "REGISTRO", "FIM_REGISTRO", "PROCEDIMENTO", 
			"FIM_PROCEDIMENTO", "FUNCAO", "FIM_FUNCAO", "RETORNE", "ESCREVA", "TIPO", 
			"VAR", "LEIA", "DELIM", "ABREPAR", "FECHAPAR", "ABRECHAVE", "FECHACHAVE", 
			"VIRGULA", "ASPAS", "MENOR", "MENORIGUAL", "MAIOR", "MAIORIGUAL", "IGUAL", 
			"DIFERENTE", "INTERVALO", "SOMA", "SUBTRACAO", "MULTIPLICACAO", "DIVISAO", 
			"MOD", "ATRIBUICAO", "PONTEIRO", "ENDERECO", "PONTO", "NUM_INT", "NUM_REAL", 
			"IDENT", "CADEIA", "CADEIA_NAO_FECHADA", "WS", "COMENTARIO", "COMENTARIO_NAO_FECHADO", 
			"ERRO"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public AlgumaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Alguma.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 65:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		case 66:
			COMENTARIO_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}
	private void COMENTARIO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2G\u021d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!"+
		"\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3"+
		"$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,"+
		"\3-\3-\3.\3.\3/\3/\3/\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\63\3\63\3\63"+
		"\3\64\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3:\3;"+
		"\3;\3<\3<\3=\3=\3>\6>\u01dc\n>\r>\16>\u01dd\3?\6?\u01e1\n?\r?\16?\u01e2"+
		"\3?\3?\6?\u01e7\n?\r?\16?\u01e8\5?\u01eb\n?\3@\3@\7@\u01ef\n@\f@\16@\u01f2"+
		"\13@\3A\3A\7A\u01f6\nA\fA\16A\u01f9\13A\3A\3A\3B\3B\7B\u01ff\nB\fB\16"+
		"B\u0202\13B\3B\3B\3C\3C\3C\3D\3D\7D\u020b\nD\fD\16D\u020e\13D\3D\3D\3"+
		"D\3E\3E\7E\u0215\nE\fE\16E\u0218\13E\3E\3E\3F\3F\6\u01f7\u0200\u020c\u0216"+
		"\2G\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67"+
		"m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\3\2"+
		"\b\4\2C\\c|\6\2\62;C\\aac|\3\2\f\f\4\2\f\f$$\5\2\13\f\17\17\"\"\4\2\f"+
		"\f\177\177\2\u0225\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2"+
		"\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k"+
		"\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2"+
		"\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2"+
		"\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b"+
		"\3\2\2\2\3\u008d\3\2\2\2\5\u0097\3\2\2\2\7\u00a5\3\2\2\2\t\u00ad\3\2\2"+
		"\2\13\u00b7\3\2\2\2\r\u00be\3\2\2\2\17\u00c9\3\2\2\2\21\u00cf\3\2\2\2"+
		"\23\u00d7\3\2\2\2\25\u00df\3\2\2\2\27\u00e4\3\2\2\2\31\u00e6\3\2\2\2\33"+
		"\u00e9\3\2\2\2\35\u00ed\3\2\2\2\37\u00f0\3\2\2\2!\u00f7\3\2\2\2#\u00fd"+
		"\3\2\2\2%\u0103\3\2\2\2\'\u0108\3\2\2\2)\u0111\3\2\2\2+\u0116\3\2\2\2"+
		"-\u011b\3\2\2\2/\u0124\3\2\2\2\61\u0128\3\2\2\2\63\u012d\3\2\2\2\65\u0136"+
		"\3\2\2\2\67\u0143\3\2\2\29\u014c\3\2\2\2;\u0159\3\2\2\2=\u0166\3\2\2\2"+
		"?\u0177\3\2\2\2A\u017e\3\2\2\2C\u0189\3\2\2\2E\u0191\3\2\2\2G\u0199\3"+
		"\2\2\2I\u019e\3\2\2\2K\u01a2\3\2\2\2M\u01a7\3\2\2\2O\u01a9\3\2\2\2Q\u01ab"+
		"\3\2\2\2S\u01ad\3\2\2\2U\u01af\3\2\2\2W\u01b1\3\2\2\2Y\u01b3\3\2\2\2["+
		"\u01b5\3\2\2\2]\u01b7\3\2\2\2_\u01ba\3\2\2\2a\u01bc\3\2\2\2c\u01bf\3\2"+
		"\2\2e\u01c1\3\2\2\2g\u01c4\3\2\2\2i\u01c7\3\2\2\2k\u01c9\3\2\2\2m\u01cb"+
		"\3\2\2\2o\u01cd\3\2\2\2q\u01cf\3\2\2\2s\u01d1\3\2\2\2u\u01d4\3\2\2\2w"+
		"\u01d6\3\2\2\2y\u01d8\3\2\2\2{\u01db\3\2\2\2}\u01e0\3\2\2\2\177\u01ec"+
		"\3\2\2\2\u0081\u01f3\3\2\2\2\u0083\u01fc\3\2\2\2\u0085\u0205\3\2\2\2\u0087"+
		"\u0208\3\2\2\2\u0089\u0212\3\2\2\2\u008b\u021b\3\2\2\2\u008d\u008e\7c"+
		"\2\2\u008e\u008f\7n\2\2\u008f\u0090\7i\2\2\u0090\u0091\7q\2\2\u0091\u0092"+
		"\7t\2\2\u0092\u0093\7k\2\2\u0093\u0094\7v\2\2\u0094\u0095\7o\2\2\u0095"+
		"\u0096\7q\2\2\u0096\4\3\2\2\2\u0097\u0098\7h\2\2\u0098\u0099\7k\2\2\u0099"+
		"\u009a\7o\2\2\u009a\u009b\7a\2\2\u009b\u009c\7c\2\2\u009c\u009d\7n\2\2"+
		"\u009d\u009e\7i\2\2\u009e\u009f\7q\2\2\u009f\u00a0\7t\2\2\u00a0\u00a1"+
		"\7k\2\2\u00a1\u00a2\7v\2\2\u00a2\u00a3\7o\2\2\u00a3\u00a4\7q\2\2\u00a4"+
		"\6\3\2\2\2\u00a5\u00a6\7f\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8\7e\2\2\u00a8"+
		"\u00a9\7n\2\2\u00a9\u00aa\7c\2\2\u00aa\u00ab\7t\2\2\u00ab\u00ac\7g\2\2"+
		"\u00ac\b\3\2\2\2\u00ad\u00ae\7e\2\2\u00ae\u00af\7q\2\2\u00af\u00b0\7p"+
		"\2\2\u00b0\u00b1\7u\2\2\u00b1\u00b2\7v\2\2\u00b2\u00b3\7c\2\2\u00b3\u00b4"+
		"\7p\2\2\u00b4\u00b5\7v\2\2\u00b5\u00b6\7g\2\2\u00b6\n\3\2\2\2\u00b7\u00b8"+
		"\7n\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba\7i\2\2\u00ba\u00bb\7k\2\2\u00bb"+
		"\u00bc\7e\2\2\u00bc\u00bd\7q\2\2\u00bd\f\3\2\2\2\u00be\u00bf\7x\2\2\u00bf"+
		"\u00c0\7g\2\2\u00c0\u00c1\7t\2\2\u00c1\u00c2\7f\2\2\u00c2\u00c3\7c\2\2"+
		"\u00c3\u00c4\7f\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6\7k\2\2\u00c6\u00c7"+
		"\7t\2\2\u00c7\u00c8\7q\2\2\u00c8\16\3\2\2\2\u00c9\u00ca\7h\2\2\u00ca\u00cb"+
		"\7c\2\2\u00cb\u00cc\7n\2\2\u00cc\u00cd\7u\2\2\u00cd\u00ce\7q\2\2\u00ce"+
		"\20\3\2\2\2\u00cf\u00d0\7n\2\2\u00d0\u00d1\7k\2\2\u00d1\u00d2\7v\2\2\u00d2"+
		"\u00d3\7g\2\2\u00d3\u00d4\7t\2\2\u00d4\u00d5\7c\2\2\u00d5\u00d6\7n\2\2"+
		"\u00d6\22\3\2\2\2\u00d7\u00d8\7k\2\2\u00d8\u00d9\7p\2\2\u00d9\u00da\7"+
		"v\2\2\u00da\u00db\7g\2\2\u00db\u00dc\7k\2\2\u00dc\u00dd\7t\2\2\u00dd\u00de"+
		"\7q\2\2\u00de\24\3\2\2\2\u00df\u00e0\7t\2\2\u00e0\u00e1\7g\2\2\u00e1\u00e2"+
		"\7c\2\2\u00e2\u00e3\7n\2\2\u00e3\26\3\2\2\2\u00e4\u00e5\7g\2\2\u00e5\30"+
		"\3\2\2\2\u00e6\u00e7\7q\2\2\u00e7\u00e8\7w\2\2\u00e8\32\3\2\2\2\u00e9"+
		"\u00ea\7p\2\2\u00ea\u00eb\7c\2\2\u00eb\u00ec\7q\2\2\u00ec\34\3\2\2\2\u00ed"+
		"\u00ee\7u\2\2\u00ee\u00ef\7g\2\2\u00ef\36\3\2\2\2\u00f0\u00f1\7h\2\2\u00f1"+
		"\u00f2\7k\2\2\u00f2\u00f3\7o\2\2\u00f3\u00f4\7a\2\2\u00f4\u00f5\7u\2\2"+
		"\u00f5\u00f6\7g\2\2\u00f6 \3\2\2\2\u00f7\u00f8\7g\2\2\u00f8\u00f9\7p\2"+
		"\2\u00f9\u00fa\7v\2\2\u00fa\u00fb\7c\2\2\u00fb\u00fc\7q\2\2\u00fc\"\3"+
		"\2\2\2\u00fd\u00fe\7u\2\2\u00fe\u00ff\7g\2\2\u00ff\u0100\7p\2\2\u0100"+
		"\u0101\7c\2\2\u0101\u0102\7q\2\2\u0102$\3\2\2\2\u0103\u0104\7e\2\2\u0104"+
		"\u0105\7c\2\2\u0105\u0106\7u\2\2\u0106\u0107\7q\2\2\u0107&\3\2\2\2\u0108"+
		"\u0109\7h\2\2\u0109\u010a\7k\2\2\u010a\u010b\7o\2\2\u010b\u010c\7a\2\2"+
		"\u010c\u010d\7e\2\2\u010d\u010e\7c\2\2\u010e\u010f\7u\2\2\u010f\u0110"+
		"\7q\2\2\u0110(\3\2\2\2\u0111\u0112\7u\2\2\u0112\u0113\7g\2\2\u0113\u0114"+
		"\7l\2\2\u0114\u0115\7c\2\2\u0115*\3\2\2\2\u0116\u0117\7r\2\2\u0117\u0118"+
		"\7c\2\2\u0118\u0119\7t\2\2\u0119\u011a\7c\2\2\u011a,\3\2\2\2\u011b\u011c"+
		"\7h\2\2\u011c\u011d\7k\2\2\u011d\u011e\7o\2\2\u011e\u011f\7a\2\2\u011f"+
		"\u0120\7r\2\2\u0120\u0121\7c\2\2\u0121\u0122\7t\2\2\u0122\u0123\7c\2\2"+
		"\u0123.\3\2\2\2\u0124\u0125\7c\2\2\u0125\u0126\7v\2\2\u0126\u0127\7g\2"+
		"\2\u0127\60\3\2\2\2\u0128\u0129\7h\2\2\u0129\u012a\7c\2\2\u012a\u012b"+
		"\7e\2\2\u012b\u012c\7c\2\2\u012c\62\3\2\2\2\u012d\u012e\7g\2\2\u012e\u012f"+
		"\7p\2\2\u012f\u0130\7s\2\2\u0130\u0131\7w\2\2\u0131\u0132\7c\2\2\u0132"+
		"\u0133\7p\2\2\u0133\u0134\7v\2\2\u0134\u0135\7q\2\2\u0135\64\3\2\2\2\u0136"+
		"\u0137\7h\2\2\u0137\u0138\7k\2\2\u0138\u0139\7o\2\2\u0139\u013a\7a\2\2"+
		"\u013a\u013b\7g\2\2\u013b\u013c\7p\2\2\u013c\u013d\7s\2\2\u013d\u013e"+
		"\7w\2\2\u013e\u013f\7c\2\2\u013f\u0140\7p\2\2\u0140\u0141\7v\2\2\u0141"+
		"\u0142\7q\2\2\u0142\66\3\2\2\2\u0143\u0144\7t\2\2\u0144\u0145\7g\2\2\u0145"+
		"\u0146\7i\2\2\u0146\u0147\7k\2\2\u0147\u0148\7u\2\2\u0148\u0149\7v\2\2"+
		"\u0149\u014a\7t\2\2\u014a\u014b\7q\2\2\u014b8\3\2\2\2\u014c\u014d\7h\2"+
		"\2\u014d\u014e\7k\2\2\u014e\u014f\7o\2\2\u014f\u0150\7a\2\2\u0150\u0151"+
		"\7t\2\2\u0151\u0152\7g\2\2\u0152\u0153\7i\2\2\u0153\u0154\7k\2\2\u0154"+
		"\u0155\7u\2\2\u0155\u0156\7v\2\2\u0156\u0157\7t\2\2\u0157\u0158\7q\2\2"+
		"\u0158:\3\2\2\2\u0159\u015a\7r\2\2\u015a\u015b\7t\2\2\u015b\u015c\7q\2"+
		"\2\u015c\u015d\7e\2\2\u015d\u015e\7g\2\2\u015e\u015f\7f\2\2\u015f\u0160"+
		"\7k\2\2\u0160\u0161\7o\2\2\u0161\u0162\7g\2\2\u0162\u0163\7p\2\2\u0163"+
		"\u0164\7v\2\2\u0164\u0165\7q\2\2\u0165<\3\2\2\2\u0166\u0167\7h\2\2\u0167"+
		"\u0168\7k\2\2\u0168\u0169\7o\2\2\u0169\u016a\7a\2\2\u016a\u016b\7r\2\2"+
		"\u016b\u016c\7t\2\2\u016c\u016d\7q\2\2\u016d\u016e\7e\2\2\u016e\u016f"+
		"\7g\2\2\u016f\u0170\7f\2\2\u0170\u0171\7k\2\2\u0171\u0172\7o\2\2\u0172"+
		"\u0173\7g\2\2\u0173\u0174\7p\2\2\u0174\u0175\7v\2\2\u0175\u0176\7q\2\2"+
		"\u0176>\3\2\2\2\u0177\u0178\7h\2\2\u0178\u0179\7w\2\2\u0179\u017a\7p\2"+
		"\2\u017a\u017b\7e\2\2\u017b\u017c\7c\2\2\u017c\u017d\7q\2\2\u017d@\3\2"+
		"\2\2\u017e\u017f\7h\2\2\u017f\u0180\7k\2\2\u0180\u0181\7o\2\2\u0181\u0182"+
		"\7a\2\2\u0182\u0183\7h\2\2\u0183\u0184\7w\2\2\u0184\u0185\7p\2\2\u0185"+
		"\u0186\7e\2\2\u0186\u0187\7c\2\2\u0187\u0188\7q\2\2\u0188B\3\2\2\2\u0189"+
		"\u018a\7t\2\2\u018a\u018b\7g\2\2\u018b\u018c\7v\2\2\u018c\u018d\7q\2\2"+
		"\u018d\u018e\7t\2\2\u018e\u018f\7p\2\2\u018f\u0190\7g\2\2\u0190D\3\2\2"+
		"\2\u0191\u0192\7g\2\2\u0192\u0193\7u\2\2\u0193\u0194\7e\2\2\u0194\u0195"+
		"\7t\2\2\u0195\u0196\7g\2\2\u0196\u0197\7x\2\2\u0197\u0198\7c\2\2\u0198"+
		"F\3\2\2\2\u0199\u019a\7v\2\2\u019a\u019b\7k\2\2\u019b\u019c\7r\2\2\u019c"+
		"\u019d\7q\2\2\u019dH\3\2\2\2\u019e\u019f\7x\2\2\u019f\u01a0\7c\2\2\u01a0"+
		"\u01a1\7t\2\2\u01a1J\3\2\2\2\u01a2\u01a3\7n\2\2\u01a3\u01a4\7g\2\2\u01a4"+
		"\u01a5\7k\2\2\u01a5\u01a6\7c\2\2\u01a6L\3\2\2\2\u01a7\u01a8\7<\2\2\u01a8"+
		"N\3\2\2\2\u01a9\u01aa\7*\2\2\u01aaP\3\2\2\2\u01ab\u01ac\7+\2\2\u01acR"+
		"\3\2\2\2\u01ad\u01ae\7]\2\2\u01aeT\3\2\2\2\u01af\u01b0\7_\2\2\u01b0V\3"+
		"\2\2\2\u01b1\u01b2\7.\2\2\u01b2X\3\2\2\2\u01b3\u01b4\7$\2\2\u01b4Z\3\2"+
		"\2\2\u01b5\u01b6\7>\2\2\u01b6\\\3\2\2\2\u01b7\u01b8\7>\2\2\u01b8\u01b9"+
		"\7?\2\2\u01b9^\3\2\2\2\u01ba\u01bb\7@\2\2\u01bb`\3\2\2\2\u01bc\u01bd\7"+
		"@\2\2\u01bd\u01be\7?\2\2\u01beb\3\2\2\2\u01bf\u01c0\7?\2\2\u01c0d\3\2"+
		"\2\2\u01c1\u01c2\7>\2\2\u01c2\u01c3\7@\2\2\u01c3f\3\2\2\2\u01c4\u01c5"+
		"\7\60\2\2\u01c5\u01c6\7\60\2\2\u01c6h\3\2\2\2\u01c7\u01c8\7-\2\2\u01c8"+
		"j\3\2\2\2\u01c9\u01ca\7/\2\2\u01cal\3\2\2\2\u01cb\u01cc\7,\2\2\u01ccn"+
		"\3\2\2\2\u01cd\u01ce\7\61\2\2\u01cep\3\2\2\2\u01cf\u01d0\7\'\2\2\u01d0"+
		"r\3\2\2\2\u01d1\u01d2\7>\2\2\u01d2\u01d3\7/\2\2\u01d3t\3\2\2\2\u01d4\u01d5"+
		"\7`\2\2\u01d5v\3\2\2\2\u01d6\u01d7\7(\2\2\u01d7x\3\2\2\2\u01d8\u01d9\7"+
		"\60\2\2\u01d9z\3\2\2\2\u01da\u01dc\4\62;\2\u01db\u01da\3\2\2\2\u01dc\u01dd"+
		"\3\2\2\2\u01dd\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01de|\3\2\2\2\u01df"+
		"\u01e1\4\62;\2\u01e0\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e0\3\2"+
		"\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01ea\3\2\2\2\u01e4\u01e6\7\60\2\2\u01e5"+
		"\u01e7\4\62;\2\u01e6\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01e6\3\2"+
		"\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01eb\3\2\2\2\u01ea\u01e4\3\2\2\2\u01ea"+
		"\u01eb\3\2\2\2\u01eb~\3\2\2\2\u01ec\u01f0\t\2\2\2\u01ed\u01ef\t\3\2\2"+
		"\u01ee\u01ed\3\2\2\2\u01ef\u01f2\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0\u01f1"+
		"\3\2\2\2\u01f1\u0080\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f3\u01f7\7$\2\2\u01f4"+
		"\u01f6\n\4\2\2\u01f5\u01f4\3\2\2\2\u01f6\u01f9\3\2\2\2\u01f7\u01f8\3\2"+
		"\2\2\u01f7\u01f5\3\2\2\2\u01f8\u01fa\3\2\2\2\u01f9\u01f7\3\2\2\2\u01fa"+
		"\u01fb\7$\2\2\u01fb\u0082\3\2\2\2\u01fc\u0200\7$\2\2\u01fd\u01ff\n\5\2"+
		"\2\u01fe\u01fd\3\2\2\2\u01ff\u0202\3\2\2\2\u0200\u0201\3\2\2\2\u0200\u01fe"+
		"\3\2\2\2\u0201\u0203\3\2\2\2\u0202\u0200\3\2\2\2\u0203\u0204\7\f\2\2\u0204"+
		"\u0084\3\2\2\2\u0205\u0206\t\6\2\2\u0206\u0207\bC\2\2\u0207\u0086\3\2"+
		"\2\2\u0208\u020c\7}\2\2\u0209\u020b\n\4\2\2\u020a\u0209\3\2\2\2\u020b"+
		"\u020e\3\2\2\2\u020c\u020d\3\2\2\2\u020c\u020a\3\2\2\2\u020d\u020f\3\2"+
		"\2\2\u020e\u020c\3\2\2\2\u020f\u0210\7\177\2\2\u0210\u0211\bD\3\2\u0211"+
		"\u0088\3\2\2\2\u0212\u0216\7}\2\2\u0213\u0215\n\7\2\2\u0214\u0213\3\2"+
		"\2\2\u0215\u0218\3\2\2\2\u0216\u0217\3\2\2\2\u0216\u0214\3\2\2\2\u0217"+
		"\u0219\3\2\2\2\u0218\u0216\3\2\2\2\u0219\u021a\7\f\2\2\u021a\u008a\3\2"+
		"\2\2\u021b\u021c\13\2\2\2\u021c\u008c\3\2\2\2\f\2\u01dd\u01e2\u01e8\u01ea"+
		"\u01f0\u01f7\u0200\u020c\u0216\4\3C\2\3D\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}