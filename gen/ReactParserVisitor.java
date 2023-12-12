// Generated from C:/Users/Omar/Desktop/anas/Compiler 2.1/ReactParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ReactParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ReactParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ReactParser#app}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApp(ReactParser.AppContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#export}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExport(ReactParser.ExportContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#importR}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportR(ReactParser.ImportRContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#variableDiclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDiclaration(ReactParser.VariableDiclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#html}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtml(ReactParser.HtmlContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(ReactParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#function1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction1(ReactParser.Function1Context ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#function2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction2(ReactParser.Function2Context ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#functionbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionbody(ReactParser.FunctionbodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#callFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallFun(ReactParser.CallFunContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#returnStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatment(ReactParser.ReturnStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#returnStatment1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatment1(ReactParser.ReturnStatment1Context ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#syntax}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSyntax(ReactParser.SyntaxContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#pureReact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPureReact(ReactParser.PureReactContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributes(ReactParser.AttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(ReactParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#attributeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeValue(ReactParser.AttributeValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#useRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseRef(ReactParser.UseRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#useState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseState(ReactParser.UseStateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(ReactParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(ReactParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#useEffet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseEffet(ReactParser.UseEffetContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#arrayy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayy(ReactParser.ArrayyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#map}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap(ReactParser.MapContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#onClick}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnClick(ReactParser.OnClickContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#htmlBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlBody(ReactParser.HtmlBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#hh}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHh(ReactParser.HhContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#mapMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapMethod(ReactParser.MapMethodContext ctx);
}