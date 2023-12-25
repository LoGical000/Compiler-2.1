// Generated from C:/Users/anast/OneDrive/Desktop/COMPILER X/Compiler-2.1/ReactParser.g4 by ANTLR 4.13.1
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ReactParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, FUNCTION=2, CONSOLE=3, LOG=4, VAR=5, LET=6, CONST=7, IF=8, ELSE=9, 
		FOR=10, WHILE=11, RETURN=12, IMPORT=13, EXPORT=14, DEFAULT=15, FROM=16, 
		USESTATE=17, USEEFFECT=18, USEREF=19, NULL=20, ARROW=21, EQUAL=22, PLUS=23, 
		MINUS=24, STAR=25, DIVISION=26, PERCENT=27, COMMA=28, SEMI=29, COLON=30, 
		LEFTPAREN=31, RIGHTPAREN=32, LEFTBRACKET=33, RIGHTBRACKET=34, LEFTCURLY=35, 
		RIGHTCURLY=36, LESSTHAN=37, GREATERTHAN=38, SELF_CLOSED=39, LESSEQUAL=40, 
		GREATEREQUAL=41, EQ=42, NEQ=43, AND=44, OR=45, PLUSPLUS=46, MINUSMINUS=47, 
		SQ=48, DQ=49, DOT=50, BOOL=51, ID=52, STRING=53, INT=54, DOUBLE=55;
	public static final int
		RULE_program = 0, RULE_importStatement = 1, RULE_export = 2, RULE_variableDeclaration = 3, 
		RULE_functionDeclaration = 4, RULE_regularFunction = 5, RULE_callBackFunction = 6, 
		RULE_parameters = 7, RULE_functionbody = 8, RULE_funcStatement = 9, RULE_callFun = 10, 
		RULE_returnStatement = 11, RULE_useRef = 12, RULE_useState = 13, RULE_useEffect = 14, 
		RULE_map = 15, RULE_jsx_element = 16, RULE_content = 17, RULE_useAttribute = 18, 
		RULE_jsx_attribute = 19, RULE_attributeDetails = 20, RULE_attributeDetailsFunction = 21, 
		RULE_attributeDetailsAttribute = 22, RULE_component = 23, RULE_props = 24, 
		RULE_name_prop = 25, RULE_prop_value = 26, RULE_shortIf = 27, RULE_values = 28, 
		RULE_array = 29, RULE_row = 30, RULE_element = 31, RULE_print = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "importStatement", "export", "variableDeclaration", "functionDeclaration", 
			"regularFunction", "callBackFunction", "parameters", "functionbody", 
			"funcStatement", "callFun", "returnStatement", "useRef", "useState", 
			"useEffect", "map", "jsx_element", "content", "useAttribute", "jsx_attribute", 
			"attributeDetails", "attributeDetailsFunction", "attributeDetailsAttribute", 
			"component", "props", "name_prop", "prop_value", "shortIf", "values", 
			"array", "row", "element", "print"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'function'", "'console'", "'log'", "'var'", "'let'", "'const'", 
			"'if'", "'else'", "'for'", "'while'", "'return'", "'import'", "'export'", 
			"'default'", "'from'", "'useState'", "'useEffect'", "'useRef'", "'null'", 
			"'=>'", "'='", "'+'", "'-'", "'*'", "'/'", "'%'", "','", "';'", "':'", 
			"'('", "')'", "'['", "']'", "'{'", "'}'", "'<'", "'>'", "'/>'", "'<='", 
			"'>='", "'=='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'''", "'\"'", 
			"'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "FUNCTION", "CONSOLE", "LOG", "VAR", "LET", "CONST", "IF", 
			"ELSE", "FOR", "WHILE", "RETURN", "IMPORT", "EXPORT", "DEFAULT", "FROM", 
			"USESTATE", "USEEFFECT", "USEREF", "NULL", "ARROW", "EQUAL", "PLUS", 
			"MINUS", "STAR", "DIVISION", "PERCENT", "COMMA", "SEMI", "COLON", "LEFTPAREN", 
			"RIGHTPAREN", "LEFTBRACKET", "RIGHTBRACKET", "LEFTCURLY", "RIGHTCURLY", 
			"LESSTHAN", "GREATERTHAN", "SELF_CLOSED", "LESSEQUAL", "GREATEREQUAL", 
			"EQ", "NEQ", "AND", "OR", "PLUSPLUS", "MINUSMINUS", "SQ", "DQ", "DOT", 
			"BOOL", "ID", "STRING", "INT", "DOUBLE"
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
	public String getGrammarFileName() { return "ReactParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ReactParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<ImportStatementContext> importStatement() {
			return getRuleContexts(ImportStatementContext.class);
		}
		public ImportStatementContext importStatement(int i) {
			return getRuleContext(ImportStatementContext.class,i);
		}
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public ExportContext export() {
			return getRuleContext(ExportContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(66);
				importStatement();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2147483876L) != 0)) {
				{
				setState(74);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FUNCTION:
				case LEFTPAREN:
					{
					setState(72);
					functionDeclaration();
					}
					break;
				case VAR:
				case LET:
				case CONST:
					{
					setState(73);
					variableDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(79);
				export();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(ReactParser.IMPORT, 0); }
		public TerminalNode FROM() { return getToken(ReactParser.FROM, 0); }
		public TerminalNode STRING() { return getToken(ReactParser.STRING, 0); }
		public TerminalNode SEMI() { return getToken(ReactParser.SEMI, 0); }
		public List<TerminalNode> ID() { return getTokens(ReactParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ReactParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ReactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactParser.COMMA, i);
		}
		public TerminalNode LEFTCURLY() { return getToken(ReactParser.LEFTCURLY, 0); }
		public TerminalNode RIGHTCURLY() { return getToken(ReactParser.RIGHTCURLY, 0); }
		public List<TerminalNode> USEEFFECT() { return getTokens(ReactParser.USEEFFECT); }
		public TerminalNode USEEFFECT(int i) {
			return getToken(ReactParser.USEEFFECT, i);
		}
		public List<TerminalNode> USESTATE() { return getTokens(ReactParser.USESTATE); }
		public TerminalNode USESTATE(int i) {
			return getToken(ReactParser.USESTATE, i);
		}
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_importStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(IMPORT);
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(83);
				match(ID);
				}
				break;
			}
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(86);
				match(COMMA);
				}
			}

			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFTCURLY) {
				{
				setState(89);
				match(LEFTCURLY);
				}
			}

			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4503599627763712L) != 0)) {
				{
				{
				setState(92);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4503599627763712L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(93);
					match(COMMA);
					}
				}

				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RIGHTCURLY) {
				{
				setState(101);
				match(RIGHTCURLY);
				}
			}

			setState(104);
			match(FROM);
			setState(105);
			match(STRING);
			setState(106);
			match(SEMI);
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
	public static class ExportContext extends ParserRuleContext {
		public TerminalNode EXPORT() { return getToken(ReactParser.EXPORT, 0); }
		public TerminalNode DEFAULT() { return getToken(ReactParser.DEFAULT, 0); }
		public TerminalNode ID() { return getToken(ReactParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(ReactParser.SEMI, 0); }
		public ExportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_export; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterExport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitExport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitExport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportContext export() throws RecognitionException {
		ExportContext _localctx = new ExportContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_export);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(EXPORT);
			setState(109);
			match(DEFAULT);
			setState(110);
			match(ID);
			setState(111);
			match(SEMI);
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
	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ReactParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(ReactParser.EQUAL, 0); }
		public TerminalNode VAR() { return getToken(ReactParser.VAR, 0); }
		public TerminalNode CONST() { return getToken(ReactParser.CONST, 0); }
		public TerminalNode LET() { return getToken(ReactParser.LET, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ReactParser.SEMI, 0); }
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 224L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(114);
			match(ID);
			setState(115);
			match(EQUAL);
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL:
			case BOOL:
			case STRING:
			case INT:
			case DOUBLE:
				{
				setState(116);
				values();
				}
				break;
			case FUNCTION:
			case LEFTPAREN:
				{
				setState(117);
				functionDeclaration();
				}
				break;
			case LEFTBRACKET:
				{
				setState(118);
				array();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(121);
				match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public RegularFunctionContext regularFunction() {
			return getRuleContext(RegularFunctionContext.class,0);
		}
		public CallBackFunctionContext callBackFunction() {
			return getRuleContext(CallBackFunctionContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionDeclaration);
		try {
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				regularFunction();
				}
				break;
			case LEFTPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				callBackFunction();
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
	public static class RegularFunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(ReactParser.FUNCTION, 0); }
		public TerminalNode ID() { return getToken(ReactParser.ID, 0); }
		public TerminalNode LEFTPAREN() { return getToken(ReactParser.LEFTPAREN, 0); }
		public TerminalNode RIGHTPAREN() { return getToken(ReactParser.RIGHTPAREN, 0); }
		public TerminalNode LEFTCURLY() { return getToken(ReactParser.LEFTCURLY, 0); }
		public FunctionbodyContext functionbody() {
			return getRuleContext(FunctionbodyContext.class,0);
		}
		public TerminalNode RIGHTCURLY() { return getToken(ReactParser.RIGHTCURLY, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public RegularFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regularFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterRegularFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitRegularFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitRegularFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegularFunctionContext regularFunction() throws RecognitionException {
		RegularFunctionContext _localctx = new RegularFunctionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_regularFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(FUNCTION);
			setState(129);
			match(ID);
			setState(130);
			match(LEFTPAREN);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFTCURLY) {
				{
				setState(131);
				parameters();
				}
			}

			setState(134);
			match(RIGHTPAREN);
			setState(135);
			match(LEFTCURLY);
			setState(136);
			functionbody();
			setState(137);
			match(RIGHTCURLY);
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
	public static class CallBackFunctionContext extends ParserRuleContext {
		public TerminalNode LEFTPAREN() { return getToken(ReactParser.LEFTPAREN, 0); }
		public TerminalNode RIGHTPAREN() { return getToken(ReactParser.RIGHTPAREN, 0); }
		public TerminalNode ARROW() { return getToken(ReactParser.ARROW, 0); }
		public FunctionbodyContext functionbody() {
			return getRuleContext(FunctionbodyContext.class,0);
		}
		public TerminalNode RIGHTCURLY() { return getToken(ReactParser.RIGHTCURLY, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode LEFTCURLY() { return getToken(ReactParser.LEFTCURLY, 0); }
		public CallBackFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callBackFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterCallBackFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitCallBackFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitCallBackFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallBackFunctionContext callBackFunction() throws RecognitionException {
		CallBackFunctionContext _localctx = new CallBackFunctionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_callBackFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(LEFTPAREN);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFTCURLY) {
				{
				setState(140);
				parameters();
				}
			}

			setState(143);
			match(RIGHTPAREN);
			setState(144);
			match(ARROW);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFTCURLY) {
				{
				setState(145);
				match(LEFTCURLY);
				}
			}

			setState(148);
			functionbody();
			setState(149);
			match(RIGHTCURLY);
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
	public static class ParametersContext extends ParserRuleContext {
		public TerminalNode LEFTCURLY() { return getToken(ReactParser.LEFTCURLY, 0); }
		public List<TerminalNode> ID() { return getTokens(ReactParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ReactParser.ID, i);
		}
		public TerminalNode RIGHTCURLY() { return getToken(ReactParser.RIGHTCURLY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ReactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactParser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(151);
			match(LEFTCURLY);
			setState(152);
			match(ID);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(153);
				match(COMMA);
				setState(154);
				match(ID);
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160);
			match(RIGHTCURLY);
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
	public static class FunctionbodyContext extends ParserRuleContext {
		public List<FuncStatementContext> funcStatement() {
			return getRuleContexts(FuncStatementContext.class);
		}
		public FuncStatementContext funcStatement(int i) {
			return getRuleContext(FuncStatementContext.class,i);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public FunctionbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterFunctionbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitFunctionbody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitFunctionbody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionbodyContext functionbody() throws RecognitionException {
		FunctionbodyContext _localctx = new FunctionbodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionbody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4503737066586344L) != 0)) {
				{
				{
				setState(162);
				funcStatement();
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(168);
				returnStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncStatementContext extends ParserRuleContext {
		public UseEffectContext useEffect() {
			return getRuleContext(UseEffectContext.class,0);
		}
		public UseStateContext useState() {
			return getRuleContext(UseStateContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public CallFunContext callFun() {
			return getRuleContext(CallFunContext.class,0);
		}
		public Jsx_elementContext jsx_element() {
			return getRuleContext(Jsx_elementContext.class,0);
		}
		public FuncStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterFuncStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitFuncStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitFuncStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncStatementContext funcStatement() throws RecognitionException {
		FuncStatementContext _localctx = new FuncStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_funcStatement);
		try {
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				useEffect();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				useState();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(173);
				variableDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(174);
				print();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(175);
				callFun();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(176);
				jsx_element();
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
	public static class CallFunContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ReactParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ReactParser.ID, i);
		}
		public TerminalNode LEFTPAREN() { return getToken(ReactParser.LEFTPAREN, 0); }
		public TerminalNode RIGHTPAREN() { return getToken(ReactParser.RIGHTPAREN, 0); }
		public TerminalNode SEMI() { return getToken(ReactParser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ReactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactParser.COMMA, i);
		}
		public CallFunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callFun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterCallFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitCallFun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitCallFun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallFunContext callFun() throws RecognitionException {
		CallFunContext _localctx = new CallFunContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_callFun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(ID);
			setState(180);
			match(LEFTPAREN);
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(181);
				match(ID);
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(182);
					match(COMMA);
					}
				}

				}
				}
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(190);
			match(RIGHTPAREN);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(191);
				match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(ReactParser.RETURN, 0); }
		public TerminalNode LEFTPAREN() { return getToken(ReactParser.LEFTPAREN, 0); }
		public TerminalNode RIGHTPAREN() { return getToken(ReactParser.RIGHTPAREN, 0); }
		public TerminalNode SEMI() { return getToken(ReactParser.SEMI, 0); }
		public List<Jsx_elementContext> jsx_element() {
			return getRuleContexts(Jsx_elementContext.class);
		}
		public Jsx_elementContext jsx_element(int i) {
			return getRuleContext(Jsx_elementContext.class,i);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(RETURN);
			setState(195);
			match(LEFTPAREN);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LESSTHAN) {
				{
				{
				setState(196);
				jsx_element();
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202);
			match(RIGHTPAREN);
			setState(203);
			match(SEMI);
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
	public static class UseRefContext extends ParserRuleContext {
		public TerminalNode USEREF() { return getToken(ReactParser.USEREF, 0); }
		public TerminalNode LEFTPAREN() { return getToken(ReactParser.LEFTPAREN, 0); }
		public TerminalNode RIGHTPAREN() { return getToken(ReactParser.RIGHTPAREN, 0); }
		public List<TerminalNode> STRING() { return getTokens(ReactParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ReactParser.STRING, i);
		}
		public UseRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterUseRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitUseRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitUseRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseRefContext useRef() throws RecognitionException {
		UseRefContext _localctx = new UseRefContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_useRef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(USEREF);
			setState(206);
			match(LEFTPAREN);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING) {
				{
				{
				setState(207);
				match(STRING);
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(213);
			match(RIGHTPAREN);
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
	public static class UseStateContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(ReactParser.CONST, 0); }
		public TerminalNode LEFTBRACKET() { return getToken(ReactParser.LEFTBRACKET, 0); }
		public List<TerminalNode> ID() { return getTokens(ReactParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ReactParser.ID, i);
		}
		public TerminalNode COMMA() { return getToken(ReactParser.COMMA, 0); }
		public TerminalNode RIGHTBRACKET() { return getToken(ReactParser.RIGHTBRACKET, 0); }
		public TerminalNode EQUAL() { return getToken(ReactParser.EQUAL, 0); }
		public TerminalNode USESTATE() { return getToken(ReactParser.USESTATE, 0); }
		public TerminalNode LEFTPAREN() { return getToken(ReactParser.LEFTPAREN, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public TerminalNode RIGHTPAREN() { return getToken(ReactParser.RIGHTPAREN, 0); }
		public TerminalNode SEMI() { return getToken(ReactParser.SEMI, 0); }
		public UseStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterUseState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitUseState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitUseState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseStateContext useState() throws RecognitionException {
		UseStateContext _localctx = new UseStateContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_useState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(CONST);
			setState(216);
			match(LEFTBRACKET);
			setState(217);
			match(ID);
			setState(218);
			match(COMMA);
			setState(219);
			match(ID);
			setState(220);
			match(RIGHTBRACKET);
			setState(221);
			match(EQUAL);
			setState(222);
			match(USESTATE);
			setState(223);
			match(LEFTPAREN);
			setState(224);
			values();
			setState(225);
			match(RIGHTPAREN);
			setState(226);
			match(SEMI);
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
	public static class UseEffectContext extends ParserRuleContext {
		public TerminalNode USEEFFECT() { return getToken(ReactParser.USEEFFECT, 0); }
		public TerminalNode LEFTPAREN() { return getToken(ReactParser.LEFTPAREN, 0); }
		public CallBackFunctionContext callBackFunction() {
			return getRuleContext(CallBackFunctionContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(ReactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactParser.COMMA, i);
		}
		public TerminalNode LEFTBRACKET() { return getToken(ReactParser.LEFTBRACKET, 0); }
		public TerminalNode RIGHTBRACKET() { return getToken(ReactParser.RIGHTBRACKET, 0); }
		public TerminalNode RIGHTPAREN() { return getToken(ReactParser.RIGHTPAREN, 0); }
		public TerminalNode SEMI() { return getToken(ReactParser.SEMI, 0); }
		public List<TerminalNode> ID() { return getTokens(ReactParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ReactParser.ID, i);
		}
		public UseEffectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useEffect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterUseEffect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitUseEffect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitUseEffect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseEffectContext useEffect() throws RecognitionException {
		UseEffectContext _localctx = new UseEffectContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_useEffect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(USEEFFECT);
			setState(229);
			match(LEFTPAREN);
			setState(230);
			callBackFunction();
			setState(231);
			match(COMMA);
			setState(232);
			match(LEFTBRACKET);
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(233);
				match(ID);
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(234);
					match(COMMA);
					}
				}

				}
				}
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(242);
			match(RIGHTBRACKET);
			setState(243);
			match(RIGHTPAREN);
			setState(244);
			match(SEMI);
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
	public static class MapContext extends ParserRuleContext {
		public TerminalNode LEFTCURLY() { return getToken(ReactParser.LEFTCURLY, 0); }
		public List<TerminalNode> ID() { return getTokens(ReactParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ReactParser.ID, i);
		}
		public TerminalNode DOT() { return getToken(ReactParser.DOT, 0); }
		public List<TerminalNode> LEFTPAREN() { return getTokens(ReactParser.LEFTPAREN); }
		public TerminalNode LEFTPAREN(int i) {
			return getToken(ReactParser.LEFTPAREN, i);
		}
		public List<TerminalNode> RIGHTPAREN() { return getTokens(ReactParser.RIGHTPAREN); }
		public TerminalNode RIGHTPAREN(int i) {
			return getToken(ReactParser.RIGHTPAREN, i);
		}
		public TerminalNode ARROW() { return getToken(ReactParser.ARROW, 0); }
		public TerminalNode RIGHTCURLY() { return getToken(ReactParser.RIGHTCURLY, 0); }
		public List<Jsx_elementContext> jsx_element() {
			return getRuleContexts(Jsx_elementContext.class);
		}
		public Jsx_elementContext jsx_element(int i) {
			return getRuleContext(Jsx_elementContext.class,i);
		}
		public MapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitMap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitMap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapContext map() throws RecognitionException {
		MapContext _localctx = new MapContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_map);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(LEFTCURLY);
			setState(247);
			match(ID);
			setState(248);
			match(DOT);
			setState(249);
			match(ID);
			setState(250);
			match(LEFTPAREN);
			setState(251);
			match(LEFTPAREN);
			setState(252);
			match(ID);
			setState(253);
			match(RIGHTPAREN);
			setState(254);
			match(ARROW);
			setState(255);
			match(LEFTPAREN);
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LESSTHAN) {
				{
				{
				setState(256);
				jsx_element();
				}
				}
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(262);
			match(RIGHTPAREN);
			setState(263);
			match(RIGHTPAREN);
			setState(264);
			match(RIGHTCURLY);
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
	public static class Jsx_elementContext extends ParserRuleContext {
		public List<TerminalNode> LESSTHAN() { return getTokens(ReactParser.LESSTHAN); }
		public TerminalNode LESSTHAN(int i) {
			return getToken(ReactParser.LESSTHAN, i);
		}
		public List<TerminalNode> ID() { return getTokens(ReactParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ReactParser.ID, i);
		}
		public List<TerminalNode> GREATERTHAN() { return getTokens(ReactParser.GREATERTHAN); }
		public TerminalNode GREATERTHAN(int i) {
			return getToken(ReactParser.GREATERTHAN, i);
		}
		public TerminalNode DIVISION() { return getToken(ReactParser.DIVISION, 0); }
		public List<Jsx_attributeContext> jsx_attribute() {
			return getRuleContexts(Jsx_attributeContext.class);
		}
		public Jsx_attributeContext jsx_attribute(int i) {
			return getRuleContext(Jsx_attributeContext.class,i);
		}
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public Jsx_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsx_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsx_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsx_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsx_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jsx_elementContext jsx_element() throws RecognitionException {
		Jsx_elementContext _localctx = new Jsx_elementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_jsx_element);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(LESSTHAN);
			setState(267);
			match(ID);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(268);
				jsx_attribute();
				}
				}
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(274);
			match(GREATERTHAN);
			setState(278);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(275);
					content();
					}
					} 
				}
				setState(280);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(281);
			match(LESSTHAN);
			setState(282);
			match(DIVISION);
			setState(283);
			match(ID);
			setState(284);
			match(GREATERTHAN);
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
	public static class ContentContext extends ParserRuleContext {
		public Jsx_elementContext jsx_element() {
			return getRuleContext(Jsx_elementContext.class,0);
		}
		public ShortIfContext shortIf() {
			return getRuleContext(ShortIfContext.class,0);
		}
		public MapContext map() {
			return getRuleContext(MapContext.class,0);
		}
		public UseAttributeContext useAttribute() {
			return getRuleContext(UseAttributeContext.class,0);
		}
		public ComponentContext component() {
			return getRuleContext(ComponentContext.class,0);
		}
		public TerminalNode ID() { return getToken(ReactParser.ID, 0); }
		public TerminalNode COLON() { return getToken(ReactParser.COLON, 0); }
		public TerminalNode DOT() { return getToken(ReactParser.DOT, 0); }
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_content);
		try {
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				jsx_element();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				shortIf();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(288);
				map();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(289);
				useAttribute();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(290);
				component();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(291);
				match(ID);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(292);
				match(COLON);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(293);
				match(DOT);
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
	public static class UseAttributeContext extends ParserRuleContext {
		public TerminalNode LEFTCURLY() { return getToken(ReactParser.LEFTCURLY, 0); }
		public List<TerminalNode> ID() { return getTokens(ReactParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ReactParser.ID, i);
		}
		public TerminalNode DOT() { return getToken(ReactParser.DOT, 0); }
		public TerminalNode RIGHTCURLY() { return getToken(ReactParser.RIGHTCURLY, 0); }
		public UseAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterUseAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitUseAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitUseAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseAttributeContext useAttribute() throws RecognitionException {
		UseAttributeContext _localctx = new UseAttributeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_useAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(LEFTCURLY);
			setState(297);
			match(ID);
			setState(298);
			match(DOT);
			setState(299);
			match(ID);
			setState(300);
			match(RIGHTCURLY);
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
	public static class Jsx_attributeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ReactParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(ReactParser.EQUAL, 0); }
		public List<TerminalNode> LEFTCURLY() { return getTokens(ReactParser.LEFTCURLY); }
		public TerminalNode LEFTCURLY(int i) {
			return getToken(ReactParser.LEFTCURLY, i);
		}
		public List<TerminalNode> RIGHTCURLY() { return getTokens(ReactParser.RIGHTCURLY); }
		public TerminalNode RIGHTCURLY(int i) {
			return getToken(ReactParser.RIGHTCURLY, i);
		}
		public List<AttributeDetailsContext> attributeDetails() {
			return getRuleContexts(AttributeDetailsContext.class);
		}
		public AttributeDetailsContext attributeDetails(int i) {
			return getRuleContext(AttributeDetailsContext.class,i);
		}
		public Jsx_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsx_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsx_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsx_attribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsx_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jsx_attributeContext jsx_attribute() throws RecognitionException {
		Jsx_attributeContext _localctx = new Jsx_attributeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_jsx_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(ID);
			setState(303);
			match(EQUAL);
			{
			setState(304);
			match(LEFTCURLY);
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFTCURLY) {
				{
				setState(305);
				match(LEFTCURLY);
				}
			}

			setState(309); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(308);
				attributeDetails();
				}
				}
				setState(311); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 13510801298030592L) != 0) );
			setState(313);
			match(RIGHTCURLY);
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RIGHTCURLY) {
				{
				setState(314);
				match(RIGHTCURLY);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeDetailsContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ReactParser.STRING, 0); }
		public TerminalNode COMMA() { return getToken(ReactParser.COMMA, 0); }
		public TerminalNode ID() { return getToken(ReactParser.ID, 0); }
		public TerminalNode COLON() { return getToken(ReactParser.COLON, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public AttributeDetailsFunctionContext attributeDetailsFunction() {
			return getRuleContext(AttributeDetailsFunctionContext.class,0);
		}
		public AttributeDetailsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeDetails; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterAttributeDetails(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitAttributeDetails(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitAttributeDetails(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeDetailsContext attributeDetails() throws RecognitionException {
		AttributeDetailsContext _localctx = new AttributeDetailsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_attributeDetails);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(317);
				match(STRING);
				}
				break;
			case 2:
				{
				setState(318);
				match(COMMA);
				setState(319);
				match(ID);
				setState(320);
				match(COLON);
				setState(321);
				values();
				}
				break;
			case 3:
				{
				setState(322);
				match(ID);
				setState(323);
				match(COLON);
				setState(324);
				values();
				}
				break;
			case 4:
				{
				setState(325);
				attributeDetailsFunction();
				}
				break;
			case 5:
				{
				setState(326);
				attributeDetailsFunction();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeDetailsFunctionContext extends ParserRuleContext {
		public List<TerminalNode> LEFTPAREN() { return getTokens(ReactParser.LEFTPAREN); }
		public TerminalNode LEFTPAREN(int i) {
			return getToken(ReactParser.LEFTPAREN, i);
		}
		public List<TerminalNode> RIGHTPAREN() { return getTokens(ReactParser.RIGHTPAREN); }
		public TerminalNode RIGHTPAREN(int i) {
			return getToken(ReactParser.RIGHTPAREN, i);
		}
		public TerminalNode ARROW() { return getToken(ReactParser.ARROW, 0); }
		public List<TerminalNode> ID() { return getTokens(ReactParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ReactParser.ID, i);
		}
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public AttributeDetailsFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeDetailsFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterAttributeDetailsFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitAttributeDetailsFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitAttributeDetailsFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeDetailsFunctionContext attributeDetailsFunction() throws RecognitionException {
		AttributeDetailsFunctionContext _localctx = new AttributeDetailsFunctionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_attributeDetailsFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(LEFTPAREN);
			setState(330);
			match(RIGHTPAREN);
			setState(331);
			match(ARROW);
			setState(332);
			match(ID);
			setState(333);
			match(LEFTPAREN);
			setState(336);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(334);
				match(ID);
				}
				break;
			case NULL:
			case BOOL:
			case STRING:
			case INT:
			case DOUBLE:
				{
				setState(335);
				values();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(338);
			match(RIGHTPAREN);
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
	public static class AttributeDetailsAttributeContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ReactParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ReactParser.ID, i);
		}
		public TerminalNode DOT() { return getToken(ReactParser.DOT, 0); }
		public AttributeDetailsAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeDetailsAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterAttributeDetailsAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitAttributeDetailsAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitAttributeDetailsAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeDetailsAttributeContext attributeDetailsAttribute() throws RecognitionException {
		AttributeDetailsAttributeContext _localctx = new AttributeDetailsAttributeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_attributeDetailsAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(ID);
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(341);
				match(DOT);
				setState(342);
				match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentContext extends ParserRuleContext {
		public TerminalNode LESSTHAN() { return getToken(ReactParser.LESSTHAN, 0); }
		public TerminalNode ID() { return getToken(ReactParser.ID, 0); }
		public TerminalNode SELF_CLOSED() { return getToken(ReactParser.SELF_CLOSED, 0); }
		public List<PropsContext> props() {
			return getRuleContexts(PropsContext.class);
		}
		public PropsContext props(int i) {
			return getRuleContext(PropsContext.class,i);
		}
		public ComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentContext component() throws RecognitionException {
		ComponentContext _localctx = new ComponentContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_component);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(LESSTHAN);
			setState(346);
			match(ID);
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(347);
				props();
				}
				}
				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(353);
			match(SELF_CLOSED);
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
	public static class PropsContext extends ParserRuleContext {
		public Name_propContext name_prop() {
			return getRuleContext(Name_propContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(ReactParser.EQUAL, 0); }
		public TerminalNode LEFTCURLY() { return getToken(ReactParser.LEFTCURLY, 0); }
		public Prop_valueContext prop_value() {
			return getRuleContext(Prop_valueContext.class,0);
		}
		public TerminalNode RIGHTCURLY() { return getToken(ReactParser.RIGHTCURLY, 0); }
		public PropsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_props; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterProps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitProps(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitProps(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropsContext props() throws RecognitionException {
		PropsContext _localctx = new PropsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_props);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			name_prop();
			setState(356);
			match(EQUAL);
			setState(357);
			match(LEFTCURLY);
			setState(358);
			prop_value();
			setState(359);
			match(RIGHTCURLY);
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
	public static class Name_propContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ReactParser.ID, 0); }
		public Name_propContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_prop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterName_prop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitName_prop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitName_prop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Name_propContext name_prop() throws RecognitionException {
		Name_propContext _localctx = new Name_propContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_name_prop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(ID);
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
	public static class Prop_valueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ReactParser.ID, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public Prop_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prop_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterProp_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitProp_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitProp_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prop_valueContext prop_value() throws RecognitionException {
		Prop_valueContext _localctx = new Prop_valueContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_prop_value);
		try {
			setState(365);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(363);
				match(ID);
				}
				break;
			case NULL:
			case BOOL:
			case STRING:
			case INT:
			case DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(364);
				values();
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
	public static class ShortIfContext extends ParserRuleContext {
		public TerminalNode LEFTCURLY() { return getToken(ReactParser.LEFTCURLY, 0); }
		public TerminalNode RIGHTCURLY() { return getToken(ReactParser.RIGHTCURLY, 0); }
		public List<ComponentContext> component() {
			return getRuleContexts(ComponentContext.class);
		}
		public ComponentContext component(int i) {
			return getRuleContext(ComponentContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(ReactParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ReactParser.ID, i);
		}
		public List<TerminalNode> AND() { return getTokens(ReactParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(ReactParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(ReactParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(ReactParser.OR, i);
		}
		public List<TerminalNode> LESSEQUAL() { return getTokens(ReactParser.LESSEQUAL); }
		public TerminalNode LESSEQUAL(int i) {
			return getToken(ReactParser.LESSEQUAL, i);
		}
		public List<TerminalNode> GREATEREQUAL() { return getTokens(ReactParser.GREATEREQUAL); }
		public TerminalNode GREATEREQUAL(int i) {
			return getToken(ReactParser.GREATEREQUAL, i);
		}
		public List<TerminalNode> EQ() { return getTokens(ReactParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(ReactParser.EQ, i);
		}
		public ShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortIfContext shortIf() throws RecognitionException {
		ShortIfContext _localctx = new ShortIfContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_shortIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(LEFTCURLY);
			setState(370);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LESSTHAN:
				{
				setState(368);
				component();
				}
				break;
			case ID:
				{
				setState(369);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(377); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(372);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 60473139527680L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(375);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LESSTHAN:
					{
					setState(373);
					component();
					}
					break;
				case ID:
					{
					setState(374);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(379); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 60473139527680L) != 0) );
			setState(381);
			match(RIGHTCURLY);
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
	public static class ValuesContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ReactParser.STRING, 0); }
		public TerminalNode BOOL() { return getToken(ReactParser.BOOL, 0); }
		public TerminalNode DOUBLE() { return getToken(ReactParser.DOUBLE, 0); }
		public TerminalNode INT() { return getToken(ReactParser.INT, 0); }
		public TerminalNode NULL() { return getToken(ReactParser.NULL, 0); }
		public ValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 65302194597920768L) != 0)) ) {
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
	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode LEFTBRACKET() { return getToken(ReactParser.LEFTBRACKET, 0); }
		public TerminalNode RIGHTBRACKET() { return getToken(ReactParser.RIGHTBRACKET, 0); }
		public List<RowContext> row() {
			return getRuleContexts(RowContext.class);
		}
		public RowContext row(int i) {
			return getRuleContext(RowContext.class,i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(LEFTBRACKET);
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFTCURLY) {
				{
				{
				setState(386);
				row();
				}
				}
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(392);
			match(RIGHTBRACKET);
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
	public static class RowContext extends ParserRuleContext {
		public TerminalNode LEFTCURLY() { return getToken(ReactParser.LEFTCURLY, 0); }
		public TerminalNode RIGHTCURLY() { return getToken(ReactParser.RIGHTCURLY, 0); }
		public TerminalNode COMMA() { return getToken(ReactParser.COMMA, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitRow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitRow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_row);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(394);
			match(LEFTCURLY);
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(395);
				element();
				}
				}
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(401);
			match(RIGHTCURLY);
			setState(402);
			match(COMMA);
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
	public static class ElementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ReactParser.ID, 0); }
		public TerminalNode COLON() { return getToken(ReactParser.COLON, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ReactParser.COMMA, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(ID);
			setState(405);
			match(COLON);
			setState(406);
			values();
			setState(407);
			match(COMMA);
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
	public static class PrintContext extends ParserRuleContext {
		public TerminalNode CONSOLE() { return getToken(ReactParser.CONSOLE, 0); }
		public TerminalNode DOT() { return getToken(ReactParser.DOT, 0); }
		public TerminalNode LOG() { return getToken(ReactParser.LOG, 0); }
		public TerminalNode LEFTPAREN() { return getToken(ReactParser.LEFTPAREN, 0); }
		public TerminalNode RIGHTPAREN() { return getToken(ReactParser.RIGHTPAREN, 0); }
		public TerminalNode SEMI() { return getToken(ReactParser.SEMI, 0); }
		public List<TerminalNode> ID() { return getTokens(ReactParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ReactParser.ID, i);
		}
		public List<TerminalNode> STRING() { return getTokens(ReactParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ReactParser.STRING, i);
		}
		public List<TerminalNode> INT() { return getTokens(ReactParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(ReactParser.INT, i);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(CONSOLE);
			setState(410);
			match(DOT);
			setState(411);
			match(LOG);
			setState(412);
			match(LEFTPAREN);
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 31525197391593472L) != 0)) {
				{
				{
				setState(413);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 31525197391593472L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(418);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(419);
			match(RIGHTPAREN);
			setState(420);
			match(SEMI);
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

	public static final String _serializedATN =
		"\u0004\u00017\u01a7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0001\u0000\u0005\u0000D\b\u0000"+
		"\n\u0000\f\u0000G\t\u0000\u0001\u0000\u0001\u0000\u0005\u0000K\b\u0000"+
		"\n\u0000\f\u0000N\t\u0000\u0001\u0000\u0003\u0000Q\b\u0000\u0001\u0001"+
		"\u0001\u0001\u0003\u0001U\b\u0001\u0001\u0001\u0003\u0001X\b\u0001\u0001"+
		"\u0001\u0003\u0001[\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001_\b\u0001"+
		"\u0005\u0001a\b\u0001\n\u0001\f\u0001d\t\u0001\u0001\u0001\u0003\u0001"+
		"g\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003x\b\u0003"+
		"\u0001\u0003\u0003\u0003{\b\u0003\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u007f\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u0085\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u008e\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u0093\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u009c\b\u0007"+
		"\n\u0007\f\u0007\u009f\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0005\b"+
		"\u00a4\b\b\n\b\f\b\u00a7\t\b\u0001\b\u0003\b\u00aa\b\b\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00b2\b\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u00b8\b\n\u0005\n\u00ba\b\n\n\n\f\n\u00bd\t\n\u0001"+
		"\n\u0001\n\u0003\n\u00c1\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u00c6\b\u000b\n\u000b\f\u000b\u00c9\t\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u00d1\b\f\n\f\f\f\u00d4\t"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u00ec\b\u000e\u0005\u000e\u00ee\b\u000e\n\u000e\f\u000e\u00f1\t\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0102\b\u000f\n\u000f"+
		"\f\u000f\u0105\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u010e\b\u0010\n\u0010"+
		"\f\u0010\u0111\t\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u0115\b\u0010"+
		"\n\u0010\f\u0010\u0118\t\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0127\b\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0133\b\u0013\u0001"+
		"\u0013\u0004\u0013\u0136\b\u0013\u000b\u0013\f\u0013\u0137\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u013c\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u0148\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0151\b\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016"+
		"\u0158\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u015d\b"+
		"\u0017\n\u0017\f\u0017\u0160\t\u0017\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0003\u001a\u016e\b\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0003\u001b\u0173\b\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u0178\b\u001b\u0004\u001b\u017a\b\u001b\u000b"+
		"\u001b\f\u001b\u017b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001d\u0001\u001d\u0005\u001d\u0184\b\u001d\n\u001d\f\u001d\u0187\t\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0005\u001e\u018d\b\u001e"+
		"\n\u001e\f\u001e\u0190\t\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0005 \u019f\b \n \f \u01a2\t \u0001 \u0001 \u0001 \u0001"+
		" \u0000\u0000!\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@\u0000\u0005\u0002\u0000\u0011"+
		"\u001244\u0001\u0000\u0005\u0007\u0002\u0000(*,-\u0003\u0000\u0014\u0014"+
		"3357\u0001\u000046\u01c0\u0000E\u0001\u0000\u0000\u0000\u0002R\u0001\u0000"+
		"\u0000\u0000\u0004l\u0001\u0000\u0000\u0000\u0006q\u0001\u0000\u0000\u0000"+
		"\b~\u0001\u0000\u0000\u0000\n\u0080\u0001\u0000\u0000\u0000\f\u008b\u0001"+
		"\u0000\u0000\u0000\u000e\u0097\u0001\u0000\u0000\u0000\u0010\u00a5\u0001"+
		"\u0000\u0000\u0000\u0012\u00b1\u0001\u0000\u0000\u0000\u0014\u00b3\u0001"+
		"\u0000\u0000\u0000\u0016\u00c2\u0001\u0000\u0000\u0000\u0018\u00cd\u0001"+
		"\u0000\u0000\u0000\u001a\u00d7\u0001\u0000\u0000\u0000\u001c\u00e4\u0001"+
		"\u0000\u0000\u0000\u001e\u00f6\u0001\u0000\u0000\u0000 \u010a\u0001\u0000"+
		"\u0000\u0000\"\u0126\u0001\u0000\u0000\u0000$\u0128\u0001\u0000\u0000"+
		"\u0000&\u012e\u0001\u0000\u0000\u0000(\u0147\u0001\u0000\u0000\u0000*"+
		"\u0149\u0001\u0000\u0000\u0000,\u0154\u0001\u0000\u0000\u0000.\u0159\u0001"+
		"\u0000\u0000\u00000\u0163\u0001\u0000\u0000\u00002\u0169\u0001\u0000\u0000"+
		"\u00004\u016d\u0001\u0000\u0000\u00006\u016f\u0001\u0000\u0000\u00008"+
		"\u017f\u0001\u0000\u0000\u0000:\u0181\u0001\u0000\u0000\u0000<\u018a\u0001"+
		"\u0000\u0000\u0000>\u0194\u0001\u0000\u0000\u0000@\u0199\u0001\u0000\u0000"+
		"\u0000BD\u0003\u0002\u0001\u0000CB\u0001\u0000\u0000\u0000DG\u0001\u0000"+
		"\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FL\u0001"+
		"\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000HK\u0003\b\u0004\u0000IK\u0003"+
		"\u0006\u0003\u0000JH\u0001\u0000\u0000\u0000JI\u0001\u0000\u0000\u0000"+
		"KN\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000"+
		"\u0000MP\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000OQ\u0003\u0004"+
		"\u0002\u0000PO\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000Q\u0001"+
		"\u0001\u0000\u0000\u0000RT\u0005\r\u0000\u0000SU\u00054\u0000\u0000TS"+
		"\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UW\u0001\u0000\u0000"+
		"\u0000VX\u0005\u001c\u0000\u0000WV\u0001\u0000\u0000\u0000WX\u0001\u0000"+
		"\u0000\u0000XZ\u0001\u0000\u0000\u0000Y[\u0005#\u0000\u0000ZY\u0001\u0000"+
		"\u0000\u0000Z[\u0001\u0000\u0000\u0000[b\u0001\u0000\u0000\u0000\\^\u0007"+
		"\u0000\u0000\u0000]_\u0005\u001c\u0000\u0000^]\u0001\u0000\u0000\u0000"+
		"^_\u0001\u0000\u0000\u0000_a\u0001\u0000\u0000\u0000`\\\u0001\u0000\u0000"+
		"\u0000ad\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000"+
		"\u0000\u0000cf\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000eg\u0005"+
		"$\u0000\u0000fe\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gh\u0001"+
		"\u0000\u0000\u0000hi\u0005\u0010\u0000\u0000ij\u00055\u0000\u0000jk\u0005"+
		"\u001d\u0000\u0000k\u0003\u0001\u0000\u0000\u0000lm\u0005\u000e\u0000"+
		"\u0000mn\u0005\u000f\u0000\u0000no\u00054\u0000\u0000op\u0005\u001d\u0000"+
		"\u0000p\u0005\u0001\u0000\u0000\u0000qr\u0007\u0001\u0000\u0000rs\u0005"+
		"4\u0000\u0000sw\u0005\u0016\u0000\u0000tx\u00038\u001c\u0000ux\u0003\b"+
		"\u0004\u0000vx\u0003:\u001d\u0000wt\u0001\u0000\u0000\u0000wu\u0001\u0000"+
		"\u0000\u0000wv\u0001\u0000\u0000\u0000xz\u0001\u0000\u0000\u0000y{\u0005"+
		"\u001d\u0000\u0000zy\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000"+
		"{\u0007\u0001\u0000\u0000\u0000|\u007f\u0003\n\u0005\u0000}\u007f\u0003"+
		"\f\u0006\u0000~|\u0001\u0000\u0000\u0000~}\u0001\u0000\u0000\u0000\u007f"+
		"\t\u0001\u0000\u0000\u0000\u0080\u0081\u0005\u0002\u0000\u0000\u0081\u0082"+
		"\u00054\u0000\u0000\u0082\u0084\u0005\u001f\u0000\u0000\u0083\u0085\u0003"+
		"\u000e\u0007\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0084\u0085\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0087\u0005"+
		" \u0000\u0000\u0087\u0088\u0005#\u0000\u0000\u0088\u0089\u0003\u0010\b"+
		"\u0000\u0089\u008a\u0005$\u0000\u0000\u008a\u000b\u0001\u0000\u0000\u0000"+
		"\u008b\u008d\u0005\u001f\u0000\u0000\u008c\u008e\u0003\u000e\u0007\u0000"+
		"\u008d\u008c\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000"+
		"\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0090\u0005 \u0000\u0000\u0090"+
		"\u0092\u0005\u0015\u0000\u0000\u0091\u0093\u0005#\u0000\u0000\u0092\u0091"+
		"\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0094"+
		"\u0001\u0000\u0000\u0000\u0094\u0095\u0003\u0010\b\u0000\u0095\u0096\u0005"+
		"$\u0000\u0000\u0096\r\u0001\u0000\u0000\u0000\u0097\u0098\u0005#\u0000"+
		"\u0000\u0098\u009d\u00054\u0000\u0000\u0099\u009a\u0005\u001c\u0000\u0000"+
		"\u009a\u009c\u00054\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009c"+
		"\u009f\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d"+
		"\u009e\u0001\u0000\u0000\u0000\u009e\u00a0\u0001\u0000\u0000\u0000\u009f"+
		"\u009d\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005$\u0000\u0000\u00a1\u000f"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a4\u0003\u0012\t\u0000\u00a3\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a7\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a9\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a8\u00aa\u0003"+
		"\u0016\u000b\u0000\u00a9\u00a8\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001"+
		"\u0000\u0000\u0000\u00aa\u0011\u0001\u0000\u0000\u0000\u00ab\u00b2\u0003"+
		"\u001c\u000e\u0000\u00ac\u00b2\u0003\u001a\r\u0000\u00ad\u00b2\u0003\u0006"+
		"\u0003\u0000\u00ae\u00b2\u0003@ \u0000\u00af\u00b2\u0003\u0014\n\u0000"+
		"\u00b0\u00b2\u0003 \u0010\u0000\u00b1\u00ab\u0001\u0000\u0000\u0000\u00b1"+
		"\u00ac\u0001\u0000\u0000\u0000\u00b1\u00ad\u0001\u0000\u0000\u0000\u00b1"+
		"\u00ae\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b1"+
		"\u00b0\u0001\u0000\u0000\u0000\u00b2\u0013\u0001\u0000\u0000\u0000\u00b3"+
		"\u00b4\u00054\u0000\u0000\u00b4\u00bb\u0005\u001f\u0000\u0000\u00b5\u00b7"+
		"\u00054\u0000\u0000\u00b6\u00b8\u0005\u001c\u0000\u0000\u00b7\u00b6\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00ba\u0001"+
		"\u0000\u0000\u0000\u00b9\u00b5\u0001\u0000\u0000\u0000\u00ba\u00bd\u0001"+
		"\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001"+
		"\u0000\u0000\u0000\u00bc\u00be\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001"+
		"\u0000\u0000\u0000\u00be\u00c0\u0005 \u0000\u0000\u00bf\u00c1\u0005\u001d"+
		"\u0000\u0000\u00c0\u00bf\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c1\u0015\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005\f\u0000"+
		"\u0000\u00c3\u00c7\u0005\u001f\u0000\u0000\u00c4\u00c6\u0003 \u0010\u0000"+
		"\u00c5\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c9\u0001\u0000\u0000\u0000"+
		"\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000"+
		"\u00c8\u00ca\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000"+
		"\u00ca\u00cb\u0005 \u0000\u0000\u00cb\u00cc\u0005\u001d\u0000\u0000\u00cc"+
		"\u0017\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005\u0013\u0000\u0000\u00ce"+
		"\u00d2\u0005\u001f\u0000\u0000\u00cf\u00d1\u00055\u0000\u0000\u00d0\u00cf"+
		"\u0001\u0000\u0000\u0000\u00d1\u00d4\u0001\u0000\u0000\u0000\u00d2\u00d0"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d5\u00d6"+
		"\u0005 \u0000\u0000\u00d6\u0019\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005"+
		"\u0007\u0000\u0000\u00d8\u00d9\u0005!\u0000\u0000\u00d9\u00da\u00054\u0000"+
		"\u0000\u00da\u00db\u0005\u001c\u0000\u0000\u00db\u00dc\u00054\u0000\u0000"+
		"\u00dc\u00dd\u0005\"\u0000\u0000\u00dd\u00de\u0005\u0016\u0000\u0000\u00de"+
		"\u00df\u0005\u0011\u0000\u0000\u00df\u00e0\u0005\u001f\u0000\u0000\u00e0"+
		"\u00e1\u00038\u001c\u0000\u00e1\u00e2\u0005 \u0000\u0000\u00e2\u00e3\u0005"+
		"\u001d\u0000\u0000\u00e3\u001b\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005"+
		"\u0012\u0000\u0000\u00e5\u00e6\u0005\u001f\u0000\u0000\u00e6\u00e7\u0003"+
		"\f\u0006\u0000\u00e7\u00e8\u0005\u001c\u0000\u0000\u00e8\u00ef\u0005!"+
		"\u0000\u0000\u00e9\u00eb\u00054\u0000\u0000\u00ea\u00ec\u0005\u001c\u0000"+
		"\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000"+
		"\u0000\u00ec\u00ee\u0001\u0000\u0000\u0000\u00ed\u00e9\u0001\u0000\u0000"+
		"\u0000\u00ee\u00f1\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000"+
		"\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0\u00f2\u0001\u0000\u0000"+
		"\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f2\u00f3\u0005\"\u0000\u0000"+
		"\u00f3\u00f4\u0005 \u0000\u0000\u00f4\u00f5\u0005\u001d\u0000\u0000\u00f5"+
		"\u001d\u0001\u0000\u0000\u0000\u00f6\u00f7\u0005#\u0000\u0000\u00f7\u00f8"+
		"\u00054\u0000\u0000\u00f8\u00f9\u00052\u0000\u0000\u00f9\u00fa\u00054"+
		"\u0000\u0000\u00fa\u00fb\u0005\u001f\u0000\u0000\u00fb\u00fc\u0005\u001f"+
		"\u0000\u0000\u00fc\u00fd\u00054\u0000\u0000\u00fd\u00fe\u0005 \u0000\u0000"+
		"\u00fe\u00ff\u0005\u0015\u0000\u0000\u00ff\u0103\u0005\u001f\u0000\u0000"+
		"\u0100\u0102\u0003 \u0010\u0000\u0101\u0100\u0001\u0000\u0000\u0000\u0102"+
		"\u0105\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0103"+
		"\u0104\u0001\u0000\u0000\u0000\u0104\u0106\u0001\u0000\u0000\u0000\u0105"+
		"\u0103\u0001\u0000\u0000\u0000\u0106\u0107\u0005 \u0000\u0000\u0107\u0108"+
		"\u0005 \u0000\u0000\u0108\u0109\u0005$\u0000\u0000\u0109\u001f\u0001\u0000"+
		"\u0000\u0000\u010a\u010b\u0005%\u0000\u0000\u010b\u010f\u00054\u0000\u0000"+
		"\u010c\u010e\u0003&\u0013\u0000\u010d\u010c\u0001\u0000\u0000\u0000\u010e"+
		"\u0111\u0001\u0000\u0000\u0000\u010f\u010d\u0001\u0000\u0000\u0000\u010f"+
		"\u0110\u0001\u0000\u0000\u0000\u0110\u0112\u0001\u0000\u0000\u0000\u0111"+
		"\u010f\u0001\u0000\u0000\u0000\u0112\u0116\u0005&\u0000\u0000\u0113\u0115"+
		"\u0003\"\u0011\u0000\u0114\u0113\u0001\u0000\u0000\u0000\u0115\u0118\u0001"+
		"\u0000\u0000\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0116\u0117\u0001"+
		"\u0000\u0000\u0000\u0117\u0119\u0001\u0000\u0000\u0000\u0118\u0116\u0001"+
		"\u0000\u0000\u0000\u0119\u011a\u0005%\u0000\u0000\u011a\u011b\u0005\u001a"+
		"\u0000\u0000\u011b\u011c\u00054\u0000\u0000\u011c\u011d\u0005&\u0000\u0000"+
		"\u011d!\u0001\u0000\u0000\u0000\u011e\u0127\u0003 \u0010\u0000\u011f\u0127"+
		"\u00036\u001b\u0000\u0120\u0127\u0003\u001e\u000f\u0000\u0121\u0127\u0003"+
		"$\u0012\u0000\u0122\u0127\u0003.\u0017\u0000\u0123\u0127\u00054\u0000"+
		"\u0000\u0124\u0127\u0005\u001e\u0000\u0000\u0125\u0127\u00052\u0000\u0000"+
		"\u0126\u011e\u0001\u0000\u0000\u0000\u0126\u011f\u0001\u0000\u0000\u0000"+
		"\u0126\u0120\u0001\u0000\u0000\u0000\u0126\u0121\u0001\u0000\u0000\u0000"+
		"\u0126\u0122\u0001\u0000\u0000\u0000\u0126\u0123\u0001\u0000\u0000\u0000"+
		"\u0126\u0124\u0001\u0000\u0000\u0000\u0126\u0125\u0001\u0000\u0000\u0000"+
		"\u0127#\u0001\u0000\u0000\u0000\u0128\u0129\u0005#\u0000\u0000\u0129\u012a"+
		"\u00054\u0000\u0000\u012a\u012b\u00052\u0000\u0000\u012b\u012c\u00054"+
		"\u0000\u0000\u012c\u012d\u0005$\u0000\u0000\u012d%\u0001\u0000\u0000\u0000"+
		"\u012e\u012f\u00054\u0000\u0000\u012f\u0130\u0005\u0016\u0000\u0000\u0130"+
		"\u0132\u0005#\u0000\u0000\u0131\u0133\u0005#\u0000\u0000\u0132\u0131\u0001"+
		"\u0000\u0000\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133\u0135\u0001"+
		"\u0000\u0000\u0000\u0134\u0136\u0003(\u0014\u0000\u0135\u0134\u0001\u0000"+
		"\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000\u0137\u0135\u0001\u0000"+
		"\u0000\u0000\u0137\u0138\u0001\u0000\u0000\u0000\u0138\u0139\u0001\u0000"+
		"\u0000\u0000\u0139\u013b\u0005$\u0000\u0000\u013a\u013c\u0005$\u0000\u0000"+
		"\u013b\u013a\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000"+
		"\u013c\'\u0001\u0000\u0000\u0000\u013d\u0148\u00055\u0000\u0000\u013e"+
		"\u013f\u0005\u001c\u0000\u0000\u013f\u0140\u00054\u0000\u0000\u0140\u0141"+
		"\u0005\u001e\u0000\u0000\u0141\u0148\u00038\u001c\u0000\u0142\u0143\u0005"+
		"4\u0000\u0000\u0143\u0144\u0005\u001e\u0000\u0000\u0144\u0148\u00038\u001c"+
		"\u0000\u0145\u0148\u0003*\u0015\u0000\u0146\u0148\u0003*\u0015\u0000\u0147"+
		"\u013d\u0001\u0000\u0000\u0000\u0147\u013e\u0001\u0000\u0000\u0000\u0147"+
		"\u0142\u0001\u0000\u0000\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0147"+
		"\u0146\u0001\u0000\u0000\u0000\u0148)\u0001\u0000\u0000\u0000\u0149\u014a"+
		"\u0005\u001f\u0000\u0000\u014a\u014b\u0005 \u0000\u0000\u014b\u014c\u0005"+
		"\u0015\u0000\u0000\u014c\u014d\u00054\u0000\u0000\u014d\u0150\u0005\u001f"+
		"\u0000\u0000\u014e\u0151\u00054\u0000\u0000\u014f\u0151\u00038\u001c\u0000"+
		"\u0150\u014e\u0001\u0000\u0000\u0000\u0150\u014f\u0001\u0000\u0000\u0000"+
		"\u0151\u0152\u0001\u0000\u0000\u0000\u0152\u0153\u0005 \u0000\u0000\u0153"+
		"+\u0001\u0000\u0000\u0000\u0154\u0157\u00054\u0000\u0000\u0155\u0156\u0005"+
		"2\u0000\u0000\u0156\u0158\u00054\u0000\u0000\u0157\u0155\u0001\u0000\u0000"+
		"\u0000\u0157\u0158\u0001\u0000\u0000\u0000\u0158-\u0001\u0000\u0000\u0000"+
		"\u0159\u015a\u0005%\u0000\u0000\u015a\u015e\u00054\u0000\u0000\u015b\u015d"+
		"\u00030\u0018\u0000\u015c\u015b\u0001\u0000\u0000\u0000\u015d\u0160\u0001"+
		"\u0000\u0000\u0000\u015e\u015c\u0001\u0000\u0000\u0000\u015e\u015f\u0001"+
		"\u0000\u0000\u0000\u015f\u0161\u0001\u0000\u0000\u0000\u0160\u015e\u0001"+
		"\u0000\u0000\u0000\u0161\u0162\u0005\'\u0000\u0000\u0162/\u0001\u0000"+
		"\u0000\u0000\u0163\u0164\u00032\u0019\u0000\u0164\u0165\u0005\u0016\u0000"+
		"\u0000\u0165\u0166\u0005#\u0000\u0000\u0166\u0167\u00034\u001a\u0000\u0167"+
		"\u0168\u0005$\u0000\u0000\u01681\u0001\u0000\u0000\u0000\u0169\u016a\u0005"+
		"4\u0000\u0000\u016a3\u0001\u0000\u0000\u0000\u016b\u016e\u00054\u0000"+
		"\u0000\u016c\u016e\u00038\u001c\u0000\u016d\u016b\u0001\u0000\u0000\u0000"+
		"\u016d\u016c\u0001\u0000\u0000\u0000\u016e5\u0001\u0000\u0000\u0000\u016f"+
		"\u0172\u0005#\u0000\u0000\u0170\u0173\u0003.\u0017\u0000\u0171\u0173\u0005"+
		"4\u0000\u0000\u0172\u0170\u0001\u0000\u0000\u0000\u0172\u0171\u0001\u0000"+
		"\u0000\u0000\u0173\u0179\u0001\u0000\u0000\u0000\u0174\u0177\u0007\u0002"+
		"\u0000\u0000\u0175\u0178\u0003.\u0017\u0000\u0176\u0178\u00054\u0000\u0000"+
		"\u0177\u0175\u0001\u0000\u0000\u0000\u0177\u0176\u0001\u0000\u0000\u0000"+
		"\u0178\u017a\u0001\u0000\u0000\u0000\u0179\u0174\u0001\u0000\u0000\u0000"+
		"\u017a\u017b\u0001\u0000\u0000\u0000\u017b\u0179\u0001\u0000\u0000\u0000"+
		"\u017b\u017c\u0001\u0000\u0000\u0000\u017c\u017d\u0001\u0000\u0000\u0000"+
		"\u017d\u017e\u0005$\u0000\u0000\u017e7\u0001\u0000\u0000\u0000\u017f\u0180"+
		"\u0007\u0003\u0000\u0000\u01809\u0001\u0000\u0000\u0000\u0181\u0185\u0005"+
		"!\u0000\u0000\u0182\u0184\u0003<\u001e\u0000\u0183\u0182\u0001\u0000\u0000"+
		"\u0000\u0184\u0187\u0001\u0000\u0000\u0000\u0185\u0183\u0001\u0000\u0000"+
		"\u0000\u0185\u0186\u0001\u0000\u0000\u0000\u0186\u0188\u0001\u0000\u0000"+
		"\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0188\u0189\u0005\"\u0000\u0000"+
		"\u0189;\u0001\u0000\u0000\u0000\u018a\u018e\u0005#\u0000\u0000\u018b\u018d"+
		"\u0003>\u001f\u0000\u018c\u018b\u0001\u0000\u0000\u0000\u018d\u0190\u0001"+
		"\u0000\u0000\u0000\u018e\u018c\u0001\u0000\u0000\u0000\u018e\u018f\u0001"+
		"\u0000\u0000\u0000\u018f\u0191\u0001\u0000\u0000\u0000\u0190\u018e\u0001"+
		"\u0000\u0000\u0000\u0191\u0192\u0005$\u0000\u0000\u0192\u0193\u0005\u001c"+
		"\u0000\u0000\u0193=\u0001\u0000\u0000\u0000\u0194\u0195\u00054\u0000\u0000"+
		"\u0195\u0196\u0005\u001e\u0000\u0000\u0196\u0197\u00038\u001c\u0000\u0197"+
		"\u0198\u0005\u001c\u0000\u0000\u0198?\u0001\u0000\u0000\u0000\u0199\u019a"+
		"\u0005\u0003\u0000\u0000\u019a\u019b\u00052\u0000\u0000\u019b\u019c\u0005"+
		"\u0004\u0000\u0000\u019c\u01a0\u0005\u001f\u0000\u0000\u019d\u019f\u0007"+
		"\u0004\u0000\u0000\u019e\u019d\u0001\u0000\u0000\u0000\u019f\u01a2\u0001"+
		"\u0000\u0000\u0000\u01a0\u019e\u0001\u0000\u0000\u0000\u01a0\u01a1\u0001"+
		"\u0000\u0000\u0000\u01a1\u01a3\u0001\u0000\u0000\u0000\u01a2\u01a0\u0001"+
		"\u0000\u0000\u0000\u01a3\u01a4\u0005 \u0000\u0000\u01a4\u01a5\u0005\u001d"+
		"\u0000\u0000\u01a5A\u0001\u0000\u0000\u0000-EJLPTWZ^bfwz~\u0084\u008d"+
		"\u0092\u009d\u00a5\u00a9\u00b1\u00b7\u00bb\u00c0\u00c7\u00d2\u00eb\u00ef"+
		"\u0103\u010f\u0116\u0126\u0132\u0137\u013b\u0147\u0150\u0157\u015e\u016d"+
		"\u0172\u0177\u017b\u0185\u018e\u01a0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}