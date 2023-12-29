// Generated from C:/Users/anast/OneDrive/Desktop/COMPILER X/Compiler-2.1/ReactParser.g4 by ANTLR 4.13.1
package gen;
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
	 * Visit a parse tree produced by {@link ReactParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ReactParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(ReactParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#export}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExport(ReactParser.ExportContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(ReactParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(ReactParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#regularFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularFunction(ReactParser.RegularFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#callBackFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallBackFunction(ReactParser.CallBackFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(ReactParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#functionbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionbody(ReactParser.FunctionbodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#funcStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncStatement(ReactParser.FuncStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#callFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallFunc(ReactParser.CallFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(ReactParser.ReturnStatementContext ctx);
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
	 * Visit a parse tree produced by {@link ReactParser#useEffect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseEffect(ReactParser.UseEffectContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#map}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap(ReactParser.MapContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsx_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsx_element(ReactParser.Jsx_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(ReactParser.ContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#useAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseAttribute(ReactParser.UseAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsx_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsx_attribute(ReactParser.Jsx_attributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsx_class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsx_class(ReactParser.Jsx_classContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#attributeDetails}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeDetails(ReactParser.AttributeDetailsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#attributeDetailsFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeDetailsFunction(ReactParser.AttributeDetailsFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#attributeDetailsAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeDetailsAttribute(ReactParser.AttributeDetailsAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#component}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent(ReactParser.ComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#props}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProps(ReactParser.PropsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#prop_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProp_value(ReactParser.Prop_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#shortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortIf(ReactParser.ShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(ReactParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#valueIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueIndex(ReactParser.ValueIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(ReactParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#arrayObjects}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayObjects(ReactParser.ArrayObjectsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#arrayValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayValues(ReactParser.ArrayValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(ReactParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(ReactParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(ReactParser.PrintContext ctx);
}