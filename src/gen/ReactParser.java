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
		public TerminalNode FROM() { return getToken(ReactParser.FROM, 0); }
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

			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(108);
				match(FROM);
				}
			}

			setState(111);
			match(STRING);
			setState(112);
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
			setState(114);
			match(EXPORT);
			setState(115);
			match(DEFAULT);
			setState(116);
			match(ID);
			setState(117);
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
			setState(119);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 224L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(120);
			match(ID);
			setState(121);
			match(EQUAL);
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL:
			case BOOL:
			case STRING:
			case INT:
			case DOUBLE:
				{
				setState(122);
				value();
				}
				break;
			case FUNCTION:
			case LEFTPAREN:
				{
				setState(123);
				functionDeclaration();
				}
				break;
			case LEFTBRACKET:
				{
				setState(124);
				array();
				}
				break;
			case ID:
				{
				setState(125);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(128);
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
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				regularFunction();
				}
				break;
			case LEFTPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
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
			setState(135);
			match(FUNCTION);
			setState(136);
			match(ID);
			setState(137);
			match(LEFTPAREN);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFTCURLY || _la==ID) {
				{
				setState(138);
				parameters();
				}
			}

			setState(141);
			match(RIGHTPAREN);
			setState(142);
			match(LEFTCURLY);
			setState(143);
			functionbody();
			setState(144);
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
			setState(146);
			match(LEFTPAREN);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFTCURLY || _la==ID) {
				{
				setState(147);
				parameters();
				}
			}

			setState(150);
			match(RIGHTPAREN);
			setState(151);
			match(ARROW);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFTCURLY) {
				{
				setState(152);
				match(LEFTCURLY);
				}
			}

			setState(155);
			functionbody();
			setState(156);
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
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFTCURLY) {
				{
				setState(158);
				match(LEFTCURLY);
				}
			}

			setState(161);
			match(ID);
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(162);
				match(COMMA);
				setState(163);
				match(ID);
				}
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RIGHTCURLY) {
				{
				setState(169);
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
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4503737067110632L) != 0)) {
				{
				{
				setState(172);
				funcStatement();
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(178);
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
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				useEffect();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				useState();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(183);
				useRef();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(184);
				variableDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(185);
				print();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(186);
				callFunc();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(187);
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
			setState(190);
			match(ID);
			setState(191);
			match(LEFTPAREN);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(192);
				match(ID);
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(193);
					match(COMMA);
					}
				}

				}
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(201);
			match(RIGHTPAREN);
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(202);
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
			setState(205);
			match(RETURN);
			setState(206);
			match(LEFTPAREN);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LESSTHAN) {
				{
				{
				setState(207);
				jsx_element();
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(213);
			match(RIGHTPAREN);
			setState(214);
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
			setState(216);
			match(USEREF);
			setState(217);
			match(LEFTPAREN);
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING) {
				{
				{
				setState(218);
				match(STRING);
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(219);
					match(COMMA);
					}
				}

				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(227);
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
			setState(229);
			match(CONST);
			setState(230);
			match(LEFTBRACKET);
			setState(231);
			match(ID);
			setState(232);
			match(COMMA);
			setState(233);
			match(ID);
			setState(234);
			match(RIGHTBRACKET);
			setState(235);
			match(EQUAL);
			setState(236);
			match(USESTATE);
			setState(237);
			match(LEFTPAREN);
			setState(238);
			value();
			setState(239);
			match(RIGHTPAREN);
			setState(240);
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
			setState(242);
			match(USEEFFECT);
			setState(243);
			match(LEFTPAREN);
			setState(244);
			callBackFunction();
			setState(245);
			match(COMMA);
			setState(246);
			match(LEFTBRACKET);
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(247);
				match(ID);
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(248);
					match(COMMA);
					}
				}

				}
				}
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(256);
			match(RIGHTBRACKET);
			setState(257);
			match(RIGHTPAREN);
			setState(258);
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
			setState(260);
			match(LEFTCURLY);
			setState(261);
			match(ID);
			setState(262);
			match(DOT);
			setState(263);
			match(ID);
			setState(264);
			match(LEFTPAREN);
			setState(265);
			match(LEFTPAREN);
			setState(266);
			match(ID);
			setState(267);
			match(RIGHTPAREN);
			setState(268);
			match(ARROW);
			setState(269);
			match(LEFTPAREN);
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LESSTHAN) {
				{
				{
				setState(270);
				jsx_element();
				}
				}
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(276);
			match(RIGHTPAREN);
			setState(277);
			match(RIGHTPAREN);
			setState(278);
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
			setState(280);
			match(LESSTHAN);
			setState(281);
			match(ID);
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(282);
				jsx_attribute();
				}
				}
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(288);
			match(GREATERTHAN);
			setState(292);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(289);
					content();
					}
					} 
				}
				setState(294);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			setState(295);
			match(LESSTHAN);
			setState(296);
			match(DIVISION);
			setState(297);
			match(ID);
			setState(298);
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
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				jsx_element();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				shortIf();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(302);
				map();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(303);
				useAttribute();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(304);
				component();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(305);
				match(ID);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(306);
				match(COLON);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(307);
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
			setState(310);
			match(LEFTCURLY);
			setState(311);
			match(ID);
			setState(312);
			match(DOT);
			setState(313);
			match(ID);
			setState(314);
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
		public List<AttributeDetailsContext> attributeDetails() {
			return getRuleContexts(AttributeDetailsContext.class);
		}
		public AttributeDetailsContext attributeDetails(int i) {
			return getRuleContext(AttributeDetailsContext.class,i);
		}
		public List<TerminalNode> RIGHTCURLY() { return getTokens(ReactParser.RIGHTCURLY); }
		public TerminalNode RIGHTCURLY(int i) {
			return getToken(ReactParser.RIGHTCURLY, i);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(ID);
			setState(317);
			match(EQUAL);
			{
			setState(319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(318);
				match(LEFTCURLY);
				}
				break;
			}
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFTCURLY) {
				{
				setState(321);
				match(LEFTCURLY);
				}
			}

			setState(325); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(324);
					attributeDetails();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(327); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(329);
				match(RIGHTCURLY);
				}
				break;
			}
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RIGHTCURLY) {
				{
				setState(332);
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
		public AttributeDetailsAttributeContext attributeDetailsAttribute() {
			return getRuleContext(AttributeDetailsAttributeContext.class,0);
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
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(335);
				match(STRING);
				}
				break;
			case 2:
				{
				setState(336);
				match(COMMA);
				setState(337);
				match(ID);
				setState(338);
				match(COLON);
				setState(339);
				value();
				}
				break;
			case 3:
				{
				setState(340);
				match(ID);
				setState(341);
				match(COLON);
				setState(342);
				value();
				}
				break;
			case 4:
				{
				setState(343);
				attributeDetailsFunction();
				}
				break;
			case 5:
				{
				setState(344);
				attributeDetailsAttribute();
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
		public TerminalNode SEMI() { return getToken(ReactParser.SEMI, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(LEFTPAREN);
			setState(348);
			match(RIGHTPAREN);
			setState(349);
			match(ARROW);
			setState(350);
			match(ID);
			setState(351);
			match(LEFTPAREN);
			setState(354);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(352);
				match(ID);
				}
				break;
			case NULL:
			case BOOL:
			case STRING:
			case INT:
			case DOUBLE:
				{
				setState(353);
				value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(356);
			match(RIGHTPAREN);
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(357);
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
			setState(360);
			match(ID);
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(361);
				match(DOT);
				setState(362);
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
			setState(365);
			match(LESSTHAN);
			setState(366);
			match(ID);
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(367);
				props();
				}
				}
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(373);
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
			setState(375);
			name_prop();
			setState(376);
			match(EQUAL);
			setState(377);
			match(LEFTCURLY);
			setState(378);
			prop_value();
			setState(379);
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
			setState(381);
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
			setState(385);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(383);
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
				setState(384);
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
			setState(387);
			match(LEFTCURLY);
			setState(390);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LESSTHAN:
				{
				setState(388);
				component();
				}
				break;
			case ID:
				{
				setState(389);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(397); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(392);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 60473139527680L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(395);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LESSTHAN:
					{
					setState(393);
					component();
					}
					break;
				case ID:
					{
					setState(394);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(399); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 60473139527680L) != 0) );
			setState(401);
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
			setState(403);
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
			setState(407);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(405);
				arrayObjects();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(406);
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
			setState(409);
			match(LEFTBRACKET);
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFTCURLY) {
				{
				{
				setState(410);
				object();
				}
				}
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(416);
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
			setState(418);
			match(LEFTBRACKET);
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 65302194597920768L) != 0)) {
				{
				{
				setState(419);
				value();
				setState(421);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(420);
					match(COMMA);
					}
				}

				}
				}
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(428);
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
		public List<TerminalNode> COMMA() { return getTokens(ReactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactParser.COMMA, i);
		}
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
			setState(430);
			match(LEFTCURLY);
			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(431);
				element();
				setState(433);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(432);
					match(COMMA);
					}
				}

				}
				}
				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(440);
			match(RIGHTCURLY);
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(441);
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
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(ID);
			setState(445);
			match(COLON);
			setState(448);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL:
			case BOOL:
			case STRING:
			case INT:
			case DOUBLE:
				{
				setState(446);
				value();
				}
				break;
			case LEFTBRACKET:
				{
				setState(447);
				array();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
			setState(450);
			match(CONSOLE);
			setState(451);
			match(DOT);
			setState(452);
			match(LOG);
			setState(453);
			match(LEFTPAREN);
			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 31525197391593472L) != 0)) {
				{
				{
				setState(454);
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
				setState(459);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(460);
			match(RIGHTPAREN);
			setState(461);
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
		"\u0004\u00017\u01d0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"\u0001\u0001\u0003\u0001k\b\u0001\u0001\u0001\u0003\u0001n\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u007f\b\u0003\u0001\u0003\u0003"+
		"\u0003\u0082\b\u0003\u0001\u0004\u0001\u0004\u0003\u0004\u0086\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u008c\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u0095\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u009a\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0003\u0007\u00a0\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"\u00a5\b\u0007\n\u0007\f\u0007\u00a8\t\u0007\u0001\u0007\u0003\u0007\u00ab"+
		"\b\u0007\u0001\b\u0005\b\u00ae\b\b\n\b\f\b\u00b1\t\b\u0001\b\u0003\b\u00b4"+
		"\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00bd"+
		"\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00c3\b\n\u0005\n\u00c5\b"+
		"\n\n\n\f\n\u00c8\t\n\u0001\n\u0001\n\u0003\n\u00cc\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0005\u000b\u00d1\b\u000b\n\u000b\f\u000b\u00d4\t\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u00dd\b\f\u0005\f\u00df\b\f\n\f\f\f\u00e2\t\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00fa\b\u000e\u0005\u000e"+
		"\u00fc\b\u000e\n\u000e\f\u000e\u00ff\t\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0005\u000f\u0110\b\u000f\n\u000f\f\u000f\u0113\t\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0005\u0010\u011c\b\u0010\n\u0010\f\u0010\u011f\t\u0010\u0001\u0010\u0001"+
		"\u0010\u0005\u0010\u0123\b\u0010\n\u0010\f\u0010\u0126\t\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u0135\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u0140\b\u0013\u0001\u0013\u0003\u0013\u0143\b\u0013\u0001\u0013\u0004"+
		"\u0013\u0146\b\u0013\u000b\u0013\f\u0013\u0147\u0001\u0013\u0003\u0013"+
		"\u014b\b\u0013\u0001\u0013\u0003\u0013\u014e\b\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u015a\b\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u0163\b\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0167\b\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u016c\b\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0005\u0017\u0171\b\u0017\n\u0017\f\u0017\u0174"+
		"\t\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0003\u001a\u0182\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0003"+
		"\u001b\u0187\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u018c"+
		"\b\u001b\u0004\u001b\u018e\b\u001b\u000b\u001b\f\u001b\u018f\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0003\u001d"+
		"\u0198\b\u001d\u0001\u001e\u0001\u001e\u0005\u001e\u019c\b\u001e\n\u001e"+
		"\f\u001e\u019f\t\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0003\u001f\u01a6\b\u001f\u0005\u001f\u01a8\b\u001f\n\u001f"+
		"\f\u001f\u01ab\t\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0003"+
		" \u01b2\b \u0005 \u01b4\b \n \f \u01b7\t \u0001 \u0001 \u0003 \u01bb\b"+
		" \u0001!\u0001!\u0001!\u0001!\u0003!\u01c1\b!\u0001\"\u0001\"\u0001\""+
		"\u0001\"\u0001\"\u0005\"\u01c8\b\"\n\"\f\"\u01cb\t\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0000\u0000#\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BD\u0000\u0005\u0002"+
		"\u0000\u0011\u001244\u0001\u0000\u0005\u0007\u0002\u0000(*,-\u0003\u0000"+
		"\u0014\u00143357\u0001\u000046\u01f6\u0000I\u0001\u0000\u0000\u0000\u0002"+
		"V\u0001\u0000\u0000\u0000\u0004r\u0001\u0000\u0000\u0000\u0006w\u0001"+
		"\u0000\u0000\u0000\b\u0085\u0001\u0000\u0000\u0000\n\u0087\u0001\u0000"+
		"\u0000\u0000\f\u0092\u0001\u0000\u0000\u0000\u000e\u009f\u0001\u0000\u0000"+
		"\u0000\u0010\u00af\u0001\u0000\u0000\u0000\u0012\u00bc\u0001\u0000\u0000"+
		"\u0000\u0014\u00be\u0001\u0000\u0000\u0000\u0016\u00cd\u0001\u0000\u0000"+
		"\u0000\u0018\u00d8\u0001\u0000\u0000\u0000\u001a\u00e5\u0001\u0000\u0000"+
		"\u0000\u001c\u00f2\u0001\u0000\u0000\u0000\u001e\u0104\u0001\u0000\u0000"+
		"\u0000 \u0118\u0001\u0000\u0000\u0000\"\u0134\u0001\u0000\u0000\u0000"+
		"$\u0136\u0001\u0000\u0000\u0000&\u013c\u0001\u0000\u0000\u0000(\u0159"+
		"\u0001\u0000\u0000\u0000*\u015b\u0001\u0000\u0000\u0000,\u0168\u0001\u0000"+
		"\u0000\u0000.\u016d\u0001\u0000\u0000\u00000\u0177\u0001\u0000\u0000\u0000"+
		"2\u017d\u0001\u0000\u0000\u00004\u0181\u0001\u0000\u0000\u00006\u0183"+
		"\u0001\u0000\u0000\u00008\u0193\u0001\u0000\u0000\u0000:\u0197\u0001\u0000"+
		"\u0000\u0000<\u0199\u0001\u0000\u0000\u0000>\u01a2\u0001\u0000\u0000\u0000"+
		"@\u01ae\u0001\u0000\u0000\u0000B\u01bc\u0001\u0000\u0000\u0000D\u01c2"+
		"\u0001\u0000\u0000\u0000FH\u0003\u0002\u0001\u0000GF\u0001\u0000\u0000"+
		"\u0000HK\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000"+
		"\u0000\u0000JP\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000LO\u0003"+
		"\b\u0004\u0000MO\u0003\u0006\u0003\u0000NL\u0001\u0000\u0000\u0000NM\u0001"+
		"\u0000\u0000\u0000OR\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000"+
		"PQ\u0001\u0000\u0000\u0000QT\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000"+
		"\u0000SU\u0003\u0004\u0002\u0000TS\u0001\u0000\u0000\u0000TU\u0001\u0000"+
		"\u0000\u0000U\u0001\u0001\u0000\u0000\u0000VX\u0005\r\u0000\u0000WY\u0005"+
		"4\u0000\u0000XW\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Y[\u0001"+
		"\u0000\u0000\u0000Z\\\u0005\u001c\u0000\u0000[Z\u0001\u0000\u0000\u0000"+
		"[\\\u0001\u0000\u0000\u0000\\^\u0001\u0000\u0000\u0000]_\u0005#\u0000"+
		"\u0000^]\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_f\u0001\u0000"+
		"\u0000\u0000`b\u0007\u0000\u0000\u0000ac\u0005\u001c\u0000\u0000ba\u0001"+
		"\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000ce\u0001\u0000\u0000\u0000"+
		"d`\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000"+
		"\u0000fg\u0001\u0000\u0000\u0000gj\u0001\u0000\u0000\u0000hf\u0001\u0000"+
		"\u0000\u0000ik\u0005$\u0000\u0000ji\u0001\u0000\u0000\u0000jk\u0001\u0000"+
		"\u0000\u0000km\u0001\u0000\u0000\u0000ln\u0005\u0010\u0000\u0000ml\u0001"+
		"\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000"+
		"op\u00055\u0000\u0000pq\u0005\u001d\u0000\u0000q\u0003\u0001\u0000\u0000"+
		"\u0000rs\u0005\u000e\u0000\u0000st\u0005\u000f\u0000\u0000tu\u00054\u0000"+
		"\u0000uv\u0005\u001d\u0000\u0000v\u0005\u0001\u0000\u0000\u0000wx\u0007"+
		"\u0001\u0000\u0000xy\u00054\u0000\u0000y~\u0005\u0016\u0000\u0000z\u007f"+
		"\u00038\u001c\u0000{\u007f\u0003\b\u0004\u0000|\u007f\u0003:\u001d\u0000"+
		"}\u007f\u00054\u0000\u0000~z\u0001\u0000\u0000\u0000~{\u0001\u0000\u0000"+
		"\u0000~|\u0001\u0000\u0000\u0000~}\u0001\u0000\u0000\u0000\u007f\u0081"+
		"\u0001\u0000\u0000\u0000\u0080\u0082\u0005\u001d\u0000\u0000\u0081\u0080"+
		"\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0007"+
		"\u0001\u0000\u0000\u0000\u0083\u0086\u0003\n\u0005\u0000\u0084\u0086\u0003"+
		"\f\u0006\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0084\u0001\u0000"+
		"\u0000\u0000\u0086\t\u0001\u0000\u0000\u0000\u0087\u0088\u0005\u0002\u0000"+
		"\u0000\u0088\u0089\u00054\u0000\u0000\u0089\u008b\u0005\u001f\u0000\u0000"+
		"\u008a\u008c\u0003\u000e\u0007\u0000\u008b\u008a\u0001\u0000\u0000\u0000"+
		"\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000"+
		"\u008d\u008e\u0005 \u0000\u0000\u008e\u008f\u0005#\u0000\u0000\u008f\u0090"+
		"\u0003\u0010\b\u0000\u0090\u0091\u0005$\u0000\u0000\u0091\u000b\u0001"+
		"\u0000\u0000\u0000\u0092\u0094\u0005\u001f\u0000\u0000\u0093\u0095\u0003"+
		"\u000e\u0007\u0000\u0094\u0093\u0001\u0000\u0000\u0000\u0094\u0095\u0001"+
		"\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0097\u0005"+
		" \u0000\u0000\u0097\u0099\u0005\u0015\u0000\u0000\u0098\u009a\u0005#\u0000"+
		"\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009c\u0003\u0010\b\u0000"+
		"\u009c\u009d\u0005$\u0000\u0000\u009d\r\u0001\u0000\u0000\u0000\u009e"+
		"\u00a0\u0005#\u0000\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u009f\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a6"+
		"\u00054\u0000\u0000\u00a2\u00a3\u0005\u001c\u0000\u0000\u00a3\u00a5\u0005"+
		"4\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a5\u00a8\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000"+
		"\u0000\u0000\u00a7\u00aa\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a9\u00ab\u0005$\u0000\u0000\u00aa\u00a9\u0001\u0000\u0000"+
		"\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u000f\u0001\u0000\u0000"+
		"\u0000\u00ac\u00ae\u0003\u0012\t\u0000\u00ad\u00ac\u0001\u0000\u0000\u0000"+
		"\u00ae\u00b1\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000"+
		"\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b3\u0001\u0000\u0000\u0000"+
		"\u00b1\u00af\u0001\u0000\u0000\u0000\u00b2\u00b4\u0003\u0016\u000b\u0000"+
		"\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b4\u0011\u0001\u0000\u0000\u0000\u00b5\u00bd\u0003\u001c\u000e\u0000"+
		"\u00b6\u00bd\u0003\u001a\r\u0000\u00b7\u00bd\u0003\u0018\f\u0000\u00b8"+
		"\u00bd\u0003\u0006\u0003\u0000\u00b9\u00bd\u0003D\"\u0000\u00ba\u00bd"+
		"\u0003\u0014\n\u0000\u00bb\u00bd\u0003 \u0010\u0000\u00bc\u00b5\u0001"+
		"\u0000\u0000\u0000\u00bc\u00b6\u0001\u0000\u0000\u0000\u00bc\u00b7\u0001"+
		"\u0000\u0000\u0000\u00bc\u00b8\u0001\u0000\u0000\u0000\u00bc\u00b9\u0001"+
		"\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bb\u0001"+
		"\u0000\u0000\u0000\u00bd\u0013\u0001\u0000\u0000\u0000\u00be\u00bf\u0005"+
		"4\u0000\u0000\u00bf\u00c6\u0005\u001f\u0000\u0000\u00c0\u00c2\u00054\u0000"+
		"\u0000\u00c1\u00c3\u0005\u001c\u0000\u0000\u00c2\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c0\u0001\u0000\u0000\u0000\u00c5\u00c8\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c9\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c9\u00cb\u0005 \u0000\u0000\u00ca\u00cc\u0005\u001d\u0000\u0000"+
		"\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000"+
		"\u00cc\u0015\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005\f\u0000\u0000\u00ce"+
		"\u00d2\u0005\u001f\u0000\u0000\u00cf\u00d1\u0003 \u0010\u0000\u00d0\u00cf"+
		"\u0001\u0000\u0000\u0000\u00d1\u00d4\u0001\u0000\u0000\u0000\u00d2\u00d0"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d5\u00d6"+
		"\u0005 \u0000\u0000\u00d6\u00d7\u0005\u001d\u0000\u0000\u00d7\u0017\u0001"+
		"\u0000\u0000\u0000\u00d8\u00d9\u0005\u0013\u0000\u0000\u00d9\u00e0\u0005"+
		"\u001f\u0000\u0000\u00da\u00dc\u00055\u0000\u0000\u00db\u00dd\u0005\u001c"+
		"\u0000\u0000\u00dc\u00db\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000"+
		"\u0000\u0000\u00dd\u00df\u0001\u0000\u0000\u0000\u00de\u00da\u0001\u0000"+
		"\u0000\u0000\u00df\u00e2\u0001\u0000\u0000\u0000\u00e0\u00de\u0001\u0000"+
		"\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005 \u0000"+
		"\u0000\u00e4\u0019\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005\u0007\u0000"+
		"\u0000\u00e6\u00e7\u0005!\u0000\u0000\u00e7\u00e8\u00054\u0000\u0000\u00e8"+
		"\u00e9\u0005\u001c\u0000\u0000\u00e9\u00ea\u00054\u0000\u0000\u00ea\u00eb"+
		"\u0005\"\u0000\u0000\u00eb\u00ec\u0005\u0016\u0000\u0000\u00ec\u00ed\u0005"+
		"\u0011\u0000\u0000\u00ed\u00ee\u0005\u001f\u0000\u0000\u00ee\u00ef\u0003"+
		"8\u001c\u0000\u00ef\u00f0\u0005 \u0000\u0000\u00f0\u00f1\u0005\u001d\u0000"+
		"\u0000\u00f1\u001b\u0001\u0000\u0000\u0000\u00f2\u00f3\u0005\u0012\u0000"+
		"\u0000\u00f3\u00f4\u0005\u001f\u0000\u0000\u00f4\u00f5\u0003\f\u0006\u0000"+
		"\u00f5\u00f6\u0005\u001c\u0000\u0000\u00f6\u00fd\u0005!\u0000\u0000\u00f7"+
		"\u00f9\u00054\u0000\u0000\u00f8\u00fa\u0005\u001c\u0000\u0000\u00f9\u00f8"+
		"\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa\u00fc"+
		"\u0001\u0000\u0000\u0000\u00fb\u00f7\u0001\u0000\u0000\u0000\u00fc\u00ff"+
		"\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd\u00fe"+
		"\u0001\u0000\u0000\u0000\u00fe\u0100\u0001\u0000\u0000\u0000\u00ff\u00fd"+
		"\u0001\u0000\u0000\u0000\u0100\u0101\u0005\"\u0000\u0000\u0101\u0102\u0005"+
		" \u0000\u0000\u0102\u0103\u0005\u001d\u0000\u0000\u0103\u001d\u0001\u0000"+
		"\u0000\u0000\u0104\u0105\u0005#\u0000\u0000\u0105\u0106\u00054\u0000\u0000"+
		"\u0106\u0107\u00052\u0000\u0000\u0107\u0108\u00054\u0000\u0000\u0108\u0109"+
		"\u0005\u001f\u0000\u0000\u0109\u010a\u0005\u001f\u0000\u0000\u010a\u010b"+
		"\u00054\u0000\u0000\u010b\u010c\u0005 \u0000\u0000\u010c\u010d\u0005\u0015"+
		"\u0000\u0000\u010d\u0111\u0005\u001f\u0000\u0000\u010e\u0110\u0003 \u0010"+
		"\u0000\u010f\u010e\u0001\u0000\u0000\u0000\u0110\u0113\u0001\u0000\u0000"+
		"\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000\u0000"+
		"\u0000\u0112\u0114\u0001\u0000\u0000\u0000\u0113\u0111\u0001\u0000\u0000"+
		"\u0000\u0114\u0115\u0005 \u0000\u0000\u0115\u0116\u0005 \u0000\u0000\u0116"+
		"\u0117\u0005$\u0000\u0000\u0117\u001f\u0001\u0000\u0000\u0000\u0118\u0119"+
		"\u0005%\u0000\u0000\u0119\u011d\u00054\u0000\u0000\u011a\u011c\u0003&"+
		"\u0013\u0000\u011b\u011a\u0001\u0000\u0000\u0000\u011c\u011f\u0001\u0000"+
		"\u0000\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011d\u011e\u0001\u0000"+
		"\u0000\u0000\u011e\u0120\u0001\u0000\u0000\u0000\u011f\u011d\u0001\u0000"+
		"\u0000\u0000\u0120\u0124\u0005&\u0000\u0000\u0121\u0123\u0003\"\u0011"+
		"\u0000\u0122\u0121\u0001\u0000\u0000\u0000\u0123\u0126\u0001\u0000\u0000"+
		"\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000"+
		"\u0000\u0125\u0127\u0001\u0000\u0000\u0000\u0126\u0124\u0001\u0000\u0000"+
		"\u0000\u0127\u0128\u0005%\u0000\u0000\u0128\u0129\u0005\u001a\u0000\u0000"+
		"\u0129\u012a\u00054\u0000\u0000\u012a\u012b\u0005&\u0000\u0000\u012b!"+
		"\u0001\u0000\u0000\u0000\u012c\u0135\u0003 \u0010\u0000\u012d\u0135\u0003"+
		"6\u001b\u0000\u012e\u0135\u0003\u001e\u000f\u0000\u012f\u0135\u0003$\u0012"+
		"\u0000\u0130\u0135\u0003.\u0017\u0000\u0131\u0135\u00054\u0000\u0000\u0132"+
		"\u0135\u0005\u001e\u0000\u0000\u0133\u0135\u00052\u0000\u0000\u0134\u012c"+
		"\u0001\u0000\u0000\u0000\u0134\u012d\u0001\u0000\u0000\u0000\u0134\u012e"+
		"\u0001\u0000\u0000\u0000\u0134\u012f\u0001\u0000\u0000\u0000\u0134\u0130"+
		"\u0001\u0000\u0000\u0000\u0134\u0131\u0001\u0000\u0000\u0000\u0134\u0132"+
		"\u0001\u0000\u0000\u0000\u0134\u0133\u0001\u0000\u0000\u0000\u0135#\u0001"+
		"\u0000\u0000\u0000\u0136\u0137\u0005#\u0000\u0000\u0137\u0138\u00054\u0000"+
		"\u0000\u0138\u0139\u00052\u0000\u0000\u0139\u013a\u00054\u0000\u0000\u013a"+
		"\u013b\u0005$\u0000\u0000\u013b%\u0001\u0000\u0000\u0000\u013c\u013d\u0005"+
		"4\u0000\u0000\u013d\u013f\u0005\u0016\u0000\u0000\u013e\u0140\u0005#\u0000"+
		"\u0000\u013f\u013e\u0001\u0000\u0000\u0000\u013f\u0140\u0001\u0000\u0000"+
		"\u0000\u0140\u0142\u0001\u0000\u0000\u0000\u0141\u0143\u0005#\u0000\u0000"+
		"\u0142\u0141\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000\u0000\u0000"+
		"\u0143\u0145\u0001\u0000\u0000\u0000\u0144\u0146\u0003(\u0014\u0000\u0145"+
		"\u0144\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000\u0000\u0147"+
		"\u0145\u0001\u0000\u0000\u0000\u0147\u0148\u0001\u0000\u0000\u0000\u0148"+
		"\u014a\u0001\u0000\u0000\u0000\u0149\u014b\u0005$\u0000\u0000\u014a\u0149"+
		"\u0001\u0000\u0000\u0000\u014a\u014b\u0001\u0000\u0000\u0000\u014b\u014d"+
		"\u0001\u0000\u0000\u0000\u014c\u014e\u0005$\u0000\u0000\u014d\u014c\u0001"+
		"\u0000\u0000\u0000\u014d\u014e\u0001\u0000\u0000\u0000\u014e\'\u0001\u0000"+
		"\u0000\u0000\u014f\u015a\u00055\u0000\u0000\u0150\u0151\u0005\u001c\u0000"+
		"\u0000\u0151\u0152\u00054\u0000\u0000\u0152\u0153\u0005\u001e\u0000\u0000"+
		"\u0153\u015a\u00038\u001c\u0000\u0154\u0155\u00054\u0000\u0000\u0155\u0156"+
		"\u0005\u001e\u0000\u0000\u0156\u015a\u00038\u001c\u0000\u0157\u015a\u0003"+
		"*\u0015\u0000\u0158\u015a\u0003,\u0016\u0000\u0159\u014f\u0001\u0000\u0000"+
		"\u0000\u0159\u0150\u0001\u0000\u0000\u0000\u0159\u0154\u0001\u0000\u0000"+
		"\u0000\u0159\u0157\u0001\u0000\u0000\u0000\u0159\u0158\u0001\u0000\u0000"+
		"\u0000\u015a)\u0001\u0000\u0000\u0000\u015b\u015c\u0005\u001f\u0000\u0000"+
		"\u015c\u015d\u0005 \u0000\u0000\u015d\u015e\u0005\u0015\u0000\u0000\u015e"+
		"\u015f\u00054\u0000\u0000\u015f\u0162\u0005\u001f\u0000\u0000\u0160\u0163"+
		"\u00054\u0000\u0000\u0161\u0163\u00038\u001c\u0000\u0162\u0160\u0001\u0000"+
		"\u0000\u0000\u0162\u0161\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000"+
		"\u0000\u0000\u0164\u0166\u0005 \u0000\u0000\u0165\u0167\u0005\u001d\u0000"+
		"\u0000\u0166\u0165\u0001\u0000\u0000\u0000\u0166\u0167\u0001\u0000\u0000"+
		"\u0000\u0167+\u0001\u0000\u0000\u0000\u0168\u016b\u00054\u0000\u0000\u0169"+
		"\u016a\u00052\u0000\u0000\u016a\u016c\u00054\u0000\u0000\u016b\u0169\u0001"+
		"\u0000\u0000\u0000\u016b\u016c\u0001\u0000\u0000\u0000\u016c-\u0001\u0000"+
		"\u0000\u0000\u016d\u016e\u0005%\u0000\u0000\u016e\u0172\u00054\u0000\u0000"+
		"\u016f\u0171\u00030\u0018\u0000\u0170\u016f\u0001\u0000\u0000\u0000\u0171"+
		"\u0174\u0001\u0000\u0000\u0000\u0172\u0170\u0001\u0000\u0000\u0000\u0172"+
		"\u0173\u0001\u0000\u0000\u0000\u0173\u0175\u0001\u0000\u0000\u0000\u0174"+
		"\u0172\u0001\u0000\u0000\u0000\u0175\u0176\u0005\'\u0000\u0000\u0176/"+
		"\u0001\u0000\u0000\u0000\u0177\u0178\u00032\u0019\u0000\u0178\u0179\u0005"+
		"\u0016\u0000\u0000\u0179\u017a\u0005#\u0000\u0000\u017a\u017b\u00034\u001a"+
		"\u0000\u017b\u017c\u0005$\u0000\u0000\u017c1\u0001\u0000\u0000\u0000\u017d"+
		"\u017e\u00054\u0000\u0000\u017e3\u0001\u0000\u0000\u0000\u017f\u0182\u0005"+
		"4\u0000\u0000\u0180\u0182\u00038\u001c\u0000\u0181\u017f\u0001\u0000\u0000"+
		"\u0000\u0181\u0180\u0001\u0000\u0000\u0000\u01825\u0001\u0000\u0000\u0000"+
		"\u0183\u0186\u0005#\u0000\u0000\u0184\u0187\u0003.\u0017\u0000\u0185\u0187"+
		"\u00054\u0000\u0000\u0186\u0184\u0001\u0000\u0000\u0000\u0186\u0185\u0001"+
		"\u0000\u0000\u0000\u0187\u018d\u0001\u0000\u0000\u0000\u0188\u018b\u0007"+
		"\u0002\u0000\u0000\u0189\u018c\u0003.\u0017\u0000\u018a\u018c\u00054\u0000"+
		"\u0000\u018b\u0189\u0001\u0000\u0000\u0000\u018b\u018a\u0001\u0000\u0000"+
		"\u0000\u018c\u018e\u0001\u0000\u0000\u0000\u018d\u0188\u0001\u0000\u0000"+
		"\u0000\u018e\u018f\u0001\u0000\u0000\u0000\u018f\u018d\u0001\u0000\u0000"+
		"\u0000\u018f\u0190\u0001\u0000\u0000\u0000\u0190\u0191\u0001\u0000\u0000"+
		"\u0000\u0191\u0192\u0005$\u0000\u0000\u01927\u0001\u0000\u0000\u0000\u0193"+
		"\u0194\u0007\u0003\u0000\u0000\u01949\u0001\u0000\u0000\u0000\u0195\u0198"+
		"\u0003<\u001e\u0000\u0196\u0198\u0003>\u001f\u0000\u0197\u0195\u0001\u0000"+
		"\u0000\u0000\u0197\u0196\u0001\u0000\u0000\u0000\u0198;\u0001\u0000\u0000"+
		"\u0000\u0199\u019d\u0005!\u0000\u0000\u019a\u019c\u0003@ \u0000\u019b"+
		"\u019a\u0001\u0000\u0000\u0000\u019c\u019f\u0001\u0000\u0000\u0000\u019d"+
		"\u019b\u0001\u0000\u0000\u0000\u019d\u019e\u0001\u0000\u0000\u0000\u019e"+
		"\u01a0\u0001\u0000\u0000\u0000\u019f\u019d\u0001\u0000\u0000\u0000\u01a0"+
		"\u01a1\u0005\"\u0000\u0000\u01a1=\u0001\u0000\u0000\u0000\u01a2\u01a9"+
		"\u0005!\u0000\u0000\u01a3\u01a5\u00038\u001c\u0000\u01a4\u01a6\u0005\u001c"+
		"\u0000\u0000\u01a5\u01a4\u0001\u0000\u0000\u0000\u01a5\u01a6\u0001\u0000"+
		"\u0000\u0000\u01a6\u01a8\u0001\u0000\u0000\u0000\u01a7\u01a3\u0001\u0000"+
		"\u0000\u0000\u01a8\u01ab\u0001\u0000\u0000\u0000\u01a9\u01a7\u0001\u0000"+
		"\u0000\u0000\u01a9\u01aa\u0001\u0000\u0000\u0000\u01aa\u01ac\u0001\u0000"+
		"\u0000\u0000\u01ab\u01a9\u0001\u0000\u0000\u0000\u01ac\u01ad\u0005\"\u0000"+
		"\u0000\u01ad?\u0001\u0000\u0000\u0000\u01ae\u01b5\u0005#\u0000\u0000\u01af"+
		"\u01b1\u0003B!\u0000\u01b0\u01b2\u0005\u001c\u0000\u0000\u01b1\u01b0\u0001"+
		"\u0000\u0000\u0000\u01b1\u01b2\u0001\u0000\u0000\u0000\u01b2\u01b4\u0001"+
		"\u0000\u0000\u0000\u01b3\u01af\u0001\u0000\u0000\u0000\u01b4\u01b7\u0001"+
		"\u0000\u0000\u0000\u01b5\u01b3\u0001\u0000\u0000\u0000\u01b5\u01b6\u0001"+
		"\u0000\u0000\u0000\u01b6\u01b8\u0001\u0000\u0000\u0000\u01b7\u01b5\u0001"+
		"\u0000\u0000\u0000\u01b8\u01ba\u0005$\u0000\u0000\u01b9\u01bb\u0005\u001c"+
		"\u0000\u0000\u01ba\u01b9\u0001\u0000\u0000\u0000\u01ba\u01bb\u0001\u0000"+
		"\u0000\u0000\u01bbA\u0001\u0000\u0000\u0000\u01bc\u01bd\u00054\u0000\u0000"+
		"\u01bd\u01c0\u0005\u001e\u0000\u0000\u01be\u01c1\u00038\u001c\u0000\u01bf"+
		"\u01c1\u0003:\u001d\u0000\u01c0\u01be\u0001\u0000\u0000\u0000\u01c0\u01bf"+
		"\u0001\u0000\u0000\u0000\u01c1C\u0001\u0000\u0000\u0000\u01c2\u01c3\u0005"+
		"\u0003\u0000\u0000\u01c3\u01c4\u00052\u0000\u0000\u01c4\u01c5\u0005\u0004"+
		"\u0000\u0000\u01c5\u01c9\u0005\u001f\u0000\u0000\u01c6\u01c8\u0007\u0004"+
		"\u0000\u0000\u01c7\u01c6\u0001\u0000\u0000\u0000\u01c8\u01cb\u0001\u0000"+
		"\u0000\u0000\u01c9\u01c7\u0001\u0000\u0000\u0000\u01c9\u01ca\u0001\u0000"+
		"\u0000\u0000\u01ca\u01cc\u0001\u0000\u0000\u0000\u01cb\u01c9\u0001\u0000"+
		"\u0000\u0000\u01cc\u01cd\u0005 \u0000\u0000\u01cd\u01ce\u0005\u001d\u0000"+
		"\u0000\u01ceE\u0001\u0000\u0000\u0000:INPTX[^bfjm~\u0081\u0085\u008b\u0094"+
		"\u0099\u009f\u00a6\u00aa\u00af\u00b3\u00bc\u00c2\u00c6\u00cb\u00d2\u00dc"+
		"\u00e0\u00f9\u00fd\u0111\u011d\u0124\u0134\u013f\u0142\u0147\u014a\u014d"+
		"\u0159\u0162\u0166\u016b\u0172\u0181\u0186\u018b\u018f\u0197\u019d\u01a5"+
		"\u01a9\u01b1\u01b5\u01ba\u01c0\u01c9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}