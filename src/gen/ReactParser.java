// Generated from C:/Users/Omar/Desktop/anas/Compiler 2.1/ReactParser.g4 by ANTLR 4.13.1
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
		FROM=16, WS=17, COMMENT=18, TYPE=19, DATATYPE_=20, REACT_=21, CREATEELEMENT=22, 
		REACTDOM=23, USE_STATE=24, USE_EFFECT=25, USE_REF=26, CONSOLE_=27, LOG_=28, 
		INPUT_=29, ONCHANGE_=30, VALUE_=31, PLACEHOLDER_=32, DISABLED_=33, ONFOCUS_=34, 
		ONCLICK_=35, HEIGHT=36, WIDTH=37, BUTTON_=38, MAP_=39, CLASS_NAME=40, 
		JSX_OPEN=41, JSX_CLOSE=42, JSX_SLASH=43, COMMA=44, OPEN_SQUARE=45, CLOSE_SQUARE=46, 
		OPEN_CURLY=47, CLOSE_CURLY=48, OPEN_PAREN=49, CLOSE_PAREN=50, COLON=51, 
		DOT=52, ARROW=53, EQUAL=54, MINUS=55, NEQUAL=56, NOT=57, OR=58, AND=59, 
		PLUS=60, PLE=61, PLPL=62, QUESTION=63, SEMI=64, DOLLAR=65, MULTI=66, S_C=67, 
		D_C=68, OPERATION=69, SYNTAX=70, NUMBER=71, STRING=72, HEX_NUMBER=73, 
		SingleLineString=74, MultiLineString=75, ID=76;
	public static final int
		RULE_app = 0, RULE_export = 1, RULE_importR = 2, RULE_variableDiclaration = 3, 
		RULE_html = 4, RULE_print = 5, RULE_function1 = 6, RULE_function2 = 7, 
		RULE_functionbody = 8, RULE_callFun = 9, RULE_returnStatment = 10, RULE_returnStatment1 = 11, 
		RULE_syntax = 12, RULE_pureReact = 13, RULE_attributes = 14, RULE_attribute = 15, 
		RULE_attributeValue = 16, RULE_useRef = 17, RULE_useState = 18, RULE_array = 19, 
		RULE_functionCall = 20, RULE_useEffet = 21, RULE_arrayy = 22, RULE_map = 23, 
		RULE_onClick = 24, RULE_htmlBody = 25, RULE_hh = 26, RULE_mapMethod = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"app", "export", "importR", "variableDiclaration", "html", "print", "function1", 
			"function2", "functionbody", "callFun", "returnStatment", "returnStatment1", 
			"syntax", "pureReact", "attributes", "attribute", "attributeValue", "useRef", 
			"useState", "array", "functionCall", "useEffet", "arrayy", "map", "onClick", 
			"htmlBody", "hh", "mapMethod"
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
			"FROM", "WS", "COMMENT", "TYPE", "DATATYPE_", "REACT_", "CREATEELEMENT", 
			"REACTDOM", "USE_STATE", "USE_EFFECT", "USE_REF", "CONSOLE_", "LOG_", 
			"INPUT_", "ONCHANGE_", "VALUE_", "PLACEHOLDER_", "DISABLED_", "ONFOCUS_", 
			"ONCLICK_", "HEIGHT", "WIDTH", "BUTTON_", "MAP_", "CLASS_NAME", "JSX_OPEN", 
			"JSX_CLOSE", "JSX_SLASH", "COMMA", "OPEN_SQUARE", "CLOSE_SQUARE", "OPEN_CURLY", 
			"CLOSE_CURLY", "OPEN_PAREN", "CLOSE_PAREN", "COLON", "DOT", "ARROW", 
			"EQUAL", "MINUS", "NEQUAL", "NOT", "OR", "AND", "PLUS", "PLE", "PLPL", 
			"QUESTION", "SEMI", "DOLLAR", "MULTI", "S_C", "D_C", "OPERATION", "SYNTAX", 
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
	public static class AppContext extends ParserRuleContext {
		public List<ExportContext> export() {
			return getRuleContexts(ExportContext.class);
		}
		public ExportContext export(int i) {
			return getRuleContext(ExportContext.class,i);
		}
		public List<ImportRContext> importR() {
			return getRuleContexts(ImportRContext.class);
		}
		public ImportRContext importR(int i) {
			return getRuleContext(ImportRContext.class,i);
		}
		public List<Function1Context> function1() {
			return getRuleContexts(Function1Context.class);
		}
		public Function1Context function1(int i) {
			return getRuleContext(Function1Context.class,i);
		}
		public List<VariableDiclarationContext> variableDiclaration() {
			return getRuleContexts(VariableDiclarationContext.class);
		}
		public VariableDiclarationContext variableDiclaration(int i) {
			return getRuleContext(VariableDiclarationContext.class,i);
		}
		public AppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_app; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterApp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitApp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitApp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppContext app() throws RecognitionException {
		AppContext _localctx = new AppContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_app);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IMPORT) {
					{
					{
					setState(56);
					importR();
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
						function1();
						}
						break;
					case CONST:
					case VAR:
					case LET:
						{
						setState(63);
						variableDiclaration();
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
				setState(69);
				export();
				}
				}
				setState(72); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 23564L) != 0) );
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
		enterRule(_localctx, 2, RULE_export);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(EXPORT);
			setState(75);
			match(DEFAULT);
			setState(76);
			match(ID);
			setState(77);
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
	public static class ImportRContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(ReactParser.IMPORT, 0); }
		public TerminalNode FROM() { return getToken(ReactParser.FROM, 0); }
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
		public List<TerminalNode> COMMA() { return getTokens(ReactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactParser.COMMA, i);
		}
		public TerminalNode OPEN_CURLY() { return getToken(ReactParser.OPEN_CURLY, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(ReactParser.CLOSE_CURLY, 0); }
		public ImportRContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importR; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterImportR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitImportR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitImportR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportRContext importR() throws RecognitionException {
		ImportRContext _localctx = new ImportRContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importR);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(IMPORT);
			setState(84);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(80);
					_la = _input.LA(1);
					if ( !(((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & 36028797018964025L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(81);
					match(COMMA);
					}
					} 
				}
				setState(86);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_CURLY) {
				{
				setState(87);
				match(OPEN_CURLY);
				}
			}

			setState(90);
			_la = _input.LA(1);
			if ( !(((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & 36028797018964025L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(91);
				match(COMMA);
				setState(92);
				match(ID);
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLOSE_CURLY) {
				{
				setState(98);
				match(CLOSE_CURLY);
				}
			}

			setState(101);
			match(FROM);
			setState(102);
			match(STRING);
			setState(103);
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
	public static class VariableDiclarationContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(ReactParser.EQUAL, 0); }
		public TerminalNode VAR() { return getToken(ReactParser.VAR, 0); }
		public TerminalNode CONST() { return getToken(ReactParser.CONST, 0); }
		public TerminalNode LET() { return getToken(ReactParser.LET, 0); }
		public List<TerminalNode> ID() { return getTokens(ReactParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ReactParser.ID, i);
		}
		public List<ArrayyContext> arrayy() {
			return getRuleContexts(ArrayyContext.class);
		}
		public ArrayyContext arrayy(int i) {
			return getRuleContext(ArrayyContext.class,i);
		}
		public Function2Context function2() {
			return getRuleContext(Function2Context.class,0);
		}
		public TerminalNode NUMBER() { return getToken(ReactParser.NUMBER, 0); }
		public UseRefContext useRef() {
			return getRuleContext(UseRefContext.class,0);
		}
		public UseStateContext useState() {
			return getRuleContext(UseStateContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ReactParser.SEMI, 0); }
		public VariableDiclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDiclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterVariableDiclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitVariableDiclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitVariableDiclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDiclarationContext variableDiclaration() throws RecognitionException {
		VariableDiclarationContext _localctx = new VariableDiclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variableDiclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3076L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(106);
				match(ID);
				}
				break;
			case OPEN_SQUARE:
				{
				setState(107);
				arrayy();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(110);
			match(EQUAL);
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAREN:
				{
				setState(111);
				function2();
				}
				break;
			case NUMBER:
				{
				setState(112);
				match(NUMBER);
				}
				break;
			case USE_REF:
				{
				setState(113);
				useRef();
				}
				break;
			case USE_STATE:
				{
				setState(114);
				useState();
				}
				break;
			case ID:
				{
				setState(115);
				match(ID);
				}
				break;
			case OPEN_SQUARE:
				{
				setState(116);
				arrayy();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(119);
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
	public static class HtmlContext extends ParserRuleContext {
		public List<TerminalNode> JSX_OPEN() { return getTokens(ReactParser.JSX_OPEN); }
		public TerminalNode JSX_OPEN(int i) {
			return getToken(ReactParser.JSX_OPEN, i);
		}
		public List<TerminalNode> JSX_CLOSE() { return getTokens(ReactParser.JSX_CLOSE); }
		public TerminalNode JSX_CLOSE(int i) {
			return getToken(ReactParser.JSX_CLOSE, i);
		}
		public List<TerminalNode> SYNTAX() { return getTokens(ReactParser.SYNTAX); }
		public TerminalNode SYNTAX(int i) {
			return getToken(ReactParser.SYNTAX, i);
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
		enterRule(_localctx, 8, RULE_html);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(JSX_OPEN);
			{
			setState(123);
			match(SYNTAX);
			}
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(124);
				match(ID);
				}
				break;
			}
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS_NAME || _la==ID) {
				{
				{
				setState(127);
				_la = _input.LA(1);
				if ( !(_la==CLASS_NAME || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(128);
				match(EQUAL);
				setState(130);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(129);
					match(OPEN_CURLY);
					}
					break;
				}
				setState(137);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(132);
					attributeValue();
					}
					break;
				case 2:
					{
					setState(133);
					match(ID);
					setState(134);
					match(DOT);
					setState(135);
					match(ID);
					}
					break;
				case 3:
					{
					setState(136);
					onClick();
					}
					break;
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLOSE_CURLY) {
					{
					setState(139);
					match(CLOSE_CURLY);
					}
				}

				}
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JSX_SLASH) {
				{
				setState(147);
				match(JSX_SLASH);
				}
			}

			setState(150);
			match(JSX_CLOSE);
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(175);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(151);
					htmlBody();
					}
					break;
				case 2:
					{
					setState(155);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(152);
							html();
							}
							} 
						}
						setState(157);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
					}
					}
					break;
				case 3:
					{
					setState(159);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OPEN_CURLY) {
						{
						setState(158);
						match(OPEN_CURLY);
						}
					}

					setState(170);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						setState(164);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==ID) {
							{
							{
							setState(161);
							match(ID);
							}
							}
							setState(166);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(167);
						match(ID);
						setState(168);
						match(DOT);
						setState(169);
						match(ID);
						}
						break;
					}
					setState(173);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==CLOSE_CURLY) {
						{
						setState(172);
						match(CLOSE_CURLY);
						}
					}

					}
					break;
				}
				{
				setState(177);
				match(JSX_OPEN);
				setState(178);
				match(JSX_SLASH);
				setState(179);
				match(SYNTAX);
				setState(180);
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
		enterRule(_localctx, 10, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(CONSOLE_);
			setState(184);
			match(DOT);
			setState(185);
			match(LOG_);
			setState(186);
			match(OPEN_PAREN);
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 41L) != 0)) {
				{
				{
				setState(187);
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
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(193);
			match(CLOSE_PAREN);
			setState(194);
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
	public static class Function1Context extends ParserRuleContext {
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
		public Function1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterFunction1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitFunction1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitFunction1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function1Context function1() throws RecognitionException {
		Function1Context _localctx = new Function1Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_function1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(FUNCTION);
			setState(197);
			match(ID);
			setState(198);
			match(OPEN_PAREN);
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(199);
				match(ID);
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(200);
					match(COMMA);
					}
				}

				}
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(208);
			match(CLOSE_PAREN);
			setState(209);
			match(OPEN_CURLY);
			setState(210);
			functionbody();
			setState(211);
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
	public static class Function2Context extends ParserRuleContext {
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
		public Function2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterFunction2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitFunction2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitFunction2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function2Context function2() throws RecognitionException {
		Function2Context _localctx = new Function2Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_function2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(OPEN_PAREN);
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(214);
				match(ID);
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(215);
					match(COMMA);
					}
				}

				}
				}
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(223);
			match(CLOSE_PAREN);
			setState(224);
			match(ARROW);
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_CURLY) {
				{
				setState(225);
				match(OPEN_CURLY);
				}
			}

			setState(228);
			functionbody();
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(229);
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
		public List<VariableDiclarationContext> variableDiclaration() {
			return getRuleContexts(VariableDiclarationContext.class);
		}
		public VariableDiclarationContext variableDiclaration(int i) {
			return getRuleContext(VariableDiclarationContext.class,i);
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
		enterRule(_localctx, 16, RULE_functionbody);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(235);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case CONST:
					case VAR:
					case LET:
						{
						setState(232);
						variableDiclaration();
						}
						break;
					case CONSOLE_:
						{
						setState(233);
						print();
						}
						break;
					case ID:
						{
						setState(234);
						callFun();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(239);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(240);
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
		enterRule(_localctx, 18, RULE_callFun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(ID);
			setState(244);
			match(OPEN_PAREN);
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
			match(CLOSE_PAREN);
			setState(255);
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
		enterRule(_localctx, 20, RULE_returnStatment);
		try {
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				returnStatment1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				match(RETURN);
				setState(259);
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
		enterRule(_localctx, 22, RULE_returnStatment1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(RETURN);
			setState(263);
			match(OPEN_PAREN);
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JSX_OPEN) {
				{
				setState(264);
				html();
				}
			}

			setState(267);
			match(CLOSE_PAREN);
			setState(268);
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
		public TerminalNode SYNTAX() { return getToken(ReactParser.SYNTAX, 0); }
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
		enterRule(_localctx, 24, RULE_syntax);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(S_C);
			setState(271);
			match(SYNTAX);
			setState(272);
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
		public TerminalNode CREATEELEMENT() { return getToken(ReactParser.CREATEELEMENT, 0); }
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
		enterRule(_localctx, 26, RULE_pureReact);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(REACT_);
			setState(275);
			match(DOT);
			setState(276);
			match(CREATEELEMENT);
			setState(277);
			match(OPEN_PAREN);
			setState(278);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(279);
			match(COMMA);
			setState(280);
			attributes();
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(281);
				match(COMMA);
				}
				break;
			}
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==REACT_ || _la==SingleLineString) {
					{
					setState(286);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case REACT_:
						{
						setState(284);
						pureReact();
						}
						break;
					case SingleLineString:
						{
						setState(285);
						match(SingleLineString);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(290);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(291);
					match(COMMA);
					}
				}

				}
				break;
			}
			setState(296);
			match(CLOSE_PAREN);
			setState(297);
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
		enterRule(_localctx, 28, RULE_attributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(OPEN_CURLY);
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(300);
				attribute();
				setState(301);
				match(COMMA);
				}
				}
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(308);
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
		enterRule(_localctx, 30, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(ID);
			setState(311);
			match(COLON);
			setState(312);
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
		enterRule(_localctx, 32, RULE_attributeValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
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
		enterRule(_localctx, 34, RULE_useRef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(USE_REF);
			setState(317);
			match(OPEN_PAREN);
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING) {
				{
				{
				setState(318);
				match(STRING);
				}
				}
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(324);
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
		enterRule(_localctx, 36, RULE_useState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(USE_STATE);
			setState(327);
			match(OPEN_PAREN);
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(328);
				match(ID);
				setState(329);
				match(DOT);
				setState(330);
				match(ID);
				}
				break;
			case 2:
				{
				setState(331);
				match(ID);
				}
				break;
			}
			setState(334);
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
		public ArrayyContext arrayy() {
			return getRuleContext(ArrayyContext.class,0);
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
		enterRule(_localctx, 38, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3076L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(337);
			arrayy();
			setState(338);
			match(EQUAL);
			setState(339);
			useState();
			setState(340);
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
		enterRule(_localctx, 40, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(ID);
			setState(343);
			match(OPEN_PAREN);
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(344);
				match(STRING);
				}
			}

			setState(347);
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
		public Function2Context function2() {
			return getRuleContext(Function2Context.class,0);
		}
		public TerminalNode COMMA() { return getToken(ReactParser.COMMA, 0); }
		public ArrayyContext arrayy() {
			return getRuleContext(ArrayyContext.class,0);
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
		enterRule(_localctx, 42, RULE_useEffet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(USE_EFFECT);
			setState(350);
			match(OPEN_PAREN);
			setState(351);
			function2();
			setState(352);
			match(COMMA);
			setState(353);
			arrayy();
			setState(354);
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
	public static class ArrayyContext extends ParserRuleContext {
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
		public ArrayyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterArrayy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitArrayy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitArrayy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayyContext arrayy() throws RecognitionException {
		ArrayyContext _localctx = new ArrayyContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_arrayy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(OPEN_SQUARE);
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & 570425345L) != 0)) {
				{
				{
				setState(360);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(357);
					match(ID);
					}
					break;
				case STRING:
					{
					setState(358);
					match(STRING);
					}
					break;
				case OPEN_CURLY:
					{
					setState(359);
					map();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(362);
					match(COMMA);
					}
				}

				}
				}
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(370);
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
		public List<ArrayyContext> arrayy() {
			return getRuleContexts(ArrayyContext.class);
		}
		public ArrayyContext arrayy(int i) {
			return getRuleContext(ArrayyContext.class,i);
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
		enterRule(_localctx, 46, RULE_map);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(OPEN_CURLY);
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(373);
				match(ID);
				setState(374);
				match(COLON);
				setState(381);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUMBER:
				case SingleLineString:
				case ID:
					{
					setState(375);
					attributeValue();
					}
					break;
				case DOLLAR:
					{
					setState(376);
					match(DOLLAR);
					setState(377);
					match(OPEN_CURLY);
					setState(378);
					_la = _input.LA(1);
					if ( !(_la==SingleLineString || _la==ID) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(379);
					match(CLOSE_CURLY);
					}
					break;
				case OPEN_SQUARE:
					{
					setState(380);
					arrayy();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(383);
					match(COMMA);
					}
				}

				}
				}
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(391);
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
		public Function2Context function2() {
			return getRuleContext(Function2Context.class,0);
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
		enterRule(_localctx, 48, RULE_onClick);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			match(OPEN_CURLY);
			setState(394);
			function2();
			setState(395);
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
	public static class HtmlBodyContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLY() { return getToken(ReactParser.OPEN_CURLY, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(ReactParser.CLOSE_CURLY, 0); }
		public MapMethodContext mapMethod() {
			return getRuleContext(MapMethodContext.class,0);
		}
		public HhContext hh() {
			return getRuleContext(HhContext.class,0);
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
		enterRule(_localctx, 50, RULE_htmlBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(OPEN_CURLY);
			setState(400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(398);
				mapMethod();
				}
				break;
			case 2:
				{
				setState(399);
				hh();
				}
				break;
			}
			setState(402);
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
	public static class HhContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ReactParser.ID, 0); }
		public TerminalNode AND() { return getToken(ReactParser.AND, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ReactParser.OPEN_PAREN, 0); }
		public HtmlContext html() {
			return getRuleContext(HtmlContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(ReactParser.CLOSE_PAREN, 0); }
		public HhContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hh; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterHh(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitHh(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitHh(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HhContext hh() throws RecognitionException {
		HhContext _localctx = new HhContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_hh);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(ID);
			setState(405);
			match(AND);
			setState(406);
			match(OPEN_PAREN);
			setState(407);
			html();
			setState(408);
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
		enterRule(_localctx, 54, RULE_mapMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(410);
				match(ID);
				setState(411);
				match(DOT);
				}
				}
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(417);
			match(MAP_);
			setState(418);
			match(OPEN_PAREN);
			setState(419);
			match(OPEN_PAREN);
			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(420);
				match(ID);
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(421);
					match(COMMA);
					}
				}

				}
				}
				setState(428);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(429);
			match(CLOSE_PAREN);
			setState(430);
			match(ARROW);
			setState(431);
			match(OPEN_PAREN);
			setState(432);
			html();
			setState(433);
			match(CLOSE_PAREN);
			setState(434);
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

	public static final String _serializedATN =
		"\u0004\u0001L\u01b5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"\u0004\u0000G\b\u0000\u000b\u0000\f\u0000H\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002S\b\u0002\n\u0002\f\u0002V\t\u0002\u0001\u0002\u0003\u0002Y\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002^\b\u0002\n\u0002\f\u0002"+
		"a\t\u0002\u0001\u0002\u0003\u0002d\b\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003m\b"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003v\b\u0003\u0001\u0003\u0003\u0003y\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004~\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u0083\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u008a\b\u0004\u0001\u0004"+
		"\u0003\u0004\u008d\b\u0004\u0005\u0004\u008f\b\u0004\n\u0004\f\u0004\u0092"+
		"\t\u0004\u0001\u0004\u0003\u0004\u0095\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004\u009a\b\u0004\n\u0004\f\u0004\u009d\t\u0004\u0001"+
		"\u0004\u0003\u0004\u00a0\b\u0004\u0001\u0004\u0005\u0004\u00a3\b\u0004"+
		"\n\u0004\f\u0004\u00a6\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004\u00ab\b\u0004\u0001\u0004\u0003\u0004\u00ae\b\u0004\u0003\u0004"+
		"\u00b0\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u00b6\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005\u00bd\b\u0005\n\u0005\f\u0005\u00c0\t\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u00ca\b\u0006\u0005\u0006\u00cc\b\u0006\n\u0006\f\u0006"+
		"\u00cf\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00d9\b\u0007\u0005\u0007"+
		"\u00db\b\u0007\n\u0007\f\u0007\u00de\t\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u00e3\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00e7"+
		"\b\u0007\u0001\b\u0001\b\u0001\b\u0005\b\u00ec\b\b\n\b\f\b\u00ef\t\b\u0001"+
		"\b\u0003\b\u00f2\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00f8\b\t"+
		"\u0005\t\u00fa\b\t\n\t\f\t\u00fd\t\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u0105\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u010a\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u011b\b\r\u0001\r\u0001\r\u0005\r\u011f\b\r\n\r\f\r"+
		"\u0122\t\r\u0001\r\u0003\r\u0125\b\r\u0003\r\u0127\b\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0130"+
		"\b\u000e\n\u000e\f\u000e\u0133\t\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0005\u0011\u0140\b\u0011\n\u0011\f\u0011\u0143"+
		"\t\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u014d\b\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u015a\b\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0003\u0016\u0169\b\u0016\u0001\u0016\u0003\u0016\u016c\b\u0016"+
		"\u0005\u0016\u016e\b\u0016\n\u0016\f\u0016\u0171\t\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u017e\b\u0017\u0001"+
		"\u0017\u0003\u0017\u0181\b\u0017\u0005\u0017\u0183\b\u0017\n\u0017\f\u0017"+
		"\u0186\t\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0191\b\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0005\u001b\u019d\b\u001b"+
		"\n\u001b\f\u001b\u01a0\t\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0003\u001b\u01a7\b\u001b\u0005\u001b\u01a9\b\u001b"+
		"\n\u001b\f\u001b\u01ac\t\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0000\u0000\u001c"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.0246\u0000\u0007\u0003\u0000\u0015\u0015\u0018\u001a"+
		"LL\u0002\u0000\u0002\u0002\n\u000b\u0002\u0000((LL\u0003\u0000GGJJLL\u0002"+
		"\u0000HHLL\u0002\u0000,,@@\u0002\u0000JJLL\u01da\u0000F\u0001\u0000\u0000"+
		"\u0000\u0002J\u0001\u0000\u0000\u0000\u0004O\u0001\u0000\u0000\u0000\u0006"+
		"i\u0001\u0000\u0000\u0000\bz\u0001\u0000\u0000\u0000\n\u00b7\u0001\u0000"+
		"\u0000\u0000\f\u00c4\u0001\u0000\u0000\u0000\u000e\u00d5\u0001\u0000\u0000"+
		"\u0000\u0010\u00ed\u0001\u0000\u0000\u0000\u0012\u00f3\u0001\u0000\u0000"+
		"\u0000\u0014\u0104\u0001\u0000\u0000\u0000\u0016\u0106\u0001\u0000\u0000"+
		"\u0000\u0018\u010e\u0001\u0000\u0000\u0000\u001a\u0112\u0001\u0000\u0000"+
		"\u0000\u001c\u012b\u0001\u0000\u0000\u0000\u001e\u0136\u0001\u0000\u0000"+
		"\u0000 \u013a\u0001\u0000\u0000\u0000\"\u013c\u0001\u0000\u0000\u0000"+
		"$\u0146\u0001\u0000\u0000\u0000&\u0150\u0001\u0000\u0000\u0000(\u0156"+
		"\u0001\u0000\u0000\u0000*\u015d\u0001\u0000\u0000\u0000,\u0164\u0001\u0000"+
		"\u0000\u0000.\u0174\u0001\u0000\u0000\u00000\u0189\u0001\u0000\u0000\u0000"+
		"2\u018d\u0001\u0000\u0000\u00004\u0194\u0001\u0000\u0000\u00006\u019e"+
		"\u0001\u0000\u0000\u00008:\u0003\u0004\u0002\u000098\u0001\u0000\u0000"+
		"\u0000:=\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000"+
		"\u0000\u0000<B\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000>A\u0003"+
		"\f\u0006\u0000?A\u0003\u0006\u0003\u0000@>\u0001\u0000\u0000\u0000@?\u0001"+
		"\u0000\u0000\u0000AD\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000"+
		"BC\u0001\u0000\u0000\u0000CE\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000"+
		"\u0000EG\u0003\u0002\u0001\u0000F;\u0001\u0000\u0000\u0000GH\u0001\u0000"+
		"\u0000\u0000HF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000I\u0001"+
		"\u0001\u0000\u0000\u0000JK\u0005\f\u0000\u0000KL\u0005\r\u0000\u0000L"+
		"M\u0005L\u0000\u0000MN\u0005@\u0000\u0000N\u0003\u0001\u0000\u0000\u0000"+
		"OT\u0005\u000e\u0000\u0000PQ\u0007\u0000\u0000\u0000QS\u0005,\u0000\u0000"+
		"RP\u0001\u0000\u0000\u0000SV\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000"+
		"\u0000TU\u0001\u0000\u0000\u0000UX\u0001\u0000\u0000\u0000VT\u0001\u0000"+
		"\u0000\u0000WY\u0005/\u0000\u0000XW\u0001\u0000\u0000\u0000XY\u0001\u0000"+
		"\u0000\u0000YZ\u0001\u0000\u0000\u0000Z_\u0007\u0000\u0000\u0000[\\\u0005"+
		",\u0000\u0000\\^\u0005L\u0000\u0000][\u0001\u0000\u0000\u0000^a\u0001"+
		"\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000"+
		"`c\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000bd\u00050\u0000\u0000"+
		"cb\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000de\u0001\u0000\u0000"+
		"\u0000ef\u0005\u0010\u0000\u0000fg\u0005H\u0000\u0000gh\u0005@\u0000\u0000"+
		"h\u0005\u0001\u0000\u0000\u0000il\u0007\u0001\u0000\u0000jm\u0005L\u0000"+
		"\u0000km\u0003,\u0016\u0000lj\u0001\u0000\u0000\u0000lk\u0001\u0000\u0000"+
		"\u0000mn\u0001\u0000\u0000\u0000nu\u00056\u0000\u0000ov\u0003\u000e\u0007"+
		"\u0000pv\u0005G\u0000\u0000qv\u0003\"\u0011\u0000rv\u0003$\u0012\u0000"+
		"sv\u0005L\u0000\u0000tv\u0003,\u0016\u0000uo\u0001\u0000\u0000\u0000u"+
		"p\u0001\u0000\u0000\u0000uq\u0001\u0000\u0000\u0000ur\u0001\u0000\u0000"+
		"\u0000us\u0001\u0000\u0000\u0000ut\u0001\u0000\u0000\u0000vx\u0001\u0000"+
		"\u0000\u0000wy\u0005@\u0000\u0000xw\u0001\u0000\u0000\u0000xy\u0001\u0000"+
		"\u0000\u0000y\u0007\u0001\u0000\u0000\u0000z{\u0005)\u0000\u0000{}\u0005"+
		"F\u0000\u0000|~\u0005L\u0000\u0000}|\u0001\u0000\u0000\u0000}~\u0001\u0000"+
		"\u0000\u0000~\u0090\u0001\u0000\u0000\u0000\u007f\u0080\u0007\u0002\u0000"+
		"\u0000\u0080\u0082\u00056\u0000\u0000\u0081\u0083\u0005/\u0000\u0000\u0082"+
		"\u0081\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083"+
		"\u0089\u0001\u0000\u0000\u0000\u0084\u008a\u0003 \u0010\u0000\u0085\u0086"+
		"\u0005L\u0000\u0000\u0086\u0087\u00054\u0000\u0000\u0087\u008a\u0005L"+
		"\u0000\u0000\u0088\u008a\u00030\u0018\u0000\u0089\u0084\u0001\u0000\u0000"+
		"\u0000\u0089\u0085\u0001\u0000\u0000\u0000\u0089\u0088\u0001\u0000\u0000"+
		"\u0000\u008a\u008c\u0001\u0000\u0000\u0000\u008b\u008d\u00050\u0000\u0000"+
		"\u008c\u008b\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000"+
		"\u008d\u008f\u0001\u0000\u0000\u0000\u008e\u007f\u0001\u0000\u0000\u0000"+
		"\u008f\u0092\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000"+
		"\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0094\u0001\u0000\u0000\u0000"+
		"\u0092\u0090\u0001\u0000\u0000\u0000\u0093\u0095\u0005+\u0000\u0000\u0094"+
		"\u0093\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095"+
		"\u0096\u0001\u0000\u0000\u0000\u0096\u00b5\u0005*\u0000\u0000\u0097\u00b0"+
		"\u00032\u0019\u0000\u0098\u009a\u0003\b\u0004\u0000\u0099\u0098\u0001"+
		"\u0000\u0000\u0000\u009a\u009d\u0001\u0000\u0000\u0000\u009b\u0099\u0001"+
		"\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u00b0\u0001"+
		"\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009e\u00a0\u0005"+
		"/\u0000\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a0\u00aa\u0001\u0000\u0000\u0000\u00a1\u00a3\u0005L\u0000"+
		"\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a5\u00ab\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a8\u0005L\u0000\u0000\u00a8\u00a9\u00054\u0000\u0000\u00a9"+
		"\u00ab\u0005L\u0000\u0000\u00aa\u00a4\u0001\u0000\u0000\u0000\u00aa\u00a7"+
		"\u0001\u0000\u0000\u0000\u00ab\u00ad\u0001\u0000\u0000\u0000\u00ac\u00ae"+
		"\u00050\u0000\u0000\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001"+
		"\u0000\u0000\u0000\u00ae\u00b0\u0001\u0000\u0000\u0000\u00af\u0097\u0001"+
		"\u0000\u0000\u0000\u00af\u009b\u0001\u0000\u0000\u0000\u00af\u009f\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005"+
		")\u0000\u0000\u00b2\u00b3\u0005+\u0000\u0000\u00b3\u00b4\u0005F\u0000"+
		"\u0000\u00b4\u00b6\u0005*\u0000\u0000\u00b5\u00af\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\t\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b8\u0005\u001b\u0000\u0000\u00b8\u00b9\u00054\u0000\u0000\u00b9\u00ba"+
		"\u0005\u001c\u0000\u0000\u00ba\u00be\u00051\u0000\u0000\u00bb\u00bd\u0007"+
		"\u0003\u0000\u0000\u00bc\u00bb\u0001\u0000\u0000\u0000\u00bd\u00c0\u0001"+
		"\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00be\u00bf\u0001"+
		"\u0000\u0000\u0000\u00bf\u00c1\u0001\u0000\u0000\u0000\u00c0\u00be\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c2\u00052\u0000\u0000\u00c2\u00c3\u0005@\u0000"+
		"\u0000\u00c3\u000b\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005\u0003\u0000"+
		"\u0000\u00c5\u00c6\u0005L\u0000\u0000\u00c6\u00cd\u00051\u0000\u0000\u00c7"+
		"\u00c9\u0005L\u0000\u0000\u00c8\u00ca\u0005,\u0000\u0000\u00c9\u00c8\u0001"+
		"\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cc\u0001"+
		"\u0000\u0000\u0000\u00cb\u00c7\u0001\u0000\u0000\u0000\u00cc\u00cf\u0001"+
		"\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001"+
		"\u0000\u0000\u0000\u00ce\u00d0\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001"+
		"\u0000\u0000\u0000\u00d0\u00d1\u00052\u0000\u0000\u00d1\u00d2\u0005/\u0000"+
		"\u0000\u00d2\u00d3\u0003\u0010\b\u0000\u00d3\u00d4\u00050\u0000\u0000"+
		"\u00d4\r\u0001\u0000\u0000\u0000\u00d5\u00dc\u00051\u0000\u0000\u00d6"+
		"\u00d8\u0005L\u0000\u0000\u00d7\u00d9\u0005,\u0000\u0000\u00d8\u00d7\u0001"+
		"\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u00db\u0001"+
		"\u0000\u0000\u0000\u00da\u00d6\u0001\u0000\u0000\u0000\u00db\u00de\u0001"+
		"\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001"+
		"\u0000\u0000\u0000\u00dd\u00df\u0001\u0000\u0000\u0000\u00de\u00dc\u0001"+
		"\u0000\u0000\u0000\u00df\u00e0\u00052\u0000\u0000\u00e0\u00e2\u00055\u0000"+
		"\u0000\u00e1\u00e3\u0005/\u0000\u0000\u00e2\u00e1\u0001\u0000\u0000\u0000"+
		"\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000"+
		"\u00e4\u00e6\u0003\u0010\b\u0000\u00e5\u00e7\u00050\u0000\u0000\u00e6"+
		"\u00e5\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7"+
		"\u000f\u0001\u0000\u0000\u0000\u00e8\u00ec\u0003\u0006\u0003\u0000\u00e9"+
		"\u00ec\u0003\n\u0005\u0000\u00ea\u00ec\u0003\u0012\t\u0000\u00eb\u00e8"+
		"\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ea"+
		"\u0001\u0000\u0000\u0000\u00ec\u00ef\u0001\u0000\u0000\u0000\u00ed\u00eb"+
		"\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00f1"+
		"\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00f0\u00f2"+
		"\u0003\u0014\n\u0000\u00f1\u00f0\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001"+
		"\u0000\u0000\u0000\u00f2\u0011\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005"+
		"L\u0000\u0000\u00f4\u00fb\u00051\u0000\u0000\u00f5\u00f7\u0005L\u0000"+
		"\u0000\u00f6\u00f8\u0005,\u0000\u0000\u00f7\u00f6\u0001\u0000\u0000\u0000"+
		"\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u00fa\u0001\u0000\u0000\u0000"+
		"\u00f9\u00f5\u0001\u0000\u0000\u0000\u00fa\u00fd\u0001\u0000\u0000\u0000"+
		"\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000"+
		"\u00fc\u00fe\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000"+
		"\u00fe\u00ff\u00052\u0000\u0000\u00ff\u0100\u0005@\u0000\u0000\u0100\u0013"+
		"\u0001\u0000\u0000\u0000\u0101\u0105\u0003\u0016\u000b\u0000\u0102\u0103"+
		"\u0005\u0004\u0000\u0000\u0103\u0105\u0003\u001a\r\u0000\u0104\u0101\u0001"+
		"\u0000\u0000\u0000\u0104\u0102\u0001\u0000\u0000\u0000\u0105\u0015\u0001"+
		"\u0000\u0000\u0000\u0106\u0107\u0005\u0004\u0000\u0000\u0107\u0109\u0005"+
		"1\u0000\u0000\u0108\u010a\u0003\b\u0004\u0000\u0109\u0108\u0001\u0000"+
		"\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000"+
		"\u0000\u0000\u010b\u010c\u00052\u0000\u0000\u010c\u010d\u0005@\u0000\u0000"+
		"\u010d\u0017\u0001\u0000\u0000\u0000\u010e\u010f\u0005C\u0000\u0000\u010f"+
		"\u0110\u0005F\u0000\u0000\u0110\u0111\u0005C\u0000\u0000\u0111\u0019\u0001"+
		"\u0000\u0000\u0000\u0112\u0113\u0005\u0015\u0000\u0000\u0113\u0114\u0005"+
		"4\u0000\u0000\u0114\u0115\u0005\u0016\u0000\u0000\u0115\u0116\u00051\u0000"+
		"\u0000\u0116\u0117\u0007\u0004\u0000\u0000\u0117\u0118\u0005,\u0000\u0000"+
		"\u0118\u011a\u0003\u001c\u000e\u0000\u0119\u011b\u0005,\u0000\u0000\u011a"+
		"\u0119\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b"+
		"\u0126\u0001\u0000\u0000\u0000\u011c\u011f\u0003\u001a\r\u0000\u011d\u011f"+
		"\u0005J\u0000\u0000\u011e\u011c\u0001\u0000\u0000\u0000\u011e\u011d\u0001"+
		"\u0000\u0000\u0000\u011f\u0122\u0001\u0000\u0000\u0000\u0120\u011e\u0001"+
		"\u0000\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121\u0124\u0001"+
		"\u0000\u0000\u0000\u0122\u0120\u0001\u0000\u0000\u0000\u0123\u0125\u0005"+
		",\u0000\u0000\u0124\u0123\u0001\u0000\u0000\u0000\u0124\u0125\u0001\u0000"+
		"\u0000\u0000\u0125\u0127\u0001\u0000\u0000\u0000\u0126\u0120\u0001\u0000"+
		"\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000\u0127\u0128\u0001\u0000"+
		"\u0000\u0000\u0128\u0129\u00052\u0000\u0000\u0129\u012a\u0007\u0005\u0000"+
		"\u0000\u012a\u001b\u0001\u0000\u0000\u0000\u012b\u0131\u0005/\u0000\u0000"+
		"\u012c\u012d\u0003\u001e\u000f\u0000\u012d\u012e\u0005,\u0000\u0000\u012e"+
		"\u0130\u0001\u0000\u0000\u0000\u012f\u012c\u0001\u0000\u0000\u0000\u0130"+
		"\u0133\u0001\u0000\u0000\u0000\u0131\u012f\u0001\u0000\u0000\u0000\u0131"+
		"\u0132\u0001\u0000\u0000\u0000\u0132\u0134\u0001\u0000\u0000\u0000\u0133"+
		"\u0131\u0001\u0000\u0000\u0000\u0134\u0135\u00050\u0000\u0000\u0135\u001d"+
		"\u0001\u0000\u0000\u0000\u0136\u0137\u0005L\u0000\u0000\u0137\u0138\u0005"+
		"3\u0000\u0000\u0138\u0139\u0003 \u0010\u0000\u0139\u001f\u0001\u0000\u0000"+
		"\u0000\u013a\u013b\u0007\u0003\u0000\u0000\u013b!\u0001\u0000\u0000\u0000"+
		"\u013c\u013d\u0005\u001a\u0000\u0000\u013d\u0141\u00051\u0000\u0000\u013e"+
		"\u0140\u0005H\u0000\u0000\u013f\u013e\u0001\u0000\u0000\u0000\u0140\u0143"+
		"\u0001\u0000\u0000\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0141\u0142"+
		"\u0001\u0000\u0000\u0000\u0142\u0144\u0001\u0000\u0000\u0000\u0143\u0141"+
		"\u0001\u0000\u0000\u0000\u0144\u0145\u00052\u0000\u0000\u0145#\u0001\u0000"+
		"\u0000\u0000\u0146\u0147\u0005\u0018\u0000\u0000\u0147\u014c\u00051\u0000"+
		"\u0000\u0148\u0149\u0005L\u0000\u0000\u0149\u014a\u00054\u0000\u0000\u014a"+
		"\u014d\u0005L\u0000\u0000\u014b\u014d\u0005L\u0000\u0000\u014c\u0148\u0001"+
		"\u0000\u0000\u0000\u014c\u014b\u0001\u0000\u0000\u0000\u014d\u014e\u0001"+
		"\u0000\u0000\u0000\u014e\u014f\u00052\u0000\u0000\u014f%\u0001\u0000\u0000"+
		"\u0000\u0150\u0151\u0007\u0001\u0000\u0000\u0151\u0152\u0003,\u0016\u0000"+
		"\u0152\u0153\u00056\u0000\u0000\u0153\u0154\u0003$\u0012\u0000\u0154\u0155"+
		"\u0005@\u0000\u0000\u0155\'\u0001\u0000\u0000\u0000\u0156\u0157\u0005"+
		"L\u0000\u0000\u0157\u0159\u00051\u0000\u0000\u0158\u015a\u0005H\u0000"+
		"\u0000\u0159\u0158\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000"+
		"\u0000\u015a\u015b\u0001\u0000\u0000\u0000\u015b\u015c\u00052\u0000\u0000"+
		"\u015c)\u0001\u0000\u0000\u0000\u015d\u015e\u0005\u0019\u0000\u0000\u015e"+
		"\u015f\u00051\u0000\u0000\u015f\u0160\u0003\u000e\u0007\u0000\u0160\u0161"+
		"\u0005,\u0000\u0000\u0161\u0162\u0003,\u0016\u0000\u0162\u0163\u00052"+
		"\u0000\u0000\u0163+\u0001\u0000\u0000\u0000\u0164\u016f\u0005-\u0000\u0000"+
		"\u0165\u0169\u0005L\u0000\u0000\u0166\u0169\u0005H\u0000\u0000\u0167\u0169"+
		"\u0003.\u0017\u0000\u0168\u0165\u0001\u0000\u0000\u0000\u0168\u0166\u0001"+
		"\u0000\u0000\u0000\u0168\u0167\u0001\u0000\u0000\u0000\u0169\u016b\u0001"+
		"\u0000\u0000\u0000\u016a\u016c\u0005,\u0000\u0000\u016b\u016a\u0001\u0000"+
		"\u0000\u0000\u016b\u016c\u0001\u0000\u0000\u0000\u016c\u016e\u0001\u0000"+
		"\u0000\u0000\u016d\u0168\u0001\u0000\u0000\u0000\u016e\u0171\u0001\u0000"+
		"\u0000\u0000\u016f\u016d\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000"+
		"\u0000\u0000\u0170\u0172\u0001\u0000\u0000\u0000\u0171\u016f\u0001\u0000"+
		"\u0000\u0000\u0172\u0173\u0005.\u0000\u0000\u0173-\u0001\u0000\u0000\u0000"+
		"\u0174\u0184\u0005/\u0000\u0000\u0175\u0176\u0005L\u0000\u0000\u0176\u017d"+
		"\u00053\u0000\u0000\u0177\u017e\u0003 \u0010\u0000\u0178\u0179\u0005A"+
		"\u0000\u0000\u0179\u017a\u0005/\u0000\u0000\u017a\u017b\u0007\u0006\u0000"+
		"\u0000\u017b\u017e\u00050\u0000\u0000\u017c\u017e\u0003,\u0016\u0000\u017d"+
		"\u0177\u0001\u0000\u0000\u0000\u017d\u0178\u0001\u0000\u0000\u0000\u017d"+
		"\u017c\u0001\u0000\u0000\u0000\u017e\u0180\u0001\u0000\u0000\u0000\u017f"+
		"\u0181\u0005,\u0000\u0000\u0180\u017f\u0001\u0000\u0000\u0000\u0180\u0181"+
		"\u0001\u0000\u0000\u0000\u0181\u0183\u0001\u0000\u0000\u0000\u0182\u0175"+
		"\u0001\u0000\u0000\u0000\u0183\u0186\u0001\u0000\u0000\u0000\u0184\u0182"+
		"\u0001\u0000\u0000\u0000\u0184\u0185\u0001\u0000\u0000\u0000\u0185\u0187"+
		"\u0001\u0000\u0000\u0000\u0186\u0184\u0001\u0000\u0000\u0000\u0187\u0188"+
		"\u00050\u0000\u0000\u0188/\u0001\u0000\u0000\u0000\u0189\u018a\u0005/"+
		"\u0000\u0000\u018a\u018b\u0003\u000e\u0007\u0000\u018b\u018c\u00050\u0000"+
		"\u0000\u018c1\u0001\u0000\u0000\u0000\u018d\u0190\u0005/\u0000\u0000\u018e"+
		"\u0191\u00036\u001b\u0000\u018f\u0191\u00034\u001a\u0000\u0190\u018e\u0001"+
		"\u0000\u0000\u0000\u0190\u018f\u0001\u0000\u0000\u0000\u0191\u0192\u0001"+
		"\u0000\u0000\u0000\u0192\u0193\u00050\u0000\u0000\u01933\u0001\u0000\u0000"+
		"\u0000\u0194\u0195\u0005L\u0000\u0000\u0195\u0196\u0005;\u0000\u0000\u0196"+
		"\u0197\u00051\u0000\u0000\u0197\u0198\u0003\b\u0004\u0000\u0198\u0199"+
		"\u00052\u0000\u0000\u01995\u0001\u0000\u0000\u0000\u019a\u019b\u0005L"+
		"\u0000\u0000\u019b\u019d\u00054\u0000\u0000\u019c\u019a\u0001\u0000\u0000"+
		"\u0000\u019d\u01a0\u0001\u0000\u0000\u0000\u019e\u019c\u0001\u0000\u0000"+
		"\u0000\u019e\u019f\u0001\u0000\u0000\u0000\u019f\u01a1\u0001\u0000\u0000"+
		"\u0000\u01a0\u019e\u0001\u0000\u0000\u0000\u01a1\u01a2\u0005\'\u0000\u0000"+
		"\u01a2\u01a3\u00051\u0000\u0000\u01a3\u01aa\u00051\u0000\u0000\u01a4\u01a6"+
		"\u0005L\u0000\u0000\u01a5\u01a7\u0005,\u0000\u0000\u01a6\u01a5\u0001\u0000"+
		"\u0000\u0000\u01a6\u01a7\u0001\u0000\u0000\u0000\u01a7\u01a9\u0001\u0000"+
		"\u0000\u0000\u01a8\u01a4\u0001\u0000\u0000\u0000\u01a9\u01ac\u0001\u0000"+
		"\u0000\u0000\u01aa\u01a8\u0001\u0000\u0000\u0000\u01aa\u01ab\u0001\u0000"+
		"\u0000\u0000\u01ab\u01ad\u0001\u0000\u0000\u0000\u01ac\u01aa\u0001\u0000"+
		"\u0000\u0000\u01ad\u01ae\u00052\u0000\u0000\u01ae\u01af\u00055\u0000\u0000"+
		"\u01af\u01b0\u00051\u0000\u0000\u01b0\u01b1\u0003\b\u0004\u0000\u01b1"+
		"\u01b2\u00052\u0000\u0000\u01b2\u01b3\u00052\u0000\u0000\u01b37\u0001"+
		"\u0000\u0000\u00009;@BHTX_clux}\u0082\u0089\u008c\u0090\u0094\u009b\u009f"+
		"\u00a4\u00aa\u00ad\u00af\u00b5\u00be\u00c9\u00cd\u00d8\u00dc\u00e2\u00e6"+
		"\u00eb\u00ed\u00f1\u00f7\u00fb\u0104\u0109\u011a\u011e\u0120\u0124\u0126"+
		"\u0131\u0141\u014c\u0159\u0168\u016b\u016f\u017d\u0180\u0184\u0190\u019e"+
		"\u01a6\u01aa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}