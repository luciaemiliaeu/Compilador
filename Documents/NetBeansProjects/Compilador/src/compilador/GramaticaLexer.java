// Generated from /home/lucas_brito/Documents/Compiladores/Compiladores/Documents/NetBeansProjects/Compilador/src/compilador/Gramatica.g4 by ANTLR 4.5.3
package compilador;

  import java.util.HashMap;
  import java.util.Map;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, Tk_break=2, Tk_Class=3, Tk_Main=4, Tk_PtVirg=5, Tk_Virg=6, Tk_DoisPonts=7, 
		Tk_AbrePar=8, Tk_FechPar=9, Tk_Int=10, Tk_Float=11, Tk_Bool=12, Tk_Str=13, 
		Tk_Neg=14, Tk_E=15, TK_OU=16, Tk_MaiorQ=17, Tk_MenorQ=18, Tk_MaiorIgual=19, 
		Tk_MenorIgual=20, Tk_Dif=21, Tk_Igual=22, Tk_AbreChaves=23, Tk_FechaChaves=24, 
		Tk_MULT=25, Tk_DIV=26, TK_SUB=27, Tk_SOMA=28, Tk_IF=29, Tk_FOR=30, Tk_ELSE=31, 
		Tk_Incre=32, Tk_Decre=33, Tk_PRINT=34, Tk_READ=35, Tk_VOID=36, Tk_RETURN=37, 
		Tk_FINAL=38, Tk_Atribu=39, Tk_True=40, Tk_False=41, ID=42, INT=43, REAL=44, 
		STRING=45, COMMENT_LINE=46, COMMENT=47, WS=48;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "Tk_break", "Tk_Class", "Tk_Main", "Tk_PtVirg", "Tk_Virg", "Tk_DoisPonts", 
		"Tk_AbrePar", "Tk_FechPar", "Tk_Int", "Tk_Float", "Tk_Bool", "Tk_Str", 
		"Tk_Neg", "Tk_E", "TK_OU", "Tk_MaiorQ", "Tk_MenorQ", "Tk_MaiorIgual", 
		"Tk_MenorIgual", "Tk_Dif", "Tk_Igual", "Tk_AbreChaves", "Tk_FechaChaves", 
		"Tk_MULT", "Tk_DIV", "TK_SUB", "Tk_SOMA", "Tk_IF", "Tk_FOR", "Tk_ELSE", 
		"Tk_Incre", "Tk_Decre", "Tk_PRINT", "Tk_READ", "Tk_VOID", "Tk_RETURN", 
		"Tk_FINAL", "Tk_Atribu", "Tk_True", "Tk_False", "ID", "INT", "REAL", "STRING", 
		"COMMENT_LINE", "COMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'!='", "'break'", "'Class'", "'Main'", "';'", "','", "':'", "'('", 
		"')'", "'Int'", "'Float'", "'Bool'", "'Str'", "'!'", "'&&'", "'||'", "'>'", 
		"'<'", "'>='", "'<='", "'=!'", "'=='", "'{'", "'}'", "'*'", "'/'", "'-'", 
		"'+'", "'if'", "'for'", "'else'", "'++'", "'--'", "'print'", "'read'", 
		"'Void'", "'return'", "'final'", "'='", "'true'", "'false'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "Tk_break", "Tk_Class", "Tk_Main", "Tk_PtVirg", "Tk_Virg", 
		"Tk_DoisPonts", "Tk_AbrePar", "Tk_FechPar", "Tk_Int", "Tk_Float", "Tk_Bool", 
		"Tk_Str", "Tk_Neg", "Tk_E", "TK_OU", "Tk_MaiorQ", "Tk_MenorQ", "Tk_MaiorIgual", 
		"Tk_MenorIgual", "Tk_Dif", "Tk_Igual", "Tk_AbreChaves", "Tk_FechaChaves", 
		"Tk_MULT", "Tk_DIV", "TK_SUB", "Tk_SOMA", "Tk_IF", "Tk_FOR", "Tk_ELSE", 
		"Tk_Incre", "Tk_Decre", "Tk_PRINT", "Tk_READ", "Tk_VOID", "Tk_RETURN", 
		"Tk_FINAL", "Tk_Atribu", "Tk_True", "Tk_False", "ID", "INT", "REAL", "STRING", 
		"COMMENT_LINE", "COMMENT", "WS"
	};
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


	public GramaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\62\u0136\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!"+
		"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&"+
		"\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*"+
		"\3*\3*\3+\3+\7+\u00f7\n+\f+\16+\u00fa\13+\3,\6,\u00fd\n,\r,\16,\u00fe"+
		"\3-\6-\u0102\n-\r-\16-\u0103\3-\3-\6-\u0108\n-\r-\16-\u0109\3.\3.\7.\u010e"+
		"\n.\f.\16.\u0111\13.\3.\3.\3/\3/\3/\3/\7/\u0119\n/\f/\16/\u011c\13/\3"+
		"/\5/\u011f\n/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\7\60\u0129\n\60\f\60\16"+
		"\60\u012c\13\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\5\u010f\u011a"+
		"\u012a\2\62\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62\3\2\6\4\2C\\"+
		"c|\5\2\62;C\\c|\3\2\62;\5\2\13\f\17\17\"\"\u013d\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\3c\3\2\2\2\5f\3"+
		"\2\2\2\7l\3\2\2\2\tr\3\2\2\2\13w\3\2\2\2\ry\3\2\2\2\17{\3\2\2\2\21}\3"+
		"\2\2\2\23\177\3\2\2\2\25\u0081\3\2\2\2\27\u0085\3\2\2\2\31\u008b\3\2\2"+
		"\2\33\u0090\3\2\2\2\35\u0094\3\2\2\2\37\u0096\3\2\2\2!\u0099\3\2\2\2#"+
		"\u009c\3\2\2\2%\u009e\3\2\2\2\'\u00a0\3\2\2\2)\u00a3\3\2\2\2+\u00a6\3"+
		"\2\2\2-\u00a9\3\2\2\2/\u00ac\3\2\2\2\61\u00ae\3\2\2\2\63\u00b0\3\2\2\2"+
		"\65\u00b2\3\2\2\2\67\u00b4\3\2\2\29\u00b6\3\2\2\2;\u00b8\3\2\2\2=\u00bb"+
		"\3\2\2\2?\u00bf\3\2\2\2A\u00c4\3\2\2\2C\u00c7\3\2\2\2E\u00ca\3\2\2\2G"+
		"\u00d0\3\2\2\2I\u00d5\3\2\2\2K\u00da\3\2\2\2M\u00e1\3\2\2\2O\u00e7\3\2"+
		"\2\2Q\u00e9\3\2\2\2S\u00ee\3\2\2\2U\u00f4\3\2\2\2W\u00fc\3\2\2\2Y\u0101"+
		"\3\2\2\2[\u010b\3\2\2\2]\u0114\3\2\2\2_\u0124\3\2\2\2a\u0132\3\2\2\2c"+
		"d\7#\2\2de\7?\2\2e\4\3\2\2\2fg\7d\2\2gh\7t\2\2hi\7g\2\2ij\7c\2\2jk\7m"+
		"\2\2k\6\3\2\2\2lm\7E\2\2mn\7n\2\2no\7c\2\2op\7u\2\2pq\7u\2\2q\b\3\2\2"+
		"\2rs\7O\2\2st\7c\2\2tu\7k\2\2uv\7p\2\2v\n\3\2\2\2wx\7=\2\2x\f\3\2\2\2"+
		"yz\7.\2\2z\16\3\2\2\2{|\7<\2\2|\20\3\2\2\2}~\7*\2\2~\22\3\2\2\2\177\u0080"+
		"\7+\2\2\u0080\24\3\2\2\2\u0081\u0082\7K\2\2\u0082\u0083\7p\2\2\u0083\u0084"+
		"\7v\2\2\u0084\26\3\2\2\2\u0085\u0086\7H\2\2\u0086\u0087\7n\2\2\u0087\u0088"+
		"\7q\2\2\u0088\u0089\7c\2\2\u0089\u008a\7v\2\2\u008a\30\3\2\2\2\u008b\u008c"+
		"\7D\2\2\u008c\u008d\7q\2\2\u008d\u008e\7q\2\2\u008e\u008f\7n\2\2\u008f"+
		"\32\3\2\2\2\u0090\u0091\7U\2\2\u0091\u0092\7v\2\2\u0092\u0093\7t\2\2\u0093"+
		"\34\3\2\2\2\u0094\u0095\7#\2\2\u0095\36\3\2\2\2\u0096\u0097\7(\2\2\u0097"+
		"\u0098\7(\2\2\u0098 \3\2\2\2\u0099\u009a\7~\2\2\u009a\u009b\7~\2\2\u009b"+
		"\"\3\2\2\2\u009c\u009d\7@\2\2\u009d$\3\2\2\2\u009e\u009f\7>\2\2\u009f"+
		"&\3\2\2\2\u00a0\u00a1\7@\2\2\u00a1\u00a2\7?\2\2\u00a2(\3\2\2\2\u00a3\u00a4"+
		"\7>\2\2\u00a4\u00a5\7?\2\2\u00a5*\3\2\2\2\u00a6\u00a7\7?\2\2\u00a7\u00a8"+
		"\7#\2\2\u00a8,\3\2\2\2\u00a9\u00aa\7?\2\2\u00aa\u00ab\7?\2\2\u00ab.\3"+
		"\2\2\2\u00ac\u00ad\7}\2\2\u00ad\60\3\2\2\2\u00ae\u00af\7\177\2\2\u00af"+
		"\62\3\2\2\2\u00b0\u00b1\7,\2\2\u00b1\64\3\2\2\2\u00b2\u00b3\7\61\2\2\u00b3"+
		"\66\3\2\2\2\u00b4\u00b5\7/\2\2\u00b58\3\2\2\2\u00b6\u00b7\7-\2\2\u00b7"+
		":\3\2\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba\7h\2\2\u00ba<\3\2\2\2\u00bb\u00bc"+
		"\7h\2\2\u00bc\u00bd\7q\2\2\u00bd\u00be\7t\2\2\u00be>\3\2\2\2\u00bf\u00c0"+
		"\7g\2\2\u00c0\u00c1\7n\2\2\u00c1\u00c2\7u\2\2\u00c2\u00c3\7g\2\2\u00c3"+
		"@\3\2\2\2\u00c4\u00c5\7-\2\2\u00c5\u00c6\7-\2\2\u00c6B\3\2\2\2\u00c7\u00c8"+
		"\7/\2\2\u00c8\u00c9\7/\2\2\u00c9D\3\2\2\2\u00ca\u00cb\7r\2\2\u00cb\u00cc"+
		"\7t\2\2\u00cc\u00cd\7k\2\2\u00cd\u00ce\7p\2\2\u00ce\u00cf\7v\2\2\u00cf"+
		"F\3\2\2\2\u00d0\u00d1\7t\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3\7c\2\2\u00d3"+
		"\u00d4\7f\2\2\u00d4H\3\2\2\2\u00d5\u00d6\7X\2\2\u00d6\u00d7\7q\2\2\u00d7"+
		"\u00d8\7k\2\2\u00d8\u00d9\7f\2\2\u00d9J\3\2\2\2\u00da\u00db\7t\2\2\u00db"+
		"\u00dc\7g\2\2\u00dc\u00dd\7v\2\2\u00dd\u00de\7w\2\2\u00de\u00df\7t\2\2"+
		"\u00df\u00e0\7p\2\2\u00e0L\3\2\2\2\u00e1\u00e2\7h\2\2\u00e2\u00e3\7k\2"+
		"\2\u00e3\u00e4\7p\2\2\u00e4\u00e5\7c\2\2\u00e5\u00e6\7n\2\2\u00e6N\3\2"+
		"\2\2\u00e7\u00e8\7?\2\2\u00e8P\3\2\2\2\u00e9\u00ea\7v\2\2\u00ea\u00eb"+
		"\7t\2\2\u00eb\u00ec\7w\2\2\u00ec\u00ed\7g\2\2\u00edR\3\2\2\2\u00ee\u00ef"+
		"\7h\2\2\u00ef\u00f0\7c\2\2\u00f0\u00f1\7n\2\2\u00f1\u00f2\7u\2\2\u00f2"+
		"\u00f3\7g\2\2\u00f3T\3\2\2\2\u00f4\u00f8\t\2\2\2\u00f5\u00f7\t\3\2\2\u00f6"+
		"\u00f5\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2"+
		"\2\2\u00f9V\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fd\t\4\2\2\u00fc\u00fb"+
		"\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"X\3\2\2\2\u0100\u0102\t\4\2\2\u0101\u0100\3\2\2\2\u0102\u0103\3\2\2\2"+
		"\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0107"+
		"\7\60\2\2\u0106\u0108\t\4\2\2\u0107\u0106\3\2\2\2\u0108\u0109\3\2\2\2"+
		"\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010aZ\3\2\2\2\u010b\u010f\7"+
		"$\2\2\u010c\u010e\13\2\2\2\u010d\u010c\3\2\2\2\u010e\u0111\3\2\2\2\u010f"+
		"\u0110\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0112\3\2\2\2\u0111\u010f\3\2"+
		"\2\2\u0112\u0113\7$\2\2\u0113\\\3\2\2\2\u0114\u0115\7\61\2\2\u0115\u0116"+
		"\7\61\2\2\u0116\u011a\3\2\2\2\u0117\u0119\13\2\2\2\u0118\u0117\3\2\2\2"+
		"\u0119\u011c\3\2\2\2\u011a\u011b\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011e"+
		"\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u011f\7\17\2\2\u011e\u011d\3\2\2\2"+
		"\u011e\u011f\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\7\f\2\2\u0121\u0122"+
		"\3\2\2\2\u0122\u0123\b/\2\2\u0123^\3\2\2\2\u0124\u0125\7\61\2\2\u0125"+
		"\u0126\7,\2\2\u0126\u012a\3\2\2\2\u0127\u0129\13\2\2\2\u0128\u0127\3\2"+
		"\2\2\u0129\u012c\3\2\2\2\u012a\u012b\3\2\2\2\u012a\u0128\3\2\2\2\u012b"+
		"\u012d\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012e\7,\2\2\u012e\u012f\7\61"+
		"\2\2\u012f\u0130\3\2\2\2\u0130\u0131\b\60\2\2\u0131`\3\2\2\2\u0132\u0133"+
		"\t\5\2\2\u0133\u0134\3\2\2\2\u0134\u0135\b\61\2\2\u0135b\3\2\2\2\13\2"+
		"\u00f8\u00fe\u0103\u0109\u010f\u011a\u011e\u012a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}