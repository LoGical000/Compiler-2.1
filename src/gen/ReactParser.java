package gen;// Generated from D:/compiler/Compiler-2.1/ReactParser.g4 by ANTLR 4.13.1
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
		EXPENSES=1, CONST=2, FUNCTION=3, RETURN=4, IF=5, ELSE=6, FOR=7, WHILE=8, 
		CLASS=9, VAR=10, LET=11, EXPORT=12, DEFAULT=13, IMPORT=14, DOCUMENT=15, 
		FROM=16, WS=17, COMMENT=18, TYPE=19, DATATYPE_=20, REACT_=21, CREATE_ELEMENT=22, 
		REACTDOM=23, USE_STATE=24, USE_EFFECT=25, USE_REF=26, CONSOLE_=27, LOG_=28, 
		INPUT_=29, ONCHANGE_=30, VALUE_=31, PLACEHOLDER_=32, DISABLED_=33, ONFOCUS_=34, 
		ONCLICK_=35, HEIGHT=36, WIDTH=37, BUTTON_=38, MAP_=39, CLASS_NAME=40, 
		JSX_OPEN=41, JSX_CLOSE=42, JSX_SLASH=43, COMMA=44, OPEN_SQUARE=45, CLOSE_SQUARE=46, 
		OPEN_CURLY=47, CLOSE_CURLY=48, OPEN_PAREN=49, CLOSE_PAREN=50, COLON=51, 
		DOT=52, ARROW=53, EQUAL=54, MINUS=55, NEQUAL=56, NOT=57, OR=58, AND=59, 
		PLUS=60, PLE=61, PLPL=62, QUESTION=63, SEMI=64, DOLLAR=65, MULTI=66, S_C=67, 
		D_C=68, OPERATION=69, HTML_SYNTAX=70, NUMBER=71, STRING=72, HEX_NUMBER=73, 
		SingleLineString=74, MultiLineString=75, ID=76;
	public static final int
		RULE_program = 0, RULE_importStatment = 1, RULE_variableDeclaration = 2, 
		RULE_regularFunction = 3, RULE_callBackFunction = 4, RULE_functionbody = 5, 
		RULE_callFun = 6, RULE_returnStatment = 7, RULE_returnStatment1 = 8, RULE_syntax = 9, 
		RULE_pureReact = 10, RULE_attributes = 11, RULE_attribute = 12, RULE_attributeValue = 13, 
		RULE_print = 14, RULE_useRef = 15, RULE_useState = 16, RULE_array = 17, 
		RULE_functionCall = 18, RULE_useEffet = 19, RULE_array_content = 20, RULE_map = 21, 
		RULE_onClick = 22, RULE_html = 23, RULE_htmlBody = 24, RULE_htmlhtml = 25, 
		RULE_mapMethod = 26, RULE_export = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "importStatment", "variableDeclaration", "regularFunction", 
			"callBackFunction", "functionbody", "callFun", "returnStatment", "returnStatment1", 
			"syntax", "pureReact", "attributes", "attribute", "attributeValue", "print", 
			"useRef", "useState", "array", "functionCall", "useEffet", "array_content", 
			"map", "onClick", "html", "htmlBody", "htmlhtml", "mapMethod", "export"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'expenses'", "'const'", "'function'", "'return'", "'if'", "'else'", 
			"'for'", "'while'", "'class'", "'var'", "'let'", "'export'", "'default'", 
			"'import'", "'document'", "'from'", null, null, "'type'", null, "'React'", 
			"'createElement'", "'ReactDOM'", "'useState'", "'useEffect'", "'useRef'", 
			"'console'", "'log'", "'input'", "'onChange'", "'value'", "'placeholder'", 
			"'disabled '", "'onFocus'", "'onclick'", "'height'", "'width'", "'button'", 
			"'map'", "'className'", "'<'", "'>'", "'/'", "','", "'['", "']'", "'{'", 
			"'}'", "'('", "')'", "':'", "'.'", "'=>'", "'='", "'-'", "'!='", "'!'", 
			"'||'", "'&&'", "'+'", "'+='", "'++'", "'?'", "';'", "'$'", "'*'", "'''", 
			"'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "EXPENSES", "CONST", "FUNCTION", "RETURN", "IF", "ELSE", "FOR", 
			"WHILE", "CLASS", "VAR", "LET", "EXPORT", "DEFAULT", "IMPORT", "DOCUMENT", 
			"FROM", "WS", "COMMENT", "TYPE", "DATATYPE_", "REACT_", "CREATE_ELEMENT", 
			"REACTDOM", "USE_STATE", "USE_EFFECT", "USE_REF", "CONSOLE_", "LOG_", 
			"INPUT_", "ONCHANGE_", "VALUE_", "PLACEHOLDER_", "DISABLED_", "ONFOCUS_", 
			"ONCLICK_", "HEIGHT", "WIDTH", "BUTTON_", "MAP_", "CLASS_NAME", "JSX_OPEN", 
			"JSX_CLOSE", "JSX_SLASH", "COMMA", "OPEN_SQUARE", "CLOSE_SQUARE", "OPEN_CURLY", 
			"CLOSE_CURLY", "OPEN_PAREN", "CLOSE_PAREN", "COLON", "DOT", "ARROW", 
			"EQUAL", "MINUS", "NEQUAL", "NOT", "OR", "AND", "PLUS", "PLE", "PLPL", 
			"QUESTION", "SEMI", "DOLLAR", "MULTI", "S_C", "D_C", "OPERATION", "HTML_SYNTAX", 
			"NUMBER", "STRING", "HEX_NUMBER", "SingleLineString", "MultiLineString", 
			"ID"
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
		public List<ImportStatmentContext> importStatment() {
			return getRuleContexts(ImportStatmentContext.class);
		}
		public ImportStatmentContext importStatment(int i) {
			return getRuleContext(ImportStatmentContext.class,i);
		}
		public List<RegularFunctionContext> regularFunction() {
			return getRuleContexts(RegularFunctionContext.class);
		}
		public RegularFunctionContext regularFunction(int i) {
			return getRuleContext(RegularFunctionContext.class,i);
		}
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<ExportContext> export() {
			return getRuleContexts(ExportContext.class);
		}
		public ExportContext export(int i) {
			return getRuleContext(ExportContext.class,i);
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
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(56);
				importStatment();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3084L) != 0)) {
				{
				setState(64);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FUNCTION:
					{
					setState(62);
					regularFunction();
					}
					break;
				case CONST:
				case VAR:
				case LET:
					{
					setState(63);
					variableDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EXPORT) {
				{
				{
				setState(69);
				export();
				}
				}
				setState(74);
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
	public static class ImportStatmentContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(ReactParser.IMPORT, 0); }
		public List<TerminalNode> FROM() { return getTokens(ReactParser.FROM); }
		public TerminalNode FROM(int i) {
			return getToken(ReactParser.FROM, i);
		}
		public TerminalNode STRING() { return getToken(ReactParser.STRING, 0); }
		public TerminalNode SEMI() { return getToken(ReactParser.SEMI, 0); }
		public List<TerminalNode> USE_STATE() { return getTokens(ReactParser.USE_STATE); }
		public TerminalNode USE_STATE(int i) {
			return getToken(ReactParser.USE_STATE, i);
		}
		public List<TerminalNode> USE_REF() { return getTokens(ReactParser.USE_REF); }
		public TerminalNode USE_REF(int i) {
			return getToken(ReactParser.USE_REF, i);
		}
		public List<TerminalNode> USE_EFFECT() { return getTokens(ReactParser.USE_EFFECT); }
		public TerminalNode USE_EFFECT(int i) {
			return getToken(ReactParser.USE_EFFECT, i);
		}
		public List<TerminalNode> ID() { return getTokens(ReactParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ReactParser.ID, i);
		}
		public List<TerminalNode> REACT_() { return getTokens(ReactParser.REACT_); }
		public TerminalNode REACT_(int i) {
			return getToken(ReactParser.REACT_, i);
		}
		public List<TerminalNode> REACTDOM() { return getTokens(ReactParser.REACTDOM); }
		public TerminalNode REACTDOM(int i) {
			return getToken(ReactParser.REACTDOM, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ReactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactParser.COMMA, i);
		}
		public TerminalNode OPEN_CURLY() { return getToken(ReactParser.OPEN_CURLY, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(ReactParser.CLOSE_CURLY, 0); }
		public ImportStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterImportStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitImportStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitImportStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatmentContext importStatment() throws RecognitionException {
		ImportStatmentContext _localctx = new ImportStatmentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_importStatment);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(IMPORT);
			setState(81);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(76);
					_la = _input.LA(1);
					if ( !(((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & 36028797018964029L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(77);
					match(FROM);
					setState(78);
					match(COMMA);
					}
					} 
				}
				setState(83);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_CURLY) {
				{
				setState(84);
				match(OPEN_CURLY);
				}
			}

			setState(87);
			_la = _input.LA(1);
			if ( !(((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & 36028797018964029L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(88);
				match(COMMA);
				setState(89);
				match(ID);
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLOSE_CURLY) {
				{
				setState(95);
				match(CLOSE_CURLY);
				}
			}

			setState(98);
			match(FROM);
			setState(99);
			match(STRING);
			setState(100);
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
		public TerminalNode EQUAL() { return getToken(ReactParser.EQUAL, 0); }
		public TerminalNode VAR() { return getToken(ReactParser.VAR, 0); }
		public TerminalNode CONST() { return getToken(ReactParser.CONST, 0); }
		public TerminalNode LET() { return getToken(ReactParser.LET, 0); }
		public List<TerminalNode> ID() { return getTokens(ReactParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ReactParser.ID, i);
		}
		public List<Array_contentContext> array_content() {
			return getRuleContexts(Array_contentContext.class);
		}
		public Array_contentContext array_content(int i) {
			return getRuleContext(Array_contentContext.class,i);
		}
		public CallBackFunctionContext callBackFunction() {
			return getRuleContext(CallBackFunctionContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(ReactParser.NUMBER, 0); }
		public UseRefContext useRef() {
			return getRuleContext(UseRefContext.class,0);
		}
		public UseStateContext useState() {
			return getRuleContext(UseStateContext.class,0);
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
		enterRule(_localctx, 4, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3076L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(103);
				match(ID);
				}
				break;
			case OPEN_SQUARE:
				{
				setState(104);
				array_content();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(107);
			match(EQUAL);
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAREN:
				{
				setState(108);
				callBackFunction();
				}
				break;
			case NUMBER:
				{
				setState(109);
				match(NUMBER);
				}
				break;
			case USE_REF:
				{
				setState(110);
				useRef();
				}
				break;
			case USE_STATE:
				{
				setState(111);
				useState();
				}
				break;
			case ID:
				{
				setState(112);
				match(ID);
				}
				break;
			case OPEN_SQUARE:
				{
				setState(113);
				array_content();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(116);
				match(SEMI);
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
	public static class RegularFunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(ReactParser.FUNCTION, 0); }
		public List<TerminalNode> ID() { return getTokens(ReactParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ReactParser.ID, i);
		}
		public TerminalNode OPEN_PAREN() { return getToken(ReactParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ReactParser.CLOSE_PAREN, 0); }
		public TerminalNode OPEN_CURLY() { return getToken(ReactParser.OPEN_CURLY, 0); }
		public FunctionbodyContext functionbody() {
			return getRuleContext(FunctionbodyContext.class,0);
		}
		public TerminalNode CLOSE_CURLY() { return getToken(ReactParser.CLOSE_CURLY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ReactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactParser.COMMA, i);
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
		enterRule(_localctx, 6, RULE_regularFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(FUNCTION);
			setState(120);
			match(ID);
			setState(121);
			match(OPEN_PAREN);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(122);
				match(ID);
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(123);
					match(COMMA);
					}
				}

				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131);
			match(CLOSE_PAREN);
			setState(132);
			match(OPEN_CURLY);
			setState(133);
			functionbody();
			setState(134);
			match(CLOSE_CURLY);
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
		public TerminalNode OPEN_PAREN() { return getToken(ReactParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ReactParser.CLOSE_PAREN, 0); }
		public TerminalNode ARROW() { return getToken(ReactParser.ARROW, 0); }
		public FunctionbodyContext functionbody() {
			return getRuleContext(FunctionbodyContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(ReactParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ReactParser.ID, i);
		}
		public TerminalNode OPEN_CURLY() { return getToken(ReactParser.OPEN_CURLY, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(ReactParser.CLOSE_CURLY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ReactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactParser.COMMA, i);
		}
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
		enterRule(_localctx, 8, RULE_callBackFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(OPEN_PAREN);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(137);
				match(ID);
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(138);
					match(COMMA);
					}
				}

				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146);
			match(CLOSE_PAREN);
			setState(147);
			match(ARROW);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_CURLY) {
				{
				setState(148);
				match(OPEN_CURLY);
				}
			}

			setState(151);
			functionbody();
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(152);
				match(CLOSE_CURLY);
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
	public static class FunctionbodyContext extends ParserRuleContext {
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
		}
		public List<CallFunContext> callFun() {
			return getRuleContexts(CallFunContext.class);
		}
		public CallFunContext callFun(int i) {
			return getRuleContext(CallFunContext.class,i);
		}
		public ReturnStatmentContext returnStatment() {
			return getRuleContext(ReturnStatmentContext.class,0);
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
		enterRule(_localctx, 10, RULE_functionbody);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(158);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case CONST:
					case VAR:
					case LET:
						{
						setState(155);
						variableDeclaration();
						}
						break;
					case CONSOLE_:
						{
						setState(156);
						print();
						}
						break;
					case ID:
						{
						setState(157);
						callFun();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(162);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(163);
				returnStatment();
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
	public static class CallFunContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ReactParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ReactParser.ID, i);
		}
		public TerminalNode OPEN_PAREN() { return getToken(ReactParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ReactParser.CLOSE_PAREN, 0); }
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
		enterRule(_localctx, 12, RULE_callFun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(ID);
			setState(167);
			match(OPEN_PAREN);
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(168);
				match(ID);
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(169);
					match(COMMA);
					}
				}

				}
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(177);
			match(CLOSE_PAREN);
			setState(178);
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
	public static class ReturnStatmentContext extends ParserRuleContext {
		public ReturnStatment1Context returnStatment1() {
			return getRuleContext(ReturnStatment1Context.class,0);
		}
		public TerminalNode RETURN() { return getToken(ReactParser.RETURN, 0); }
		public PureReactContext pureReact() {
			return getRuleContext(PureReactContext.class,0);
		}
		public ReturnStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterReturnStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitReturnStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitReturnStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatmentContext returnStatment() throws RecognitionException {
		ReturnStatmentContext _localctx = new ReturnStatmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_returnStatment);
		try {
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				returnStatment1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				match(RETURN);
				setState(182);
				pureReact();
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
	public static class ReturnStatment1Context extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(ReactParser.RETURN, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ReactParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ReactParser.CLOSE_PAREN, 0); }
		public TerminalNode SEMI() { return getToken(ReactParser.SEMI, 0); }
		public HtmlContext html() {
			return getRuleContext(HtmlContext.class,0);
		}
		public ReturnStatment1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatment1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterReturnStatment1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitReturnStatment1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitReturnStatment1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatment1Context returnStatment1() throws RecognitionException {
		ReturnStatment1Context _localctx = new ReturnStatment1Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_returnStatment1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(RETURN);
			setState(186);
			match(OPEN_PAREN);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JSX_OPEN) {
				{
				setState(187);
				html();
				}
			}

			setState(190);
			match(CLOSE_PAREN);
			setState(191);
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
	public static class SyntaxContext extends ParserRuleContext {
		public List<TerminalNode> S_C() { return getTokens(ReactParser.S_C); }
		public TerminalNode S_C(int i) {
			return getToken(ReactParser.S_C, i);
		}
		public TerminalNode HTML_SYNTAX() { return getToken(ReactParser.HTML_SYNTAX, 0); }
		public SyntaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syntax; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterSyntax(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitSyntax(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitSyntax(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SyntaxContext syntax() throws RecognitionException {
		SyntaxContext _localctx = new SyntaxContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_syntax);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(S_C);
			setState(194);
			match(HTML_SYNTAX);
			setState(195);
			match(S_C);
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
	public static class PureReactContext extends ParserRuleContext {
		public TerminalNode REACT_() { return getToken(ReactParser.REACT_, 0); }
		public TerminalNode DOT() { return getToken(ReactParser.DOT, 0); }
		public TerminalNode CREATE_ELEMENT() { return getToken(ReactParser.CREATE_ELEMENT, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ReactParser.OPEN_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ReactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactParser.COMMA, i);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(ReactParser.CLOSE_PAREN, 0); }
		public TerminalNode STRING() { return getToken(ReactParser.STRING, 0); }
		public TerminalNode ID() { return getToken(ReactParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(ReactParser.SEMI, 0); }
		public List<PureReactContext> pureReact() {
			return getRuleContexts(PureReactContext.class);
		}
		public PureReactContext pureReact(int i) {
			return getRuleContext(PureReactContext.class,i);
		}
		public List<TerminalNode> SingleLineString() { return getTokens(ReactParser.SingleLineString); }
		public TerminalNode SingleLineString(int i) {
			return getToken(ReactParser.SingleLineString, i);
		}
		public PureReactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pureReact; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterPureReact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitPureReact(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitPureReact(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PureReactContext pureReact() throws RecognitionException {
		PureReactContext _localctx = new PureReactContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_pureReact);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(REACT_);
			setState(198);
			match(DOT);
			setState(199);
			match(CREATE_ELEMENT);
			setState(200);
			match(OPEN_PAREN);
			setState(201);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(202);
			match(COMMA);
			setState(203);
			attributes();
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(204);
				match(COMMA);
				}
				break;
			}
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==REACT_ || _la==SingleLineString) {
					{
					setState(209);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case REACT_:
						{
						setState(207);
						pureReact();
						}
						break;
					case SingleLineString:
						{
						setState(208);
						match(SingleLineString);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(213);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(214);
					match(COMMA);
					}
				}

				}
				break;
			}
			setState(219);
			match(CLOSE_PAREN);
			setState(220);
			_la = _input.LA(1);
			if ( !(_la==COMMA || _la==SEMI) ) {
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
	public static class AttributesContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLY() { return getToken(ReactParser.OPEN_CURLY, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(ReactParser.CLOSE_CURLY, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ReactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactParser.COMMA, i);
		}
		public AttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_attributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(OPEN_CURLY);
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(223);
				attribute();
				setState(224);
				match(COMMA);
				}
				}
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(231);
			match(CLOSE_CURLY);
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
	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ReactParser.ID, 0); }
		public TerminalNode COLON() { return getToken(ReactParser.COLON, 0); }
		public AttributeValueContext attributeValue() {
			return getRuleContext(AttributeValueContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(ID);
			setState(234);
			match(COLON);
			setState(235);
			attributeValue();
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
	public static class AttributeValueContext extends ParserRuleContext {
		public TerminalNode SingleLineString() { return getToken(ReactParser.SingleLineString, 0); }
		public TerminalNode NUMBER() { return getToken(ReactParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(ReactParser.ID, 0); }
		public AttributeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterAttributeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitAttributeValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitAttributeValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeValueContext attributeValue() throws RecognitionException {
		AttributeValueContext _localctx = new AttributeValueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_attributeValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_la = _input.LA(1);
			if ( !(((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 41L) != 0)) ) {
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
	public static class PrintContext extends ParserRuleContext {
		public TerminalNode CONSOLE_() { return getToken(ReactParser.CONSOLE_, 0); }
		public TerminalNode DOT() { return getToken(ReactParser.DOT, 0); }
		public TerminalNode LOG_() { return getToken(ReactParser.LOG_, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ReactParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ReactParser.CLOSE_PAREN, 0); }
		public TerminalNode SEMI() { return getToken(ReactParser.SEMI, 0); }
		public List<TerminalNode> ID() { return getTokens(ReactParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ReactParser.ID, i);
		}
		public List<TerminalNode> SingleLineString() { return getTokens(ReactParser.SingleLineString); }
		public TerminalNode SingleLineString(int i) {
			return getToken(ReactParser.SingleLineString, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(ReactParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ReactParser.NUMBER, i);
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
		enterRule(_localctx, 28, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(CONSOLE_);
			setState(240);
			match(DOT);
			setState(241);
			match(LOG_);
			setState(242);
			match(OPEN_PAREN);
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 41L) != 0)) {
				{
				{
				setState(243);
				_la = _input.LA(1);
				if ( !(((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 41L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(249);
			match(CLOSE_PAREN);
			setState(250);
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
		public TerminalNode USE_REF() { return getToken(ReactParser.USE_REF, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ReactParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ReactParser.CLOSE_PAREN, 0); }
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
		enterRule(_localctx, 30, RULE_useRef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(USE_REF);
			setState(253);
			match(OPEN_PAREN);
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING) {
				{
				{
				setState(254);
				match(STRING);
				}
				}
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(260);
			match(CLOSE_PAREN);
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
		public TerminalNode USE_STATE() { return getToken(ReactParser.USE_STATE, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ReactParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ReactParser.CLOSE_PAREN, 0); }
		public List<TerminalNode> ID() { return getTokens(ReactParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ReactParser.ID, i);
		}
		public TerminalNode DOT() { return getToken(ReactParser.DOT, 0); }
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
		enterRule(_localctx, 32, RULE_useState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(USE_STATE);
			setState(263);
			match(OPEN_PAREN);
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(264);
				match(ID);
				setState(265);
				match(DOT);
				setState(266);
				match(ID);
				}
				break;
			case 2:
				{
				setState(267);
				match(ID);
				}
				break;
			}
			setState(270);
			match(CLOSE_PAREN);
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
		public Array_contentContext array_content() {
			return getRuleContext(Array_contentContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(ReactParser.EQUAL, 0); }
		public UseStateContext useState() {
			return getRuleContext(UseStateContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ReactParser.SEMI, 0); }
		public TerminalNode VAR() { return getToken(ReactParser.VAR, 0); }
		public TerminalNode CONST() { return getToken(ReactParser.CONST, 0); }
		public TerminalNode LET() { return getToken(ReactParser.LET, 0); }
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
		enterRule(_localctx, 34, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3076L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(273);
			array_content();
			setState(274);
			match(EQUAL);
			setState(275);
			useState();
			setState(276);
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
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ReactParser.ID, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ReactParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ReactParser.CLOSE_PAREN, 0); }
		public TerminalNode STRING() { return getToken(ReactParser.STRING, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(ID);
			setState(279);
			match(OPEN_PAREN);
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(280);
				match(STRING);
				}
			}

			setState(283);
			match(CLOSE_PAREN);
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
	public static class UseEffetContext extends ParserRuleContext {
		public TerminalNode USE_EFFECT() { return getToken(ReactParser.USE_EFFECT, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ReactParser.OPEN_PAREN, 0); }
		public CallBackFunctionContext callBackFunction() {
			return getRuleContext(CallBackFunctionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ReactParser.COMMA, 0); }
		public Array_contentContext array_content() {
			return getRuleContext(Array_contentContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(ReactParser.CLOSE_PAREN, 0); }
		public UseEffetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useEffet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterUseEffet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitUseEffet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitUseEffet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseEffetContext useEffet() throws RecognitionException {
		UseEffetContext _localctx = new UseEffetContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_useEffet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(USE_EFFECT);
			setState(286);
			match(OPEN_PAREN);
			setState(287);
			callBackFunction();
			setState(288);
			match(COMMA);
			setState(289);
			array_content();
			setState(290);
			match(CLOSE_PAREN);
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
	public static class Array_contentContext extends ParserRuleContext {
		public TerminalNode OPEN_SQUARE() { return getToken(ReactParser.OPEN_SQUARE, 0); }
		public TerminalNode CLOSE_SQUARE() { return getToken(ReactParser.CLOSE_SQUARE, 0); }
		public List<TerminalNode> ID() { return getTokens(ReactParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ReactParser.ID, i);
		}
		public List<TerminalNode> STRING() { return getTokens(ReactParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ReactParser.STRING, i);
		}
		public List<MapContext> map() {
			return getRuleContexts(MapContext.class);
		}
		public MapContext map(int i) {
			return getRuleContext(MapContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ReactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactParser.COMMA, i);
		}
		public Array_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterArray_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitArray_content(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitArray_content(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_contentContext array_content() throws RecognitionException {
		Array_contentContext _localctx = new Array_contentContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_array_content);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(OPEN_SQUARE);
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & 570425345L) != 0)) {
				{
				{
				setState(296);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(293);
					match(ID);
					}
					break;
				case STRING:
					{
					setState(294);
					match(STRING);
					}
					break;
				case OPEN_CURLY:
					{
					setState(295);
					map();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(298);
					match(COMMA);
					}
				}

				}
				}
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(306);
			match(CLOSE_SQUARE);
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
		public List<TerminalNode> OPEN_CURLY() { return getTokens(ReactParser.OPEN_CURLY); }
		public TerminalNode OPEN_CURLY(int i) {
			return getToken(ReactParser.OPEN_CURLY, i);
		}
		public List<TerminalNode> CLOSE_CURLY() { return getTokens(ReactParser.CLOSE_CURLY); }
		public TerminalNode CLOSE_CURLY(int i) {
			return getToken(ReactParser.CLOSE_CURLY, i);
		}
		public List<TerminalNode> ID() { return getTokens(ReactParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ReactParser.ID, i);
		}
		public List<TerminalNode> COLON() { return getTokens(ReactParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(ReactParser.COLON, i);
		}
		public List<AttributeValueContext> attributeValue() {
			return getRuleContexts(AttributeValueContext.class);
		}
		public AttributeValueContext attributeValue(int i) {
			return getRuleContext(AttributeValueContext.class,i);
		}
		public List<TerminalNode> DOLLAR() { return getTokens(ReactParser.DOLLAR); }
		public TerminalNode DOLLAR(int i) {
			return getToken(ReactParser.DOLLAR, i);
		}
		public List<Array_contentContext> array_content() {
			return getRuleContexts(Array_contentContext.class);
		}
		public Array_contentContext array_content(int i) {
			return getRuleContext(Array_contentContext.class,i);
		}
		public List<TerminalNode> SingleLineString() { return getTokens(ReactParser.SingleLineString); }
		public TerminalNode SingleLineString(int i) {
			return getToken(ReactParser.SingleLineString, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ReactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactParser.COMMA, i);
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
		enterRule(_localctx, 42, RULE_map);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(OPEN_CURLY);
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(309);
				match(ID);
				setState(310);
				match(COLON);
				setState(317);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUMBER:
				case SingleLineString:
				case ID:
					{
					setState(311);
					attributeValue();
					}
					break;
				case DOLLAR:
					{
					setState(312);
					match(DOLLAR);
					setState(313);
					match(OPEN_CURLY);
					setState(314);
					_la = _input.LA(1);
					if ( !(_la==SingleLineString || _la==ID) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(315);
					match(CLOSE_CURLY);
					}
					break;
				case OPEN_SQUARE:
					{
					setState(316);
					array_content();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(319);
					match(COMMA);
					}
				}

				}
				}
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(327);
			match(CLOSE_CURLY);
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
	public static class OnClickContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLY() { return getToken(ReactParser.OPEN_CURLY, 0); }
		public CallBackFunctionContext callBackFunction() {
			return getRuleContext(CallBackFunctionContext.class,0);
		}
		public TerminalNode CLOSE_CURLY() { return getToken(ReactParser.CLOSE_CURLY, 0); }
		public OnClickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onClick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterOnClick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitOnClick(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitOnClick(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnClickContext onClick() throws RecognitionException {
		OnClickContext _localctx = new OnClickContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_onClick);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(OPEN_CURLY);
			setState(330);
			callBackFunction();
			setState(331);
			match(CLOSE_CURLY);
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
	public static class HtmlContext extends ParserRuleContext {
		public List<TerminalNode> JSX_OPEN() { return getTokens(ReactParser.JSX_OPEN); }
		public TerminalNode JSX_OPEN(int i) {
			return getToken(ReactParser.JSX_OPEN, i);
		}
		public List<TerminalNode> JSX_CLOSE() { return getTokens(ReactParser.JSX_CLOSE); }
		public TerminalNode JSX_CLOSE(int i) {
			return getToken(ReactParser.JSX_CLOSE, i);
		}
		public List<TerminalNode> HTML_SYNTAX() { return getTokens(ReactParser.HTML_SYNTAX); }
		public TerminalNode HTML_SYNTAX(int i) {
			return getToken(ReactParser.HTML_SYNTAX, i);
		}
		public List<TerminalNode> ID() { return getTokens(ReactParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ReactParser.ID, i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(ReactParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(ReactParser.EQUAL, i);
		}
		public List<TerminalNode> JSX_SLASH() { return getTokens(ReactParser.JSX_SLASH); }
		public TerminalNode JSX_SLASH(int i) {
			return getToken(ReactParser.JSX_SLASH, i);
		}
		public List<TerminalNode> CLASS_NAME() { return getTokens(ReactParser.CLASS_NAME); }
		public TerminalNode CLASS_NAME(int i) {
			return getToken(ReactParser.CLASS_NAME, i);
		}
		public List<AttributeValueContext> attributeValue() {
			return getRuleContexts(AttributeValueContext.class);
		}
		public AttributeValueContext attributeValue(int i) {
			return getRuleContext(AttributeValueContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(ReactParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ReactParser.DOT, i);
		}
		public List<OnClickContext> onClick() {
			return getRuleContexts(OnClickContext.class);
		}
		public OnClickContext onClick(int i) {
			return getRuleContext(OnClickContext.class,i);
		}
		public HtmlBodyContext htmlBody() {
			return getRuleContext(HtmlBodyContext.class,0);
		}
		public List<TerminalNode> OPEN_CURLY() { return getTokens(ReactParser.OPEN_CURLY); }
		public TerminalNode OPEN_CURLY(int i) {
			return getToken(ReactParser.OPEN_CURLY, i);
		}
		public List<TerminalNode> CLOSE_CURLY() { return getTokens(ReactParser.CLOSE_CURLY); }
		public TerminalNode CLOSE_CURLY(int i) {
			return getToken(ReactParser.CLOSE_CURLY, i);
		}
		public List<HtmlContext> html() {
			return getRuleContexts(HtmlContext.class);
		}
		public HtmlContext html(int i) {
			return getRuleContext(HtmlContext.class,i);
		}
		public HtmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterHtml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitHtml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitHtml(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContext html() throws RecognitionException {
		HtmlContext _localctx = new HtmlContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_html);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(JSX_OPEN);
			{
			setState(334);
			match(HTML_SYNTAX);
			}
			setState(336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(335);
				match(ID);
				}
				break;
			}
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS_NAME || _la==ID) {
				{
				{
				setState(338);
				_la = _input.LA(1);
				if ( !(_la==CLASS_NAME || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(339);
				match(EQUAL);
				setState(341);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(340);
					match(OPEN_CURLY);
					}
					break;
				}
				setState(348);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(343);
					attributeValue();
					}
					break;
				case 2:
					{
					setState(344);
					match(ID);
					setState(345);
					match(DOT);
					setState(346);
					match(ID);
					}
					break;
				case 3:
					{
					setState(347);
					onClick();
					}
					break;
				}
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLOSE_CURLY) {
					{
					setState(350);
					match(CLOSE_CURLY);
					}
				}

				}
				}
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JSX_SLASH) {
				{
				setState(358);
				match(JSX_SLASH);
				}
			}

			setState(361);
			match(JSX_CLOSE);
			setState(392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(386);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(362);
					htmlBody();
					}
					break;
				case 2:
					{
					setState(366);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(363);
							html();
							}
							} 
						}
						setState(368);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
					}
					}
					break;
				case 3:
					{
					setState(370);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OPEN_CURLY) {
						{
						setState(369);
						match(OPEN_CURLY);
						}
					}

					setState(381);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
					case 1:
						{
						setState(375);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==ID) {
							{
							{
							setState(372);
							match(ID);
							}
							}
							setState(377);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(378);
						match(ID);
						setState(379);
						match(DOT);
						setState(380);
						match(ID);
						}
						break;
					}
					setState(384);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==CLOSE_CURLY) {
						{
						setState(383);
						match(CLOSE_CURLY);
						}
					}

					}
					break;
				}
				{
				setState(388);
				match(JSX_OPEN);
				setState(389);
				match(JSX_SLASH);
				setState(390);
				match(HTML_SYNTAX);
				setState(391);
				match(JSX_CLOSE);
				}
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
	public static class HtmlBodyContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLY() { return getToken(ReactParser.OPEN_CURLY, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(ReactParser.CLOSE_CURLY, 0); }
		public MapMethodContext mapMethod() {
			return getRuleContext(MapMethodContext.class,0);
		}
		public HtmlhtmlContext htmlhtml() {
			return getRuleContext(HtmlhtmlContext.class,0);
		}
		public HtmlBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterHtmlBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitHtmlBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitHtmlBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlBodyContext htmlBody() throws RecognitionException {
		HtmlBodyContext _localctx = new HtmlBodyContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_htmlBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(OPEN_CURLY);
			setState(397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(395);
				mapMethod();
				}
				break;
			case 2:
				{
				setState(396);
				htmlhtml();
				}
				break;
			}
			setState(399);
			match(CLOSE_CURLY);
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
	public static class HtmlhtmlContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ReactParser.ID, 0); }
		public TerminalNode AND() { return getToken(ReactParser.AND, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ReactParser.OPEN_PAREN, 0); }
		public HtmlContext html() {
			return getRuleContext(HtmlContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(ReactParser.CLOSE_PAREN, 0); }
		public HtmlhtmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlhtml; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterHtmlhtml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitHtmlhtml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitHtmlhtml(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlhtmlContext htmlhtml() throws RecognitionException {
		HtmlhtmlContext _localctx = new HtmlhtmlContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_htmlhtml);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(ID);
			setState(402);
			match(AND);
			setState(403);
			match(OPEN_PAREN);
			setState(404);
			html();
			setState(405);
			match(CLOSE_PAREN);
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
	public static class MapMethodContext extends ParserRuleContext {
		public TerminalNode MAP_() { return getToken(ReactParser.MAP_, 0); }
		public List<TerminalNode> OPEN_PAREN() { return getTokens(ReactParser.OPEN_PAREN); }
		public TerminalNode OPEN_PAREN(int i) {
			return getToken(ReactParser.OPEN_PAREN, i);
		}
		public List<TerminalNode> CLOSE_PAREN() { return getTokens(ReactParser.CLOSE_PAREN); }
		public TerminalNode CLOSE_PAREN(int i) {
			return getToken(ReactParser.CLOSE_PAREN, i);
		}
		public TerminalNode ARROW() { return getToken(ReactParser.ARROW, 0); }
		public HtmlContext html() {
			return getRuleContext(HtmlContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(ReactParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ReactParser.ID, i);
		}
		public List<TerminalNode> DOT() { return getTokens(ReactParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ReactParser.DOT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ReactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactParser.COMMA, i);
		}
		public MapMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterMapMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitMapMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitMapMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapMethodContext mapMethod() throws RecognitionException {
		MapMethodContext _localctx = new MapMethodContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_mapMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(407);
				match(ID);
				setState(408);
				match(DOT);
				}
				}
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(414);
			match(MAP_);
			setState(415);
			match(OPEN_PAREN);
			setState(416);
			match(OPEN_PAREN);
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(417);
				match(ID);
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(418);
					match(COMMA);
					}
				}

				}
				}
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(426);
			match(CLOSE_PAREN);
			setState(427);
			match(ARROW);
			setState(428);
			match(OPEN_PAREN);
			setState(429);
			html();
			setState(430);
			match(CLOSE_PAREN);
			setState(431);
			match(CLOSE_PAREN);
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
		enterRule(_localctx, 54, RULE_export);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(EXPORT);
			setState(434);
			match(DEFAULT);
			setState(435);
			match(ID);
			setState(436);
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
		"\u0004\u0001L\u01b7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0001\u0000\u0005\u0000:\b\u0000\n\u0000\f\u0000=\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000A\b\u0000\n\u0000\f\u0000D\t\u0000\u0001\u0000"+
		"\u0005\u0000G\b\u0000\n\u0000\f\u0000J\t\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001P\b\u0001\n\u0001\f\u0001S\t\u0001"+
		"\u0001\u0001\u0003\u0001V\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001[\b\u0001\n\u0001\f\u0001^\t\u0001\u0001\u0001\u0003\u0001"+
		"a\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002j\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"s\b\u0002\u0001\u0002\u0003\u0002v\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003}\b\u0003\u0005\u0003\u007f"+
		"\b\u0003\n\u0003\f\u0003\u0082\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u008c\b\u0004\u0005\u0004\u008e\b\u0004\n\u0004\f\u0004\u0091\t\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0096\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004\u009a\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005\u009f\b\u0005\n\u0005\f\u0005\u00a2\t\u0005\u0001\u0005\u0003"+
		"\u0005\u00a5\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u00ab\b\u0006\u0005\u0006\u00ad\b\u0006\n\u0006\f\u0006\u00b0\t"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u00b8\b\u0007\u0001\b\u0001\b\u0001\b\u0003\b\u00bd"+
		"\b\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00ce\b\n\u0001"+
		"\n\u0001\n\u0005\n\u00d2\b\n\n\n\f\n\u00d5\t\n\u0001\n\u0003\n\u00d8\b"+
		"\n\u0003\n\u00da\b\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0005\u000b\u00e3\b\u000b\n\u000b\f\u000b\u00e6\t\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u00f5\b\u000e\n\u000e\f\u000e\u00f8\t\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0100\b\u000f\n"+
		"\u000f\f\u000f\u0103\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u010d"+
		"\b\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u011a\b\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0129\b\u0014\u0001\u0014\u0003"+
		"\u0014\u012c\b\u0014\u0005\u0014\u012e\b\u0014\n\u0014\f\u0014\u0131\t"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u013e\b\u0015\u0001\u0015\u0003\u0015\u0141\b\u0015\u0005\u0015"+
		"\u0143\b\u0015\n\u0015\f\u0015\u0146\t\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0003\u0017\u0151\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u0156\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0003\u0017\u015d\b\u0017\u0001\u0017\u0003\u0017\u0160\b\u0017"+
		"\u0005\u0017\u0162\b\u0017\n\u0017\f\u0017\u0165\t\u0017\u0001\u0017\u0003"+
		"\u0017\u0168\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u016d"+
		"\b\u0017\n\u0017\f\u0017\u0170\t\u0017\u0001\u0017\u0003\u0017\u0173\b"+
		"\u0017\u0001\u0017\u0005\u0017\u0176\b\u0017\n\u0017\f\u0017\u0179\t\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u017e\b\u0017\u0001\u0017"+
		"\u0003\u0017\u0181\b\u0017\u0003\u0017\u0183\b\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0189\b\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0003\u0018\u018e\b\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0005\u001a\u019a\b\u001a\n\u001a\f\u001a\u019d\t\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a"+
		"\u01a4\b\u001a\u0005\u001a\u01a6\b\u001a\n\u001a\f\u001a\u01a9\t\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0000\u0000\u001c\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.0246\u0000\u0007\u0003"+
		"\u0000\u0015\u0015\u0017\u001aLL\u0002\u0000\u0002\u0002\n\u000b\u0002"+
		"\u0000HHLL\u0002\u0000,,@@\u0003\u0000GGJJLL\u0002\u0000JJLL\u0002\u0000"+
		"((LL\u01dc\u0000;\u0001\u0000\u0000\u0000\u0002K\u0001\u0000\u0000\u0000"+
		"\u0004f\u0001\u0000\u0000\u0000\u0006w\u0001\u0000\u0000\u0000\b\u0088"+
		"\u0001\u0000\u0000\u0000\n\u00a0\u0001\u0000\u0000\u0000\f\u00a6\u0001"+
		"\u0000\u0000\u0000\u000e\u00b7\u0001\u0000\u0000\u0000\u0010\u00b9\u0001"+
		"\u0000\u0000\u0000\u0012\u00c1\u0001\u0000\u0000\u0000\u0014\u00c5\u0001"+
		"\u0000\u0000\u0000\u0016\u00de\u0001\u0000\u0000\u0000\u0018\u00e9\u0001"+
		"\u0000\u0000\u0000\u001a\u00ed\u0001\u0000\u0000\u0000\u001c\u00ef\u0001"+
		"\u0000\u0000\u0000\u001e\u00fc\u0001\u0000\u0000\u0000 \u0106\u0001\u0000"+
		"\u0000\u0000\"\u0110\u0001\u0000\u0000\u0000$\u0116\u0001\u0000\u0000"+
		"\u0000&\u011d\u0001\u0000\u0000\u0000(\u0124\u0001\u0000\u0000\u0000*"+
		"\u0134\u0001\u0000\u0000\u0000,\u0149\u0001\u0000\u0000\u0000.\u014d\u0001"+
		"\u0000\u0000\u00000\u018a\u0001\u0000\u0000\u00002\u0191\u0001\u0000\u0000"+
		"\u00004\u019b\u0001\u0000\u0000\u00006\u01b1\u0001\u0000\u0000\u00008"+
		":\u0003\u0002\u0001\u000098\u0001\u0000\u0000\u0000:=\u0001\u0000\u0000"+
		"\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<B\u0001\u0000"+
		"\u0000\u0000=;\u0001\u0000\u0000\u0000>A\u0003\u0006\u0003\u0000?A\u0003"+
		"\u0004\u0002\u0000@>\u0001\u0000\u0000\u0000@?\u0001\u0000\u0000\u0000"+
		"AD\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000"+
		"\u0000CH\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000EG\u00036\u001b"+
		"\u0000FE\u0001\u0000\u0000\u0000GJ\u0001\u0000\u0000\u0000HF\u0001\u0000"+
		"\u0000\u0000HI\u0001\u0000\u0000\u0000I\u0001\u0001\u0000\u0000\u0000"+
		"JH\u0001\u0000\u0000\u0000KQ\u0005\u000e\u0000\u0000LM\u0007\u0000\u0000"+
		"\u0000MN\u0005\u0010\u0000\u0000NP\u0005,\u0000\u0000OL\u0001\u0000\u0000"+
		"\u0000PS\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000QR\u0001\u0000"+
		"\u0000\u0000RU\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000TV\u0005"+
		"/\u0000\u0000UT\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VW\u0001"+
		"\u0000\u0000\u0000W\\\u0007\u0000\u0000\u0000XY\u0005,\u0000\u0000Y[\u0005"+
		"L\u0000\u0000ZX\u0001\u0000\u0000\u0000[^\u0001\u0000\u0000\u0000\\Z\u0001"+
		"\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]`\u0001\u0000\u0000\u0000"+
		"^\\\u0001\u0000\u0000\u0000_a\u00050\u0000\u0000`_\u0001\u0000\u0000\u0000"+
		"`a\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u0005\u0010\u0000"+
		"\u0000cd\u0005H\u0000\u0000de\u0005@\u0000\u0000e\u0003\u0001\u0000\u0000"+
		"\u0000fi\u0007\u0001\u0000\u0000gj\u0005L\u0000\u0000hj\u0003(\u0014\u0000"+
		"ig\u0001\u0000\u0000\u0000ih\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000"+
		"\u0000kr\u00056\u0000\u0000ls\u0003\b\u0004\u0000ms\u0005G\u0000\u0000"+
		"ns\u0003\u001e\u000f\u0000os\u0003 \u0010\u0000ps\u0005L\u0000\u0000q"+
		"s\u0003(\u0014\u0000rl\u0001\u0000\u0000\u0000rm\u0001\u0000\u0000\u0000"+
		"rn\u0001\u0000\u0000\u0000ro\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000"+
		"\u0000rq\u0001\u0000\u0000\u0000su\u0001\u0000\u0000\u0000tv\u0005@\u0000"+
		"\u0000ut\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000v\u0005\u0001"+
		"\u0000\u0000\u0000wx\u0005\u0003\u0000\u0000xy\u0005L\u0000\u0000y\u0080"+
		"\u00051\u0000\u0000z|\u0005L\u0000\u0000{}\u0005,\u0000\u0000|{\u0001"+
		"\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}\u007f\u0001\u0000\u0000"+
		"\u0000~z\u0001\u0000\u0000\u0000\u007f\u0082\u0001\u0000\u0000\u0000\u0080"+
		"~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0083"+
		"\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u00052\u0000\u0000\u0084\u0085\u0005/\u0000\u0000\u0085\u0086\u0003\n"+
		"\u0005\u0000\u0086\u0087\u00050\u0000\u0000\u0087\u0007\u0001\u0000\u0000"+
		"\u0000\u0088\u008f\u00051\u0000\u0000\u0089\u008b\u0005L\u0000\u0000\u008a"+
		"\u008c\u0005,\u0000\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008b\u008c"+
		"\u0001\u0000\u0000\u0000\u008c\u008e\u0001\u0000\u0000\u0000\u008d\u0089"+
		"\u0001\u0000\u0000\u0000\u008e\u0091\u0001\u0000\u0000\u0000\u008f\u008d"+
		"\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0092"+
		"\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0092\u0093"+
		"\u00052\u0000\u0000\u0093\u0095\u00055\u0000\u0000\u0094\u0096\u0005/"+
		"\u0000\u0000\u0095\u0094\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000"+
		"\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0099\u0003\n\u0005"+
		"\u0000\u0098\u009a\u00050\u0000\u0000\u0099\u0098\u0001\u0000\u0000\u0000"+
		"\u0099\u009a\u0001\u0000\u0000\u0000\u009a\t\u0001\u0000\u0000\u0000\u009b"+
		"\u009f\u0003\u0004\u0002\u0000\u009c\u009f\u0003\u001c\u000e\u0000\u009d"+
		"\u009f\u0003\f\u0006\u0000\u009e\u009b\u0001\u0000\u0000\u0000\u009e\u009c"+
		"\u0001\u0000\u0000\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009f\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a4\u0001\u0000\u0000\u0000\u00a2\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a5\u0003\u000e\u0007\u0000\u00a4\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u000b"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005L\u0000\u0000\u00a7\u00ae\u0005"+
		"1\u0000\u0000\u00a8\u00aa\u0005L\u0000\u0000\u00a9\u00ab\u0005,\u0000"+
		"\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000"+
		"\u0000\u00ab\u00ad\u0001\u0000\u0000\u0000\u00ac\u00a8\u0001\u0000\u0000"+
		"\u0000\u00ad\u00b0\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000"+
		"\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b1\u00b2\u00052\u0000\u0000"+
		"\u00b2\u00b3\u0005@\u0000\u0000\u00b3\r\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b8\u0003\u0010\b\u0000\u00b5\u00b6\u0005\u0004\u0000\u0000\u00b6\u00b8"+
		"\u0003\u0014\n\u0000\u00b7\u00b4\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001"+
		"\u0000\u0000\u0000\u00b8\u000f\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005"+
		"\u0004\u0000\u0000\u00ba\u00bc\u00051\u0000\u0000\u00bb\u00bd\u0003.\u0017"+
		"\u0000\u00bc\u00bb\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000"+
		"\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00bf\u00052\u0000\u0000"+
		"\u00bf\u00c0\u0005@\u0000\u0000\u00c0\u0011\u0001\u0000\u0000\u0000\u00c1"+
		"\u00c2\u0005C\u0000\u0000\u00c2\u00c3\u0005F\u0000\u0000\u00c3\u00c4\u0005"+
		"C\u0000\u0000\u00c4\u0013\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005\u0015"+
		"\u0000\u0000\u00c6\u00c7\u00054\u0000\u0000\u00c7\u00c8\u0005\u0016\u0000"+
		"\u0000\u00c8\u00c9\u00051\u0000\u0000\u00c9\u00ca\u0007\u0002\u0000\u0000"+
		"\u00ca\u00cb\u0005,\u0000\u0000\u00cb\u00cd\u0003\u0016\u000b\u0000\u00cc"+
		"\u00ce\u0005,\u0000\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00cd\u00ce"+
		"\u0001\u0000\u0000\u0000\u00ce\u00d9\u0001\u0000\u0000\u0000\u00cf\u00d2"+
		"\u0003\u0014\n\u0000\u00d0\u00d2\u0005J\u0000\u0000\u00d1\u00cf\u0001"+
		"\u0000\u0000\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d7\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d8\u0005,\u0000\u0000\u00d7\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00da\u0001\u0000"+
		"\u0000\u0000\u00d9\u00d3\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000"+
		"\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00dc\u00052\u0000"+
		"\u0000\u00dc\u00dd\u0007\u0003\u0000\u0000\u00dd\u0015\u0001\u0000\u0000"+
		"\u0000\u00de\u00e4\u0005/\u0000\u0000\u00df\u00e0\u0003\u0018\f\u0000"+
		"\u00e0\u00e1\u0005,\u0000\u0000\u00e1\u00e3\u0001\u0000\u0000\u0000\u00e2"+
		"\u00df\u0001\u0000\u0000\u0000\u00e3\u00e6\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5"+
		"\u00e7\u0001\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e7"+
		"\u00e8\u00050\u0000\u0000\u00e8\u0017\u0001\u0000\u0000\u0000\u00e9\u00ea"+
		"\u0005L\u0000\u0000\u00ea\u00eb\u00053\u0000\u0000\u00eb\u00ec\u0003\u001a"+
		"\r\u0000\u00ec\u0019\u0001\u0000\u0000\u0000\u00ed\u00ee\u0007\u0004\u0000"+
		"\u0000\u00ee\u001b\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005\u001b\u0000"+
		"\u0000\u00f0\u00f1\u00054\u0000\u0000\u00f1\u00f2\u0005\u001c\u0000\u0000"+
		"\u00f2\u00f6\u00051\u0000\u0000\u00f3\u00f5\u0007\u0004\u0000\u0000\u00f4"+
		"\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f8\u0001\u0000\u0000\u0000\u00f6"+
		"\u00f4\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7"+
		"\u00f9\u0001\u0000\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f9"+
		"\u00fa\u00052\u0000\u0000\u00fa\u00fb\u0005@\u0000\u0000\u00fb\u001d\u0001"+
		"\u0000\u0000\u0000\u00fc\u00fd\u0005\u001a\u0000\u0000\u00fd\u0101\u0005"+
		"1\u0000\u0000\u00fe\u0100\u0005H\u0000\u0000\u00ff\u00fe\u0001\u0000\u0000"+
		"\u0000\u0100\u0103\u0001\u0000\u0000\u0000\u0101\u00ff\u0001\u0000\u0000"+
		"\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102\u0104\u0001\u0000\u0000"+
		"\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0104\u0105\u00052\u0000\u0000"+
		"\u0105\u001f\u0001\u0000\u0000\u0000\u0106\u0107\u0005\u0018\u0000\u0000"+
		"\u0107\u010c\u00051\u0000\u0000\u0108\u0109\u0005L\u0000\u0000\u0109\u010a"+
		"\u00054\u0000\u0000\u010a\u010d\u0005L\u0000\u0000\u010b\u010d\u0005L"+
		"\u0000\u0000\u010c\u0108\u0001\u0000\u0000\u0000\u010c\u010b\u0001\u0000"+
		"\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010e\u010f\u00052\u0000"+
		"\u0000\u010f!\u0001\u0000\u0000\u0000\u0110\u0111\u0007\u0001\u0000\u0000"+
		"\u0111\u0112\u0003(\u0014\u0000\u0112\u0113\u00056\u0000\u0000\u0113\u0114"+
		"\u0003 \u0010\u0000\u0114\u0115\u0005@\u0000\u0000\u0115#\u0001\u0000"+
		"\u0000\u0000\u0116\u0117\u0005L\u0000\u0000\u0117\u0119\u00051\u0000\u0000"+
		"\u0118\u011a\u0005H\u0000\u0000\u0119\u0118\u0001\u0000\u0000\u0000\u0119"+
		"\u011a\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b"+
		"\u011c\u00052\u0000\u0000\u011c%\u0001\u0000\u0000\u0000\u011d\u011e\u0005"+
		"\u0019\u0000\u0000\u011e\u011f\u00051\u0000\u0000\u011f\u0120\u0003\b"+
		"\u0004\u0000\u0120\u0121\u0005,\u0000\u0000\u0121\u0122\u0003(\u0014\u0000"+
		"\u0122\u0123\u00052\u0000\u0000\u0123\'\u0001\u0000\u0000\u0000\u0124"+
		"\u012f\u0005-\u0000\u0000\u0125\u0129\u0005L\u0000\u0000\u0126\u0129\u0005"+
		"H\u0000\u0000\u0127\u0129\u0003*\u0015\u0000\u0128\u0125\u0001\u0000\u0000"+
		"\u0000\u0128\u0126\u0001\u0000\u0000\u0000\u0128\u0127\u0001\u0000\u0000"+
		"\u0000\u0129\u012b\u0001\u0000\u0000\u0000\u012a\u012c\u0005,\u0000\u0000"+
		"\u012b\u012a\u0001\u0000\u0000\u0000\u012b\u012c\u0001\u0000\u0000\u0000"+
		"\u012c\u012e\u0001\u0000\u0000\u0000\u012d\u0128\u0001\u0000\u0000\u0000"+
		"\u012e\u0131\u0001\u0000\u0000\u0000\u012f\u012d\u0001\u0000\u0000\u0000"+
		"\u012f\u0130\u0001\u0000\u0000\u0000\u0130\u0132\u0001\u0000\u0000\u0000"+
		"\u0131\u012f\u0001\u0000\u0000\u0000\u0132\u0133\u0005.\u0000\u0000\u0133"+
		")\u0001\u0000\u0000\u0000\u0134\u0144\u0005/\u0000\u0000\u0135\u0136\u0005"+
		"L\u0000\u0000\u0136\u013d\u00053\u0000\u0000\u0137\u013e\u0003\u001a\r"+
		"\u0000\u0138\u0139\u0005A\u0000\u0000\u0139\u013a\u0005/\u0000\u0000\u013a"+
		"\u013b\u0007\u0005\u0000\u0000\u013b\u013e\u00050\u0000\u0000\u013c\u013e"+
		"\u0003(\u0014\u0000\u013d\u0137\u0001\u0000\u0000\u0000\u013d\u0138\u0001"+
		"\u0000\u0000\u0000\u013d\u013c\u0001\u0000\u0000\u0000\u013e\u0140\u0001"+
		"\u0000\u0000\u0000\u013f\u0141\u0005,\u0000\u0000\u0140\u013f\u0001\u0000"+
		"\u0000\u0000\u0140\u0141\u0001\u0000\u0000\u0000\u0141\u0143\u0001\u0000"+
		"\u0000\u0000\u0142\u0135\u0001\u0000\u0000\u0000\u0143\u0146\u0001\u0000"+
		"\u0000\u0000\u0144\u0142\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000"+
		"\u0000\u0000\u0145\u0147\u0001\u0000\u0000\u0000\u0146\u0144\u0001\u0000"+
		"\u0000\u0000\u0147\u0148\u00050\u0000\u0000\u0148+\u0001\u0000\u0000\u0000"+
		"\u0149\u014a\u0005/\u0000\u0000\u014a\u014b\u0003\b\u0004\u0000\u014b"+
		"\u014c\u00050\u0000\u0000\u014c-\u0001\u0000\u0000\u0000\u014d\u014e\u0005"+
		")\u0000\u0000\u014e\u0150\u0005F\u0000\u0000\u014f\u0151\u0005L\u0000"+
		"\u0000\u0150\u014f\u0001\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000"+
		"\u0000\u0151\u0163\u0001\u0000\u0000\u0000\u0152\u0153\u0007\u0006\u0000"+
		"\u0000\u0153\u0155\u00056\u0000\u0000\u0154\u0156\u0005/\u0000\u0000\u0155"+
		"\u0154\u0001\u0000\u0000\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u0156"+
		"\u015c\u0001\u0000\u0000\u0000\u0157\u015d\u0003\u001a\r\u0000\u0158\u0159"+
		"\u0005L\u0000\u0000\u0159\u015a\u00054\u0000\u0000\u015a\u015d\u0005L"+
		"\u0000\u0000\u015b\u015d\u0003,\u0016\u0000\u015c\u0157\u0001\u0000\u0000"+
		"\u0000\u015c\u0158\u0001\u0000\u0000\u0000\u015c\u015b\u0001\u0000\u0000"+
		"\u0000\u015d\u015f\u0001\u0000\u0000\u0000\u015e\u0160\u00050\u0000\u0000"+
		"\u015f\u015e\u0001\u0000\u0000\u0000\u015f\u0160\u0001\u0000\u0000\u0000"+
		"\u0160\u0162\u0001\u0000\u0000\u0000\u0161\u0152\u0001\u0000\u0000\u0000"+
		"\u0162\u0165\u0001\u0000\u0000\u0000\u0163\u0161\u0001\u0000\u0000\u0000"+
		"\u0163\u0164\u0001\u0000\u0000\u0000\u0164\u0167\u0001\u0000\u0000\u0000"+
		"\u0165\u0163\u0001\u0000\u0000\u0000\u0166\u0168\u0005+\u0000\u0000\u0167"+
		"\u0166\u0001\u0000\u0000\u0000\u0167\u0168\u0001\u0000\u0000\u0000\u0168"+
		"\u0169\u0001\u0000\u0000\u0000\u0169\u0188\u0005*\u0000\u0000\u016a\u0183"+
		"\u00030\u0018\u0000\u016b\u016d\u0003.\u0017\u0000\u016c\u016b\u0001\u0000"+
		"\u0000\u0000\u016d\u0170\u0001\u0000\u0000\u0000\u016e\u016c\u0001\u0000"+
		"\u0000\u0000\u016e\u016f\u0001\u0000\u0000\u0000\u016f\u0183\u0001\u0000"+
		"\u0000\u0000\u0170\u016e\u0001\u0000\u0000\u0000\u0171\u0173\u0005/\u0000"+
		"\u0000\u0172\u0171\u0001\u0000\u0000\u0000\u0172\u0173\u0001\u0000\u0000"+
		"\u0000\u0173\u017d\u0001\u0000\u0000\u0000\u0174\u0176\u0005L\u0000\u0000"+
		"\u0175\u0174\u0001\u0000\u0000\u0000\u0176\u0179\u0001\u0000\u0000\u0000"+
		"\u0177\u0175\u0001\u0000\u0000\u0000\u0177\u0178\u0001\u0000\u0000\u0000"+
		"\u0178\u017e\u0001\u0000\u0000\u0000\u0179\u0177\u0001\u0000\u0000\u0000"+
		"\u017a\u017b\u0005L\u0000\u0000\u017b\u017c\u00054\u0000\u0000\u017c\u017e"+
		"\u0005L\u0000\u0000\u017d\u0177\u0001\u0000\u0000\u0000\u017d\u017a\u0001"+
		"\u0000\u0000\u0000\u017e\u0180\u0001\u0000\u0000\u0000\u017f\u0181\u0005"+
		"0\u0000\u0000\u0180\u017f\u0001\u0000\u0000\u0000\u0180\u0181\u0001\u0000"+
		"\u0000\u0000\u0181\u0183\u0001\u0000\u0000\u0000\u0182\u016a\u0001\u0000"+
		"\u0000\u0000\u0182\u016e\u0001\u0000\u0000\u0000\u0182\u0172\u0001\u0000"+
		"\u0000\u0000\u0183\u0184\u0001\u0000\u0000\u0000\u0184\u0185\u0005)\u0000"+
		"\u0000\u0185\u0186\u0005+\u0000\u0000\u0186\u0187\u0005F\u0000\u0000\u0187"+
		"\u0189\u0005*\u0000\u0000\u0188\u0182\u0001\u0000\u0000\u0000\u0188\u0189"+
		"\u0001\u0000\u0000\u0000\u0189/\u0001\u0000\u0000\u0000\u018a\u018d\u0005"+
		"/\u0000\u0000\u018b\u018e\u00034\u001a\u0000\u018c\u018e\u00032\u0019"+
		"\u0000\u018d\u018b\u0001\u0000\u0000\u0000\u018d\u018c\u0001\u0000\u0000"+
		"\u0000\u018e\u018f\u0001\u0000\u0000\u0000\u018f\u0190\u00050\u0000\u0000"+
		"\u01901\u0001\u0000\u0000\u0000\u0191\u0192\u0005L\u0000\u0000\u0192\u0193"+
		"\u0005;\u0000\u0000\u0193\u0194\u00051\u0000\u0000\u0194\u0195\u0003."+
		"\u0017\u0000\u0195\u0196\u00052\u0000\u0000\u01963\u0001\u0000\u0000\u0000"+
		"\u0197\u0198\u0005L\u0000\u0000\u0198\u019a\u00054\u0000\u0000\u0199\u0197"+
		"\u0001\u0000\u0000\u0000\u019a\u019d\u0001\u0000\u0000\u0000\u019b\u0199"+
		"\u0001\u0000\u0000\u0000\u019b\u019c\u0001\u0000\u0000\u0000\u019c\u019e"+
		"\u0001\u0000\u0000\u0000\u019d\u019b\u0001\u0000\u0000\u0000\u019e\u019f"+
		"\u0005\'\u0000\u0000\u019f\u01a0\u00051\u0000\u0000\u01a0\u01a7\u0005"+
		"1\u0000\u0000\u01a1\u01a3\u0005L\u0000\u0000\u01a2\u01a4\u0005,\u0000"+
		"\u0000\u01a3\u01a2\u0001\u0000\u0000\u0000\u01a3\u01a4\u0001\u0000\u0000"+
		"\u0000\u01a4\u01a6\u0001\u0000\u0000\u0000\u01a5\u01a1\u0001\u0000\u0000"+
		"\u0000\u01a6\u01a9\u0001\u0000\u0000\u0000\u01a7\u01a5\u0001\u0000\u0000"+
		"\u0000\u01a7\u01a8\u0001\u0000\u0000\u0000\u01a8\u01aa\u0001\u0000\u0000"+
		"\u0000\u01a9\u01a7\u0001\u0000\u0000\u0000\u01aa\u01ab\u00052\u0000\u0000"+
		"\u01ab\u01ac\u00055\u0000\u0000\u01ac\u01ad\u00051\u0000\u0000\u01ad\u01ae"+
		"\u0003.\u0017\u0000\u01ae\u01af\u00052\u0000\u0000\u01af\u01b0\u00052"+
		"\u0000\u0000\u01b05\u0001\u0000\u0000\u0000\u01b1\u01b2\u0005\f\u0000"+
		"\u0000\u01b2\u01b3\u0005\r\u0000\u0000\u01b3\u01b4\u0005L\u0000\u0000"+
		"\u01b4\u01b5\u0005@\u0000\u0000\u01b57\u0001\u0000\u0000\u00009;@BHQU"+
		"\\`iru|\u0080\u008b\u008f\u0095\u0099\u009e\u00a0\u00a4\u00aa\u00ae\u00b7"+
		"\u00bc\u00cd\u00d1\u00d3\u00d7\u00d9\u00e4\u00f6\u0101\u010c\u0119\u0128"+
		"\u012b\u012f\u013d\u0140\u0144\u0150\u0155\u015c\u015f\u0163\u0167\u016e"+
		"\u0172\u0177\u017d\u0180\u0182\u0188\u018d\u019b\u01a3\u01a7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}