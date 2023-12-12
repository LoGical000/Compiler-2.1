package gen;// Generated from D:/compiler/Compiler-2.1/ReactParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ReactParser}.
 */
public interface ReactParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ReactParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ReactParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ReactParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#importStatment}.
	 * @param ctx the parse tree
	 */
	void enterImportStatment(ReactParser.ImportStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#importStatment}.
	 * @param ctx the parse tree
	 */
	void exitImportStatment(ReactParser.ImportStatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(ReactParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(ReactParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#regularFunction}.
	 * @param ctx the parse tree
	 */
	void enterRegularFunction(ReactParser.RegularFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#regularFunction}.
	 * @param ctx the parse tree
	 */
	void exitRegularFunction(ReactParser.RegularFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#callBackFunction}.
	 * @param ctx the parse tree
	 */
	void enterCallBackFunction(ReactParser.CallBackFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#callBackFunction}.
	 * @param ctx the parse tree
	 */
	void exitCallBackFunction(ReactParser.CallBackFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#functionbody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionbody(ReactParser.FunctionbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#functionbody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionbody(ReactParser.FunctionbodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#callFun}.
	 * @param ctx the parse tree
	 */
	void enterCallFun(ReactParser.CallFunContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#callFun}.
	 * @param ctx the parse tree
	 */
	void exitCallFun(ReactParser.CallFunContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#returnStatment}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatment(ReactParser.ReturnStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#returnStatment}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatment(ReactParser.ReturnStatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#returnStatment1}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatment1(ReactParser.ReturnStatment1Context ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#returnStatment1}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatment1(ReactParser.ReturnStatment1Context ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#syntax}.
	 * @param ctx the parse tree
	 */
	void enterSyntax(ReactParser.SyntaxContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#syntax}.
	 * @param ctx the parse tree
	 */
	void exitSyntax(ReactParser.SyntaxContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#pureReact}.
	 * @param ctx the parse tree
	 */
	void enterPureReact(ReactParser.PureReactContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#pureReact}.
	 * @param ctx the parse tree
	 */
	void exitPureReact(ReactParser.PureReactContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterAttributes(ReactParser.AttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitAttributes(ReactParser.AttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(ReactParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(ReactParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void enterAttributeValue(ReactParser.AttributeValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void exitAttributeValue(ReactParser.AttributeValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(ReactParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(ReactParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#useRef}.
	 * @param ctx the parse tree
	 */
	void enterUseRef(ReactParser.UseRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#useRef}.
	 * @param ctx the parse tree
	 */
	void exitUseRef(ReactParser.UseRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#useState}.
	 * @param ctx the parse tree
	 */
	void enterUseState(ReactParser.UseStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#useState}.
	 * @param ctx the parse tree
	 */
	void exitUseState(ReactParser.UseStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(ReactParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(ReactParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(ReactParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(ReactParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#useEffet}.
	 * @param ctx the parse tree
	 */
	void enterUseEffet(ReactParser.UseEffetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#useEffet}.
	 * @param ctx the parse tree
	 */
	void exitUseEffet(ReactParser.UseEffetContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#array_content}.
	 * @param ctx the parse tree
	 */
	void enterArray_content(ReactParser.Array_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#array_content}.
	 * @param ctx the parse tree
	 */
	void exitArray_content(ReactParser.Array_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#map}.
	 * @param ctx the parse tree
	 */
	void enterMap(ReactParser.MapContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#map}.
	 * @param ctx the parse tree
	 */
	void exitMap(ReactParser.MapContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#onClick}.
	 * @param ctx the parse tree
	 */
	void enterOnClick(ReactParser.OnClickContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#onClick}.
	 * @param ctx the parse tree
	 */
	void exitOnClick(ReactParser.OnClickContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#html}.
	 * @param ctx the parse tree
	 */
	void enterHtml(ReactParser.HtmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#html}.
	 * @param ctx the parse tree
	 */
	void exitHtml(ReactParser.HtmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#htmlBody}.
	 * @param ctx the parse tree
	 */
	void enterHtmlBody(ReactParser.HtmlBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#htmlBody}.
	 * @param ctx the parse tree
	 */
	void exitHtmlBody(ReactParser.HtmlBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#htmlhtml}.
	 * @param ctx the parse tree
	 */
	void enterHtmlhtml(ReactParser.HtmlhtmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#htmlhtml}.
	 * @param ctx the parse tree
	 */
	void exitHtmlhtml(ReactParser.HtmlhtmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#mapMethod}.
	 * @param ctx the parse tree
	 */
	void enterMapMethod(ReactParser.MapMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#mapMethod}.
	 * @param ctx the parse tree
	 */
	void exitMapMethod(ReactParser.MapMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#export}.
	 * @param ctx the parse tree
	 */
	void enterExport(ReactParser.ExportContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#export}.
	 * @param ctx the parse tree
	 */
	void exitExport(ReactParser.ExportContext ctx);
}