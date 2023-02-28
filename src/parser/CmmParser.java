// Generated from java-escape by ANTLR 4.11.1
package parser;

    import ast.*;
    import ast.definitions.*;
    import ast.expressions.*;
    import ast.statements.*;
    import ast.types.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CmmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, ID=37, INT_CONSTANT=38, 
		REAL_CONSTANT=39, CHAR_CONSTANT=40, SL_COMMENT=41, ML_COMMENT=42, BLANKS=43;
	public static final int
		RULE_program = 0, RULE_main = 1, RULE_expression = 2, RULE_statement = 3, 
		RULE_type = 4, RULE_builtInType = 5, RULE_recordField = 6, RULE_definition = 7, 
		RULE_functionDefinition = 8, RULE_variableDefinition = 9, RULE_block = 10, 
		RULE_funcInvocation = 11, RULE_functionBody = 12, RULE_params = 13, RULE_args = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "main", "expression", "statement", "type", "builtInType", 
			"recordField", "definition", "functionDefinition", "variableDefinition", 
			"block", "funcInvocation", "functionBody", "params", "args"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'void'", "'main'", "'('", "')'", "'['", "']'", "'.'", "'-'", "'!'", 
			"'*'", "'/'", "'%'", "'+'", "'<'", "'<='", "'>'", "'>='", "'!='", "'=='", 
			"'&&'", "'||'", "'='", "';'", "'if'", "'else'", "'read'", "','", "'return'", 
			"'write'", "'while'", "'struct'", "'{'", "'}'", "'int'", "'double'", 
			"'char'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
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

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CmmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CmmParser.EOF, 0); }
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(30);
					definition();
					}
					} 
				}
				setState(35);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(36);
			main();
			setState(37);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainContext extends ParserRuleContext {
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(T__0);
			setState(40);
			match(T__1);
			setState(41);
			match(T__2);
			setState(42);
			match(T__3);
			setState(43);
			functionBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public Expression ast;
		public ExpressionContext e1;
		public FuncInvocationContext f1;
		public TypeContext t1;
		public Token i1;
		public Token ID;
		public Token op;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FuncInvocationContext funcInvocation() {
			return getRuleContext(FuncInvocationContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode INT_CONSTANT() { return getToken(CmmParser.INT_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(CmmParser.CHAR_CONSTANT, 0); }
		public TerminalNode REAL_CONSTANT() { return getToken(CmmParser.REAL_CONSTANT, 0); }
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(46);
				match(T__2);
				setState(47);
				((ExpressionContext)_localctx).e1 = expression(0);
				setState(48);
				match(T__3);
				((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).e1.ast;
				}
				break;
			case 2:
				{
				setState(51);
				((ExpressionContext)_localctx).f1 = funcInvocation();
				_localctx.ast = ((ExpressionContext)_localctx).f1.ast
				}
				break;
			case 3:
				{
				setState(54);
				match(T__2);
				setState(55);
				((ExpressionContext)_localctx).t1 = type(0);
				setState(56);
				match(T__3);
				setState(57);
				((ExpressionContext)_localctx).e1 = expression(11);
				((ExpressionContext)_localctx).ast =  new Cast(((ExpressionContext)_localctx).t1.ast.getLine(), ((ExpressionContext)_localctx).t1.ast.getColumn(), ((ExpressionContext)_localctx).t1.ast, ((ExpressionContext)_localctx).e1.ast);
				}
				break;
			case 4:
				{
				setState(60);
				match(T__7);
				setState(61);
				((ExpressionContext)_localctx).e1 = expression(10);
				((ExpressionContext)_localctx).ast =  new UnaryMinus(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), ((ExpressionContext)_localctx).e1.ast);
				}
				break;
			case 5:
				{
				setState(64);
				match(T__8);
				setState(65);
				((ExpressionContext)_localctx).e1 = expression(9);
				((ExpressionContext)_localctx).ast =  new UnaryNot(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), ((ExpressionContext)_localctx).e1.ast);
				}
				break;
			case 6:
				{
				setState(68);
				((ExpressionContext)_localctx).i1 = match(INT_CONSTANT);
				((ExpressionContext)_localctx).ast =  new IntLiteral(((ExpressionContext)_localctx).i1.getLine(), ((ExpressionContext)_localctx).i1.getCharPositionInLine()+1, LexerHelper.lexemeToInt((((ExpressionContext)_localctx).i1!=null?((ExpressionContext)_localctx).i1.getText():null)));
				}
				break;
			case 7:
				{
				setState(70);
				((ExpressionContext)_localctx).i1 = match(CHAR_CONSTANT);
				((ExpressionContext)_localctx).ast =  new CharLiteral(((ExpressionContext)_localctx).i1.getLine(), ((ExpressionContext)_localctx).i1.getCharPositionInLine()+1, LexerHelper.lexemeToChar((((ExpressionContext)_localctx).i1!=null?((ExpressionContext)_localctx).i1.getText():null)));
				}
				break;
			case 8:
				{
				setState(72);
				((ExpressionContext)_localctx).i1 = match(REAL_CONSTANT);
				((ExpressionContext)_localctx).ast =  new DoubleLiteral(((ExpressionContext)_localctx).i1.getLine(), ((ExpressionContext)_localctx).i1.getCharPositionInLine()+1, LexerHelper.lexemeToReal((((ExpressionContext)_localctx).i1!=null?((ExpressionContext)_localctx).i1.getText():null)));
				}
				break;
			case 9:
				{
				setState(74);
				((ExpressionContext)_localctx).ID = match(ID);
				((ExpressionContext)_localctx).ast =  new Variable(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(110);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(108);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(78);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(79);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 7168L) != 0) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(80);
						((ExpressionContext)_localctx).e2 = expression(9);
						((ExpressionContext)_localctx).ast =  new Arithmetic(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), ((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast, (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null));
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(83);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(84);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__7 || _la==T__12) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(85);
						((ExpressionContext)_localctx).e2 = expression(8);
						((ExpressionContext)_localctx).ast =  new Arithmetic(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), ((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast, (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null));
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(88);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(89);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 1032192L) != 0) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(90);
						((ExpressionContext)_localctx).e2 = expression(7);
						((ExpressionContext)_localctx).ast =  new Comparison(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), ((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast, (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null));
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(93);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(94);
						_la = _input.LA(1);
						if ( !(_la==T__19 || _la==T__20) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(95);
						((ExpressionContext)_localctx).e2 = expression(6);
						((ExpressionContext)_localctx).ast =  new Logical(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), ((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast, (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null));
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(98);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(99);
						match(T__4);
						setState(100);
						((ExpressionContext)_localctx).e2 = expression(0);
						setState(101);
						match(T__5);
						((ExpressionContext)_localctx).ast =  new ArrayAccess(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), ((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(104);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(105);
						match(T__6);
						setState(106);
						((ExpressionContext)_localctx).ID = match(ID);
						((ExpressionContext)_localctx).ast =  new FieldAccess(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), ((ExpressionContext)_localctx).e1.ast, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null));
						}
						break;
					}
					} 
				}
				setState(112);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public ExpressionContext e1;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FuncInvocationContext funcInvocation() {
			return getRuleContext(FuncInvocationContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		int _la;
		try {
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				((StatementContext)_localctx).e1 = expression(0);
				setState(114);
				match(T__21);
				setState(115);
				((StatementContext)_localctx).e2 = expression(0);
				setState(116);
				match(T__22);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				funcInvocation();
				setState(119);
				match(T__22);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				match(T__23);
				setState(122);
				match(T__2);
				setState(123);
				((StatementContext)_localctx).e1 = expression(0);
				setState(124);
				match(T__3);
				setState(125);
				block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(127);
				match(T__23);
				setState(128);
				match(T__2);
				setState(129);
				((StatementContext)_localctx).e1 = expression(0);
				setState(130);
				match(T__3);
				setState(131);
				block();
				setState(132);
				match(T__24);
				setState(133);
				block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(135);
				match(T__25);
				setState(136);
				((StatementContext)_localctx).e1 = expression(0);
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__26) {
					{
					{
					setState(137);
					match(T__26);
					setState(138);
					((StatementContext)_localctx).e2 = expression(0);
					}
					}
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(144);
				match(T__22);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(146);
				match(T__27);
				setState(147);
				((StatementContext)_localctx).e1 = expression(0);
				setState(148);
				match(T__22);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(150);
				match(T__28);
				setState(151);
				((StatementContext)_localctx).e1 = expression(0);
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__26) {
					{
					{
					setState(152);
					match(T__26);
					setState(153);
					((StatementContext)_localctx).e2 = expression(0);
					}
					}
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(159);
				match(T__22);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(161);
				match(T__29);
				setState(162);
				match(T__2);
				setState(163);
				((StatementContext)_localctx).e1 = expression(0);
				setState(164);
				match(T__3);
				setState(165);
				block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public Type ast;
		public TypeContext t1;
		public BuiltInTypeContext builtInType() {
			return getRuleContext(BuiltInTypeContext.class,0);
		}
		public List<RecordFieldContext> recordField() {
			return getRuleContexts(RecordFieldContext.class);
		}
		public RecordFieldContext recordField(int i) {
			return getRuleContext(RecordFieldContext.class,i);
		}
		public List<TerminalNode> INT_CONSTANT() { return getTokens(CmmParser.INT_CONSTANT); }
		public TerminalNode INT_CONSTANT(int i) {
			return getToken(CmmParser.INT_CONSTANT, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_type, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
			case T__34:
			case T__35:
				{
				setState(170);
				builtInType();
				}
				break;
			case T__0:
				{
				setState(171);
				match(T__0);
				}
				break;
			case T__30:
				{
				setState(172);
				match(T__30);
				setState(173);
				match(T__31);
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 122406567938L) != 0) {
					{
					{
					setState(174);
					recordField();
					}
					}
					setState(179);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(180);
				match(T__32);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(197);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					_localctx.t1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(183);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(184);
					match(T__4);
					setState(185);
					match(INT_CONSTANT);
					setState(186);
					match(T__5);
					setState(192);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(187);
							match(T__4);
							setState(188);
							match(INT_CONSTANT);
							setState(189);
							match(T__5);
							}
							} 
						}
						setState(194);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
					}
					}
					} 
				}
				setState(199);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BuiltInTypeContext extends ParserRuleContext {
		public BuiltInTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtInType; }
	}

	public final BuiltInTypeContext builtInType() throws RecognitionException {
		BuiltInTypeContext _localctx = new BuiltInTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_builtInType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 120259084288L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RecordFieldContext extends ParserRuleContext {
		public TypeContext t1;
		public List<TerminalNode> ID() { return getTokens(CmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CmmParser.ID, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public RecordFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordField; }
	}

	public final RecordFieldContext recordField() throws RecognitionException {
		RecordFieldContext _localctx = new RecordFieldContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_recordField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			((RecordFieldContext)_localctx).t1 = type(0);
			setState(203);
			match(ID);
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__26) {
				{
				{
				setState(204);
				match(T__26);
				setState(205);
				match(ID);
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(211);
			match(T__22);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefinitionContext extends ParserRuleContext {
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public VariableDefinitionContext variableDefinition() {
			return getRuleContext(VariableDefinitionContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_definition);
		try {
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				functionDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				variableDefinition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDefinitionContext extends ParserRuleContext {
		public BuiltInTypeContext t1;
		public Token idF;
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public BuiltInTypeContext builtInType() {
			return getRuleContext(BuiltInTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionDefinition);
		int _la;
		try {
			setState(234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
			case T__34:
			case T__35:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				((FunctionDefinitionContext)_localctx).t1 = builtInType();
				setState(218);
				((FunctionDefinitionContext)_localctx).idF = match(ID);
				setState(219);
				match(T__2);
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 120259084288L) != 0) {
					{
					setState(220);
					params();
					}
				}

				setState(223);
				match(T__3);
				setState(224);
				functionBody();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				match(T__0);
				setState(227);
				((FunctionDefinitionContext)_localctx).idF = match(ID);
				setState(228);
				match(T__2);
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 120259084288L) != 0) {
					{
					setState(229);
					params();
					}
				}

				setState(232);
				match(T__3);
				setState(233);
				functionBody();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDefinitionContext extends ParserRuleContext {
		public Token id1;
		public Token id2;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(CmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CmmParser.ID, i);
		}
		public VariableDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDefinition; }
	}

	public final VariableDefinitionContext variableDefinition() throws RecognitionException {
		VariableDefinitionContext _localctx = new VariableDefinitionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variableDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			type(0);
			setState(237);
			((VariableDefinitionContext)_localctx).id1 = match(ID);
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__26) {
				{
				{
				setState(238);
				match(T__26);
				setState(239);
				((VariableDefinitionContext)_localctx).id2 = match(ID);
				}
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(245);
			match(T__22);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_block);
		int _la;
		try {
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__7:
			case T__8:
			case T__23:
			case T__25:
			case T__27:
			case T__28:
			case T__29:
			case ID:
			case INT_CONSTANT:
			case REAL_CONSTANT:
			case CHAR_CONSTANT:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				statement();
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				match(T__31);
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 2063547237128L) != 0) {
					{
					{
					setState(249);
					statement();
					}
					}
					setState(254);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(255);
				match(T__32);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncInvocationContext extends ParserRuleContext {
		public FunctionInvocation ast;
		public Token ID;
		public ArgsContext args;
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public FuncInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcInvocation; }
	}

	public final FuncInvocationContext funcInvocation() throws RecognitionException {
		FuncInvocationContext _localctx = new FuncInvocationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_funcInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			((FuncInvocationContext)_localctx).ID = match(ID);
			setState(259);
			match(T__2);
			setState(260);
			((FuncInvocationContext)_localctx).args = args();
			setState(261);
			match(T__3);
			((FuncInvocationContext)_localctx).ast =  new FunctionInvocation(((FuncInvocationContext)_localctx).ID.getLine(), ((FuncInvocationContext)_localctx).ID.getCharPositionInLine()+1,
			                                                                  new Variable(((FuncInvocationContext)_localctx).ID.getLine(), ((FuncInvocationContext)_localctx).ID.getCharPositionInLine()+1)),
			                                                                    ((FuncInvocationContext)_localctx).args.ast);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionBodyContext extends ParserRuleContext {
		public List<VariableDefinitionContext> variableDefinition() {
			return getRuleContexts(VariableDefinitionContext.class);
		}
		public VariableDefinitionContext variableDefinition(int i) {
			return getRuleContext(VariableDefinitionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(T__31);
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 122406567938L) != 0) {
				{
				{
				setState(265);
				variableDefinition();
				}
				}
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 2063547237128L) != 0) {
				{
				{
				setState(271);
				statement();
				}
				}
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(277);
			match(T__32);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamsContext extends ParserRuleContext {
		public BuiltInTypeContext t1;
		public Token id1;
		public BuiltInTypeContext t2;
		public Token id2;
		public List<BuiltInTypeContext> builtInType() {
			return getRuleContexts(BuiltInTypeContext.class);
		}
		public BuiltInTypeContext builtInType(int i) {
			return getRuleContext(BuiltInTypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(CmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CmmParser.ID, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			((ParamsContext)_localctx).t1 = builtInType();
			setState(280);
			((ParamsContext)_localctx).id1 = match(ID);
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__26) {
				{
				{
				setState(281);
				match(T__26);
				setState(282);
				((ParamsContext)_localctx).t2 = builtInType();
				setState(283);
				((ParamsContext)_localctx).id2 = match(ID);
				}
				}
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgsContext extends ParserRuleContext {
		public List<Expression> ast = new ArrayList<>();
		public ExpressionContext e1;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_args);
		int _la;
		try {
			setState(302);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__7:
			case T__8:
			case ID:
			case INT_CONSTANT:
			case REAL_CONSTANT:
			case CHAR_CONSTANT:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(290);
				((ArgsContext)_localctx).e1 = expression(0);
				_localctx.ast.add(((ArgsContext)_localctx).e1.ast)
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__26) {
					{
					{
					setState(292);
					match(T__26);
					setState(293);
					((ArgsContext)_localctx).e2 = expression(0);
					_localctx.ast.add(((ArgsContext)_localctx).e2.ast)
					}
					}
					setState(300);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 4:
			return type_sempred((TypeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 12);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001+\u0131\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0005\u0000"+
		" \b\u0000\n\u0000\f\u0000#\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002M\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002m\b\u0002\n\u0002\f\u0002"+
		"p\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u008c\b\u0003\n\u0003"+
		"\f\u0003\u008f\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003\u009b\b\u0003\n\u0003\f\u0003\u009e\t\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003\u00a8\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00b0\b\u0004\n\u0004\f\u0004"+
		"\u00b3\t\u0004\u0001\u0004\u0003\u0004\u00b6\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004\u00bf\b\u0004\n\u0004\f\u0004\u00c2\t\u0004\u0005\u0004\u00c4\b"+
		"\u0004\n\u0004\f\u0004\u00c7\t\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00cf\b\u0006\n\u0006"+
		"\f\u0006\u00d2\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u00d8\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00de"+
		"\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00e7"+
		"\b\b\u0001\b\u0001\b\u0003\b\u00eb\b\b\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0005\t\u00f1\b\t\n\t\f\t\u00f4\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0005\n\u00fb\b\n\n\n\f\n\u00fe\t\n\u0001\n\u0003\n\u0101\b\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0005\f\u010b\b\f\n\f\f\f\u010e\t\f\u0001\f\u0005\f\u0111\b"+
		"\f\n\f\f\f\u0114\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0005\r\u011e\b\r\n\r\f\r\u0121\t\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0129\b\u000e"+
		"\n\u000e\f\u000e\u012c\t\u000e\u0001\u000e\u0003\u000e\u012f\b\u000e\u0001"+
		"\u000e\u0000\u0002\u0004\b\u000f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u0000\u0005\u0001\u0000\n\f\u0002"+
		"\u0000\b\b\r\r\u0001\u0000\u000e\u0013\u0001\u0000\u0014\u0015\u0001\u0000"+
		"\"$\u014b\u0000!\u0001\u0000\u0000\u0000\u0002\'\u0001\u0000\u0000\u0000"+
		"\u0004L\u0001\u0000\u0000\u0000\u0006\u00a7\u0001\u0000\u0000\u0000\b"+
		"\u00b5\u0001\u0000\u0000\u0000\n\u00c8\u0001\u0000\u0000\u0000\f\u00ca"+
		"\u0001\u0000\u0000\u0000\u000e\u00d7\u0001\u0000\u0000\u0000\u0010\u00ea"+
		"\u0001\u0000\u0000\u0000\u0012\u00ec\u0001\u0000\u0000\u0000\u0014\u0100"+
		"\u0001\u0000\u0000\u0000\u0016\u0102\u0001\u0000\u0000\u0000\u0018\u0108"+
		"\u0001\u0000\u0000\u0000\u001a\u0117\u0001\u0000\u0000\u0000\u001c\u012e"+
		"\u0001\u0000\u0000\u0000\u001e \u0003\u000e\u0007\u0000\u001f\u001e\u0001"+
		"\u0000\u0000\u0000 #\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000"+
		"\u0000!\"\u0001\u0000\u0000\u0000\"$\u0001\u0000\u0000\u0000#!\u0001\u0000"+
		"\u0000\u0000$%\u0003\u0002\u0001\u0000%&\u0005\u0000\u0000\u0001&\u0001"+
		"\u0001\u0000\u0000\u0000\'(\u0005\u0001\u0000\u0000()\u0005\u0002\u0000"+
		"\u0000)*\u0005\u0003\u0000\u0000*+\u0005\u0004\u0000\u0000+,\u0003\u0018"+
		"\f\u0000,\u0003\u0001\u0000\u0000\u0000-.\u0006\u0002\uffff\uffff\u0000"+
		"./\u0005\u0003\u0000\u0000/0\u0003\u0004\u0002\u000001\u0005\u0004\u0000"+
		"\u000012\u0006\u0002\uffff\uffff\u00002M\u0001\u0000\u0000\u000034\u0003"+
		"\u0016\u000b\u000045\u0006\u0002\uffff\uffff\u00005M\u0001\u0000\u0000"+
		"\u000067\u0005\u0003\u0000\u000078\u0003\b\u0004\u000089\u0005\u0004\u0000"+
		"\u00009:\u0003\u0004\u0002\u000b:;\u0006\u0002\uffff\uffff\u0000;M\u0001"+
		"\u0000\u0000\u0000<=\u0005\b\u0000\u0000=>\u0003\u0004\u0002\n>?\u0006"+
		"\u0002\uffff\uffff\u0000?M\u0001\u0000\u0000\u0000@A\u0005\t\u0000\u0000"+
		"AB\u0003\u0004\u0002\tBC\u0006\u0002\uffff\uffff\u0000CM\u0001\u0000\u0000"+
		"\u0000DE\u0005&\u0000\u0000EM\u0006\u0002\uffff\uffff\u0000FG\u0005(\u0000"+
		"\u0000GM\u0006\u0002\uffff\uffff\u0000HI\u0005\'\u0000\u0000IM\u0006\u0002"+
		"\uffff\uffff\u0000JK\u0005%\u0000\u0000KM\u0006\u0002\uffff\uffff\u0000"+
		"L-\u0001\u0000\u0000\u0000L3\u0001\u0000\u0000\u0000L6\u0001\u0000\u0000"+
		"\u0000L<\u0001\u0000\u0000\u0000L@\u0001\u0000\u0000\u0000LD\u0001\u0000"+
		"\u0000\u0000LF\u0001\u0000\u0000\u0000LH\u0001\u0000\u0000\u0000LJ\u0001"+
		"\u0000\u0000\u0000Mn\u0001\u0000\u0000\u0000NO\n\b\u0000\u0000OP\u0007"+
		"\u0000\u0000\u0000PQ\u0003\u0004\u0002\tQR\u0006\u0002\uffff\uffff\u0000"+
		"Rm\u0001\u0000\u0000\u0000ST\n\u0007\u0000\u0000TU\u0007\u0001\u0000\u0000"+
		"UV\u0003\u0004\u0002\bVW\u0006\u0002\uffff\uffff\u0000Wm\u0001\u0000\u0000"+
		"\u0000XY\n\u0006\u0000\u0000YZ\u0007\u0002\u0000\u0000Z[\u0003\u0004\u0002"+
		"\u0007[\\\u0006\u0002\uffff\uffff\u0000\\m\u0001\u0000\u0000\u0000]^\n"+
		"\u0005\u0000\u0000^_\u0007\u0003\u0000\u0000_`\u0003\u0004\u0002\u0006"+
		"`a\u0006\u0002\uffff\uffff\u0000am\u0001\u0000\u0000\u0000bc\n\r\u0000"+
		"\u0000cd\u0005\u0005\u0000\u0000de\u0003\u0004\u0002\u0000ef\u0005\u0006"+
		"\u0000\u0000fg\u0006\u0002\uffff\uffff\u0000gm\u0001\u0000\u0000\u0000"+
		"hi\n\f\u0000\u0000ij\u0005\u0007\u0000\u0000jk\u0005%\u0000\u0000km\u0006"+
		"\u0002\uffff\uffff\u0000lN\u0001\u0000\u0000\u0000lS\u0001\u0000\u0000"+
		"\u0000lX\u0001\u0000\u0000\u0000l]\u0001\u0000\u0000\u0000lb\u0001\u0000"+
		"\u0000\u0000lh\u0001\u0000\u0000\u0000mp\u0001\u0000\u0000\u0000nl\u0001"+
		"\u0000\u0000\u0000no\u0001\u0000\u0000\u0000o\u0005\u0001\u0000\u0000"+
		"\u0000pn\u0001\u0000\u0000\u0000qr\u0003\u0004\u0002\u0000rs\u0005\u0016"+
		"\u0000\u0000st\u0003\u0004\u0002\u0000tu\u0005\u0017\u0000\u0000u\u00a8"+
		"\u0001\u0000\u0000\u0000vw\u0003\u0016\u000b\u0000wx\u0005\u0017\u0000"+
		"\u0000x\u00a8\u0001\u0000\u0000\u0000yz\u0005\u0018\u0000\u0000z{\u0005"+
		"\u0003\u0000\u0000{|\u0003\u0004\u0002\u0000|}\u0005\u0004\u0000\u0000"+
		"}~\u0003\u0014\n\u0000~\u00a8\u0001\u0000\u0000\u0000\u007f\u0080\u0005"+
		"\u0018\u0000\u0000\u0080\u0081\u0005\u0003\u0000\u0000\u0081\u0082\u0003"+
		"\u0004\u0002\u0000\u0082\u0083\u0005\u0004\u0000\u0000\u0083\u0084\u0003"+
		"\u0014\n\u0000\u0084\u0085\u0005\u0019\u0000\u0000\u0085\u0086\u0003\u0014"+
		"\n\u0000\u0086\u00a8\u0001\u0000\u0000\u0000\u0087\u0088\u0005\u001a\u0000"+
		"\u0000\u0088\u008d\u0003\u0004\u0002\u0000\u0089\u008a\u0005\u001b\u0000"+
		"\u0000\u008a\u008c\u0003\u0004\u0002\u0000\u008b\u0089\u0001\u0000\u0000"+
		"\u0000\u008c\u008f\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000"+
		"\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u0090\u0001\u0000\u0000"+
		"\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u0090\u0091\u0005\u0017\u0000"+
		"\u0000\u0091\u00a8\u0001\u0000\u0000\u0000\u0092\u0093\u0005\u001c\u0000"+
		"\u0000\u0093\u0094\u0003\u0004\u0002\u0000\u0094\u0095\u0005\u0017\u0000"+
		"\u0000\u0095\u00a8\u0001\u0000\u0000\u0000\u0096\u0097\u0005\u001d\u0000"+
		"\u0000\u0097\u009c\u0003\u0004\u0002\u0000\u0098\u0099\u0005\u001b\u0000"+
		"\u0000\u0099\u009b\u0003\u0004\u0002\u0000\u009a\u0098\u0001\u0000\u0000"+
		"\u0000\u009b\u009e\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000"+
		"\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009f\u0001\u0000\u0000"+
		"\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\u0017\u0000"+
		"\u0000\u00a0\u00a8\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005\u001e\u0000"+
		"\u0000\u00a2\u00a3\u0005\u0003\u0000\u0000\u00a3\u00a4\u0003\u0004\u0002"+
		"\u0000\u00a4\u00a5\u0005\u0004\u0000\u0000\u00a5\u00a6\u0003\u0014\n\u0000"+
		"\u00a6\u00a8\u0001\u0000\u0000\u0000\u00a7q\u0001\u0000\u0000\u0000\u00a7"+
		"v\u0001\u0000\u0000\u0000\u00a7y\u0001\u0000\u0000\u0000\u00a7\u007f\u0001"+
		"\u0000\u0000\u0000\u00a7\u0087\u0001\u0000\u0000\u0000\u00a7\u0092\u0001"+
		"\u0000\u0000\u0000\u00a7\u0096\u0001\u0000\u0000\u0000\u00a7\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a8\u0007\u0001\u0000\u0000\u0000\u00a9\u00aa\u0006"+
		"\u0004\uffff\uffff\u0000\u00aa\u00b6\u0003\n\u0005\u0000\u00ab\u00b6\u0005"+
		"\u0001\u0000\u0000\u00ac\u00ad\u0005\u001f\u0000\u0000\u00ad\u00b1\u0005"+
		" \u0000\u0000\u00ae\u00b0\u0003\f\u0006\u0000\u00af\u00ae\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b3\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b4\u00b6\u0005!\u0000"+
		"\u0000\u00b5\u00a9\u0001\u0000\u0000\u0000\u00b5\u00ab\u0001\u0000\u0000"+
		"\u0000\u00b5\u00ac\u0001\u0000\u0000\u0000\u00b6\u00c5\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b8\n\u0001\u0000\u0000\u00b8\u00b9\u0005\u0005\u0000\u0000"+
		"\u00b9\u00ba\u0005&\u0000\u0000\u00ba\u00c0\u0005\u0006\u0000\u0000\u00bb"+
		"\u00bc\u0005\u0005\u0000\u0000\u00bc\u00bd\u0005&\u0000\u0000\u00bd\u00bf"+
		"\u0005\u0006\u0000\u0000\u00be\u00bb\u0001\u0000\u0000\u0000\u00bf\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0\u00c1"+
		"\u0001\u0000\u0000\u0000\u00c1\u00c4\u0001\u0000\u0000\u0000\u00c2\u00c0"+
		"\u0001\u0000\u0000\u0000\u00c3\u00b7\u0001\u0000\u0000\u0000\u00c4\u00c7"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c6\t\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c9\u0007\u0004\u0000\u0000\u00c9\u000b\u0001"+
		"\u0000\u0000\u0000\u00ca\u00cb\u0003\b\u0004\u0000\u00cb\u00d0\u0005%"+
		"\u0000\u0000\u00cc\u00cd\u0005\u001b\u0000\u0000\u00cd\u00cf\u0005%\u0000"+
		"\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00cf\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d3\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d4\u0005\u0017\u0000\u0000\u00d4\r\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d8\u0003\u0010\b\u0000\u00d6\u00d8\u0003\u0012\t\u0000\u00d7"+
		"\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d6\u0001\u0000\u0000\u0000\u00d8"+
		"\u000f\u0001\u0000\u0000\u0000\u00d9\u00da\u0003\n\u0005\u0000\u00da\u00db"+
		"\u0005%\u0000\u0000\u00db\u00dd\u0005\u0003\u0000\u0000\u00dc\u00de\u0003"+
		"\u001a\r\u0000\u00dd\u00dc\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000"+
		"\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e0\u0005\u0004"+
		"\u0000\u0000\u00e0\u00e1\u0003\u0018\f\u0000\u00e1\u00eb\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e3\u0005\u0001\u0000\u0000\u00e3\u00e4\u0005%\u0000\u0000"+
		"\u00e4\u00e6\u0005\u0003\u0000\u0000\u00e5\u00e7\u0003\u001a\r\u0000\u00e6"+
		"\u00e5\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7"+
		"\u00e8\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005\u0004\u0000\u0000\u00e9"+
		"\u00eb\u0003\u0018\f\u0000\u00ea\u00d9\u0001\u0000\u0000\u0000\u00ea\u00e2"+
		"\u0001\u0000\u0000\u0000\u00eb\u0011\u0001\u0000\u0000\u0000\u00ec\u00ed"+
		"\u0003\b\u0004\u0000\u00ed\u00f2\u0005%\u0000\u0000\u00ee\u00ef\u0005"+
		"\u001b\u0000\u0000\u00ef\u00f1\u0005%\u0000\u0000\u00f0\u00ee\u0001\u0000"+
		"\u0000\u0000\u00f1\u00f4\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000"+
		"\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f5\u0001\u0000"+
		"\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005\u0017"+
		"\u0000\u0000\u00f6\u0013\u0001\u0000\u0000\u0000\u00f7\u0101\u0003\u0006"+
		"\u0003\u0000\u00f8\u00fc\u0005 \u0000\u0000\u00f9\u00fb\u0003\u0006\u0003"+
		"\u0000\u00fa\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fe\u0001\u0000\u0000"+
		"\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000"+
		"\u0000\u00fd\u00ff\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000"+
		"\u0000\u00ff\u0101\u0005!\u0000\u0000\u0100\u00f7\u0001\u0000\u0000\u0000"+
		"\u0100\u00f8\u0001\u0000\u0000\u0000\u0101\u0015\u0001\u0000\u0000\u0000"+
		"\u0102\u0103\u0005%\u0000\u0000\u0103\u0104\u0005\u0003\u0000\u0000\u0104"+
		"\u0105\u0003\u001c\u000e\u0000\u0105\u0106\u0005\u0004\u0000\u0000\u0106"+
		"\u0107\u0006\u000b\uffff\uffff\u0000\u0107\u0017\u0001\u0000\u0000\u0000"+
		"\u0108\u010c\u0005 \u0000\u0000\u0109\u010b\u0003\u0012\t\u0000\u010a"+
		"\u0109\u0001\u0000\u0000\u0000\u010b\u010e\u0001\u0000\u0000\u0000\u010c"+
		"\u010a\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d"+
		"\u0112\u0001\u0000\u0000\u0000\u010e\u010c\u0001\u0000\u0000\u0000\u010f"+
		"\u0111\u0003\u0006\u0003\u0000\u0110\u010f\u0001\u0000\u0000\u0000\u0111"+
		"\u0114\u0001\u0000\u0000\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0112"+
		"\u0113\u0001\u0000\u0000\u0000\u0113\u0115\u0001\u0000\u0000\u0000\u0114"+
		"\u0112\u0001\u0000\u0000\u0000\u0115\u0116\u0005!\u0000\u0000\u0116\u0019"+
		"\u0001\u0000\u0000\u0000\u0117\u0118\u0003\n\u0005\u0000\u0118\u011f\u0005"+
		"%\u0000\u0000\u0119\u011a\u0005\u001b\u0000\u0000\u011a\u011b\u0003\n"+
		"\u0005\u0000\u011b\u011c\u0005%\u0000\u0000\u011c\u011e\u0001\u0000\u0000"+
		"\u0000\u011d\u0119\u0001\u0000\u0000\u0000\u011e\u0121\u0001\u0000\u0000"+
		"\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000\u0000"+
		"\u0000\u0120\u001b\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000"+
		"\u0000\u0122\u0123\u0003\u0004\u0002\u0000\u0123\u012a\u0006\u000e\uffff"+
		"\uffff\u0000\u0124\u0125\u0005\u001b\u0000\u0000\u0125\u0126\u0003\u0004"+
		"\u0002\u0000\u0126\u0127\u0006\u000e\uffff\uffff\u0000\u0127\u0129\u0001"+
		"\u0000\u0000\u0000\u0128\u0124\u0001\u0000\u0000\u0000\u0129\u012c\u0001"+
		"\u0000\u0000\u0000\u012a\u0128\u0001\u0000\u0000\u0000\u012a\u012b\u0001"+
		"\u0000\u0000\u0000\u012b\u012f\u0001\u0000\u0000\u0000\u012c\u012a\u0001"+
		"\u0000\u0000\u0000\u012d\u012f\u0001\u0000\u0000\u0000\u012e\u0122\u0001"+
		"\u0000\u0000\u0000\u012e\u012d\u0001\u0000\u0000\u0000\u012f\u001d\u0001"+
		"\u0000\u0000\u0000\u0018!Lln\u008d\u009c\u00a7\u00b1\u00b5\u00c0\u00c5"+
		"\u00d0\u00d7\u00dd\u00e6\u00ea\u00f2\u00fc\u0100\u010c\u0112\u011f\u012a"+
		"\u012e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}