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
		RIGHTCURLY=36, LESSTHAN=37, GREATERTHAN=38, LESSEQUAL=39, GREATEREQUAL=40, 
		EQ=41, NEQ=42, AND=43, OR=44, PLUSPLUS=45, MINUSMINUS=46, SQ=47, DQ=48, 
		DOT=49, BOOL=50, ID=51, STRING=52, INT=53, DOUBLE=54;
	public static final int
		RULE_program = 0, RULE_importStatement = 1, RULE_export = 2, RULE_variableDeclaration = 3, 
		RULE_functionDeclaration = 4, RULE_regularFunction = 5, RULE_callBackFunction = 6, 
		RULE_parameters = 7, RULE_functionbody = 8, RULE_funcStatement = 9, RULE_callFunc = 10, 
		RULE_returnStatement = 11, RULE_useRef = 12, RULE_useState = 13, RULE_useEffect = 14, 
		RULE_map = 15, RULE_jsx_element = 16, RULE_content = 17, RULE_useAttribute = 18, 
		RULE_jsx_attribute = 19, RULE_jsx_class = 20, RULE_attributeDetails = 21, 
		RULE_attributeDetailsFunction = 22, RULE_attributeDetailsAttribute = 23, 
		RULE_component = 24, RULE_props = 25, RULE_prop_value = 26, RULE_shortIf = 27, 
		RULE_value = 28, RULE_valueIndex = 29, RULE_array = 30, RULE_arrayObjects = 31, 
		RULE_arrayValues = 32, RULE_object = 33, RULE_element = 34, RULE_print = 35;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "importStatement", "export", "variableDeclaration", "functionDeclaration", 
			"regularFunction", "callBackFunction", "parameters", "functionbody", 
			"funcStatement", "callFunc", "returnStatement", "useRef", "useState", 
			"useEffect", "map", "jsx_element", "content", "useAttribute", "jsx_attribute", 
			"jsx_class", "attributeDetails", "attributeDetailsFunction", "attributeDetailsAttribute", 
			"component", "props", "prop_value", "shortIf", "value", "valueIndex", 
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
			"'('", "')'", "'['", "']'", "'{'", "'}'", "'<'", "'>'", "'<='", "'>='", 
			"'=='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'''", "'\"'", "'.'"
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
			"LESSTHAN", "GREATERTHAN", "LESSEQUAL", "GREATEREQUAL", "EQ", "NEQ", 
			"AND", "OR", "PLUSPLUS", "MINUSMINUS", "SQ", "DQ", "DOT", "BOOL", "ID", 
			"STRING", "INT", "DOUBLE"
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
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(72);
				importStatement();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2147483876L) != 0)) {
				{
				setState(80);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FUNCTION:
				case LEFTPAREN:
					{
					setState(78);
					functionDeclaration();
					}
					break;
				case VAR:
				case LET:
				case CONST:
					{
					setState(79);
					variableDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(85);
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
		public Token source;
		public TerminalNode IMPORT() { return getToken(ReactParser.IMPORT, 0); }
		public TerminalNode STRING() { return getToken(ReactParser.STRING, 0); }
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
		public TerminalNode SEMI() { return getToken(ReactParser.SEMI, 0); }
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
			setState(88);
			match(IMPORT);
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(89);
				match(ID);
				}
				break;
			}
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(92);
				match(COMMA);
				}
			}

			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFTCURLY) {
				{
				setState(95);
				match(LEFTCURLY);
				}
			}

			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2251799814078464L) != 0)) {
				{
				{
				setState(98);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2251799814078464L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(99);
					match(COMMA);
					}
				}

				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RIGHTCURLY) {
				{
				setState(107);
				match(RIGHTCURLY);
				}
			}

			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(110);
				match(FROM);
				}
			}

			setState(113);
			((ImportStatementContext)_localctx).source = match(STRING);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(114);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(EXPORT);
			setState(118);
			match(DEFAULT);
			setState(119);
			match(ID);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(120);
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
	public static class VariableDeclarationContext extends ParserRuleContext {
		public Token variable;
		public TerminalNode EQUAL() { return getToken(ReactParser.EQUAL, 0); }
		public TerminalNode VAR() { return getToken(ReactParser.VAR, 0); }
		public TerminalNode CONST() { return getToken(ReactParser.CONST, 0); }
		public TerminalNode LET() { return getToken(ReactParser.LET, 0); }
		public List<TerminalNode> ID() { return getTokens(ReactParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ReactParser.ID, i);
		}
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
			setState(123);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 224L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(124);
			((VariableDeclarationContext)_localctx).variable = match(ID);
			setState(125);
			match(EQUAL);
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(126);
				value();
				}
				break;
			case 2:
				{
				setState(127);
				functionDeclaration();
				}
				break;
			case 3:
				{
				setState(128);
				array();
				}
				break;
			case 4:
				{
				setState(129);
				match(ID);
				}
				break;
			}
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(132);
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
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				regularFunction();
				}
				break;
			case LEFTPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
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
		public Token functionName;
		public TerminalNode FUNCTION() { return getToken(ReactParser.FUNCTION, 0); }
		public TerminalNode LEFTPAREN() { return getToken(ReactParser.LEFTPAREN, 0); }
		public TerminalNode RIGHTPAREN() { return getToken(ReactParser.RIGHTPAREN, 0); }
		public TerminalNode LEFTCURLY() { return getToken(ReactParser.LEFTCURLY, 0); }
		public FunctionbodyContext functionbody() {
			return getRuleContext(FunctionbodyContext.class,0);
		}
		public TerminalNode RIGHTCURLY() { return getToken(ReactParser.RIGHTCURLY, 0); }
		public TerminalNode ID() { return getToken(ReactParser.ID, 0); }
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
			setState(139);
			match(FUNCTION);
			setState(140);
			((RegularFunctionContext)_localctx).functionName = match(ID);
			setState(141);
			match(LEFTPAREN);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFTCURLY || _la==ID) {
				{
				setState(142);
				parameters();
				}
			}

			setState(145);
			match(RIGHTPAREN);
			setState(146);
			match(LEFTCURLY);
			setState(147);
			functionbody();
			setState(148);
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
			setState(150);
			match(LEFTPAREN);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFTCURLY || _la==ID) {
				{
				setState(151);
				parameters();
				}
			}

			setState(154);
			match(RIGHTPAREN);
			setState(155);
			match(ARROW);
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
			functionbody();
			setState(160);
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
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFTCURLY) {
				{
				setState(162);
				match(LEFTCURLY);
				}
			}

			setState(165);
			match(ID);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(166);
				match(COMMA);
				setState(167);
				match(ID);
				}
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RIGHTCURLY) {
				{
				setState(173);
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
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2251937253425384L) != 0)) {
				{
				{
				setState(176);
				funcStatement();
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(182);
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
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				useEffect();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				useState();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(187);
				useRef();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(188);
				variableDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(189);
				print();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(190);
				callFunc();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(191);
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
			setState(194);
			match(ID);
			setState(195);
			match(LEFTPAREN);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(196);
				match(ID);
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(197);
					match(COMMA);
					}
				}

				}
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(205);
			match(RIGHTPAREN);
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(206);
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
		public List<Jsx_elementContext> jsx_element() {
			return getRuleContexts(Jsx_elementContext.class);
		}
		public Jsx_elementContext jsx_element(int i) {
			return getRuleContext(Jsx_elementContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(ReactParser.SEMI, 0); }
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
			setState(209);
			match(RETURN);
			setState(210);
			match(LEFTPAREN);
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LESSTHAN) {
				{
				{
				setState(211);
				jsx_element();
				}
				}
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(217);
			match(RIGHTPAREN);
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(218);
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
			setState(221);
			match(USEREF);
			setState(222);
			match(LEFTPAREN);
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING) {
				{
				{
				setState(223);
				match(STRING);
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(224);
					match(COMMA);
					}
				}

				}
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(232);
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
			setState(234);
			match(CONST);
			setState(235);
			match(LEFTBRACKET);
			setState(236);
			match(ID);
			setState(237);
			match(COMMA);
			setState(238);
			match(ID);
			setState(239);
			match(RIGHTBRACKET);
			setState(240);
			match(EQUAL);
			setState(241);
			match(USESTATE);
			setState(242);
			match(LEFTPAREN);
			setState(243);
			value();
			setState(244);
			match(RIGHTPAREN);
			setState(245);
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
			setState(247);
			match(USEEFFECT);
			setState(248);
			match(LEFTPAREN);
			setState(249);
			callBackFunction();
			setState(250);
			match(COMMA);
			setState(251);
			match(LEFTBRACKET);
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(252);
				match(ID);
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(253);
					match(COMMA);
					}
				}

				}
				}
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(261);
			match(RIGHTBRACKET);
			setState(262);
			match(RIGHTPAREN);
			setState(263);
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
			setState(265);
			match(LEFTCURLY);
			setState(266);
			match(ID);
			setState(267);
			match(DOT);
			setState(268);
			match(ID);
			setState(269);
			match(LEFTPAREN);
			setState(270);
			match(LEFTPAREN);
			setState(271);
			match(ID);
			setState(272);
			match(RIGHTPAREN);
			setState(273);
			match(ARROW);
			setState(274);
			match(LEFTPAREN);
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LESSTHAN) {
				{
				{
				setState(275);
				jsx_element();
				}
				}
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(281);
			match(RIGHTPAREN);
			setState(282);
			match(RIGHTPAREN);
			setState(283);
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
		public TerminalNode DIVISION() { return getToken(ReactParser.DIVISION, 0); }
		public List<TerminalNode> GREATERTHAN() { return getTokens(ReactParser.GREATERTHAN); }
		public TerminalNode GREATERTHAN(int i) {
			return getToken(ReactParser.GREATERTHAN, i);
		}
		public List<TerminalNode> ID() { return getTokens(ReactParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ReactParser.ID, i);
		}
		public List<Jsx_attributeContext> jsx_attribute() {
			return getRuleContexts(Jsx_attributeContext.class);
		}
		public Jsx_attributeContext jsx_attribute(int i) {
			return getRuleContext(Jsx_attributeContext.class,i);
		}
		public List<Jsx_classContext> jsx_class() {
			return getRuleContexts(Jsx_classContext.class);
		}
		public Jsx_classContext jsx_class(int i) {
			return getRuleContext(Jsx_classContext.class,i);
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
			setState(285);
			match(LESSTHAN);
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(286);
				match(ID);
				}
				break;
			}
			setState(293);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(291);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						setState(289);
						jsx_attribute();
						}
						break;
					case 2:
						{
						setState(290);
						jsx_class();
						}
						break;
					}
					} 
				}
				setState(295);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GREATERTHAN) {
				{
				setState(296);
				match(GREATERTHAN);
				}
			}

			setState(302);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(299);
					content();
					}
					} 
				}
				setState(304);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			}
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESSTHAN) {
				{
				setState(305);
				match(LESSTHAN);
				}
			}

			setState(308);
			match(DIVISION);
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(309);
				match(ID);
				}
			}

			setState(312);
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
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(314);
				jsx_element();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
				shortIf();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(316);
				map();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(317);
				useAttribute();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(318);
				component();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(319);
				match(ID);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(320);
				match(COLON);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(321);
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
			setState(324);
			match(LEFTCURLY);
			setState(325);
			match(ID);
			setState(326);
			match(DOT);
			setState(327);
			match(ID);
			setState(328);
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
			setState(330);
			match(ID);
			setState(331);
			match(EQUAL);
			{
			setState(333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(332);
				match(LEFTCURLY);
				}
				break;
			}
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFTCURLY) {
				{
				setState(335);
				match(LEFTCURLY);
				}
			}

			setState(339); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(338);
					attributeDetails();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(341); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(343);
				match(RIGHTCURLY);
				}
				break;
			}
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RIGHTCURLY) {
				{
				setState(346);
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
	public static class Jsx_classContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ReactParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(ReactParser.EQUAL, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Jsx_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsx_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsx_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsx_class(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsx_class(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jsx_classContext jsx_class() throws RecognitionException {
		Jsx_classContext _localctx = new Jsx_classContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_jsx_class);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(ID);
			setState(350);
			match(EQUAL);
			setState(351);
			value();
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
		enterRule(_localctx, 42, RULE_attributeDetails);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(353);
				match(STRING);
				}
				break;
			case 2:
				{
				setState(354);
				match(COMMA);
				setState(355);
				match(ID);
				setState(356);
				match(COLON);
				setState(357);
				value();
				}
				break;
			case 3:
				{
				setState(358);
				match(ID);
				setState(359);
				match(COLON);
				setState(360);
				value();
				}
				break;
			case 4:
				{
				setState(361);
				attributeDetailsFunction();
				}
				break;
			case 5:
				{
				setState(362);
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
		enterRule(_localctx, 44, RULE_attributeDetailsFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(LEFTPAREN);
			setState(366);
			match(RIGHTPAREN);
			setState(367);
			match(ARROW);
			setState(368);
			match(ID);
			setState(369);
			match(LEFTPAREN);
			setState(372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(370);
				match(ID);
				}
				break;
			case 2:
				{
				setState(371);
				value();
				}
				break;
			}
			setState(374);
			match(RIGHTPAREN);
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(375);
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
		enterRule(_localctx, 46, RULE_attributeDetailsAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(ID);
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(379);
				match(DOT);
				setState(380);
				match(ID);
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
	public static class ComponentContext extends ParserRuleContext {
		public TerminalNode LESSTHAN() { return getToken(ReactParser.LESSTHAN, 0); }
		public TerminalNode ID() { return getToken(ReactParser.ID, 0); }
		public TerminalNode DIVISION() { return getToken(ReactParser.DIVISION, 0); }
		public TerminalNode GREATERTHAN() { return getToken(ReactParser.GREATERTHAN, 0); }
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
		enterRule(_localctx, 48, RULE_component);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(LESSTHAN);
			setState(384);
			match(ID);
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(385);
				props();
				}
				}
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(391);
			match(DIVISION);
			setState(392);
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
	public static class PropsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ReactParser.ID, 0); }
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
		enterRule(_localctx, 50, RULE_props);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(ID);
			setState(395);
			match(EQUAL);
			setState(396);
			match(LEFTCURLY);
			setState(397);
			prop_value();
			setState(398);
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
			setState(402);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(400);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(401);
				value();
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
			setState(404);
			match(LEFTCURLY);
			setState(407);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LESSTHAN:
				{
				setState(405);
				component();
				}
				break;
			case ID:
				{
				setState(406);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(414); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(409);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 30236569763840L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(412);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LESSTHAN:
					{
					setState(410);
					component();
					}
					break;
				case ID:
					{
					setState(411);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(416); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 30236569763840L) != 0) );
			setState(418);
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
		public ValueIndexContext valueIndex() {
			return getRuleContext(ValueIndexContext.class,0);
		}
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(420);
				match(STRING);
				}
				break;
			case BOOL:
				{
				setState(421);
				match(BOOL);
				}
				break;
			case DOUBLE:
				{
				setState(422);
				match(DOUBLE);
				}
				break;
			case INT:
				{
				setState(423);
				match(INT);
				}
				break;
			case NULL:
				{
				setState(424);
				match(NULL);
				}
				break;
			case ID:
				{
				setState(425);
				valueIndex();
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
	public static class ValueIndexContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ReactParser.ID, 0); }
		public TerminalNode LEFTBRACKET() { return getToken(ReactParser.LEFTBRACKET, 0); }
		public TerminalNode INT() { return getToken(ReactParser.INT, 0); }
		public TerminalNode RIGHTBRACKET() { return getToken(ReactParser.RIGHTBRACKET, 0); }
		public ValueIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueIndex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterValueIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitValueIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitValueIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueIndexContext valueIndex() throws RecognitionException {
		ValueIndexContext _localctx = new ValueIndexContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_valueIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(ID);
			setState(429);
			match(LEFTBRACKET);
			setState(430);
			match(INT);
			setState(431);
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
		enterRule(_localctx, 60, RULE_array);
		try {
			setState(435);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(433);
				arrayObjects();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(434);
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
		enterRule(_localctx, 62, RULE_arrayObjects);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(LEFTBRACKET);
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFTCURLY) {
				{
				{
				setState(438);
				object();
				}
				}
				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(444);
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
		enterRule(_localctx, 64, RULE_arrayValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(LEFTBRACKET);
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34902897113169920L) != 0)) {
				{
				{
				setState(447);
				value();
				setState(449);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(448);
					match(COMMA);
					}
				}

				}
				}
				setState(455);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(456);
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
		enterRule(_localctx, 66, RULE_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			match(LEFTCURLY);
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(459);
				element();
				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(460);
					match(COMMA);
					}
				}

				}
				}
				setState(467);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(468);
			match(RIGHTCURLY);
			setState(470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(469);
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
		enterRule(_localctx, 68, RULE_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			match(ID);
			setState(473);
			match(COLON);
			setState(476);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL:
			case BOOL:
			case ID:
			case STRING:
			case INT:
			case DOUBLE:
				{
				setState(474);
				value();
				}
				break;
			case LEFTBRACKET:
				{
				setState(475);
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
		enterRule(_localctx, 70, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			match(CONSOLE);
			setState(479);
			match(DOT);
			setState(480);
			match(LOG);
			setState(481);
			match(LEFTPAREN);
			setState(485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15762598695796736L) != 0)) {
				{
				{
				setState(482);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15762598695796736L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(487);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(488);
			match(RIGHTPAREN);
			setState(489);
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
		"\u0004\u00016\u01ec\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0001\u0000\u0005\u0000J\b\u0000\n\u0000\f\u0000M\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0005\u0000Q\b\u0000\n\u0000\f\u0000T\t\u0000\u0001"+
		"\u0000\u0003\u0000W\b\u0000\u0001\u0001\u0001\u0001\u0003\u0001[\b\u0001"+
		"\u0001\u0001\u0003\u0001^\b\u0001\u0001\u0001\u0003\u0001a\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001e\b\u0001\u0005\u0001g\b\u0001\n\u0001\f"+
		"\u0001j\t\u0001\u0001\u0001\u0003\u0001m\b\u0001\u0001\u0001\u0003\u0001"+
		"p\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001t\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002z\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u0083\b\u0003\u0001\u0003\u0003\u0003\u0086\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0003\u0004\u008a\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u0090\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0003\u0006\u0099\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u009e\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0003\u0007\u00a4\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007\u00a9\b\u0007\n\u0007\f\u0007\u00ac"+
		"\t\u0007\u0001\u0007\u0003\u0007\u00af\b\u0007\u0001\b\u0005\b\u00b2\b"+
		"\b\n\b\f\b\u00b5\t\b\u0001\b\u0003\b\u00b8\b\b\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00c1\b\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u00c7\b\n\u0005\n\u00c9\b\n\n\n\f\n\u00cc\t\n\u0001"+
		"\n\u0001\n\u0003\n\u00d0\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u00d5\b\u000b\n\u000b\f\u000b\u00d8\t\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u00dc\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00e2"+
		"\b\f\u0005\f\u00e4\b\f\n\f\f\f\u00e7\t\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00ff\b\u000e\u0005\u000e\u0101"+
		"\b\u000e\n\u000e\f\u000e\u0104\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0005\u000f\u0115\b\u000f\n\u000f\f\u000f\u0118\t\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0003\u0010\u0120"+
		"\b\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u0124\b\u0010\n\u0010\f\u0010"+
		"\u0127\t\u0010\u0001\u0010\u0003\u0010\u012a\b\u0010\u0001\u0010\u0005"+
		"\u0010\u012d\b\u0010\n\u0010\f\u0010\u0130\t\u0010\u0001\u0010\u0003\u0010"+
		"\u0133\b\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0137\b\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0143\b\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u014e\b\u0013\u0001\u0013\u0003"+
		"\u0013\u0151\b\u0013\u0001\u0013\u0004\u0013\u0154\b\u0013\u000b\u0013"+
		"\f\u0013\u0155\u0001\u0013\u0003\u0013\u0159\b\u0013\u0001\u0013\u0003"+
		"\u0013\u015c\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u016c\b\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0003\u0016\u0175\b\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0179"+
		"\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u017e\b\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0183\b\u0018\n\u0018"+
		"\f\u0018\u0186\t\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0003\u001a\u0193\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0003\u001b\u0198\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b"+
		"\u019d\b\u001b\u0004\u001b\u019f\b\u001b\u000b\u001b\f\u001b\u01a0\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0003\u001c\u01ab\b\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0003\u001e\u01b4"+
		"\b\u001e\u0001\u001f\u0001\u001f\u0005\u001f\u01b8\b\u001f\n\u001f\f\u001f"+
		"\u01bb\t\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0003 \u01c2"+
		"\b \u0005 \u01c4\b \n \f \u01c7\t \u0001 \u0001 \u0001!\u0001!\u0001!"+
		"\u0003!\u01ce\b!\u0005!\u01d0\b!\n!\f!\u01d3\t!\u0001!\u0001!\u0003!\u01d7"+
		"\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u01dd\b\"\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0005#\u01e4\b#\n#\f#\u01e7\t#\u0001#\u0001#\u0001#\u0001"+
		"#\u0000\u0000$\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF\u0000\u0004\u0002\u0000"+
		"\u0011\u001233\u0001\u0000\u0005\u0007\u0002\u0000\')+,\u0001\u000035"+
		"\u021e\u0000K\u0001\u0000\u0000\u0000\u0002X\u0001\u0000\u0000\u0000\u0004"+
		"u\u0001\u0000\u0000\u0000\u0006{\u0001\u0000\u0000\u0000\b\u0089\u0001"+
		"\u0000\u0000\u0000\n\u008b\u0001\u0000\u0000\u0000\f\u0096\u0001\u0000"+
		"\u0000\u0000\u000e\u00a3\u0001\u0000\u0000\u0000\u0010\u00b3\u0001\u0000"+
		"\u0000\u0000\u0012\u00c0\u0001\u0000\u0000\u0000\u0014\u00c2\u0001\u0000"+
		"\u0000\u0000\u0016\u00d1\u0001\u0000\u0000\u0000\u0018\u00dd\u0001\u0000"+
		"\u0000\u0000\u001a\u00ea\u0001\u0000\u0000\u0000\u001c\u00f7\u0001\u0000"+
		"\u0000\u0000\u001e\u0109\u0001\u0000\u0000\u0000 \u011d\u0001\u0000\u0000"+
		"\u0000\"\u0142\u0001\u0000\u0000\u0000$\u0144\u0001\u0000\u0000\u0000"+
		"&\u014a\u0001\u0000\u0000\u0000(\u015d\u0001\u0000\u0000\u0000*\u016b"+
		"\u0001\u0000\u0000\u0000,\u016d\u0001\u0000\u0000\u0000.\u017a\u0001\u0000"+
		"\u0000\u00000\u017f\u0001\u0000\u0000\u00002\u018a\u0001\u0000\u0000\u0000"+
		"4\u0192\u0001\u0000\u0000\u00006\u0194\u0001\u0000\u0000\u00008\u01aa"+
		"\u0001\u0000\u0000\u0000:\u01ac\u0001\u0000\u0000\u0000<\u01b3\u0001\u0000"+
		"\u0000\u0000>\u01b5\u0001\u0000\u0000\u0000@\u01be\u0001\u0000\u0000\u0000"+
		"B\u01ca\u0001\u0000\u0000\u0000D\u01d8\u0001\u0000\u0000\u0000F\u01de"+
		"\u0001\u0000\u0000\u0000HJ\u0003\u0002\u0001\u0000IH\u0001\u0000\u0000"+
		"\u0000JM\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000"+
		"\u0000\u0000LR\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000NQ\u0003"+
		"\b\u0004\u0000OQ\u0003\u0006\u0003\u0000PN\u0001\u0000\u0000\u0000PO\u0001"+
		"\u0000\u0000\u0000QT\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000"+
		"RS\u0001\u0000\u0000\u0000SV\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000"+
		"\u0000UW\u0003\u0004\u0002\u0000VU\u0001\u0000\u0000\u0000VW\u0001\u0000"+
		"\u0000\u0000W\u0001\u0001\u0000\u0000\u0000XZ\u0005\r\u0000\u0000Y[\u0005"+
		"3\u0000\u0000ZY\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[]\u0001"+
		"\u0000\u0000\u0000\\^\u0005\u001c\u0000\u0000]\\\u0001\u0000\u0000\u0000"+
		"]^\u0001\u0000\u0000\u0000^`\u0001\u0000\u0000\u0000_a\u0005#\u0000\u0000"+
		"`_\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ah\u0001\u0000\u0000"+
		"\u0000bd\u0007\u0000\u0000\u0000ce\u0005\u001c\u0000\u0000dc\u0001\u0000"+
		"\u0000\u0000de\u0001\u0000\u0000\u0000eg\u0001\u0000\u0000\u0000fb\u0001"+
		"\u0000\u0000\u0000gj\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000"+
		"hi\u0001\u0000\u0000\u0000il\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000"+
		"\u0000km\u0005$\u0000\u0000lk\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000"+
		"\u0000mo\u0001\u0000\u0000\u0000np\u0005\u0010\u0000\u0000on\u0001\u0000"+
		"\u0000\u0000op\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qs\u0005"+
		"4\u0000\u0000rt\u0005\u001d\u0000\u0000sr\u0001\u0000\u0000\u0000st\u0001"+
		"\u0000\u0000\u0000t\u0003\u0001\u0000\u0000\u0000uv\u0005\u000e\u0000"+
		"\u0000vw\u0005\u000f\u0000\u0000wy\u00053\u0000\u0000xz\u0005\u001d\u0000"+
		"\u0000yx\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z\u0005\u0001"+
		"\u0000\u0000\u0000{|\u0007\u0001\u0000\u0000|}\u00053\u0000\u0000}\u0082"+
		"\u0005\u0016\u0000\u0000~\u0083\u00038\u001c\u0000\u007f\u0083\u0003\b"+
		"\u0004\u0000\u0080\u0083\u0003<\u001e\u0000\u0081\u0083\u00053\u0000\u0000"+
		"\u0082~\u0001\u0000\u0000\u0000\u0082\u007f\u0001\u0000\u0000\u0000\u0082"+
		"\u0080\u0001\u0000\u0000\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0083"+
		"\u0085\u0001\u0000\u0000\u0000\u0084\u0086\u0005\u001d\u0000\u0000\u0085"+
		"\u0084\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086"+
		"\u0007\u0001\u0000\u0000\u0000\u0087\u008a\u0003\n\u0005\u0000\u0088\u008a"+
		"\u0003\f\u0006\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u0088\u0001"+
		"\u0000\u0000\u0000\u008a\t\u0001\u0000\u0000\u0000\u008b\u008c\u0005\u0002"+
		"\u0000\u0000\u008c\u008d\u00053\u0000\u0000\u008d\u008f\u0005\u001f\u0000"+
		"\u0000\u008e\u0090\u0003\u000e\u0007\u0000\u008f\u008e\u0001\u0000\u0000"+
		"\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0005 \u0000\u0000\u0092\u0093\u0005#\u0000\u0000\u0093"+
		"\u0094\u0003\u0010\b\u0000\u0094\u0095\u0005$\u0000\u0000\u0095\u000b"+
		"\u0001\u0000\u0000\u0000\u0096\u0098\u0005\u001f\u0000\u0000\u0097\u0099"+
		"\u0003\u000e\u0007\u0000\u0098\u0097\u0001\u0000\u0000\u0000\u0098\u0099"+
		"\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009b"+
		"\u0005 \u0000\u0000\u009b\u009d\u0005\u0015\u0000\u0000\u009c\u009e\u0005"+
		"#\u0000\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000"+
		"\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00a0\u0003\u0010"+
		"\b\u0000\u00a0\u00a1\u0005$\u0000\u0000\u00a1\r\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a4\u0005#\u0000\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5"+
		"\u00aa\u00053\u0000\u0000\u00a6\u00a7\u0005\u001c\u0000\u0000\u00a7\u00a9"+
		"\u00053\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a9\u00ac\u0001"+
		"\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001"+
		"\u0000\u0000\u0000\u00ab\u00ae\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001"+
		"\u0000\u0000\u0000\u00ad\u00af\u0005$\u0000\u0000\u00ae\u00ad\u0001\u0000"+
		"\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u000f\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b2\u0003\u0012\t\u0000\u00b1\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b5\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b7\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b6\u00b8\u0003\u0016\u000b"+
		"\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000"+
		"\u0000\u00b8\u0011\u0001\u0000\u0000\u0000\u00b9\u00c1\u0003\u001c\u000e"+
		"\u0000\u00ba\u00c1\u0003\u001a\r\u0000\u00bb\u00c1\u0003\u0018\f\u0000"+
		"\u00bc\u00c1\u0003\u0006\u0003\u0000\u00bd\u00c1\u0003F#\u0000\u00be\u00c1"+
		"\u0003\u0014\n\u0000\u00bf\u00c1\u0003 \u0010\u0000\u00c0\u00b9\u0001"+
		"\u0000\u0000\u0000\u00c0\u00ba\u0001\u0000\u0000\u0000\u00c0\u00bb\u0001"+
		"\u0000\u0000\u0000\u00c0\u00bc\u0001\u0000\u0000\u0000\u00c0\u00bd\u0001"+
		"\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0\u00bf\u0001"+
		"\u0000\u0000\u0000\u00c1\u0013\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005"+
		"3\u0000\u0000\u00c3\u00ca\u0005\u001f\u0000\u0000\u00c4\u00c6\u00053\u0000"+
		"\u0000\u00c5\u00c7\u0005\u001c\u0000\u0000\u00c6\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c9\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c4\u0001\u0000\u0000\u0000\u00c9\u00cc\u0001\u0000\u0000"+
		"\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000"+
		"\u0000\u00cb\u00cd\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000"+
		"\u0000\u00cd\u00cf\u0005 \u0000\u0000\u00ce\u00d0\u0005\u001d\u0000\u0000"+
		"\u00cf\u00ce\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000"+
		"\u00d0\u0015\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005\f\u0000\u0000\u00d2"+
		"\u00d6\u0005\u001f\u0000\u0000\u00d3\u00d5\u0003 \u0010\u0000\u00d4\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d8\u0001\u0000\u0000\u0000\u00d6\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d9"+
		"\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d9\u00db"+
		"\u0005 \u0000\u0000\u00da\u00dc\u0005\u001d\u0000\u0000\u00db\u00da\u0001"+
		"\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u0017\u0001"+
		"\u0000\u0000\u0000\u00dd\u00de\u0005\u0013\u0000\u0000\u00de\u00e5\u0005"+
		"\u001f\u0000\u0000\u00df\u00e1\u00054\u0000\u0000\u00e0\u00e2\u0005\u001c"+
		"\u0000\u0000\u00e1\u00e0\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e4\u0001\u0000\u0000\u0000\u00e3\u00df\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e7\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e8\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005 \u0000"+
		"\u0000\u00e9\u0019\u0001\u0000\u0000\u0000\u00ea\u00eb\u0005\u0007\u0000"+
		"\u0000\u00eb\u00ec\u0005!\u0000\u0000\u00ec\u00ed\u00053\u0000\u0000\u00ed"+
		"\u00ee\u0005\u001c\u0000\u0000\u00ee\u00ef\u00053\u0000\u0000\u00ef\u00f0"+
		"\u0005\"\u0000\u0000\u00f0\u00f1\u0005\u0016\u0000\u0000\u00f1\u00f2\u0005"+
		"\u0011\u0000\u0000\u00f2\u00f3\u0005\u001f\u0000\u0000\u00f3\u00f4\u0003"+
		"8\u001c\u0000\u00f4\u00f5\u0005 \u0000\u0000\u00f5\u00f6\u0005\u001d\u0000"+
		"\u0000\u00f6\u001b\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005\u0012\u0000"+
		"\u0000\u00f8\u00f9\u0005\u001f\u0000\u0000\u00f9\u00fa\u0003\f\u0006\u0000"+
		"\u00fa\u00fb\u0005\u001c\u0000\u0000\u00fb\u0102\u0005!\u0000\u0000\u00fc"+
		"\u00fe\u00053\u0000\u0000\u00fd\u00ff\u0005\u001c\u0000\u0000\u00fe\u00fd"+
		"\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0101"+
		"\u0001\u0000\u0000\u0000\u0100\u00fc\u0001\u0000\u0000\u0000\u0101\u0104"+
		"\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0102\u0103"+
		"\u0001\u0000\u0000\u0000\u0103\u0105\u0001\u0000\u0000\u0000\u0104\u0102"+
		"\u0001\u0000\u0000\u0000\u0105\u0106\u0005\"\u0000\u0000\u0106\u0107\u0005"+
		" \u0000\u0000\u0107\u0108\u0005\u001d\u0000\u0000\u0108\u001d\u0001\u0000"+
		"\u0000\u0000\u0109\u010a\u0005#\u0000\u0000\u010a\u010b\u00053\u0000\u0000"+
		"\u010b\u010c\u00051\u0000\u0000\u010c\u010d\u00053\u0000\u0000\u010d\u010e"+
		"\u0005\u001f\u0000\u0000\u010e\u010f\u0005\u001f\u0000\u0000\u010f\u0110"+
		"\u00053\u0000\u0000\u0110\u0111\u0005 \u0000\u0000\u0111\u0112\u0005\u0015"+
		"\u0000\u0000\u0112\u0116\u0005\u001f\u0000\u0000\u0113\u0115\u0003 \u0010"+
		"\u0000\u0114\u0113\u0001\u0000\u0000\u0000\u0115\u0118\u0001\u0000\u0000"+
		"\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000"+
		"\u0000\u0117\u0119\u0001\u0000\u0000\u0000\u0118\u0116\u0001\u0000\u0000"+
		"\u0000\u0119\u011a\u0005 \u0000\u0000\u011a\u011b\u0005 \u0000\u0000\u011b"+
		"\u011c\u0005$\u0000\u0000\u011c\u001f\u0001\u0000\u0000\u0000\u011d\u011f"+
		"\u0005%\u0000\u0000\u011e\u0120\u00053\u0000\u0000\u011f\u011e\u0001\u0000"+
		"\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u0120\u0125\u0001\u0000"+
		"\u0000\u0000\u0121\u0124\u0003&\u0013\u0000\u0122\u0124\u0003(\u0014\u0000"+
		"\u0123\u0121\u0001\u0000\u0000\u0000\u0123\u0122\u0001\u0000\u0000\u0000"+
		"\u0124\u0127\u0001\u0000\u0000\u0000\u0125\u0123\u0001\u0000\u0000\u0000"+
		"\u0125\u0126\u0001\u0000\u0000\u0000\u0126\u0129\u0001\u0000\u0000\u0000"+
		"\u0127\u0125\u0001\u0000\u0000\u0000\u0128\u012a\u0005&\u0000\u0000\u0129"+
		"\u0128\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000\u0000\u0000\u012a"+
		"\u012e\u0001\u0000\u0000\u0000\u012b\u012d\u0003\"\u0011\u0000\u012c\u012b"+
		"\u0001\u0000\u0000\u0000\u012d\u0130\u0001\u0000\u0000\u0000\u012e\u012c"+
		"\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u0132"+
		"\u0001\u0000\u0000\u0000\u0130\u012e\u0001\u0000\u0000\u0000\u0131\u0133"+
		"\u0005%\u0000\u0000\u0132\u0131\u0001\u0000\u0000\u0000\u0132\u0133\u0001"+
		"\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000\u0000\u0134\u0136\u0005"+
		"\u001a\u0000\u0000\u0135\u0137\u00053\u0000\u0000\u0136\u0135\u0001\u0000"+
		"\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000"+
		"\u0000\u0000\u0138\u0139\u0005&\u0000\u0000\u0139!\u0001\u0000\u0000\u0000"+
		"\u013a\u0143\u0003 \u0010\u0000\u013b\u0143\u00036\u001b\u0000\u013c\u0143"+
		"\u0003\u001e\u000f\u0000\u013d\u0143\u0003$\u0012\u0000\u013e\u0143\u0003"+
		"0\u0018\u0000\u013f\u0143\u00053\u0000\u0000\u0140\u0143\u0005\u001e\u0000"+
		"\u0000\u0141\u0143\u00051\u0000\u0000\u0142\u013a\u0001\u0000\u0000\u0000"+
		"\u0142\u013b\u0001\u0000\u0000\u0000\u0142\u013c\u0001\u0000\u0000\u0000"+
		"\u0142\u013d\u0001\u0000\u0000\u0000\u0142\u013e\u0001\u0000\u0000\u0000"+
		"\u0142\u013f\u0001\u0000\u0000\u0000\u0142\u0140\u0001\u0000\u0000\u0000"+
		"\u0142\u0141\u0001\u0000\u0000\u0000\u0143#\u0001\u0000\u0000\u0000\u0144"+
		"\u0145\u0005#\u0000\u0000\u0145\u0146\u00053\u0000\u0000\u0146\u0147\u0005"+
		"1\u0000\u0000\u0147\u0148\u00053\u0000\u0000\u0148\u0149\u0005$\u0000"+
		"\u0000\u0149%\u0001\u0000\u0000\u0000\u014a\u014b\u00053\u0000\u0000\u014b"+
		"\u014d\u0005\u0016\u0000\u0000\u014c\u014e\u0005#\u0000\u0000\u014d\u014c"+
		"\u0001\u0000\u0000\u0000\u014d\u014e\u0001\u0000\u0000\u0000\u014e\u0150"+
		"\u0001\u0000\u0000\u0000\u014f\u0151\u0005#\u0000\u0000\u0150\u014f\u0001"+
		"\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0151\u0153\u0001"+
		"\u0000\u0000\u0000\u0152\u0154\u0003*\u0015\u0000\u0153\u0152\u0001\u0000"+
		"\u0000\u0000\u0154\u0155\u0001\u0000\u0000\u0000\u0155\u0153\u0001\u0000"+
		"\u0000\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u0156\u0158\u0001\u0000"+
		"\u0000\u0000\u0157\u0159\u0005$\u0000\u0000\u0158\u0157\u0001\u0000\u0000"+
		"\u0000\u0158\u0159\u0001\u0000\u0000\u0000\u0159\u015b\u0001\u0000\u0000"+
		"\u0000\u015a\u015c\u0005$\u0000\u0000\u015b\u015a\u0001\u0000\u0000\u0000"+
		"\u015b\u015c\u0001\u0000\u0000\u0000\u015c\'\u0001\u0000\u0000\u0000\u015d"+
		"\u015e\u00053\u0000\u0000\u015e\u015f\u0005\u0016\u0000\u0000\u015f\u0160"+
		"\u00038\u001c\u0000\u0160)\u0001\u0000\u0000\u0000\u0161\u016c\u00054"+
		"\u0000\u0000\u0162\u0163\u0005\u001c\u0000\u0000\u0163\u0164\u00053\u0000"+
		"\u0000\u0164\u0165\u0005\u001e\u0000\u0000\u0165\u016c\u00038\u001c\u0000"+
		"\u0166\u0167\u00053\u0000\u0000\u0167\u0168\u0005\u001e\u0000\u0000\u0168"+
		"\u016c\u00038\u001c\u0000\u0169\u016c\u0003,\u0016\u0000\u016a\u016c\u0003"+
		".\u0017\u0000\u016b\u0161\u0001\u0000\u0000\u0000\u016b\u0162\u0001\u0000"+
		"\u0000\u0000\u016b\u0166\u0001\u0000\u0000\u0000\u016b\u0169\u0001\u0000"+
		"\u0000\u0000\u016b\u016a\u0001\u0000\u0000\u0000\u016c+\u0001\u0000\u0000"+
		"\u0000\u016d\u016e\u0005\u001f\u0000\u0000\u016e\u016f\u0005 \u0000\u0000"+
		"\u016f\u0170\u0005\u0015\u0000\u0000\u0170\u0171\u00053\u0000\u0000\u0171"+
		"\u0174\u0005\u001f\u0000\u0000\u0172\u0175\u00053\u0000\u0000\u0173\u0175"+
		"\u00038\u001c\u0000\u0174\u0172\u0001\u0000\u0000\u0000\u0174\u0173\u0001"+
		"\u0000\u0000\u0000\u0175\u0176\u0001\u0000\u0000\u0000\u0176\u0178\u0005"+
		" \u0000\u0000\u0177\u0179\u0005\u001d\u0000\u0000\u0178\u0177\u0001\u0000"+
		"\u0000\u0000\u0178\u0179\u0001\u0000\u0000\u0000\u0179-\u0001\u0000\u0000"+
		"\u0000\u017a\u017d\u00053\u0000\u0000\u017b\u017c\u00051\u0000\u0000\u017c"+
		"\u017e\u00053\u0000\u0000\u017d\u017b\u0001\u0000\u0000\u0000\u017d\u017e"+
		"\u0001\u0000\u0000\u0000\u017e/\u0001\u0000\u0000\u0000\u017f\u0180\u0005"+
		"%\u0000\u0000\u0180\u0184\u00053\u0000\u0000\u0181\u0183\u00032\u0019"+
		"\u0000\u0182\u0181\u0001\u0000\u0000\u0000\u0183\u0186\u0001\u0000\u0000"+
		"\u0000\u0184\u0182\u0001\u0000\u0000\u0000\u0184\u0185\u0001\u0000\u0000"+
		"\u0000\u0185\u0187\u0001\u0000\u0000\u0000\u0186\u0184\u0001\u0000\u0000"+
		"\u0000\u0187\u0188\u0005\u001a\u0000\u0000\u0188\u0189\u0005&\u0000\u0000"+
		"\u01891\u0001\u0000\u0000\u0000\u018a\u018b\u00053\u0000\u0000\u018b\u018c"+
		"\u0005\u0016\u0000\u0000\u018c\u018d\u0005#\u0000\u0000\u018d\u018e\u0003"+
		"4\u001a\u0000\u018e\u018f\u0005$\u0000\u0000\u018f3\u0001\u0000\u0000"+
		"\u0000\u0190\u0193\u00053\u0000\u0000\u0191\u0193\u00038\u001c\u0000\u0192"+
		"\u0190\u0001\u0000\u0000\u0000\u0192\u0191\u0001\u0000\u0000\u0000\u0193"+
		"5\u0001\u0000\u0000\u0000\u0194\u0197\u0005#\u0000\u0000\u0195\u0198\u0003"+
		"0\u0018\u0000\u0196\u0198\u00053\u0000\u0000\u0197\u0195\u0001\u0000\u0000"+
		"\u0000\u0197\u0196\u0001\u0000\u0000\u0000\u0198\u019e\u0001\u0000\u0000"+
		"\u0000\u0199\u019c\u0007\u0002\u0000\u0000\u019a\u019d\u00030\u0018\u0000"+
		"\u019b\u019d\u00053\u0000\u0000\u019c\u019a\u0001\u0000\u0000\u0000\u019c"+
		"\u019b\u0001\u0000\u0000\u0000\u019d\u019f\u0001\u0000\u0000\u0000\u019e"+
		"\u0199\u0001\u0000\u0000\u0000\u019f\u01a0\u0001\u0000\u0000\u0000\u01a0"+
		"\u019e\u0001\u0000\u0000\u0000\u01a0\u01a1\u0001\u0000\u0000\u0000\u01a1"+
		"\u01a2\u0001\u0000\u0000\u0000\u01a2\u01a3\u0005$\u0000\u0000\u01a37\u0001"+
		"\u0000\u0000\u0000\u01a4\u01ab\u00054\u0000\u0000\u01a5\u01ab\u00052\u0000"+
		"\u0000\u01a6\u01ab\u00056\u0000\u0000\u01a7\u01ab\u00055\u0000\u0000\u01a8"+
		"\u01ab\u0005\u0014\u0000\u0000\u01a9\u01ab\u0003:\u001d\u0000\u01aa\u01a4"+
		"\u0001\u0000\u0000\u0000\u01aa\u01a5\u0001\u0000\u0000\u0000\u01aa\u01a6"+
		"\u0001\u0000\u0000\u0000\u01aa\u01a7\u0001\u0000\u0000\u0000\u01aa\u01a8"+
		"\u0001\u0000\u0000\u0000\u01aa\u01a9\u0001\u0000\u0000\u0000\u01ab9\u0001"+
		"\u0000\u0000\u0000\u01ac\u01ad\u00053\u0000\u0000\u01ad\u01ae\u0005!\u0000"+
		"\u0000\u01ae\u01af\u00055\u0000\u0000\u01af\u01b0\u0005\"\u0000\u0000"+
		"\u01b0;\u0001\u0000\u0000\u0000\u01b1\u01b4\u0003>\u001f\u0000\u01b2\u01b4"+
		"\u0003@ \u0000\u01b3\u01b1\u0001\u0000\u0000\u0000\u01b3\u01b2\u0001\u0000"+
		"\u0000\u0000\u01b4=\u0001\u0000\u0000\u0000\u01b5\u01b9\u0005!\u0000\u0000"+
		"\u01b6\u01b8\u0003B!\u0000\u01b7\u01b6\u0001\u0000\u0000\u0000\u01b8\u01bb"+
		"\u0001\u0000\u0000\u0000\u01b9\u01b7\u0001\u0000\u0000\u0000\u01b9\u01ba"+
		"\u0001\u0000\u0000\u0000\u01ba\u01bc\u0001\u0000\u0000\u0000\u01bb\u01b9"+
		"\u0001\u0000\u0000\u0000\u01bc\u01bd\u0005\"\u0000\u0000\u01bd?\u0001"+
		"\u0000\u0000\u0000\u01be\u01c5\u0005!\u0000\u0000\u01bf\u01c1\u00038\u001c"+
		"\u0000\u01c0\u01c2\u0005\u001c\u0000\u0000\u01c1\u01c0\u0001\u0000\u0000"+
		"\u0000\u01c1\u01c2\u0001\u0000\u0000\u0000\u01c2\u01c4\u0001\u0000\u0000"+
		"\u0000\u01c3\u01bf\u0001\u0000\u0000\u0000\u01c4\u01c7\u0001\u0000\u0000"+
		"\u0000\u01c5\u01c3\u0001\u0000\u0000\u0000\u01c5\u01c6\u0001\u0000\u0000"+
		"\u0000\u01c6\u01c8\u0001\u0000\u0000\u0000\u01c7\u01c5\u0001\u0000\u0000"+
		"\u0000\u01c8\u01c9\u0005\"\u0000\u0000\u01c9A\u0001\u0000\u0000\u0000"+
		"\u01ca\u01d1\u0005#\u0000\u0000\u01cb\u01cd\u0003D\"\u0000\u01cc\u01ce"+
		"\u0005\u001c\u0000\u0000\u01cd\u01cc\u0001\u0000\u0000\u0000\u01cd\u01ce"+
		"\u0001\u0000\u0000\u0000\u01ce\u01d0\u0001\u0000\u0000\u0000\u01cf\u01cb"+
		"\u0001\u0000\u0000\u0000\u01d0\u01d3\u0001\u0000\u0000\u0000\u01d1\u01cf"+
		"\u0001\u0000\u0000\u0000\u01d1\u01d2\u0001\u0000\u0000\u0000\u01d2\u01d4"+
		"\u0001\u0000\u0000\u0000\u01d3\u01d1\u0001\u0000\u0000\u0000\u01d4\u01d6"+
		"\u0005$\u0000\u0000\u01d5\u01d7\u0005\u001c\u0000\u0000\u01d6\u01d5\u0001"+
		"\u0000\u0000\u0000\u01d6\u01d7\u0001\u0000\u0000\u0000\u01d7C\u0001\u0000"+
		"\u0000\u0000\u01d8\u01d9\u00053\u0000\u0000\u01d9\u01dc\u0005\u001e\u0000"+
		"\u0000\u01da\u01dd\u00038\u001c\u0000\u01db\u01dd\u0003<\u001e\u0000\u01dc"+
		"\u01da\u0001\u0000\u0000\u0000\u01dc\u01db\u0001\u0000\u0000\u0000\u01dd"+
		"E\u0001\u0000\u0000\u0000\u01de\u01df\u0005\u0003\u0000\u0000\u01df\u01e0"+
		"\u00051\u0000\u0000\u01e0\u01e1\u0005\u0004\u0000\u0000\u01e1\u01e5\u0005"+
		"\u001f\u0000\u0000\u01e2\u01e4\u0007\u0003\u0000\u0000\u01e3\u01e2\u0001"+
		"\u0000\u0000\u0000\u01e4\u01e7\u0001\u0000\u0000\u0000\u01e5\u01e3\u0001"+
		"\u0000\u0000\u0000\u01e5\u01e6\u0001\u0000\u0000\u0000\u01e6\u01e8\u0001"+
		"\u0000\u0000\u0000\u01e7\u01e5\u0001\u0000\u0000\u0000\u01e8\u01e9\u0005"+
		" \u0000\u0000\u01e9\u01ea\u0005\u001d\u0000\u0000\u01eaG\u0001\u0000\u0000"+
		"\u0000CKPRVZ]`dhlosy\u0082\u0085\u0089\u008f\u0098\u009d\u00a3\u00aa\u00ae"+
		"\u00b3\u00b7\u00c0\u00c6\u00ca\u00cf\u00d6\u00db\u00e1\u00e5\u00fe\u0102"+
		"\u0116\u011f\u0123\u0125\u0129\u012e\u0132\u0136\u0142\u014d\u0150\u0155"+
		"\u0158\u015b\u016b\u0174\u0178\u017d\u0184\u0192\u0197\u019c\u01a0\u01aa"+
		"\u01b3\u01b9\u01c1\u01c5\u01cd\u01d1\u01d6\u01dc\u01e5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}