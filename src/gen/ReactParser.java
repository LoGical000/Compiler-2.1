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
		RULE_parameters = 7, RULE_functionbody = 8, RULE_funcStatement = 9, RULE_callFunc = 10, 
		RULE_returnStatement = 11, RULE_useRef = 12, RULE_useState = 13, RULE_useEffect = 14, 
		RULE_map = 15, RULE_jsx_element = 16, RULE_content = 17, RULE_useAttribute = 18, 
		RULE_jsx_attribute = 19, RULE_attributeDetails = 20, RULE_attributeDetailsFunction = 21, 
		RULE_attributeDetailsAttribute = 22, RULE_component = 23, RULE_props = 24, 
		RULE_name_prop = 25, RULE_prop_value = 26, RULE_shortIf = 27, RULE_value = 28, 
		RULE_array = 29, RULE_arrayObjects = 30, RULE_arrayValues = 31, RULE_object = 32, 
		RULE_element = 33, RULE_print = 34;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "importStatement", "export", "variableDeclaration", "functionDeclaration", 
			"regularFunction", "callBackFunction", "parameters", "functionbody", 
			"funcStatement", "callFunc", "returnStatement", "useRef", "useState", 
			"useEffect", "map", "jsx_element", "content", "useAttribute", "jsx_attribute", 
			"attributeDetails", "attributeDetailsFunction", "attributeDetailsAttribute", 
			"component", "props", "name_prop", "prop_value", "shortIf", "value", 
			"array", "arrayObjects", "arrayValues", "object", "element", "print"
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
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(70);
				importStatement();
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2147483876L) != 0)) {
				{
				setState(78);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FUNCTION:
				case LEFTPAREN:
					{
					setState(76);
					functionDeclaration();
					}
					break;
				case VAR:
				case LET:
				case CONST:
					{
					setState(77);
					variableDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(83);
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
			setState(86);
			match(IMPORT);
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(87);
				match(ID);
				}
				break;
			}
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(90);
				match(COMMA);
				}
			}

			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFTCURLY) {
				{
				setState(93);
				match(LEFTCURLY);
				}
			}

			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4503599627763712L) != 0)) {
				{
				{
				setState(96);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4503599627763712L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(97);
					match(COMMA);
					}
				}

				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RIGHTCURLY) {
				{
				setState(105);
				match(RIGHTCURLY);
				}
			}

			setState(108);
			match(FROM);
			setState(109);
			match(STRING);
			setState(110);
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
			setState(112);
			match(EXPORT);
			setState(113);
			match(DEFAULT);
			setState(114);
			match(ID);
			setState(115);
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
		public List<TerminalNode> ID() { return getTokens(ReactParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ReactParser.ID, i);
		}
		public TerminalNode EQUAL() { return getToken(ReactParser.EQUAL, 0); }
		public TerminalNode VAR() { return getToken(ReactParser.VAR, 0); }
		public TerminalNode CONST() { return getToken(ReactParser.CONST, 0); }
		public TerminalNode LET() { return getToken(ReactParser.LET, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
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
			setState(117);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 224L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(118);
			match(ID);
			setState(119);
			match(EQUAL);
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL:
			case BOOL:
			case STRING:
			case INT:
			case DOUBLE:
				{
				setState(120);
				value();
				}
				break;
			case FUNCTION:
			case LEFTPAREN:
				{
				setState(121);
				functionDeclaration();
				}
				break;
			case LEFTBRACKET:
				{
				setState(122);
				array();
				}
				break;
			case ID:
				{
				setState(123);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(126);
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
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				regularFunction();
				}
				break;
			case LEFTPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
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
			setState(133);
			match(FUNCTION);
			setState(134);
			match(ID);
			setState(135);
			match(LEFTPAREN);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFTCURLY || _la==ID) {
				{
				setState(136);
				parameters();
				}
			}

			setState(139);
			match(RIGHTPAREN);
			setState(140);
			match(LEFTCURLY);
			setState(141);
			functionbody();
			setState(142);
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
			setState(144);
			match(LEFTPAREN);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFTCURLY || _la==ID) {
				{
				setState(145);
				parameters();
				}
			}

			setState(148);
			match(RIGHTPAREN);
			setState(149);
			match(ARROW);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFTCURLY) {
				{
				setState(150);
				match(LEFTCURLY);
				}
			}

			setState(153);
			functionbody();
			setState(154);
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
		public List<TerminalNode> ID() { return getTokens(ReactParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ReactParser.ID, i);
		}
		public TerminalNode LEFTCURLY() { return getToken(ReactParser.LEFTCURLY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ReactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactParser.COMMA, i);
		}
		public TerminalNode RIGHTCURLY() { return getToken(ReactParser.RIGHTCURLY, 0); }
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
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFTCURLY) {
				{
				setState(156);
				match(LEFTCURLY);
				}
			}

			setState(159);
			match(ID);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(160);
				match(COMMA);
				setState(161);
				match(ID);
				}
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RIGHTCURLY) {
				{
				setState(167);
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
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4503737067110632L) != 0)) {
				{
				{
				setState(170);
				funcStatement();
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(176);
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
		public UseRefContext useRef() {
			return getRuleContext(UseRefContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public CallFuncContext callFunc() {
			return getRuleContext(CallFuncContext.class,0);
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
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				useEffect();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				useState();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
				useRef();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(182);
				variableDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(183);
				print();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(184);
				callFunc();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(185);
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
	public static class CallFuncContext extends ParserRuleContext {
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
		public CallFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterCallFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitCallFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitCallFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallFuncContext callFunc() throws RecognitionException {
		CallFuncContext _localctx = new CallFuncContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_callFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(ID);
			setState(189);
			match(LEFTPAREN);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(190);
				match(ID);
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(191);
					match(COMMA);
					}
				}

				}
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(199);
			match(RIGHTPAREN);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(200);
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
			setState(203);
			match(RETURN);
			setState(204);
			match(LEFTPAREN);
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LESSTHAN) {
				{
				{
				setState(205);
				jsx_element();
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(211);
			match(RIGHTPAREN);
			setState(212);
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
		public List<TerminalNode> COMMA() { return getTokens(ReactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactParser.COMMA, i);
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
			setState(214);
			match(USEREF);
			setState(215);
			match(LEFTPAREN);
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING) {
				{
				{
				setState(216);
				match(STRING);
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(217);
					match(COMMA);
					}
				}

				}
				}
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(225);
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
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
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
			setState(227);
			match(CONST);
			setState(228);
			match(LEFTBRACKET);
			setState(229);
			match(ID);
			setState(230);
			match(COMMA);
			setState(231);
			match(ID);
			setState(232);
			match(RIGHTBRACKET);
			setState(233);
			match(EQUAL);
			setState(234);
			match(USESTATE);
			setState(235);
			match(LEFTPAREN);
			setState(236);
			value();
			setState(237);
			match(RIGHTPAREN);
			setState(238);
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
			setState(240);
			match(USEEFFECT);
			setState(241);
			match(LEFTPAREN);
			setState(242);
			callBackFunction();
			setState(243);
			match(COMMA);
			setState(244);
			match(LEFTBRACKET);
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(245);
				match(ID);
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(246);
					match(COMMA);
					}
				}

				}
				}
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(254);
			match(RIGHTBRACKET);
			setState(255);
			match(RIGHTPAREN);
			setState(256);
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
			setState(258);
			match(LEFTCURLY);
			setState(259);
			match(ID);
			setState(260);
			match(DOT);
			setState(261);
			match(ID);
			setState(262);
			match(LEFTPAREN);
			setState(263);
			match(LEFTPAREN);
			setState(264);
			match(ID);
			setState(265);
			match(RIGHTPAREN);
			setState(266);
			match(ARROW);
			setState(267);
			match(LEFTPAREN);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LESSTHAN) {
				{
				{
				setState(268);
				jsx_element();
				}
				}
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(274);
			match(RIGHTPAREN);
			setState(275);
			match(RIGHTPAREN);
			setState(276);
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
			setState(278);
			match(LESSTHAN);
			setState(279);
			match(ID);
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(280);
				jsx_attribute();
				}
				}
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(286);
			match(GREATERTHAN);
			setState(290);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(287);
					content();
					}
					} 
				}
				setState(292);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			setState(293);
			match(LESSTHAN);
			setState(294);
			match(DIVISION);
			setState(295);
			match(ID);
			setState(296);
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
			setState(306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				jsx_element();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				shortIf();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(300);
				map();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(301);
				useAttribute();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(302);
				component();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(303);
				match(ID);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(304);
				match(COLON);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(305);
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
			setState(308);
			match(LEFTCURLY);
			setState(309);
			match(ID);
			setState(310);
			match(DOT);
			setState(311);
			match(ID);
			setState(312);
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
			setState(314);
			match(ID);
			setState(315);
			match(EQUAL);
			{
			setState(316);
			match(LEFTCURLY);
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFTCURLY) {
				{
				setState(317);
				match(LEFTCURLY);
				}
			}

			setState(321); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(320);
				attributeDetails();
				}
				}
				setState(323); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 13510801298030592L) != 0) );
			setState(325);
			match(RIGHTCURLY);
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RIGHTCURLY) {
				{
				setState(326);
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
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
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
			setState(339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(329);
				match(STRING);
				}
				break;
			case 2:
				{
				setState(330);
				match(COMMA);
				setState(331);
				match(ID);
				setState(332);
				match(COLON);
				setState(333);
				value();
				}
				break;
			case 3:
				{
				setState(334);
				match(ID);
				setState(335);
				match(COLON);
				setState(336);
				value();
				}
				break;
			case 4:
				{
				setState(337);
				attributeDetailsFunction();
				}
				break;
			case 5:
				{
				setState(338);
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
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
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
			setState(341);
			match(LEFTPAREN);
			setState(342);
			match(RIGHTPAREN);
			setState(343);
			match(ARROW);
			setState(344);
			match(ID);
			setState(345);
			match(LEFTPAREN);
			setState(348);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(346);
				match(ID);
				}
				break;
			case NULL:
			case BOOL:
			case STRING:
			case INT:
			case DOUBLE:
				{
				setState(347);
				value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(350);
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
			setState(352);
			match(ID);
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(353);
				match(DOT);
				setState(354);
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
			setState(357);
			match(LESSTHAN);
			setState(358);
			match(ID);
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(359);
				props();
				}
				}
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(365);
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
			setState(367);
			name_prop();
			setState(368);
			match(EQUAL);
			setState(369);
			match(LEFTCURLY);
			setState(370);
			prop_value();
			setState(371);
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
			setState(373);
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
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
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
			setState(377);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
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
				setState(376);
				value();
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
			setState(379);
			match(LEFTCURLY);
			setState(382);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LESSTHAN:
				{
				setState(380);
				component();
				}
				break;
			case ID:
				{
				setState(381);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(389); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(384);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 60473139527680L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(387);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LESSTHAN:
					{
					setState(385);
					component();
					}
					break;
				case ID:
					{
					setState(386);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(391); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 60473139527680L) != 0) );
			setState(393);
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
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ReactParser.STRING, 0); }
		public TerminalNode BOOL() { return getToken(ReactParser.BOOL, 0); }
		public TerminalNode DOUBLE() { return getToken(ReactParser.DOUBLE, 0); }
		public TerminalNode INT() { return getToken(ReactParser.INT, 0); }
		public TerminalNode NULL() { return getToken(ReactParser.NULL, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
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
		public ArrayObjectsContext arrayObjects() {
			return getRuleContext(ArrayObjectsContext.class,0);
		}
		public ArrayValuesContext arrayValues() {
			return getRuleContext(ArrayValuesContext.class,0);
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
		try {
			setState(399);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(397);
				arrayObjects();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(398);
				arrayValues();
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
	public static class ArrayObjectsContext extends ParserRuleContext {
		public TerminalNode LEFTBRACKET() { return getToken(ReactParser.LEFTBRACKET, 0); }
		public TerminalNode RIGHTBRACKET() { return getToken(ReactParser.RIGHTBRACKET, 0); }
		public List<ObjectContext> object() {
			return getRuleContexts(ObjectContext.class);
		}
		public ObjectContext object(int i) {
			return getRuleContext(ObjectContext.class,i);
		}
		public ArrayObjectsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayObjects; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterArrayObjects(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitArrayObjects(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitArrayObjects(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayObjectsContext arrayObjects() throws RecognitionException {
		ArrayObjectsContext _localctx = new ArrayObjectsContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_arrayObjects);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(LEFTBRACKET);
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFTCURLY) {
				{
				{
				setState(402);
				object();
				}
				}
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(408);
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
	public static class ArrayValuesContext extends ParserRuleContext {
		public TerminalNode LEFTBRACKET() { return getToken(ReactParser.LEFTBRACKET, 0); }
		public TerminalNode RIGHTBRACKET() { return getToken(ReactParser.RIGHTBRACKET, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ReactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactParser.COMMA, i);
		}
		public ArrayValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterArrayValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitArrayValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitArrayValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayValuesContext arrayValues() throws RecognitionException {
		ArrayValuesContext _localctx = new ArrayValuesContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_arrayValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			match(LEFTBRACKET);
			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 65302194597920768L) != 0)) {
				{
				{
				setState(411);
				value();
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(412);
					match(COMMA);
					}
				}

				}
				}
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(420);
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
	public static class ObjectContext extends ParserRuleContext {
		public TerminalNode LEFTCURLY() { return getToken(ReactParser.LEFTCURLY, 0); }
		public TerminalNode RIGHTCURLY() { return getToken(ReactParser.RIGHTCURLY, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(ReactParser.COMMA, 0); }
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(LEFTCURLY);
			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(423);
				element();
				}
				}
				setState(428);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(429);
			match(RIGHTCURLY);
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(430);
				match(COMMA);
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
	public static class ElementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ReactParser.ID, 0); }
		public TerminalNode COLON() { return getToken(ReactParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
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
		enterRule(_localctx, 66, RULE_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(ID);
			setState(434);
			match(COLON);
			setState(435);
			value();
			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(436);
				match(COMMA);
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
		enterRule(_localctx, 68, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			match(CONSOLE);
			setState(440);
			match(DOT);
			setState(441);
			match(LOG);
			setState(442);
			match(LEFTPAREN);
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 31525197391593472L) != 0)) {
				{
				{
				setState(443);
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
				setState(448);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(449);
			match(RIGHTPAREN);
			setState(450);
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
		"\u0004\u00017\u01c5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0001"+
		"\u0000\u0005\u0000H\b\u0000\n\u0000\f\u0000K\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0005\u0000O\b\u0000\n\u0000\f\u0000R\t\u0000\u0001\u0000\u0003"+
		"\u0000U\b\u0000\u0001\u0001\u0001\u0001\u0003\u0001Y\b\u0001\u0001\u0001"+
		"\u0003\u0001\\\b\u0001\u0001\u0001\u0003\u0001_\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001c\b\u0001\u0005\u0001e\b\u0001\n\u0001\f\u0001h\t\u0001"+
		"\u0001\u0001\u0003\u0001k\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003}\b\u0003\u0001\u0003\u0003\u0003\u0080\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u0084\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u008a\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u0093\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0098\b"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0003\u0007\u009e"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00a3\b\u0007"+
		"\n\u0007\f\u0007\u00a6\t\u0007\u0001\u0007\u0003\u0007\u00a9\b\u0007\u0001"+
		"\b\u0005\b\u00ac\b\b\n\b\f\b\u00af\t\b\u0001\b\u0003\b\u00b2\b\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00bb\b\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u00c1\b\n\u0005\n\u00c3\b\n\n\n\f\n"+
		"\u00c6\t\n\u0001\n\u0001\n\u0003\n\u00ca\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000b\u00cf\b\u000b\n\u000b\f\u000b\u00d2\t\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00db"+
		"\b\f\u0005\f\u00dd\b\f\n\f\f\f\u00e0\t\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00f8\b\u000e\u0005\u000e\u00fa"+
		"\b\u000e\n\u000e\f\u000e\u00fd\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0005\u000f\u010e\b\u000f\n\u000f\f\u000f\u0111\t\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0005"+
		"\u0010\u011a\b\u0010\n\u0010\f\u0010\u011d\t\u0010\u0001\u0010\u0001\u0010"+
		"\u0005\u0010\u0121\b\u0010\n\u0010\f\u0010\u0124\t\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u0133\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u013f\b\u0013\u0001\u0013\u0004\u0013\u0142\b\u0013\u000b\u0013"+
		"\f\u0013\u0143\u0001\u0013\u0001\u0013\u0003\u0013\u0148\b\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0154\b\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u015d\b\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u0164\b\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0005\u0017\u0169\b\u0017\n\u0017\f\u0017\u016c\t\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0003\u001a"+
		"\u017a\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u017f\b"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0184\b\u001b\u0004"+
		"\u001b\u0186\b\u001b\u000b\u001b\f\u001b\u0187\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0003\u001d\u0190\b\u001d"+
		"\u0001\u001e\u0001\u001e\u0005\u001e\u0194\b\u001e\n\u001e\f\u001e\u0197"+
		"\t\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0003"+
		"\u001f\u019e\b\u001f\u0005\u001f\u01a0\b\u001f\n\u001f\f\u001f\u01a3\t"+
		"\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0005 \u01a9\b \n \f \u01ac"+
		"\t \u0001 \u0001 \u0003 \u01b0\b \u0001!\u0001!\u0001!\u0001!\u0003!\u01b6"+
		"\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0005\"\u01bd\b\"\n\"\f\""+
		"\u01c0\t\"\u0001\"\u0001\"\u0001\"\u0001\"\u0000\u0000#\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@BD\u0000\u0005\u0002\u0000\u0011\u001244\u0001\u0000\u0005"+
		"\u0007\u0002\u0000(*,-\u0003\u0000\u0014\u00143357\u0001\u000046\u01e6"+
		"\u0000I\u0001\u0000\u0000\u0000\u0002V\u0001\u0000\u0000\u0000\u0004p"+
		"\u0001\u0000\u0000\u0000\u0006u\u0001\u0000\u0000\u0000\b\u0083\u0001"+
		"\u0000\u0000\u0000\n\u0085\u0001\u0000\u0000\u0000\f\u0090\u0001\u0000"+
		"\u0000\u0000\u000e\u009d\u0001\u0000\u0000\u0000\u0010\u00ad\u0001\u0000"+
		"\u0000\u0000\u0012\u00ba\u0001\u0000\u0000\u0000\u0014\u00bc\u0001\u0000"+
		"\u0000\u0000\u0016\u00cb\u0001\u0000\u0000\u0000\u0018\u00d6\u0001\u0000"+
		"\u0000\u0000\u001a\u00e3\u0001\u0000\u0000\u0000\u001c\u00f0\u0001\u0000"+
		"\u0000\u0000\u001e\u0102\u0001\u0000\u0000\u0000 \u0116\u0001\u0000\u0000"+
		"\u0000\"\u0132\u0001\u0000\u0000\u0000$\u0134\u0001\u0000\u0000\u0000"+
		"&\u013a\u0001\u0000\u0000\u0000(\u0153\u0001\u0000\u0000\u0000*\u0155"+
		"\u0001\u0000\u0000\u0000,\u0160\u0001\u0000\u0000\u0000.\u0165\u0001\u0000"+
		"\u0000\u00000\u016f\u0001\u0000\u0000\u00002\u0175\u0001\u0000\u0000\u0000"+
		"4\u0179\u0001\u0000\u0000\u00006\u017b\u0001\u0000\u0000\u00008\u018b"+
		"\u0001\u0000\u0000\u0000:\u018f\u0001\u0000\u0000\u0000<\u0191\u0001\u0000"+
		"\u0000\u0000>\u019a\u0001\u0000\u0000\u0000@\u01a6\u0001\u0000\u0000\u0000"+
		"B\u01b1\u0001\u0000\u0000\u0000D\u01b7\u0001\u0000\u0000\u0000FH\u0003"+
		"\u0002\u0001\u0000GF\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000\u0000"+
		"IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JP\u0001\u0000\u0000"+
		"\u0000KI\u0001\u0000\u0000\u0000LO\u0003\b\u0004\u0000MO\u0003\u0006\u0003"+
		"\u0000NL\u0001\u0000\u0000\u0000NM\u0001\u0000\u0000\u0000OR\u0001\u0000"+
		"\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QT\u0001"+
		"\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000SU\u0003\u0004\u0002\u0000"+
		"TS\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000U\u0001\u0001\u0000"+
		"\u0000\u0000VX\u0005\r\u0000\u0000WY\u00054\u0000\u0000XW\u0001\u0000"+
		"\u0000\u0000XY\u0001\u0000\u0000\u0000Y[\u0001\u0000\u0000\u0000Z\\\u0005"+
		"\u001c\u0000\u0000[Z\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000"+
		"\\^\u0001\u0000\u0000\u0000]_\u0005#\u0000\u0000^]\u0001\u0000\u0000\u0000"+
		"^_\u0001\u0000\u0000\u0000_f\u0001\u0000\u0000\u0000`b\u0007\u0000\u0000"+
		"\u0000ac\u0005\u001c\u0000\u0000ba\u0001\u0000\u0000\u0000bc\u0001\u0000"+
		"\u0000\u0000ce\u0001\u0000\u0000\u0000d`\u0001\u0000\u0000\u0000eh\u0001"+
		"\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000"+
		"gj\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000ik\u0005$\u0000\u0000"+
		"ji\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000"+
		"\u0000lm\u0005\u0010\u0000\u0000mn\u00055\u0000\u0000no\u0005\u001d\u0000"+
		"\u0000o\u0003\u0001\u0000\u0000\u0000pq\u0005\u000e\u0000\u0000qr\u0005"+
		"\u000f\u0000\u0000rs\u00054\u0000\u0000st\u0005\u001d\u0000\u0000t\u0005"+
		"\u0001\u0000\u0000\u0000uv\u0007\u0001\u0000\u0000vw\u00054\u0000\u0000"+
		"w|\u0005\u0016\u0000\u0000x}\u00038\u001c\u0000y}\u0003\b\u0004\u0000"+
		"z}\u0003:\u001d\u0000{}\u00054\u0000\u0000|x\u0001\u0000\u0000\u0000|"+
		"y\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000|{\u0001\u0000\u0000"+
		"\u0000}\u007f\u0001\u0000\u0000\u0000~\u0080\u0005\u001d\u0000\u0000\u007f"+
		"~\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0007"+
		"\u0001\u0000\u0000\u0000\u0081\u0084\u0003\n\u0005\u0000\u0082\u0084\u0003"+
		"\f\u0006\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0082\u0001\u0000"+
		"\u0000\u0000\u0084\t\u0001\u0000\u0000\u0000\u0085\u0086\u0005\u0002\u0000"+
		"\u0000\u0086\u0087\u00054\u0000\u0000\u0087\u0089\u0005\u001f\u0000\u0000"+
		"\u0088\u008a\u0003\u000e\u0007\u0000\u0089\u0088\u0001\u0000\u0000\u0000"+
		"\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000"+
		"\u008b\u008c\u0005 \u0000\u0000\u008c\u008d\u0005#\u0000\u0000\u008d\u008e"+
		"\u0003\u0010\b\u0000\u008e\u008f\u0005$\u0000\u0000\u008f\u000b\u0001"+
		"\u0000\u0000\u0000\u0090\u0092\u0005\u001f\u0000\u0000\u0091\u0093\u0003"+
		"\u000e\u0007\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0092\u0093\u0001"+
		"\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0095\u0005"+
		" \u0000\u0000\u0095\u0097\u0005\u0015\u0000\u0000\u0096\u0098\u0005#\u0000"+
		"\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000"+
		"\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009a\u0003\u0010\b\u0000"+
		"\u009a\u009b\u0005$\u0000\u0000\u009b\r\u0001\u0000\u0000\u0000\u009c"+
		"\u009e\u0005#\u0000\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009d\u009e"+
		"\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00a4"+
		"\u00054\u0000\u0000\u00a0\u00a1\u0005\u001c\u0000\u0000\u00a1\u00a3\u0005"+
		"4\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a3\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a8\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a9\u0005$\u0000\u0000\u00a8\u00a7\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u000f\u0001\u0000\u0000"+
		"\u0000\u00aa\u00ac\u0003\u0012\t\u0000\u00ab\u00aa\u0001\u0000\u0000\u0000"+
		"\u00ac\u00af\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000"+
		"\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00b1\u0001\u0000\u0000\u0000"+
		"\u00af\u00ad\u0001\u0000\u0000\u0000\u00b0\u00b2\u0003\u0016\u000b\u0000"+
		"\u00b1\u00b0\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b2\u0011\u0001\u0000\u0000\u0000\u00b3\u00bb\u0003\u001c\u000e\u0000"+
		"\u00b4\u00bb\u0003\u001a\r\u0000\u00b5\u00bb\u0003\u0018\f\u0000\u00b6"+
		"\u00bb\u0003\u0006\u0003\u0000\u00b7\u00bb\u0003D\"\u0000\u00b8\u00bb"+
		"\u0003\u0014\n\u0000\u00b9\u00bb\u0003 \u0010\u0000\u00ba\u00b3\u0001"+
		"\u0000\u0000\u0000\u00ba\u00b4\u0001\u0000\u0000\u0000\u00ba\u00b5\u0001"+
		"\u0000\u0000\u0000\u00ba\u00b6\u0001\u0000\u0000\u0000\u00ba\u00b7\u0001"+
		"\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba\u00b9\u0001"+
		"\u0000\u0000\u0000\u00bb\u0013\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005"+
		"4\u0000\u0000\u00bd\u00c4\u0005\u001f\u0000\u0000\u00be\u00c0\u00054\u0000"+
		"\u0000\u00bf\u00c1\u0005\u001c\u0000\u0000\u00c0\u00bf\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c2\u00be\u0001\u0000\u0000\u0000\u00c3\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c7\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c9\u0005 \u0000\u0000\u00c8\u00ca\u0005\u001d\u0000\u0000"+
		"\u00c9\u00c8\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000"+
		"\u00ca\u0015\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005\f\u0000\u0000\u00cc"+
		"\u00d0\u0005\u001f\u0000\u0000\u00cd\u00cf\u0003 \u0010\u0000\u00ce\u00cd"+
		"\u0001\u0000\u0000\u0000\u00cf\u00d2\u0001\u0000\u0000\u0000\u00d0\u00ce"+
		"\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d3\u00d4"+
		"\u0005 \u0000\u0000\u00d4\u00d5\u0005\u001d\u0000\u0000\u00d5\u0017\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d7\u0005\u0013\u0000\u0000\u00d7\u00de\u0005"+
		"\u001f\u0000\u0000\u00d8\u00da\u00055\u0000\u0000\u00d9\u00db\u0005\u001c"+
		"\u0000\u0000\u00da\u00d9\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000"+
		"\u0000\u0000\u00db\u00dd\u0001\u0000\u0000\u0000\u00dc\u00d8\u0001\u0000"+
		"\u0000\u0000\u00dd\u00e0\u0001\u0000\u0000\u0000\u00de\u00dc\u0001\u0000"+
		"\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e1\u0001\u0000"+
		"\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005 \u0000"+
		"\u0000\u00e2\u0019\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005\u0007\u0000"+
		"\u0000\u00e4\u00e5\u0005!\u0000\u0000\u00e5\u00e6\u00054\u0000\u0000\u00e6"+
		"\u00e7\u0005\u001c\u0000\u0000\u00e7\u00e8\u00054\u0000\u0000\u00e8\u00e9"+
		"\u0005\"\u0000\u0000\u00e9\u00ea\u0005\u0016\u0000\u0000\u00ea\u00eb\u0005"+
		"\u0011\u0000\u0000\u00eb\u00ec\u0005\u001f\u0000\u0000\u00ec\u00ed\u0003"+
		"8\u001c\u0000\u00ed\u00ee\u0005 \u0000\u0000\u00ee\u00ef\u0005\u001d\u0000"+
		"\u0000\u00ef\u001b\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005\u0012\u0000"+
		"\u0000\u00f1\u00f2\u0005\u001f\u0000\u0000\u00f2\u00f3\u0003\f\u0006\u0000"+
		"\u00f3\u00f4\u0005\u001c\u0000\u0000\u00f4\u00fb\u0005!\u0000\u0000\u00f5"+
		"\u00f7\u00054\u0000\u0000\u00f6\u00f8\u0005\u001c\u0000\u0000\u00f7\u00f6"+
		"\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u00fa"+
		"\u0001\u0000\u0000\u0000\u00f9\u00f5\u0001\u0000\u0000\u0000\u00fa\u00fd"+
		"\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fc"+
		"\u0001\u0000\u0000\u0000\u00fc\u00fe\u0001\u0000\u0000\u0000\u00fd\u00fb"+
		"\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005\"\u0000\u0000\u00ff\u0100\u0005"+
		" \u0000\u0000\u0100\u0101\u0005\u001d\u0000\u0000\u0101\u001d\u0001\u0000"+
		"\u0000\u0000\u0102\u0103\u0005#\u0000\u0000\u0103\u0104\u00054\u0000\u0000"+
		"\u0104\u0105\u00052\u0000\u0000\u0105\u0106\u00054\u0000\u0000\u0106\u0107"+
		"\u0005\u001f\u0000\u0000\u0107\u0108\u0005\u001f\u0000\u0000\u0108\u0109"+
		"\u00054\u0000\u0000\u0109\u010a\u0005 \u0000\u0000\u010a\u010b\u0005\u0015"+
		"\u0000\u0000\u010b\u010f\u0005\u001f\u0000\u0000\u010c\u010e\u0003 \u0010"+
		"\u0000\u010d\u010c\u0001\u0000\u0000\u0000\u010e\u0111\u0001\u0000\u0000"+
		"\u0000\u010f\u010d\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000"+
		"\u0000\u0110\u0112\u0001\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000"+
		"\u0000\u0112\u0113\u0005 \u0000\u0000\u0113\u0114\u0005 \u0000\u0000\u0114"+
		"\u0115\u0005$\u0000\u0000\u0115\u001f\u0001\u0000\u0000\u0000\u0116\u0117"+
		"\u0005%\u0000\u0000\u0117\u011b\u00054\u0000\u0000\u0118\u011a\u0003&"+
		"\u0013\u0000\u0119\u0118\u0001\u0000\u0000\u0000\u011a\u011d\u0001\u0000"+
		"\u0000\u0000\u011b\u0119\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000"+
		"\u0000\u0000\u011c\u011e\u0001\u0000\u0000\u0000\u011d\u011b\u0001\u0000"+
		"\u0000\u0000\u011e\u0122\u0005&\u0000\u0000\u011f\u0121\u0003\"\u0011"+
		"\u0000\u0120\u011f\u0001\u0000\u0000\u0000\u0121\u0124\u0001\u0000\u0000"+
		"\u0000\u0122\u0120\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000\u0000"+
		"\u0000\u0123\u0125\u0001\u0000\u0000\u0000\u0124\u0122\u0001\u0000\u0000"+
		"\u0000\u0125\u0126\u0005%\u0000\u0000\u0126\u0127\u0005\u001a\u0000\u0000"+
		"\u0127\u0128\u00054\u0000\u0000\u0128\u0129\u0005&\u0000\u0000\u0129!"+
		"\u0001\u0000\u0000\u0000\u012a\u0133\u0003 \u0010\u0000\u012b\u0133\u0003"+
		"6\u001b\u0000\u012c\u0133\u0003\u001e\u000f\u0000\u012d\u0133\u0003$\u0012"+
		"\u0000\u012e\u0133\u0003.\u0017\u0000\u012f\u0133\u00054\u0000\u0000\u0130"+
		"\u0133\u0005\u001e\u0000\u0000\u0131\u0133\u00052\u0000\u0000\u0132\u012a"+
		"\u0001\u0000\u0000\u0000\u0132\u012b\u0001\u0000\u0000\u0000\u0132\u012c"+
		"\u0001\u0000\u0000\u0000\u0132\u012d\u0001\u0000\u0000\u0000\u0132\u012e"+
		"\u0001\u0000\u0000\u0000\u0132\u012f\u0001\u0000\u0000\u0000\u0132\u0130"+
		"\u0001\u0000\u0000\u0000\u0132\u0131\u0001\u0000\u0000\u0000\u0133#\u0001"+
		"\u0000\u0000\u0000\u0134\u0135\u0005#\u0000\u0000\u0135\u0136\u00054\u0000"+
		"\u0000\u0136\u0137\u00052\u0000\u0000\u0137\u0138\u00054\u0000\u0000\u0138"+
		"\u0139\u0005$\u0000\u0000\u0139%\u0001\u0000\u0000\u0000\u013a\u013b\u0005"+
		"4\u0000\u0000\u013b\u013c\u0005\u0016\u0000\u0000\u013c\u013e\u0005#\u0000"+
		"\u0000\u013d\u013f\u0005#\u0000\u0000\u013e\u013d\u0001\u0000\u0000\u0000"+
		"\u013e\u013f\u0001\u0000\u0000\u0000\u013f\u0141\u0001\u0000\u0000\u0000"+
		"\u0140\u0142\u0003(\u0014\u0000\u0141\u0140\u0001\u0000\u0000\u0000\u0142"+
		"\u0143\u0001\u0000\u0000\u0000\u0143\u0141\u0001\u0000\u0000\u0000\u0143"+
		"\u0144\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000\u0145"+
		"\u0147\u0005$\u0000\u0000\u0146\u0148\u0005$\u0000\u0000\u0147\u0146\u0001"+
		"\u0000\u0000\u0000\u0147\u0148\u0001\u0000\u0000\u0000\u0148\'\u0001\u0000"+
		"\u0000\u0000\u0149\u0154\u00055\u0000\u0000\u014a\u014b\u0005\u001c\u0000"+
		"\u0000\u014b\u014c\u00054\u0000\u0000\u014c\u014d\u0005\u001e\u0000\u0000"+
		"\u014d\u0154\u00038\u001c\u0000\u014e\u014f\u00054\u0000\u0000\u014f\u0150"+
		"\u0005\u001e\u0000\u0000\u0150\u0154\u00038\u001c\u0000\u0151\u0154\u0003"+
		"*\u0015\u0000\u0152\u0154\u0003*\u0015\u0000\u0153\u0149\u0001\u0000\u0000"+
		"\u0000\u0153\u014a\u0001\u0000\u0000\u0000\u0153\u014e\u0001\u0000\u0000"+
		"\u0000\u0153\u0151\u0001\u0000\u0000\u0000\u0153\u0152\u0001\u0000\u0000"+
		"\u0000\u0154)\u0001\u0000\u0000\u0000\u0155\u0156\u0005\u001f\u0000\u0000"+
		"\u0156\u0157\u0005 \u0000\u0000\u0157\u0158\u0005\u0015\u0000\u0000\u0158"+
		"\u0159\u00054\u0000\u0000\u0159\u015c\u0005\u001f\u0000\u0000\u015a\u015d"+
		"\u00054\u0000\u0000\u015b\u015d\u00038\u001c\u0000\u015c\u015a\u0001\u0000"+
		"\u0000\u0000\u015c\u015b\u0001\u0000\u0000\u0000\u015d\u015e\u0001\u0000"+
		"\u0000\u0000\u015e\u015f\u0005 \u0000\u0000\u015f+\u0001\u0000\u0000\u0000"+
		"\u0160\u0163\u00054\u0000\u0000\u0161\u0162\u00052\u0000\u0000\u0162\u0164"+
		"\u00054\u0000\u0000\u0163\u0161\u0001\u0000\u0000\u0000\u0163\u0164\u0001"+
		"\u0000\u0000\u0000\u0164-\u0001\u0000\u0000\u0000\u0165\u0166\u0005%\u0000"+
		"\u0000\u0166\u016a\u00054\u0000\u0000\u0167\u0169\u00030\u0018\u0000\u0168"+
		"\u0167\u0001\u0000\u0000\u0000\u0169\u016c\u0001\u0000\u0000\u0000\u016a"+
		"\u0168\u0001\u0000\u0000\u0000\u016a\u016b\u0001\u0000\u0000\u0000\u016b"+
		"\u016d\u0001\u0000\u0000\u0000\u016c\u016a\u0001\u0000\u0000\u0000\u016d"+
		"\u016e\u0005\'\u0000\u0000\u016e/\u0001\u0000\u0000\u0000\u016f\u0170"+
		"\u00032\u0019\u0000\u0170\u0171\u0005\u0016\u0000\u0000\u0171\u0172\u0005"+
		"#\u0000\u0000\u0172\u0173\u00034\u001a\u0000\u0173\u0174\u0005$\u0000"+
		"\u0000\u01741\u0001\u0000\u0000\u0000\u0175\u0176\u00054\u0000\u0000\u0176"+
		"3\u0001\u0000\u0000\u0000\u0177\u017a\u00054\u0000\u0000\u0178\u017a\u0003"+
		"8\u001c\u0000\u0179\u0177\u0001\u0000\u0000\u0000\u0179\u0178\u0001\u0000"+
		"\u0000\u0000\u017a5\u0001\u0000\u0000\u0000\u017b\u017e\u0005#\u0000\u0000"+
		"\u017c\u017f\u0003.\u0017\u0000\u017d\u017f\u00054\u0000\u0000\u017e\u017c"+
		"\u0001\u0000\u0000\u0000\u017e\u017d\u0001\u0000\u0000\u0000\u017f\u0185"+
		"\u0001\u0000\u0000\u0000\u0180\u0183\u0007\u0002\u0000\u0000\u0181\u0184"+
		"\u0003.\u0017\u0000\u0182\u0184\u00054\u0000\u0000\u0183\u0181\u0001\u0000"+
		"\u0000\u0000\u0183\u0182\u0001\u0000\u0000\u0000\u0184\u0186\u0001\u0000"+
		"\u0000\u0000\u0185\u0180\u0001\u0000\u0000\u0000\u0186\u0187\u0001\u0000"+
		"\u0000\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0187\u0188\u0001\u0000"+
		"\u0000\u0000\u0188\u0189\u0001\u0000\u0000\u0000\u0189\u018a\u0005$\u0000"+
		"\u0000\u018a7\u0001\u0000\u0000\u0000\u018b\u018c\u0007\u0003\u0000\u0000"+
		"\u018c9\u0001\u0000\u0000\u0000\u018d\u0190\u0003<\u001e\u0000\u018e\u0190"+
		"\u0003>\u001f\u0000\u018f\u018d\u0001\u0000\u0000\u0000\u018f\u018e\u0001"+
		"\u0000\u0000\u0000\u0190;\u0001\u0000\u0000\u0000\u0191\u0195\u0005!\u0000"+
		"\u0000\u0192\u0194\u0003@ \u0000\u0193\u0192\u0001\u0000\u0000\u0000\u0194"+
		"\u0197\u0001\u0000\u0000\u0000\u0195\u0193\u0001\u0000\u0000\u0000\u0195"+
		"\u0196\u0001\u0000\u0000\u0000\u0196\u0198\u0001\u0000\u0000\u0000\u0197"+
		"\u0195\u0001\u0000\u0000\u0000\u0198\u0199\u0005\"\u0000\u0000\u0199="+
		"\u0001\u0000\u0000\u0000\u019a\u01a1\u0005!\u0000\u0000\u019b\u019d\u0003"+
		"8\u001c\u0000\u019c\u019e\u0005\u001c\u0000\u0000\u019d\u019c\u0001\u0000"+
		"\u0000\u0000\u019d\u019e\u0001\u0000\u0000\u0000\u019e\u01a0\u0001\u0000"+
		"\u0000\u0000\u019f\u019b\u0001\u0000\u0000\u0000\u01a0\u01a3\u0001\u0000"+
		"\u0000\u0000\u01a1\u019f\u0001\u0000\u0000\u0000\u01a1\u01a2\u0001\u0000"+
		"\u0000\u0000\u01a2\u01a4\u0001\u0000\u0000\u0000\u01a3\u01a1\u0001\u0000"+
		"\u0000\u0000\u01a4\u01a5\u0005\"\u0000\u0000\u01a5?\u0001\u0000\u0000"+
		"\u0000\u01a6\u01aa\u0005#\u0000\u0000\u01a7\u01a9\u0003B!\u0000\u01a8"+
		"\u01a7\u0001\u0000\u0000\u0000\u01a9\u01ac\u0001\u0000\u0000\u0000\u01aa"+
		"\u01a8\u0001\u0000\u0000\u0000\u01aa\u01ab\u0001\u0000\u0000\u0000\u01ab"+
		"\u01ad\u0001\u0000\u0000\u0000\u01ac\u01aa\u0001\u0000\u0000\u0000\u01ad"+
		"\u01af\u0005$\u0000\u0000\u01ae\u01b0\u0005\u001c\u0000\u0000\u01af\u01ae"+
		"\u0001\u0000\u0000\u0000\u01af\u01b0\u0001\u0000\u0000\u0000\u01b0A\u0001"+
		"\u0000\u0000\u0000\u01b1\u01b2\u00054\u0000\u0000\u01b2\u01b3\u0005\u001e"+
		"\u0000\u0000\u01b3\u01b5\u00038\u001c\u0000\u01b4\u01b6\u0005\u001c\u0000"+
		"\u0000\u01b5\u01b4\u0001\u0000\u0000\u0000\u01b5\u01b6\u0001\u0000\u0000"+
		"\u0000\u01b6C\u0001\u0000\u0000\u0000\u01b7\u01b8\u0005\u0003\u0000\u0000"+
		"\u01b8\u01b9\u00052\u0000\u0000\u01b9\u01ba\u0005\u0004\u0000\u0000\u01ba"+
		"\u01be\u0005\u001f\u0000\u0000\u01bb\u01bd\u0007\u0004\u0000\u0000\u01bc"+
		"\u01bb\u0001\u0000\u0000\u0000\u01bd\u01c0\u0001\u0000\u0000\u0000\u01be"+
		"\u01bc\u0001\u0000\u0000\u0000\u01be\u01bf\u0001\u0000\u0000\u0000\u01bf"+
		"\u01c1\u0001\u0000\u0000\u0000\u01c0\u01be\u0001\u0000\u0000\u0000\u01c1"+
		"\u01c2\u0005 \u0000\u0000\u01c2\u01c3\u0005\u001d\u0000\u0000\u01c3E\u0001"+
		"\u0000\u0000\u00005INPTX[^bfj|\u007f\u0083\u0089\u0092\u0097\u009d\u00a4"+
		"\u00a8\u00ad\u00b1\u00ba\u00c0\u00c4\u00c9\u00d0\u00da\u00de\u00f7\u00fb"+
		"\u010f\u011b\u0122\u0132\u013e\u0143\u0147\u0153\u015c\u0163\u016a\u0179"+
		"\u017e\u0183\u0187\u018f\u0195\u019d\u01a1\u01aa\u01af\u01b5\u01be";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}