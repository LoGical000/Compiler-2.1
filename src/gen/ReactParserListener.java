// Generated from C:/Users/anast/OneDrive/Desktop/COMPILER X/Compiler-2.1/ReactParser.g4 by ANTLR 4.13.1
package gen;
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
	 * Enter a parse tree produced by {@link ReactParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(ReactParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(ReactParser.ImportStatementContext ctx);
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
	 * Enter a parse tree produced by {@link ReactParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(ReactParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(ReactParser.FunctionDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link ReactParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(ReactParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(ReactParser.ParametersContext ctx);
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
	 * Enter a parse tree produced by {@link ReactParser#funcStatement}.
	 * @param ctx the parse tree
	 */
	void enterFuncStatement(ReactParser.FuncStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#funcStatement}.
	 * @param ctx the parse tree
	 */
	void exitFuncStatement(ReactParser.FuncStatementContext ctx);
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
	 * Enter a parse tree produced by {@link ReactParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(ReactParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(ReactParser.ReturnStatementContext ctx);
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
	 * Enter a parse tree produced by {@link ReactParser#useEffect}.
	 * @param ctx the parse tree
	 */
	void enterUseEffect(ReactParser.UseEffectContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#useEffect}.
	 * @param ctx the parse tree
	 */
	void exitUseEffect(ReactParser.UseEffectContext ctx);
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
	 * Enter a parse tree produced by {@link ReactParser#jsx_element}.
	 * @param ctx the parse tree
	 */
	void enterJsx_element(ReactParser.Jsx_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsx_element}.
	 * @param ctx the parse tree
	 */
	void exitJsx_element(ReactParser.Jsx_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(ReactParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(ReactParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#useAttribute}.
	 * @param ctx the parse tree
	 */
	void enterUseAttribute(ReactParser.UseAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#useAttribute}.
	 * @param ctx the parse tree
	 */
	void exitUseAttribute(ReactParser.UseAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#jsx_attribute}.
	 * @param ctx the parse tree
	 */
	void enterJsx_attribute(ReactParser.Jsx_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsx_attribute}.
	 * @param ctx the parse tree
	 */
	void exitJsx_attribute(ReactParser.Jsx_attributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#attributeDetails}.
	 * @param ctx the parse tree
	 */
	void enterAttributeDetails(ReactParser.AttributeDetailsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#attributeDetails}.
	 * @param ctx the parse tree
	 */
	void exitAttributeDetails(ReactParser.AttributeDetailsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#attributeDetailsFunction}.
	 * @param ctx the parse tree
	 */
	void enterAttributeDetailsFunction(ReactParser.AttributeDetailsFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#attributeDetailsFunction}.
	 * @param ctx the parse tree
	 */
	void exitAttributeDetailsFunction(ReactParser.AttributeDetailsFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#attributeDetailsAttribute}.
	 * @param ctx the parse tree
	 */
	void enterAttributeDetailsAttribute(ReactParser.AttributeDetailsAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#attributeDetailsAttribute}.
	 * @param ctx the parse tree
	 */
	void exitAttributeDetailsAttribute(ReactParser.AttributeDetailsAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#component}.
	 * @param ctx the parse tree
	 */
	void enterComponent(ReactParser.ComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#component}.
	 * @param ctx the parse tree
	 */
	void exitComponent(ReactParser.ComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#props}.
	 * @param ctx the parse tree
	 */
	void enterProps(ReactParser.PropsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#props}.
	 * @param ctx the parse tree
	 */
	void exitProps(ReactParser.PropsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#name_prop}.
	 * @param ctx the parse tree
	 */
	void enterName_prop(ReactParser.Name_propContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#name_prop}.
	 * @param ctx the parse tree
	 */
	void exitName_prop(ReactParser.Name_propContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#prop_value}.
	 * @param ctx the parse tree
	 */
	void enterProp_value(ReactParser.Prop_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#prop_value}.
	 * @param ctx the parse tree
	 */
	void exitProp_value(ReactParser.Prop_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#shortIf}.
	 * @param ctx the parse tree
	 */
	void enterShortIf(ReactParser.ShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#shortIf}.
	 * @param ctx the parse tree
	 */
	void exitShortIf(ReactParser.ShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#values}.
	 * @param ctx the parse tree
	 */
	void enterValues(ReactParser.ValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#values}.
	 * @param ctx the parse tree
	 */
	void exitValues(ReactParser.ValuesContext ctx);
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
	 * Enter a parse tree produced by {@link ReactParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(ReactParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(ReactParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(ReactParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(ReactParser.ElementContext ctx);
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
}