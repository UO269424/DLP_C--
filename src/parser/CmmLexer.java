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
		ID=1, INT_CONSTANT=2, REAL_CONSTANT=3, CHAR_CONSTANT=4, SL_COMMENT=5, 
		ML_COMMENT=6, BLANKS=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DIGIT", "LETTER", "REAL", "ID", "INT_CONSTANT", "REAL_CONSTANT", "CHAR_CONSTANT", 
			"SL_COMMENT", "ML_COMMENT", "BLANKS"
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
			null, "ID", "INT_CONSTANT", "REAL_CONSTANT", "CHAR_CONSTANT", "SL_COMMENT", 
			"ML_COMMENT", "BLANKS"
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
		"\u0004\u0000\u0007\u0084\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0003\u0002\u001b\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0004\u0002\u001f\b\u0002\u000b\u0002\f\u0002 \u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002&\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0003\u0003*\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"/\b\u0003\n\u0003\f\u00032\t\u0003\u0001\u0004\u0001\u0004\u0004\u0004"+
		"6\b\u0004\u000b\u0004\f\u00047\u0001\u0004\u0005\u0004;\b\u0004\n\u0004"+
		"\f\u0004>\t\u0004\u0003\u0004@\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005F\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"J\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005N\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006]\b\u0006\u0001\u0006\u0003\u0006`\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007f\b\u0007\n\u0007\f\u0007i\t\u0007"+
		"\u0001\u0007\u0003\u0007l\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0005\bt\b\b\n\b\f\bw\t\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0004\t\u007f\b\t\u000b\t\f\t\u0080\u0001\t\u0001\t"+
		"\u0002gu\u0000\n\u0001\u0000\u0003\u0000\u0005\u0000\u0007\u0001\t\u0002"+
		"\u000b\u0003\r\u0004\u000f\u0005\u0011\u0006\u0013\u0007\u0001\u0000\u0006"+
		"\u0001\u000009\u0002\u0000AZaz\u0001\u000019\u0002\u0000EEee\u0002\u0001"+
		"\n\n\r\r\u0003\u0000\t\n\r\r  \u0094\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0001\u0015"+
		"\u0001\u0000\u0000\u0000\u0003\u0017\u0001\u0000\u0000\u0000\u0005%\u0001"+
		"\u0000\u0000\u0000\u0007)\u0001\u0000\u0000\u0000\t?\u0001\u0000\u0000"+
		"\u0000\u000bM\u0001\u0000\u0000\u0000\r_\u0001\u0000\u0000\u0000\u000f"+
		"a\u0001\u0000\u0000\u0000\u0011o\u0001\u0000\u0000\u0000\u0013~\u0001"+
		"\u0000\u0000\u0000\u0015\u0016\u0007\u0000\u0000\u0000\u0016\u0002\u0001"+
		"\u0000\u0000\u0000\u0017\u0018\u0007\u0001\u0000\u0000\u0018\u0004\u0001"+
		"\u0000\u0000\u0000\u0019\u001b\u0003\t\u0004\u0000\u001a\u0019\u0001\u0000"+
		"\u0000\u0000\u001a\u001b\u0001\u0000\u0000\u0000\u001b\u001c\u0001\u0000"+
		"\u0000\u0000\u001c\u001e\u0005.\u0000\u0000\u001d\u001f\u0003\u0001\u0000"+
		"\u0000\u001e\u001d\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000"+
		" \u001e\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000!&\u0001\u0000"+
		"\u0000\u0000\"#\u0003\t\u0004\u0000#$\u0005.\u0000\u0000$&\u0001\u0000"+
		"\u0000\u0000%\u001a\u0001\u0000\u0000\u0000%\"\u0001\u0000\u0000\u0000"+
		"&\u0006\u0001\u0000\u0000\u0000\'*\u0003\u0003\u0001\u0000(*\u0005_\u0000"+
		"\u0000)\'\u0001\u0000\u0000\u0000)(\u0001\u0000\u0000\u0000*0\u0001\u0000"+
		"\u0000\u0000+/\u0003\u0003\u0001\u0000,/\u0003\u0001\u0000\u0000-/\u0005"+
		"_\u0000\u0000.+\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000.-\u0001"+
		"\u0000\u0000\u0000/2\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u0000"+
		"01\u0001\u0000\u0000\u00001\b\u0001\u0000\u0000\u000020\u0001\u0000\u0000"+
		"\u00003@\u00050\u0000\u000046\u0007\u0002\u0000\u000054\u0001\u0000\u0000"+
		"\u000067\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u000078\u0001\u0000"+
		"\u0000\u00008<\u0001\u0000\u0000\u00009;\u0003\u0001\u0000\u0000:9\u0001"+
		"\u0000\u0000\u0000;>\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000"+
		"<=\u0001\u0000\u0000\u0000=@\u0001\u0000\u0000\u0000><\u0001\u0000\u0000"+
		"\u0000?3\u0001\u0000\u0000\u0000?5\u0001\u0000\u0000\u0000@\n\u0001\u0000"+
		"\u0000\u0000AN\u0003\u0005\u0002\u0000BN\u0003\t\u0004\u0000CF\u0003\u0005"+
		"\u0002\u0000DF\u0003\t\u0004\u0000EC\u0001\u0000\u0000\u0000ED\u0001\u0000"+
		"\u0000\u0000FG\u0001\u0000\u0000\u0000GI\u0007\u0003\u0000\u0000HJ\u0005"+
		"-\u0000\u0000IH\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JK\u0001"+
		"\u0000\u0000\u0000KL\u0003\t\u0004\u0000LN\u0001\u0000\u0000\u0000MA\u0001"+
		"\u0000\u0000\u0000MB\u0001\u0000\u0000\u0000ME\u0001\u0000\u0000\u0000"+
		"N\f\u0001\u0000\u0000\u0000OP\u0005\'\u0000\u0000PQ\t\u0000\u0000\u0000"+
		"Q`\u0005\'\u0000\u0000RS\u0005\'\u0000\u0000ST\u0005\\\u0000\u0000TU\u0003"+
		"\t\u0004\u0000UV\u0005\'\u0000\u0000V`\u0001\u0000\u0000\u0000W\\\u0005"+
		"\'\u0000\u0000XY\u0005\\\u0000\u0000Y]\u0005t\u0000\u0000Z[\u0005\\\u0000"+
		"\u0000[]\u0005n\u0000\u0000\\X\u0001\u0000\u0000\u0000\\Z\u0001\u0000"+
		"\u0000\u0000]^\u0001\u0000\u0000\u0000^`\u0005\'\u0000\u0000_O\u0001\u0000"+
		"\u0000\u0000_R\u0001\u0000\u0000\u0000_W\u0001\u0000\u0000\u0000`\u000e"+
		"\u0001\u0000\u0000\u0000ab\u0005/\u0000\u0000bc\u0005/\u0000\u0000cg\u0001"+
		"\u0000\u0000\u0000df\t\u0000\u0000\u0000ed\u0001\u0000\u0000\u0000fi\u0001"+
		"\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000"+
		"hk\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000jl\u0007\u0004\u0000"+
		"\u0000kj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mn\u0006\u0007"+
		"\u0000\u0000n\u0010\u0001\u0000\u0000\u0000op\u0005/\u0000\u0000pq\u0005"+
		"*\u0000\u0000qu\u0001\u0000\u0000\u0000rt\t\u0000\u0000\u0000sr\u0001"+
		"\u0000\u0000\u0000tw\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000"+
		"us\u0001\u0000\u0000\u0000vx\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000"+
		"\u0000xy\u0005*\u0000\u0000yz\u0005/\u0000\u0000z{\u0001\u0000\u0000\u0000"+
		"{|\u0006\b\u0000\u0000|\u0012\u0001\u0000\u0000\u0000}\u007f\u0007\u0005"+
		"\u0000\u0000~}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000"+
		"\u0080~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081"+
		"\u0082\u0001\u0000\u0000\u0000\u0082\u0083\u0006\t\u0000\u0000\u0083\u0014"+
		"\u0001\u0000\u0000\u0000\u0013\u0000\u001a %).07<?EIM\\_gku\u0080\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}