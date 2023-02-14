// Generated from java-escape by ANTLR 4.11.1
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CmmLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IDENTIFIER=1, INT_CONSTANT=2, REAL_CONSTANT=3, CHAR_CONSTANT=4, BLANKS=5, 
		SL_COMMENT=6, ML_COMMENT=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DIGIT", "LETTER", "REAL", "IDENTIFIER", "INT_CONSTANT", "REAL_CONSTANT", 
			"CHAR_CONSTANT", "BLANKS", "SL_COMMENT", "ML_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IDENTIFIER", "INT_CONSTANT", "REAL_CONSTANT", "CHAR_CONSTANT", 
			"BLANKS", "SL_COMMENT", "ML_COMMENT"
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


	public CmmLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cmm.g4"; }

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

	public static final String _serializedATN =
		"\u0004\u0000\u0007}\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0003\u0002\u001b\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0004\u0002\u001f\b\u0002\u000b\u0002\f\u0002 \u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002&\b\u0002\u0001\u0003\u0001\u0003\u0003"+
		"\u0003*\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003/\b\u0003"+
		"\n\u0003\f\u00032\t\u0003\u0001\u0004\u0001\u0004\u0004\u00046\b\u0004"+
		"\u000b\u0004\f\u00047\u0001\u0004\u0005\u0004;\b\u0004\n\u0004\f\u0004"+
		">\t\u0004\u0003\u0004@\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005E\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006T\b\u0006\u0001\u0006\u0003"+
		"\u0006W\b\u0006\u0001\u0007\u0004\u0007Z\b\u0007\u000b\u0007\f\u0007["+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0005\bd\b\b"+
		"\n\b\f\bg\t\b\u0001\b\u0003\bj\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0005\tr\b\t\n\t\f\tu\t\t\u0001\t\u0001\t\u0001\t\u0003\tz"+
		"\b\t\u0001\t\u0001\t\u0002es\u0000\n\u0001\u0000\u0003\u0000\u0005\u0000"+
		"\u0007\u0001\t\u0002\u000b\u0003\r\u0004\u000f\u0005\u0011\u0006\u0013"+
		"\u0007\u0001\u0000\u0006\u0001\u000009\u0002\u0000AZaz\u0001\u000019\u0002"+
		"\u0000EEee\u0003\u0000\t\n\r\r  \u0002\u0001\n\n\r\r\u008b\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0001\u0015\u0001\u0000\u0000\u0000\u0003\u0017\u0001\u0000"+
		"\u0000\u0000\u0005%\u0001\u0000\u0000\u0000\u0007)\u0001\u0000\u0000\u0000"+
		"\t?\u0001\u0000\u0000\u0000\u000bA\u0001\u0000\u0000\u0000\rV\u0001\u0000"+
		"\u0000\u0000\u000fY\u0001\u0000\u0000\u0000\u0011_\u0001\u0000\u0000\u0000"+
		"\u0013m\u0001\u0000\u0000\u0000\u0015\u0016\u0007\u0000\u0000\u0000\u0016"+
		"\u0002\u0001\u0000\u0000\u0000\u0017\u0018\u0007\u0001\u0000\u0000\u0018"+
		"\u0004\u0001\u0000\u0000\u0000\u0019\u001b\u0003\t\u0004\u0000\u001a\u0019"+
		"\u0001\u0000\u0000\u0000\u001a\u001b\u0001\u0000\u0000\u0000\u001b\u001c"+
		"\u0001\u0000\u0000\u0000\u001c\u001e\u0005.\u0000\u0000\u001d\u001f\u0003"+
		"\u0001\u0000\u0000\u001e\u001d\u0001\u0000\u0000\u0000\u001f \u0001\u0000"+
		"\u0000\u0000 \u001e\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000"+
		"!&\u0001\u0000\u0000\u0000\"#\u0003\t\u0004\u0000#$\u0005.\u0000\u0000"+
		"$&\u0001\u0000\u0000\u0000%\u001a\u0001\u0000\u0000\u0000%\"\u0001\u0000"+
		"\u0000\u0000&\u0006\u0001\u0000\u0000\u0000\'*\u0003\u0003\u0001\u0000"+
		"(*\u0005_\u0000\u0000)\'\u0001\u0000\u0000\u0000)(\u0001\u0000\u0000\u0000"+
		"*0\u0001\u0000\u0000\u0000+/\u0003\u0003\u0001\u0000,/\u0003\u0001\u0000"+
		"\u0000-/\u0005_\u0000\u0000.+\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000"+
		"\u0000.-\u0001\u0000\u0000\u0000/2\u0001\u0000\u0000\u00000.\u0001\u0000"+
		"\u0000\u000001\u0001\u0000\u0000\u00001\b\u0001\u0000\u0000\u000020\u0001"+
		"\u0000\u0000\u00003@\u00050\u0000\u000046\u0007\u0002\u0000\u000054\u0001"+
		"\u0000\u0000\u000067\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u0000"+
		"78\u0001\u0000\u0000\u00008<\u0001\u0000\u0000\u00009;\u0003\u0001\u0000"+
		"\u0000:9\u0001\u0000\u0000\u0000;>\u0001\u0000\u0000\u0000<:\u0001\u0000"+
		"\u0000\u0000<=\u0001\u0000\u0000\u0000=@\u0001\u0000\u0000\u0000><\u0001"+
		"\u0000\u0000\u0000?3\u0001\u0000\u0000\u0000?5\u0001\u0000\u0000\u0000"+
		"@\n\u0001\u0000\u0000\u0000AD\u0003\u0005\u0002\u0000BC\u0007\u0003\u0000"+
		"\u0000CE\u0003\t\u0004\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000"+
		"\u0000E\f\u0001\u0000\u0000\u0000FG\u0005\'\u0000\u0000GH\t\u0000\u0000"+
		"\u0000HW\u0005\'\u0000\u0000IJ\u0005\'\u0000\u0000JK\u0005\\\u0000\u0000"+
		"KL\u0003\t\u0004\u0000LM\u0005\'\u0000\u0000MW\u0001\u0000\u0000\u0000"+
		"NS\u0005\'\u0000\u0000OP\u0005\\\u0000\u0000PT\u0005t\u0000\u0000QR\u0005"+
		"\\\u0000\u0000RT\u0005n\u0000\u0000SO\u0001\u0000\u0000\u0000SQ\u0001"+
		"\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UW\u0005\'\u0000\u0000VF\u0001"+
		"\u0000\u0000\u0000VI\u0001\u0000\u0000\u0000VN\u0001\u0000\u0000\u0000"+
		"W\u000e\u0001\u0000\u0000\u0000XZ\u0007\u0004\u0000\u0000YX\u0001\u0000"+
		"\u0000\u0000Z[\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001"+
		"\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]^\u0006\u0007\u0000\u0000"+
		"^\u0010\u0001\u0000\u0000\u0000_`\u0005/\u0000\u0000`a\u0005/\u0000\u0000"+
		"ae\u0001\u0000\u0000\u0000bd\t\u0000\u0000\u0000cb\u0001\u0000\u0000\u0000"+
		"dg\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000"+
		"\u0000fi\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000hj\u0007\u0005"+
		"\u0000\u0000ih\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000kl\u0006"+
		"\b\u0000\u0000l\u0012\u0001\u0000\u0000\u0000mn\u0005/\u0000\u0000no\u0005"+
		"*\u0000\u0000os\u0001\u0000\u0000\u0000pr\t\u0000\u0000\u0000qp\u0001"+
		"\u0000\u0000\u0000ru\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000"+
		"sq\u0001\u0000\u0000\u0000ty\u0001\u0000\u0000\u0000us\u0001\u0000\u0000"+
		"\u0000vw\u0005/\u0000\u0000wz\u0005*\u0000\u0000xz\u0005\u0000\u0000\u0001"+
		"yv\u0001\u0000\u0000\u0000yx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000"+
		"\u0000{|\u0006\t\u0000\u0000|\u0014\u0001\u0000\u0000\u0000\u0012\u0000"+
		"\u001a %).07<?DSV[eisy\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}