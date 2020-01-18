// Generated from src/bc/antlr/bc.g4 by ANTLR 4.7.2
package bc.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class bcParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		BigNumberLiteral=46, StringLiteral=47, Identifier=48, DropWS=49;
	public static final int
		RULE_program = 0, RULE_bcStatement = 1, RULE_bcStatementCase = 2, RULE_bcIf = 3, 
		RULE_bcWhile = 4, RULE_bcFor = 5, RULE_bcBreak = 6, RULE_bcContinue = 7, 
		RULE_bcHalt = 8, RULE_bcReturn = 9, RULE_bcBlock = 10, RULE_bcFunctionDefinition = 11, 
		RULE_bcPrint = 12, RULE_printArg = 13, RULE_parameters = 14, RULE_bcAutoList = 15, 
		RULE_bcVarDecl = 16, RULE_bcAssignment = 17, RULE_bcExpr = 18, RULE_bcLogicalOrExpr = 19, 
		RULE_bcLogicalAndExpr = 20, RULE_bcLogicalNotExpr = 21, RULE_bcRelationalOpExpr = 22, 
		RULE_bcAssignmentOpExpr = 23, RULE_bcAdditiveExpr = 24, RULE_bcMultiplicativeExpr = 25, 
		RULE_bcPowerExpr = 26, RULE_bcIncDecExpr = 27, RULE_bcNegExpr = 28, RULE_bcPostFixExpr = 29, 
		RULE_bcVarAccess = 30, RULE_bcFunctionCall = 31, RULE_bcArgs = 32, RULE_bcArg = 33, 
		RULE_bcPrimaryExpr = 34, RULE_bcParExpr = 35, RULE_bcNumber = 36, RULE_bcString = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "bcStatement", "bcStatementCase", "bcIf", "bcWhile", "bcFor", 
			"bcBreak", "bcContinue", "bcHalt", "bcReturn", "bcBlock", "bcFunctionDefinition", 
			"bcPrint", "printArg", "parameters", "bcAutoList", "bcVarDecl", "bcAssignment", 
			"bcExpr", "bcLogicalOrExpr", "bcLogicalAndExpr", "bcLogicalNotExpr", 
			"bcRelationalOpExpr", "bcAssignmentOpExpr", "bcAdditiveExpr", "bcMultiplicativeExpr", 
			"bcPowerExpr", "bcIncDecExpr", "bcNegExpr", "bcPostFixExpr", "bcVarAccess", 
			"bcFunctionCall", "bcArgs", "bcArg", "bcPrimaryExpr", "bcParExpr", "bcNumber", 
			"bcString"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'if'", "'('", "')'", "'else'", "'while'", "'for'", "'break'", 
			"'continue'", "'halt'", "'return'", "'{'", "'}'", "'define'", "'void'", 
			"'print'", "','", "'auto'", "'[]'", "'='", "'||'", "'&&'", "'!'", "'=='", 
			"'!='", "'<='", "'>='", "'<'", "'>'", "'+='", "'-='", "'/='", "'*='", 
			"'%='", "'^='", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'++'", "'--'", 
			"'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "BigNumberLiteral", 
			"StringLiteral", "Identifier", "DropWS"
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
	public String getGrammarFileName() { return "bc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public bcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<BcStatementContext> bcStatement() {
			return getRuleContexts(BcStatementContext.class);
		}
		public BcStatementContext bcStatement(int i) {
			return getRuleContext(BcStatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(76);
				bcStatement();
				}
				}
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__15) | (1L << T__22) | (1L << T__35) | (1L << T__36) | (1L << T__41) | (1L << T__42) | (1L << BigNumberLiteral) | (1L << StringLiteral) | (1L << Identifier))) != 0) );
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

	public static class BcStatementContext extends ParserRuleContext {
		public BcStatementCaseContext bcStatementCase() {
			return getRuleContext(BcStatementCaseContext.class,0);
		}
		public BcStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bcStatement; }
	}

	public final BcStatementContext bcStatement() throws RecognitionException {
		BcStatementContext _localctx = new BcStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bcStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			bcStatementCase();
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(82);
				match(T__0);
				}
				break;
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

	public static class BcStatementCaseContext extends ParserRuleContext {
		public BcIfContext bcIf() {
			return getRuleContext(BcIfContext.class,0);
		}
		public BcWhileContext bcWhile() {
			return getRuleContext(BcWhileContext.class,0);
		}
		public BcForContext bcFor() {
			return getRuleContext(BcForContext.class,0);
		}
		public BcBlockContext bcBlock() {
			return getRuleContext(BcBlockContext.class,0);
		}
		public BcFunctionDefinitionContext bcFunctionDefinition() {
			return getRuleContext(BcFunctionDefinitionContext.class,0);
		}
		public BcBreakContext bcBreak() {
			return getRuleContext(BcBreakContext.class,0);
		}
		public BcContinueContext bcContinue() {
			return getRuleContext(BcContinueContext.class,0);
		}
		public BcReturnContext bcReturn() {
			return getRuleContext(BcReturnContext.class,0);
		}
		public BcHaltContext bcHalt() {
			return getRuleContext(BcHaltContext.class,0);
		}
		public BcPrintContext bcPrint() {
			return getRuleContext(BcPrintContext.class,0);
		}
		public BcExprContext bcExpr() {
			return getRuleContext(BcExprContext.class,0);
		}
		public BcStatementCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bcStatementCase; }
	}

	public final BcStatementCaseContext bcStatementCase() throws RecognitionException {
		BcStatementCaseContext _localctx = new BcStatementCaseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_bcStatementCase);
		try {
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				bcIf();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				bcWhile();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				bcFor();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 4);
				{
				setState(88);
				bcBlock();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 5);
				{
				setState(89);
				bcFunctionDefinition();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 6);
				{
				setState(90);
				bcBreak();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 7);
				{
				setState(91);
				bcContinue();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 8);
				{
				setState(92);
				bcReturn();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 9);
				{
				setState(93);
				bcHalt();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 10);
				{
				setState(94);
				bcPrint();
				}
				break;
			case T__2:
			case T__22:
			case T__35:
			case T__36:
			case T__41:
			case T__42:
			case BigNumberLiteral:
			case StringLiteral:
			case Identifier:
				enterOuterAlt(_localctx, 11);
				{
				setState(95);
				bcExpr();
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

	public static class BcIfContext extends ParserRuleContext {
		public BcExprContext bcExpr() {
			return getRuleContext(BcExprContext.class,0);
		}
		public List<BcStatementContext> bcStatement() {
			return getRuleContexts(BcStatementContext.class);
		}
		public BcStatementContext bcStatement(int i) {
			return getRuleContext(BcStatementContext.class,i);
		}
		public BcIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bcIf; }
	}

	public final BcIfContext bcIf() throws RecognitionException {
		BcIfContext _localctx = new BcIfContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bcIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(T__1);
			setState(99);
			match(T__2);
			setState(100);
			bcExpr();
			setState(101);
			match(T__3);
			setState(102);
			bcStatement();
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(103);
				match(T__4);
				setState(104);
				bcStatement();
				}
				break;
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

	public static class BcWhileContext extends ParserRuleContext {
		public BcExprContext bcExpr() {
			return getRuleContext(BcExprContext.class,0);
		}
		public BcStatementContext bcStatement() {
			return getRuleContext(BcStatementContext.class,0);
		}
		public BcWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bcWhile; }
	}

	public final BcWhileContext bcWhile() throws RecognitionException {
		BcWhileContext _localctx = new BcWhileContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_bcWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(T__5);
			setState(108);
			match(T__2);
			setState(109);
			bcExpr();
			setState(110);
			match(T__3);
			setState(111);
			bcStatement();
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

	public static class BcForContext extends ParserRuleContext {
		public BcStatementContext bcStatement() {
			return getRuleContext(BcStatementContext.class,0);
		}
		public List<BcExprContext> bcExpr() {
			return getRuleContexts(BcExprContext.class);
		}
		public BcExprContext bcExpr(int i) {
			return getRuleContext(BcExprContext.class,i);
		}
		public BcForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bcFor; }
	}

	public final BcForContext bcFor() throws RecognitionException {
		BcForContext _localctx = new BcForContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bcFor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(T__6);
			setState(114);
			match(T__2);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__22) | (1L << T__35) | (1L << T__36) | (1L << T__41) | (1L << T__42) | (1L << BigNumberLiteral) | (1L << StringLiteral) | (1L << Identifier))) != 0)) {
				{
				setState(115);
				bcExpr();
				}
			}

			setState(118);
			match(T__0);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__22) | (1L << T__35) | (1L << T__36) | (1L << T__41) | (1L << T__42) | (1L << BigNumberLiteral) | (1L << StringLiteral) | (1L << Identifier))) != 0)) {
				{
				setState(119);
				bcExpr();
				}
			}

			setState(122);
			match(T__0);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__22) | (1L << T__35) | (1L << T__36) | (1L << T__41) | (1L << T__42) | (1L << BigNumberLiteral) | (1L << StringLiteral) | (1L << Identifier))) != 0)) {
				{
				setState(123);
				bcExpr();
				}
			}

			setState(126);
			match(T__3);
			setState(127);
			bcStatement();
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

	public static class BcBreakContext extends ParserRuleContext {
		public BcBreakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bcBreak; }
	}

	public final BcBreakContext bcBreak() throws RecognitionException {
		BcBreakContext _localctx = new BcBreakContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bcBreak);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(T__7);
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

	public static class BcContinueContext extends ParserRuleContext {
		public BcContinueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bcContinue; }
	}

	public final BcContinueContext bcContinue() throws RecognitionException {
		BcContinueContext _localctx = new BcContinueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bcContinue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(T__8);
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

	public static class BcHaltContext extends ParserRuleContext {
		public BcHaltContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bcHalt; }
	}

	public final BcHaltContext bcHalt() throws RecognitionException {
		BcHaltContext _localctx = new BcHaltContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_bcHalt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(T__9);
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

	public static class BcReturnContext extends ParserRuleContext {
		public BcExprContext bcExpr() {
			return getRuleContext(BcExprContext.class,0);
		}
		public BcReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bcReturn; }
	}

	public final BcReturnContext bcReturn() throws RecognitionException {
		BcReturnContext _localctx = new BcReturnContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_bcReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(T__10);
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(136);
				bcExpr();
				}
				break;
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

	public static class BcBlockContext extends ParserRuleContext {
		public List<BcStatementContext> bcStatement() {
			return getRuleContexts(BcStatementContext.class);
		}
		public BcStatementContext bcStatement(int i) {
			return getRuleContext(BcStatementContext.class,i);
		}
		public BcBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bcBlock; }
	}

	public final BcBlockContext bcBlock() throws RecognitionException {
		BcBlockContext _localctx = new BcBlockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_bcBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(T__11);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__15) | (1L << T__22) | (1L << T__35) | (1L << T__36) | (1L << T__41) | (1L << T__42) | (1L << BigNumberLiteral) | (1L << StringLiteral) | (1L << Identifier))) != 0)) {
				{
				{
				setState(140);
				bcStatement();
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146);
			match(T__12);
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

	public static class BcFunctionDefinitionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(bcParser.Identifier, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public BcAutoListContext bcAutoList() {
			return getRuleContext(BcAutoListContext.class,0);
		}
		public List<BcStatementContext> bcStatement() {
			return getRuleContexts(BcStatementContext.class);
		}
		public BcStatementContext bcStatement(int i) {
			return getRuleContext(BcStatementContext.class,i);
		}
		public BcFunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bcFunctionDefinition; }
	}

	public final BcFunctionDefinitionContext bcFunctionDefinition() throws RecognitionException {
		BcFunctionDefinitionContext _localctx = new BcFunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_bcFunctionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(T__13);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(149);
				match(T__14);
				}
			}

			setState(152);
			match(Identifier);
			setState(153);
			match(T__2);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(154);
				parameters();
				}
			}

			setState(157);
			match(T__3);
			setState(158);
			match(T__11);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(159);
				bcAutoList();
				}
			}

			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__15) | (1L << T__22) | (1L << T__35) | (1L << T__36) | (1L << T__41) | (1L << T__42) | (1L << BigNumberLiteral) | (1L << StringLiteral) | (1L << Identifier))) != 0)) {
				{
				{
				setState(162);
				bcStatement();
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(168);
			match(T__12);
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

	public static class BcPrintContext extends ParserRuleContext {
		public List<PrintArgContext> printArg() {
			return getRuleContexts(PrintArgContext.class);
		}
		public PrintArgContext printArg(int i) {
			return getRuleContext(PrintArgContext.class,i);
		}
		public BcPrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bcPrint; }
	}

	public final BcPrintContext bcPrint() throws RecognitionException {
		BcPrintContext _localctx = new BcPrintContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_bcPrint);
		int _la;
		try {
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(T__15);
				setState(171);
				printArg();
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__16) {
					{
					{
					setState(172);
					match(T__16);
					setState(173);
					printArg();
					}
					}
					setState(178);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				match(T__15);
				setState(180);
				match(T__2);
				setState(181);
				printArg();
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__16) {
					{
					{
					setState(182);
					match(T__16);
					setState(183);
					printArg();
					}
					}
					setState(188);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(189);
				match(T__3);
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

	public static class PrintArgContext extends ParserRuleContext {
		public BcExprContext bcExpr() {
			return getRuleContext(BcExprContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(bcParser.StringLiteral, 0); }
		public PrintArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printArg; }
	}

	public final PrintArgContext printArg() throws RecognitionException {
		PrintArgContext _localctx = new PrintArgContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_printArg);
		try {
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				bcExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				match(StringLiteral);
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

	public static class ParametersContext extends ParserRuleContext {
		public List<BcVarDeclContext> bcVarDecl() {
			return getRuleContexts(BcVarDeclContext.class);
		}
		public BcVarDeclContext bcVarDecl(int i) {
			return getRuleContext(BcVarDeclContext.class,i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			bcVarDecl();
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(198);
				match(T__16);
				setState(199);
				bcVarDecl();
				}
				}
				setState(204);
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

	public static class BcAutoListContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public BcAutoListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bcAutoList; }
	}

	public final BcAutoListContext bcAutoList() throws RecognitionException {
		BcAutoListContext _localctx = new BcAutoListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_bcAutoList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(T__17);
			setState(206);
			parameters();
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

	public static class BcVarDeclContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(bcParser.Identifier, 0); }
		public BcVarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bcVarDecl; }
	}

	public final BcVarDeclContext bcVarDecl() throws RecognitionException {
		BcVarDeclContext _localctx = new BcVarDeclContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_bcVarDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(Identifier);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(209);
				match(T__18);
				}
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

	public static class BcAssignmentContext extends ParserRuleContext {
		public BcVarAccessContext bcVarAccess() {
			return getRuleContext(BcVarAccessContext.class,0);
		}
		public BcExprContext bcExpr() {
			return getRuleContext(BcExprContext.class,0);
		}
		public BcAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bcAssignment; }
	}

	public final BcAssignmentContext bcAssignment() throws RecognitionException {
		BcAssignmentContext _localctx = new BcAssignmentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_bcAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			bcVarAccess();
			setState(213);
			match(T__19);
			setState(214);
			bcExpr();
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

	public static class BcExprContext extends ParserRuleContext {
		public BcLogicalOrExprContext bcLogicalOrExpr() {
			return getRuleContext(BcLogicalOrExprContext.class,0);
		}
		public BcExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bcExpr; }
	}

	public final BcExprContext bcExpr() throws RecognitionException {
		BcExprContext _localctx = new BcExprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_bcExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			bcLogicalOrExpr(0);
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

	public static class BcLogicalOrExprContext extends ParserRuleContext {
		public BcLogicalAndExprContext bcLogicalAndExpr() {
			return getRuleContext(BcLogicalAndExprContext.class,0);
		}
		public BcLogicalOrExprContext bcLogicalOrExpr() {
			return getRuleContext(BcLogicalOrExprContext.class,0);
		}
		public BcLogicalOrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bcLogicalOrExpr; }
	}

	public final BcLogicalOrExprContext bcLogicalOrExpr() throws RecognitionException {
		return bcLogicalOrExpr(0);
	}

	private BcLogicalOrExprContext bcLogicalOrExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BcLogicalOrExprContext _localctx = new BcLogicalOrExprContext(_ctx, _parentState);
		BcLogicalOrExprContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_bcLogicalOrExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(219);
			bcLogicalAndExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(226);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BcLogicalOrExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bcLogicalOrExpr);
					setState(221);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(222);
					match(T__20);
					setState(223);
					bcLogicalAndExpr(0);
					}
					} 
				}
				setState(228);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class BcLogicalAndExprContext extends ParserRuleContext {
		public BcLogicalNotExprContext bcLogicalNotExpr() {
			return getRuleContext(BcLogicalNotExprContext.class,0);
		}
		public BcLogicalAndExprContext bcLogicalAndExpr() {
			return getRuleContext(BcLogicalAndExprContext.class,0);
		}
		public BcLogicalAndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bcLogicalAndExpr; }
	}

	public final BcLogicalAndExprContext bcLogicalAndExpr() throws RecognitionException {
		return bcLogicalAndExpr(0);
	}

	private BcLogicalAndExprContext bcLogicalAndExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BcLogicalAndExprContext _localctx = new BcLogicalAndExprContext(_ctx, _parentState);
		BcLogicalAndExprContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_bcLogicalAndExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(230);
			bcLogicalNotExpr();
			}
			_ctx.stop = _input.LT(-1);
			setState(237);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BcLogicalAndExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bcLogicalAndExpr);
					setState(232);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(233);
					match(T__21);
					setState(234);
					bcLogicalNotExpr();
					}
					} 
				}
				setState(239);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class BcLogicalNotExprContext extends ParserRuleContext {
		public BcLogicalNotExprContext bcLogicalNotExpr() {
			return getRuleContext(BcLogicalNotExprContext.class,0);
		}
		public BcRelationalOpExprContext bcRelationalOpExpr() {
			return getRuleContext(BcRelationalOpExprContext.class,0);
		}
		public BcLogicalNotExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bcLogicalNotExpr; }
	}

	public final BcLogicalNotExprContext bcLogicalNotExpr() throws RecognitionException {
		BcLogicalNotExprContext _localctx = new BcLogicalNotExprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_bcLogicalNotExpr);
		try {
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				match(T__22);
				setState(241);
				bcLogicalNotExpr();
				}
				break;
			case T__2:
			case T__35:
			case T__36:
			case T__41:
			case T__42:
			case BigNumberLiteral:
			case StringLiteral:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				bcRelationalOpExpr(0);
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

	public static class BcRelationalOpExprContext extends ParserRuleContext {
		public BcAssignmentOpExprContext bcAssignmentOpExpr() {
			return getRuleContext(BcAssignmentOpExprContext.class,0);
		}
		public BcRelationalOpExprContext bcRelationalOpExpr() {
			return getRuleContext(BcRelationalOpExprContext.class,0);
		}
		public BcRelationalOpExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bcRelationalOpExpr; }
	}

	public final BcRelationalOpExprContext bcRelationalOpExpr() throws RecognitionException {
		return bcRelationalOpExpr(0);
	}

	private BcRelationalOpExprContext bcRelationalOpExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BcRelationalOpExprContext _localctx = new BcRelationalOpExprContext(_ctx, _parentState);
		BcRelationalOpExprContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_bcRelationalOpExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(246);
			bcAssignmentOpExpr();
			}
			_ctx.stop = _input.LT(-1);
			setState(268);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(266);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new BcRelationalOpExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bcRelationalOpExpr);
						setState(248);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(249);
						match(T__23);
						setState(250);
						bcAssignmentOpExpr();
						}
						break;
					case 2:
						{
						_localctx = new BcRelationalOpExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bcRelationalOpExpr);
						setState(251);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(252);
						match(T__24);
						setState(253);
						bcAssignmentOpExpr();
						}
						break;
					case 3:
						{
						_localctx = new BcRelationalOpExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bcRelationalOpExpr);
						setState(254);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(255);
						match(T__25);
						setState(256);
						bcAssignmentOpExpr();
						}
						break;
					case 4:
						{
						_localctx = new BcRelationalOpExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bcRelationalOpExpr);
						setState(257);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(258);
						match(T__26);
						setState(259);
						bcAssignmentOpExpr();
						}
						break;
					case 5:
						{
						_localctx = new BcRelationalOpExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bcRelationalOpExpr);
						setState(260);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(261);
						match(T__27);
						setState(262);
						bcAssignmentOpExpr();
						}
						break;
					case 6:
						{
						_localctx = new BcRelationalOpExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bcRelationalOpExpr);
						setState(263);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(264);
						match(T__28);
						setState(265);
						bcAssignmentOpExpr();
						}
						break;
					}
					} 
				}
				setState(270);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class BcAssignmentOpExprContext extends ParserRuleContext {
		public BcVarAccessContext bcVarAccess() {
			return getRuleContext(BcVarAccessContext.class,0);
		}
		public BcAdditiveExprContext bcAdditiveExpr() {
			return getRuleContext(BcAdditiveExprContext.class,0);
		}
		public BcAssignmentOpExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bcAssignmentOpExpr; }
	}

	public final BcAssignmentOpExprContext bcAssignmentOpExpr() throws RecognitionException {
		BcAssignmentOpExprContext _localctx = new BcAssignmentOpExprContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_bcAssignmentOpExpr);
		try {
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				bcVarAccess();
				setState(272);
				match(T__19);
				setState(273);
				bcAdditiveExpr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				bcVarAccess();
				setState(276);
				match(T__29);
				setState(277);
				bcAdditiveExpr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(279);
				bcVarAccess();
				setState(280);
				match(T__30);
				setState(281);
				bcAdditiveExpr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(283);
				bcVarAccess();
				setState(284);
				match(T__31);
				setState(285);
				bcAdditiveExpr(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(287);
				bcVarAccess();
				setState(288);
				match(T__32);
				setState(289);
				bcAdditiveExpr(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(291);
				bcVarAccess();
				setState(292);
				match(T__33);
				setState(293);
				bcAdditiveExpr(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(295);
				bcVarAccess();
				setState(296);
				match(T__34);
				setState(297);
				bcAdditiveExpr(0);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(299);
				bcAdditiveExpr(0);
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

	public static class BcAdditiveExprContext extends ParserRuleContext {
		public BcMultiplicativeExprContext bcMultiplicativeExpr() {
			return getRuleContext(BcMultiplicativeExprContext.class,0);
		}
		public BcAdditiveExprContext bcAdditiveExpr() {
			return getRuleContext(BcAdditiveExprContext.class,0);
		}
		public BcAdditiveExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bcAdditiveExpr; }
	}

	public final BcAdditiveExprContext bcAdditiveExpr() throws RecognitionException {
		return bcAdditiveExpr(0);
	}

	private BcAdditiveExprContext bcAdditiveExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BcAdditiveExprContext _localctx = new BcAdditiveExprContext(_ctx, _parentState);
		BcAdditiveExprContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_bcAdditiveExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(303);
			bcMultiplicativeExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(313);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(311);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new BcAdditiveExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bcAdditiveExpr);
						setState(305);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(306);
						match(T__35);
						setState(307);
						bcMultiplicativeExpr(0);
						}
						break;
					case 2:
						{
						_localctx = new BcAdditiveExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bcAdditiveExpr);
						setState(308);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(309);
						match(T__36);
						setState(310);
						bcMultiplicativeExpr(0);
						}
						break;
					}
					} 
				}
				setState(315);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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

	public static class BcMultiplicativeExprContext extends ParserRuleContext {
		public BcPowerExprContext bcPowerExpr() {
			return getRuleContext(BcPowerExprContext.class,0);
		}
		public BcMultiplicativeExprContext bcMultiplicativeExpr() {
			return getRuleContext(BcMultiplicativeExprContext.class,0);
		}
		public BcMultiplicativeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bcMultiplicativeExpr; }
	}

	public final BcMultiplicativeExprContext bcMultiplicativeExpr() throws RecognitionException {
		return bcMultiplicativeExpr(0);
	}

	private BcMultiplicativeExprContext bcMultiplicativeExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BcMultiplicativeExprContext _localctx = new BcMultiplicativeExprContext(_ctx, _parentState);
		BcMultiplicativeExprContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_bcMultiplicativeExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(317);
			bcPowerExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(330);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(328);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new BcMultiplicativeExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bcMultiplicativeExpr);
						setState(319);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(320);
						match(T__37);
						setState(321);
						bcPowerExpr(0);
						}
						break;
					case 2:
						{
						_localctx = new BcMultiplicativeExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bcMultiplicativeExpr);
						setState(322);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(323);
						match(T__38);
						setState(324);
						bcPowerExpr(0);
						}
						break;
					case 3:
						{
						_localctx = new BcMultiplicativeExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bcMultiplicativeExpr);
						setState(325);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(326);
						match(T__39);
						setState(327);
						bcPowerExpr(0);
						}
						break;
					}
					} 
				}
				setState(332);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	public static class BcPowerExprContext extends ParserRuleContext {
		public BcIncDecExprContext bcIncDecExpr() {
			return getRuleContext(BcIncDecExprContext.class,0);
		}
		public BcPowerExprContext bcPowerExpr() {
			return getRuleContext(BcPowerExprContext.class,0);
		}
		public BcPowerExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bcPowerExpr; }
	}

	public final BcPowerExprContext bcPowerExpr() throws RecognitionException {
		return bcPowerExpr(0);
	}

	private BcPowerExprContext bcPowerExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BcPowerExprContext _localctx = new BcPowerExprContext(_ctx, _parentState);
		BcPowerExprContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_bcPowerExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(334);
			bcIncDecExpr();
			}
			_ctx.stop = _input.LT(-1);
			setState(341);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BcPowerExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bcPowerExpr);
					setState(336);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(337);
					match(T__40);
					setState(338);
					bcIncDecExpr();
					}
					} 
				}
				setState(343);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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

	public static class BcIncDecExprContext extends ParserRuleContext {
		public BcVarAccessContext bcVarAccess() {
			return getRuleContext(BcVarAccessContext.class,0);
		}
		public BcNegExprContext bcNegExpr() {
			return getRuleContext(BcNegExprContext.class,0);
		}
		public BcIncDecExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bcIncDecExpr; }
	}

	public final BcIncDecExprContext bcIncDecExpr() throws RecognitionException {
		BcIncDecExprContext _localctx = new BcIncDecExprContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_bcIncDecExpr);
		try {
			setState(355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(344);
				match(T__41);
				setState(345);
				bcVarAccess();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
				match(T__42);
				setState(347);
				bcVarAccess();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(348);
				bcVarAccess();
				setState(349);
				match(T__41);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(351);
				bcVarAccess();
				setState(352);
				match(T__42);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(354);
				bcNegExpr();
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

	public static class BcNegExprContext extends ParserRuleContext {
		public BcNegExprContext bcNegExpr() {
			return getRuleContext(BcNegExprContext.class,0);
		}
		public BcPostFixExprContext bcPostFixExpr() {
			return getRuleContext(BcPostFixExprContext.class,0);
		}
		public BcNegExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bcNegExpr; }
	}

	public final BcNegExprContext bcNegExpr() throws RecognitionException {
		BcNegExprContext _localctx = new BcNegExprContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_bcNegExpr);
		int _la;
		try {
			setState(360);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
			case T__36:
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				_la = _input.LA(1);
				if ( !(_la==T__35 || _la==T__36) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(358);
				bcNegExpr();
				}
				break;
			case T__2:
			case BigNumberLiteral:
			case StringLiteral:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
				bcPostFixExpr();
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

	public static class BcPostFixExprContext extends ParserRuleContext {
		public BcFunctionCallContext bcFunctionCall() {
			return getRuleContext(BcFunctionCallContext.class,0);
		}
		public BcVarAccessContext bcVarAccess() {
			return getRuleContext(BcVarAccessContext.class,0);
		}
		public BcPrimaryExprContext bcPrimaryExpr() {
			return getRuleContext(BcPrimaryExprContext.class,0);
		}
		public BcPostFixExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bcPostFixExpr; }
	}

	public final BcPostFixExprContext bcPostFixExpr() throws RecognitionException {
		BcPostFixExprContext _localctx = new BcPostFixExprContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_bcPostFixExpr);
		try {
			setState(365);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				bcFunctionCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(363);
				bcVarAccess();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(364);
				bcPrimaryExpr();
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

	public static class BcVarAccessContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(bcParser.Identifier, 0); }
		public BcExprContext bcExpr() {
			return getRuleContext(BcExprContext.class,0);
		}
		public BcVarAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bcVarAccess; }
	}

	public final BcVarAccessContext bcVarAccess() throws RecognitionException {
		BcVarAccessContext _localctx = new BcVarAccessContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_bcVarAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(Identifier);
			setState(372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(368);
				match(T__43);
				setState(369);
				bcExpr();
				setState(370);
				match(T__44);
				}
				break;
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

	public static class BcFunctionCallContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(bcParser.Identifier, 0); }
		public BcArgsContext bcArgs() {
			return getRuleContext(BcArgsContext.class,0);
		}
		public BcFunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bcFunctionCall; }
	}

	public final BcFunctionCallContext bcFunctionCall() throws RecognitionException {
		BcFunctionCallContext _localctx = new BcFunctionCallContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_bcFunctionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(Identifier);
			setState(375);
			match(T__2);
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__22) | (1L << T__35) | (1L << T__36) | (1L << T__41) | (1L << T__42) | (1L << BigNumberLiteral) | (1L << StringLiteral) | (1L << Identifier))) != 0)) {
				{
				setState(376);
				bcArgs();
				}
			}

			setState(379);
			match(T__3);
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

	public static class BcArgsContext extends ParserRuleContext {
		public List<BcArgContext> bcArg() {
			return getRuleContexts(BcArgContext.class);
		}
		public BcArgContext bcArg(int i) {
			return getRuleContext(BcArgContext.class,i);
		}
		public BcArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bcArgs; }
	}

	public final BcArgsContext bcArgs() throws RecognitionException {
		BcArgsContext _localctx = new BcArgsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_bcArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			bcArg();
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(382);
				match(T__16);
				setState(383);
				bcArg();
				}
				}
				setState(388);
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

	public static class BcArgContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(bcParser.Identifier, 0); }
		public BcExprContext bcExpr() {
			return getRuleContext(BcExprContext.class,0);
		}
		public BcArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bcArg; }
	}

	public final BcArgContext bcArg() throws RecognitionException {
		BcArgContext _localctx = new BcArgContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_bcArg);
		try {
			setState(392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(389);
				match(Identifier);
				setState(390);
				match(T__18);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(391);
				bcExpr();
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

	public static class BcPrimaryExprContext extends ParserRuleContext {
		public BcNumberContext bcNumber() {
			return getRuleContext(BcNumberContext.class,0);
		}
		public BcStringContext bcString() {
			return getRuleContext(BcStringContext.class,0);
		}
		public BcParExprContext bcParExpr() {
			return getRuleContext(BcParExprContext.class,0);
		}
		public BcPrimaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bcPrimaryExpr; }
	}

	public final BcPrimaryExprContext bcPrimaryExpr() throws RecognitionException {
		BcPrimaryExprContext _localctx = new BcPrimaryExprContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_bcPrimaryExpr);
		try {
			setState(397);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BigNumberLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				bcNumber();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(395);
				bcString();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(396);
				bcParExpr();
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

	public static class BcParExprContext extends ParserRuleContext {
		public BcExprContext bcExpr() {
			return getRuleContext(BcExprContext.class,0);
		}
		public BcParExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bcParExpr; }
	}

	public final BcParExprContext bcParExpr() throws RecognitionException {
		BcParExprContext _localctx = new BcParExprContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_bcParExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			match(T__2);
			setState(400);
			bcExpr();
			setState(401);
			match(T__3);
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

	public static class BcNumberContext extends ParserRuleContext {
		public TerminalNode BigNumberLiteral() { return getToken(bcParser.BigNumberLiteral, 0); }
		public BcNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bcNumber; }
	}

	public final BcNumberContext bcNumber() throws RecognitionException {
		BcNumberContext _localctx = new BcNumberContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_bcNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(BigNumberLiteral);
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

	public static class BcStringContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(bcParser.StringLiteral, 0); }
		public BcStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bcString; }
	}

	public final BcStringContext bcString() throws RecognitionException {
		BcStringContext _localctx = new BcStringContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_bcString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(StringLiteral);
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
		case 19:
			return bcLogicalOrExpr_sempred((BcLogicalOrExprContext)_localctx, predIndex);
		case 20:
			return bcLogicalAndExpr_sempred((BcLogicalAndExprContext)_localctx, predIndex);
		case 22:
			return bcRelationalOpExpr_sempred((BcRelationalOpExprContext)_localctx, predIndex);
		case 24:
			return bcAdditiveExpr_sempred((BcAdditiveExprContext)_localctx, predIndex);
		case 25:
			return bcMultiplicativeExpr_sempred((BcMultiplicativeExprContext)_localctx, predIndex);
		case 26:
			return bcPowerExpr_sempred((BcPowerExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean bcLogicalOrExpr_sempred(BcLogicalOrExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean bcLogicalAndExpr_sempred(BcLogicalAndExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean bcRelationalOpExpr_sempred(BcRelationalOpExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean bcAdditiveExpr_sempred(BcAdditiveExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean bcMultiplicativeExpr_sempred(BcMultiplicativeExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean bcPowerExpr_sempred(BcPowerExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\u019a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\6\2P\n\2\r\2\16\2Q\3\3"+
		"\3\3\5\3V\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4c\n\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\5\5l\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\5\7w\n\7\3\7\3\7\5\7{\n\7\3\7\3\7\5\7\177\n\7\3\7\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\5\13\u008c\n\13\3\f\3\f\7\f\u0090\n\f\f\f\16\f"+
		"\u0093\13\f\3\f\3\f\3\r\3\r\5\r\u0099\n\r\3\r\3\r\3\r\5\r\u009e\n\r\3"+
		"\r\3\r\3\r\5\r\u00a3\n\r\3\r\7\r\u00a6\n\r\f\r\16\r\u00a9\13\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\7\16\u00b1\n\16\f\16\16\16\u00b4\13\16\3\16\3\16"+
		"\3\16\3\16\3\16\7\16\u00bb\n\16\f\16\16\16\u00be\13\16\3\16\3\16\5\16"+
		"\u00c2\n\16\3\17\3\17\5\17\u00c6\n\17\3\20\3\20\3\20\7\20\u00cb\n\20\f"+
		"\20\16\20\u00ce\13\20\3\21\3\21\3\21\3\22\3\22\5\22\u00d5\n\22\3\23\3"+
		"\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u00e3\n\25"+
		"\f\25\16\25\u00e6\13\25\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u00ee\n\26"+
		"\f\26\16\26\u00f1\13\26\3\27\3\27\3\27\5\27\u00f6\n\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\7\30\u010d\n\30\f\30\16\30\u0110\13\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31"+
		"\u012f\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u013a\n"+
		"\32\f\32\16\32\u013d\13\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\7\33\u014b\n\33\f\33\16\33\u014e\13\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\7\34\u0156\n\34\f\34\16\34\u0159\13\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0166\n\35\3\36\3\36\3\36"+
		"\5\36\u016b\n\36\3\37\3\37\3\37\5\37\u0170\n\37\3 \3 \3 \3 \3 \5 \u0177"+
		"\n \3!\3!\3!\5!\u017c\n!\3!\3!\3\"\3\"\3\"\7\"\u0183\n\"\f\"\16\"\u0186"+
		"\13\"\3#\3#\3#\5#\u018b\n#\3$\3$\3$\5$\u0190\n$\3%\3%\3%\3%\3&\3&\3\'"+
		"\3\'\3\'\2\b(*.\62\64\66(\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&"+
		"(*,.\60\62\64\668:<>@BDFHJL\2\3\3\2&\'\2\u01b2\2O\3\2\2\2\4S\3\2\2\2\6"+
		"b\3\2\2\2\bd\3\2\2\2\nm\3\2\2\2\fs\3\2\2\2\16\u0083\3\2\2\2\20\u0085\3"+
		"\2\2\2\22\u0087\3\2\2\2\24\u0089\3\2\2\2\26\u008d\3\2\2\2\30\u0096\3\2"+
		"\2\2\32\u00c1\3\2\2\2\34\u00c5\3\2\2\2\36\u00c7\3\2\2\2 \u00cf\3\2\2\2"+
		"\"\u00d2\3\2\2\2$\u00d6\3\2\2\2&\u00da\3\2\2\2(\u00dc\3\2\2\2*\u00e7\3"+
		"\2\2\2,\u00f5\3\2\2\2.\u00f7\3\2\2\2\60\u012e\3\2\2\2\62\u0130\3\2\2\2"+
		"\64\u013e\3\2\2\2\66\u014f\3\2\2\28\u0165\3\2\2\2:\u016a\3\2\2\2<\u016f"+
		"\3\2\2\2>\u0171\3\2\2\2@\u0178\3\2\2\2B\u017f\3\2\2\2D\u018a\3\2\2\2F"+
		"\u018f\3\2\2\2H\u0191\3\2\2\2J\u0195\3\2\2\2L\u0197\3\2\2\2NP\5\4\3\2"+
		"ON\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\3\3\2\2\2SU\5\6\4\2TV\7\3\2"+
		"\2UT\3\2\2\2UV\3\2\2\2V\5\3\2\2\2Wc\5\b\5\2Xc\5\n\6\2Yc\5\f\7\2Zc\5\26"+
		"\f\2[c\5\30\r\2\\c\5\16\b\2]c\5\20\t\2^c\5\24\13\2_c\5\22\n\2`c\5\32\16"+
		"\2ac\5&\24\2bW\3\2\2\2bX\3\2\2\2bY\3\2\2\2bZ\3\2\2\2b[\3\2\2\2b\\\3\2"+
		"\2\2b]\3\2\2\2b^\3\2\2\2b_\3\2\2\2b`\3\2\2\2ba\3\2\2\2c\7\3\2\2\2de\7"+
		"\4\2\2ef\7\5\2\2fg\5&\24\2gh\7\6\2\2hk\5\4\3\2ij\7\7\2\2jl\5\4\3\2ki\3"+
		"\2\2\2kl\3\2\2\2l\t\3\2\2\2mn\7\b\2\2no\7\5\2\2op\5&\24\2pq\7\6\2\2qr"+
		"\5\4\3\2r\13\3\2\2\2st\7\t\2\2tv\7\5\2\2uw\5&\24\2vu\3\2\2\2vw\3\2\2\2"+
		"wx\3\2\2\2xz\7\3\2\2y{\5&\24\2zy\3\2\2\2z{\3\2\2\2{|\3\2\2\2|~\7\3\2\2"+
		"}\177\5&\24\2~}\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\7\6"+
		"\2\2\u0081\u0082\5\4\3\2\u0082\r\3\2\2\2\u0083\u0084\7\n\2\2\u0084\17"+
		"\3\2\2\2\u0085\u0086\7\13\2\2\u0086\21\3\2\2\2\u0087\u0088\7\f\2\2\u0088"+
		"\23\3\2\2\2\u0089\u008b\7\r\2\2\u008a\u008c\5&\24\2\u008b\u008a\3\2\2"+
		"\2\u008b\u008c\3\2\2\2\u008c\25\3\2\2\2\u008d\u0091\7\16\2\2\u008e\u0090"+
		"\5\4\3\2\u008f\u008e\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0095\7\17"+
		"\2\2\u0095\27\3\2\2\2\u0096\u0098\7\20\2\2\u0097\u0099\7\21\2\2\u0098"+
		"\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\7\62"+
		"\2\2\u009b\u009d\7\5\2\2\u009c\u009e\5\36\20\2\u009d\u009c\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\7\6\2\2\u00a0\u00a2\7\16"+
		"\2\2\u00a1\u00a3\5 \21\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a7\3\2\2\2\u00a4\u00a6\5\4\3\2\u00a5\u00a4\3\2\2\2\u00a6\u00a9\3\2"+
		"\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00aa\u00ab\7\17\2\2\u00ab\31\3\2\2\2\u00ac\u00ad\7\22"+
		"\2\2\u00ad\u00b2\5\34\17\2\u00ae\u00af\7\23\2\2\u00af\u00b1\5\34\17\2"+
		"\u00b0\u00ae\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3"+
		"\3\2\2\2\u00b3\u00c2\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\7\22\2\2"+
		"\u00b6\u00b7\7\5\2\2\u00b7\u00bc\5\34\17\2\u00b8\u00b9\7\23\2\2\u00b9"+
		"\u00bb\5\34\17\2\u00ba\u00b8\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3"+
		"\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bf\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf"+
		"\u00c0\7\6\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00ac\3\2\2\2\u00c1\u00b5\3\2"+
		"\2\2\u00c2\33\3\2\2\2\u00c3\u00c6\5&\24\2\u00c4\u00c6\7\61\2\2\u00c5\u00c3"+
		"\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\35\3\2\2\2\u00c7\u00cc\5\"\22\2\u00c8"+
		"\u00c9\7\23\2\2\u00c9\u00cb\5\"\22\2\u00ca\u00c8\3\2\2\2\u00cb\u00ce\3"+
		"\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\37\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00cf\u00d0\7\24\2\2\u00d0\u00d1\5\36\20\2\u00d1!\3\2\2"+
		"\2\u00d2\u00d4\7\62\2\2\u00d3\u00d5\7\25\2\2\u00d4\u00d3\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5#\3\2\2\2\u00d6\u00d7\5> \2\u00d7\u00d8\7\26\2\2\u00d8"+
		"\u00d9\5&\24\2\u00d9%\3\2\2\2\u00da\u00db\5(\25\2\u00db\'\3\2\2\2\u00dc"+
		"\u00dd\b\25\1\2\u00dd\u00de\5*\26\2\u00de\u00e4\3\2\2\2\u00df\u00e0\f"+
		"\4\2\2\u00e0\u00e1\7\27\2\2\u00e1\u00e3\5*\26\2\u00e2\u00df\3\2\2\2\u00e3"+
		"\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5)\3\2\2\2"+
		"\u00e6\u00e4\3\2\2\2\u00e7\u00e8\b\26\1\2\u00e8\u00e9\5,\27\2\u00e9\u00ef"+
		"\3\2\2\2\u00ea\u00eb\f\4\2\2\u00eb\u00ec\7\30\2\2\u00ec\u00ee\5,\27\2"+
		"\u00ed\u00ea\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0"+
		"\3\2\2\2\u00f0+\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f3\7\31\2\2\u00f3"+
		"\u00f6\5,\27\2\u00f4\u00f6\5.\30\2\u00f5\u00f2\3\2\2\2\u00f5\u00f4\3\2"+
		"\2\2\u00f6-\3\2\2\2\u00f7\u00f8\b\30\1\2\u00f8\u00f9\5\60\31\2\u00f9\u010e"+
		"\3\2\2\2\u00fa\u00fb\f\t\2\2\u00fb\u00fc\7\32\2\2\u00fc\u010d\5\60\31"+
		"\2\u00fd\u00fe\f\b\2\2\u00fe\u00ff\7\33\2\2\u00ff\u010d\5\60\31\2\u0100"+
		"\u0101\f\7\2\2\u0101\u0102\7\34\2\2\u0102\u010d\5\60\31\2\u0103\u0104"+
		"\f\6\2\2\u0104\u0105\7\35\2\2\u0105\u010d\5\60\31\2\u0106\u0107\f\5\2"+
		"\2\u0107\u0108\7\36\2\2\u0108\u010d\5\60\31\2\u0109\u010a\f\4\2\2\u010a"+
		"\u010b\7\37\2\2\u010b\u010d\5\60\31\2\u010c\u00fa\3\2\2\2\u010c\u00fd"+
		"\3\2\2\2\u010c\u0100\3\2\2\2\u010c\u0103\3\2\2\2\u010c\u0106\3\2\2\2\u010c"+
		"\u0109\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2"+
		"\2\2\u010f/\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0112\5> \2\u0112\u0113"+
		"\7\26\2\2\u0113\u0114\5\62\32\2\u0114\u012f\3\2\2\2\u0115\u0116\5> \2"+
		"\u0116\u0117\7 \2\2\u0117\u0118\5\62\32\2\u0118\u012f\3\2\2\2\u0119\u011a"+
		"\5> \2\u011a\u011b\7!\2\2\u011b\u011c\5\62\32\2\u011c\u012f\3\2\2\2\u011d"+
		"\u011e\5> \2\u011e\u011f\7\"\2\2\u011f\u0120\5\62\32\2\u0120\u012f\3\2"+
		"\2\2\u0121\u0122\5> \2\u0122\u0123\7#\2\2\u0123\u0124\5\62\32\2\u0124"+
		"\u012f\3\2\2\2\u0125\u0126\5> \2\u0126\u0127\7$\2\2\u0127\u0128\5\62\32"+
		"\2\u0128\u012f\3\2\2\2\u0129\u012a\5> \2\u012a\u012b\7%\2\2\u012b\u012c"+
		"\5\62\32\2\u012c\u012f\3\2\2\2\u012d\u012f\5\62\32\2\u012e\u0111\3\2\2"+
		"\2\u012e\u0115\3\2\2\2\u012e\u0119\3\2\2\2\u012e\u011d\3\2\2\2\u012e\u0121"+
		"\3\2\2\2\u012e\u0125\3\2\2\2\u012e\u0129\3\2\2\2\u012e\u012d\3\2\2\2\u012f"+
		"\61\3\2\2\2\u0130\u0131\b\32\1\2\u0131\u0132\5\64\33\2\u0132\u013b\3\2"+
		"\2\2\u0133\u0134\f\5\2\2\u0134\u0135\7&\2\2\u0135\u013a\5\64\33\2\u0136"+
		"\u0137\f\4\2\2\u0137\u0138\7\'\2\2\u0138\u013a\5\64\33\2\u0139\u0133\3"+
		"\2\2\2\u0139\u0136\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b"+
		"\u013c\3\2\2\2\u013c\63\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u013f\b\33\1"+
		"\2\u013f\u0140\5\66\34\2\u0140\u014c\3\2\2\2\u0141\u0142\f\6\2\2\u0142"+
		"\u0143\7(\2\2\u0143\u014b\5\66\34\2\u0144\u0145\f\5\2\2\u0145\u0146\7"+
		")\2\2\u0146\u014b\5\66\34\2\u0147\u0148\f\4\2\2\u0148\u0149\7*\2\2\u0149"+
		"\u014b\5\66\34\2\u014a\u0141\3\2\2\2\u014a\u0144\3\2\2\2\u014a\u0147\3"+
		"\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d"+
		"\65\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0150\b\34\1\2\u0150\u0151\58\35"+
		"\2\u0151\u0157\3\2\2\2\u0152\u0153\f\4\2\2\u0153\u0154\7+\2\2\u0154\u0156"+
		"\58\35\2\u0155\u0152\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157"+
		"\u0158\3\2\2\2\u0158\67\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015b\7,\2\2"+
		"\u015b\u0166\5> \2\u015c\u015d\7-\2\2\u015d\u0166\5> \2\u015e\u015f\5"+
		"> \2\u015f\u0160\7,\2\2\u0160\u0166\3\2\2\2\u0161\u0162\5> \2\u0162\u0163"+
		"\7-\2\2\u0163\u0166\3\2\2\2\u0164\u0166\5:\36\2\u0165\u015a\3\2\2\2\u0165"+
		"\u015c\3\2\2\2\u0165\u015e\3\2\2\2\u0165\u0161\3\2\2\2\u0165\u0164\3\2"+
		"\2\2\u01669\3\2\2\2\u0167\u0168\t\2\2\2\u0168\u016b\5:\36\2\u0169\u016b"+
		"\5<\37\2\u016a\u0167\3\2\2\2\u016a\u0169\3\2\2\2\u016b;\3\2\2\2\u016c"+
		"\u0170\5@!\2\u016d\u0170\5> \2\u016e\u0170\5F$\2\u016f\u016c\3\2\2\2\u016f"+
		"\u016d\3\2\2\2\u016f\u016e\3\2\2\2\u0170=\3\2\2\2\u0171\u0176\7\62\2\2"+
		"\u0172\u0173\7.\2\2\u0173\u0174\5&\24\2\u0174\u0175\7/\2\2\u0175\u0177"+
		"\3\2\2\2\u0176\u0172\3\2\2\2\u0176\u0177\3\2\2\2\u0177?\3\2\2\2\u0178"+
		"\u0179\7\62\2\2\u0179\u017b\7\5\2\2\u017a\u017c\5B\"\2\u017b\u017a\3\2"+
		"\2\2\u017b\u017c\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017e\7\6\2\2\u017e"+
		"A\3\2\2\2\u017f\u0184\5D#\2\u0180\u0181\7\23\2\2\u0181\u0183\5D#\2\u0182"+
		"\u0180\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2"+
		"\2\2\u0185C\3\2\2\2\u0186\u0184\3\2\2\2\u0187\u0188\7\62\2\2\u0188\u018b"+
		"\7\25\2\2\u0189\u018b\5&\24\2\u018a\u0187\3\2\2\2\u018a\u0189\3\2\2\2"+
		"\u018bE\3\2\2\2\u018c\u0190\5J&\2\u018d\u0190\5L\'\2\u018e\u0190\5H%\2"+
		"\u018f\u018c\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u018e\3\2\2\2\u0190G\3"+
		"\2\2\2\u0191\u0192\7\5\2\2\u0192\u0193\5&\24\2\u0193\u0194\7\6\2\2\u0194"+
		"I\3\2\2\2\u0195\u0196\7\60\2\2\u0196K\3\2\2\2\u0197\u0198\7\61\2\2\u0198"+
		"M\3\2\2\2(QUbkvz~\u008b\u0091\u0098\u009d\u00a2\u00a7\u00b2\u00bc\u00c1"+
		"\u00c5\u00cc\u00d4\u00e4\u00ef\u00f5\u010c\u010e\u012e\u0139\u013b\u014a"+
		"\u014c\u0157\u0165\u016a\u016f\u0176\u017b\u0184\u018a\u018f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}