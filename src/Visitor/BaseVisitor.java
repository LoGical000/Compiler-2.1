package Visitor;

import AST.*;
import SymbolTable.*;
import gen.ReactParser;
import gen.ReactParserBaseVisitor;

public class BaseVisitor extends ReactParserBaseVisitor {

    SymbolTable symbolTable = new SymbolTable();

    ///PROGRAM
    @Override
    public Program visitProgram(ReactParser.ProgramContext ctx) {
        Program program = new Program();
        for (int i=0;i<ctx.importStatement().size();i++) {
            if(ctx.importStatement(i)!=null)
            {
                program.getImportStatementList().add(visitImportStatement(ctx.importStatement(i)));
            }
        }
        for (int i=0;i<ctx.variableDeclaration().size();i++) {
            if(ctx.variableDeclaration(i)!=null)
            {
                program.getVariableDeclarationList().add(visitVariableDeclaration(ctx.variableDeclaration(i)));
            }
        }
        for (int i=0;i<ctx.functionDeclaration().size();i++) {
            if(ctx.functionDeclaration(i)!=null)
            {
                program.getFunctionDeclarationList().add(visitFunctionDeclaration(ctx.functionDeclaration(i)));
            }
        }
        program.setExport(visitExport(ctx.export()));

        this.symbolTable.print();

        return program;

    }

    ///IMPORT
    @Override
    public ImportStatement visitImportStatement(ReactParser.ImportStatementContext ctx) {
        ImportStatement importStatement=new ImportStatement();

        for (int i=0;i<ctx.ID().size();i++) {
            if(ctx.ID(i)!=null)
            {
                importStatement.getImports().add(ctx.ID(i).getText());
            }
        }
        for (int i=0;i<ctx.USESTATE().size();i++) {
            if(ctx.USESTATE(i)!=null)
            {
                importStatement.getImports().add(ctx.USESTATE(i).getText());
            }
        }
        for (int i=0;i<ctx.USEEFFECT().size();i++) {
            if(ctx.USEEFFECT(i)!=null)
            {
                importStatement.getImports().add(ctx.USEEFFECT(i).getText());
            }
        }
        importStatement.setFrom(ctx.STRING().getText());

        Row row = new Row();
        row.setType("IMPORTFROM");
        row.setValue(importStatement.getFrom());
        this.symbolTable.getRows().add(row);

        return importStatement;
    }

    ///VARIABLE DECLARATION
    @Override
    public VariableDeclaration visitVariableDeclaration(ReactParser.VariableDeclarationContext ctx) {
        VariableDeclaration variableDeclaration = new VariableDeclaration();



        //type
        if(ctx.VAR()!=null) {
            variableDeclaration.setType(ctx.VAR().getText());
        }
        else if(ctx.CONST()!=null) {
            variableDeclaration.setType(ctx.CONST().getText());
        }
        else {
            variableDeclaration.setType(ctx.LET().getText());
        }

        //variable
        variableDeclaration.setVariable(ctx.ID(0).getText());


        //value
        if(ctx.ID(1)!=null) {
            variableDeclaration.setId(ctx.ID(1).getText());
        }
        else if(ctx.functionDeclaration()!=null) {
            variableDeclaration.setFunctionDeclaration(visitFunctionDeclaration(ctx.functionDeclaration()));
        }
        else if(ctx.array()!=null) {
            variableDeclaration.setArray(visitArray(ctx.array()));
        }
        else {
            variableDeclaration.setValue(visitValue(ctx.value()));
        }



        Row row = new Row();
        row.setType("Variable");
        row.setValue(variableDeclaration.getVariable());
        this.symbolTable.getRows().add(row);

        return variableDeclaration;

    }

    ///FUNCTION DECLARATION
    @Override
    public FunctionDeclaration visitFunctionDeclaration(ReactParser.FunctionDeclarationContext ctx) {
        FunctionDeclaration functionDeclaration=new FunctionDeclaration();

        if (ctx.regularFunction()!=null)
            functionDeclaration.setRegularFunction(visitRegularFunction(ctx.regularFunction()));
        else if (ctx.callBackFunction()!=null)
            functionDeclaration.setCallBackFunction(visitCallBackFunction(ctx.callBackFunction()));

        return functionDeclaration;
    }

    ///REGULAR FUNCTION
    @Override
    public RegularFunction visitRegularFunction(ReactParser.RegularFunctionContext ctx) {
        RegularFunction regularFunction = new RegularFunction();

        regularFunction.setFunctionName(ctx.ID().getText());
        if (ctx.parameters()!=null)
            regularFunction.setParameters(visitParameters(ctx.parameters()));
        regularFunction.setFunctionBody(visitFunctionbody(ctx.functionbody()));


        Row row = new Row();
        row.setType("RegularFunction");
        row.setValue(regularFunction.getFunctionName());
        this.symbolTable.getRows().add(row);

        return regularFunction;
    }
    ///CALLBACK FUNCTION
    @Override
    public CallBackFunction visitCallBackFunction(ReactParser.CallBackFunctionContext ctx) {
        CallBackFunction callBackFunction = new CallBackFunction();

        if (ctx.parameters()!=null)
            callBackFunction.setParameters(visitParameters(ctx.parameters()));
        callBackFunction.setFunctionBody(visitFunctionbody(ctx.functionbody()));

        return callBackFunction;
    }

    ///EXPORT
    @Override
    public Export visitExport(ReactParser.ExportContext ctx) {
        Export export=new Export();
        export.setId(ctx.ID().getText());

        Row row = new Row();
        row.setType("Export");
        row.setValue(export.getId());
        this.symbolTable.getRows().add(row);

        return export;

    }
    ///PARAMETERS
    @Override
    public Parameters visitParameters(ReactParser.ParametersContext ctx) {
        Parameters parameters = new Parameters();
        for (int i=0;i<ctx.ID().size();i++) {
            if(ctx.ID(i)!=null)
            {
                parameters.getIds().add(ctx.ID(i).getText());
            }
        }


        return parameters;

    }

    ///FUNCTION BODY
    @Override
    public FunctionBody visitFunctionbody(ReactParser.FunctionbodyContext ctx) {
        FunctionBody functionBody = new FunctionBody();

        for (int i=0;i<ctx.funcStatement().size();i++) {
            if(ctx.funcStatement(i)!=null)
            {
                functionBody.getFuncStatementList().add(visitFuncStatement(ctx.funcStatement(i)));
            }
        }
        if(ctx.returnStatement()!=null){
            functionBody.setReturnStatement(visitReturnStatement(ctx.returnStatement()));
        }

        return functionBody;
    }


    @Override
    public FuncStatement visitFuncStatement(ReactParser.FuncStatementContext ctx) {
        FuncStatement funcStatement = new FuncStatement();

        if(ctx.useState()!=null)
            funcStatement.setUseState(visitUseState(ctx.useState()));
        else if(ctx.useEffect()!=null)
            funcStatement.setUseEffect(visitUseEffect(ctx.useEffect()));
        else if(ctx.useRef()!=null)
            funcStatement.setUseRef(visitUseRef(ctx.useRef()));
        else if(ctx.variableDeclaration()!=null)
            funcStatement.setVariableDeclaration(visitVariableDeclaration(ctx.variableDeclaration()));
        else if(ctx.print()!=null)
            funcStatement.setPrint(visitPrint(ctx.print()));
        else if(ctx.callFunc()!=null)
            funcStatement.setCallFunc(visitCallFunc(ctx.callFunc()));
        else if(ctx.jsx_element()!=null)
            funcStatement.setJsxElement(visitJsx_element(ctx.jsx_element()));


        return funcStatement;

    }

    @Override
    public UseEffect visitUseEffect(ReactParser.UseEffectContext ctx) {
        UseEffect useEffect = new UseEffect();

        useEffect.setCallBackFunction(visitCallBackFunction(ctx.callBackFunction()));
        for(int i=0;i<ctx.ID().size();i++){
            if(ctx.ID(i)!=null)
                useEffect.getIds().add(ctx.ID(i).getText());
        }

        return useEffect;
    }

    @Override
    public UseState visitUseState(ReactParser.UseStateContext ctx) {
        UseState useState = new UseState();

        useState.setId1(ctx.ID(0).getText());
        useState.setId2(ctx.ID(1).getText());
        useState.setValue(visitValue(ctx.value()));

        return useState;
    }

    @Override
    public UseRef visitUseRef(ReactParser.UseRefContext ctx) {
        UseRef useRef = new UseRef();

        for(int i=0;i<ctx.STRING().size();i++) {
            if (ctx.STRING(i) != null)
                useRef.getStrings().add(ctx.STRING(i).getText());
        }

        return useRef;
    }

    @Override
    public CallFunc visitCallFunc(ReactParser.CallFuncContext ctx) {
        CallFunc callFunc = new CallFunc();

        callFunc.setFuncName(ctx.ID(0).getText());
        for(int i=1;i<ctx.ID().size();i++){
            if(ctx.ID(i)!=null)
                callFunc.getArguments().add(ctx.ID(i).getText());
        }

        return callFunc;
    }

    @Override
    public Print visitPrint(ReactParser.PrintContext ctx) {
        Print print = new Print();

        for(int i=0;i<ctx.STRING().size();i++){
            if(ctx.STRING(i)!=null)
                print.getStrings().add(ctx.STRING(i).getText());
        }
        for(int i=0;i<ctx.INT().size();i++){
            if(ctx.INT(i)!=null)
                print.getStrings().add(ctx.INT(i).getText());
        }
        for(int i=0;i<ctx.ID().size();i++){
            if(ctx.ID(i)!=null)
                print.getStrings().add(ctx.ID(i).getText());
        }

        return print;
    }

    @Override
    public Value visitValue(ReactParser.ValueContext ctx) {
        Value value=new Value();

        if(ctx.STRING()!=null) {
            value.setString(ctx.STRING().getText());
            Row row = new Row();
            row.setType("StringValue");
            row.setValue(value.getString());
            this.symbolTable.getRows().add(row);
        }
        else if(ctx.INT()!=null) {
            value.setInteger(ctx.INT().getText());
            Row row = new Row();
            row.setType("IntValue");
            row.setValue(value.getInteger());
            this.symbolTable.getRows().add(row);
        }
        else if(ctx.DOUBLE()!=null) {
            value.setaDouble(ctx.DOUBLE().getText());
            Row row = new Row();
            row.setType("DoubleValue");
            row.setValue(value.getaDouble());
            this.symbolTable.getRows().add(row);
        }
        else if(ctx.NULL()!=null)
            value.setaNull(ctx.NULL().getText());
        else if(ctx.BOOL()!=null) {
            value.setaBoolean(ctx.BOOL().getText());
            Row row = new Row();
            row.setType("BoolValue");
            row.setValue(value.getaBoolean());
            this.symbolTable.getRows().add(row);
        }
        else if(ctx.valueIndex()!=null)
            value.setValueIndex(visitValueIndex(ctx.valueIndex()));

        return value;
    }

    @Override
    public ValueIndex visitValueIndex(ReactParser.ValueIndexContext ctx) {
        ValueIndex valueIndex= new ValueIndex();

        valueIndex.setArrayName(ctx.ID().getText());
        valueIndex.setIndex(ctx.INT().getText());

        return valueIndex;
    }

    @Override
    public Array visitArray(ReactParser.ArrayContext ctx) {
        Array array = new Array();

        if(ctx.arrayObjects()!=null)
            array.setArrayObjects(visitArrayObjects(ctx.arrayObjects()));
        else
            array.setArrayValues(visitArrayValues(ctx.arrayValues()));

        return array;
    }

    @Override
    public ArrayObjects visitArrayObjects(ReactParser.ArrayObjectsContext ctx) {
        ArrayObjects arrayObjects = new ArrayObjects();

        for(int i=0;i<ctx.object().size();i++){
            if(ctx.object(i)!=null)
                arrayObjects.getObjectList().add(visitObject(ctx.object(i)));
        }

        return  arrayObjects;
    }

    @Override
    public ArrayValues visitArrayValues(ReactParser.ArrayValuesContext ctx) {
        ArrayValues arrayValues = new ArrayValues();

        for(int i=0;i<ctx.value().size();i++){
            if(ctx.value(i)!=null)
                arrayValues.getValueList().add(visitValue(ctx.value(i)));
        }

        return arrayValues;
    }

    @Override
    public OBJECT visitObject(ReactParser.ObjectContext ctx) {
        OBJECT object = new OBJECT();

        for(int i=0;i<ctx.element().size();i++){
            if(ctx.element(i)!=null)
                object.getElementList().add(visitElement(ctx.element(i)));
        }

        return object;
    }

    @Override
    public Element visitElement(ReactParser.ElementContext ctx) {
        Element element = new Element();

        element.setId(ctx.ID().getText());
        if(ctx.value()!=null)
            element.setValue(visitValue(ctx.value()));
        else
            element.setArray(visitArray(ctx.array()));

        Row row = new Row();
        row.setType("Element");
        row.setValue(element.getId());
        this.symbolTable.getRows().add(row);

        return element;
    }

    @Override
    public ReturnStatement visitReturnStatement(ReactParser.ReturnStatementContext ctx) {
        ReturnStatement returnStatement = new ReturnStatement();

        for(int i=0;i<ctx.jsx_element().size();i++){
            if(ctx.jsx_element(i)!=null)
                returnStatement.getJsxElementList().add(visitJsx_element(ctx.jsx_element(i)));
        }

        return returnStatement;
    }

    @Override
    public MAP visitMap(ReactParser.MapContext ctx) {
        MAP map = new MAP();

        map.setObjectsList(ctx.ID(0).getText());
        map.setMapType(ctx.ID(1).getText());
        map.setObject(ctx.ID(2).getText());
        for(int i=0;i<ctx.jsx_element().size();i++){
            if (ctx.jsx_element(i)!=null)
                map.getJsxElementList().add(visitJsx_element(ctx.jsx_element(i)));
        }

        Row row = new Row();
        row.setType("Map");
        row.setValue(map.getObjectsList());
        this.symbolTable.getRows().add(row);

        return map;
    }

    @Override
    public JSXElement visitJsx_element(ReactParser.Jsx_elementContext ctx) {
        JSXElement jsxElement = new JSXElement();

        if(ctx.ID(0)!=null) {
            jsxElement.setJsxElementName(ctx.ID(0).getText());
            Row row = new Row();
            row.setType("JSXElement");
            row.setValue(jsxElement.getJsxElementName());
            this.symbolTable.getRows().add(row);
        }
        for(int i=0;i<ctx.jsx_attribute().size();i++){
            if (ctx.jsx_attribute(i)!=null)
                jsxElement.getJsxAttributeList().add(visitJsx_attribute(ctx.jsx_attribute(i)));
        }
        for(int i=0;i<ctx.jsx_class().size();i++){
            if (ctx.jsx_class(i)!=null)
                jsxElement.getJsxClassList().add(visitJsx_class(ctx.jsx_class(i)));
        }
        for(int i=0;i<ctx.content().size();i++){
            if (ctx.content(i)!=null)
                jsxElement.getContentList().add(visitContent(ctx.content(i)));
        }

        return jsxElement;
    }

    @Override
    public Content visitContent(ReactParser.ContentContext ctx) {
        Content content = new Content();

        if(ctx.ID()!=null)
            content.setId(ctx.ID().getText());
        else if (ctx.jsx_element()!=null)
            content.setJsxElement(visitJsx_element(ctx.jsx_element()));
        else if (ctx.map()!=null)
            content.setMap(visitMap(ctx.map()));
        else if (ctx.component()!=null)
            content.setComponent(visitComponent(ctx.component()));
        else if (ctx.shortIf()!=null)
            content.setShortIf(visitShortIf(ctx.shortIf()));
        else if (ctx.jsx_element()!=null)
            content.setUseAttribute(visitUseAttribute(ctx.useAttribute()));

        return content;
    }

    @Override
    public UseAttribute visitUseAttribute(ReactParser.UseAttributeContext ctx) {
        UseAttribute useAttribute = new UseAttribute();

        useAttribute.setObject(ctx.ID(0).getText());
        useAttribute.setAttribute(ctx.ID(1).getText());

        return useAttribute;
    }

    @Override
    public JSXClass visitJsx_class(ReactParser.Jsx_classContext ctx) {
        JSXClass jsxClass = new JSXClass();

        jsxClass.setId(ctx.ID().getText());
        jsxClass.setValue(visitValue(ctx.value()));

        Row row = new Row();
        row.setType("JSXClass");
        row.setValue(jsxClass.getId());
        this.symbolTable.getRows().add(row);

        return jsxClass;
    }

    @Override
    public JSXAttribute visitJsx_attribute(ReactParser.Jsx_attributeContext ctx) {
        JSXAttribute jsxAttribute = new JSXAttribute();

        jsxAttribute.setName(ctx.ID().getText());
        Row row = new Row();
        row.setType("JSXAttribute");
        row.setValue(jsxAttribute.getName());
        this.symbolTable.getRows().add(row);
        jsxAttribute.getAttributeDetailsList().add(visitAttributeDetails(ctx.attributeDetails(0)));
        for(int i=1;i<ctx.attributeDetails().size();i++){
            if(ctx.attributeDetails(i)!=null){
                jsxAttribute.getAttributeDetailsList().add(visitAttributeDetails(ctx.attributeDetails(i)));
            }
        }

        return jsxAttribute;
    }

    @Override
    public AttributeDetails visitAttributeDetails(ReactParser.AttributeDetailsContext ctx) {
        AttributeDetails attributeDetails = new AttributeDetails();

        if(ctx.STRING()!=null)
            attributeDetails.setString(ctx.STRING().getText());
        else if (ctx.attributeDetailsAttribute()!=null)
            attributeDetails.setAttributeDetailsAttribute(visitAttributeDetailsAttribute(ctx.attributeDetailsAttribute()));
        else if (ctx.attributeDetailsFunction()!=null)
            attributeDetails.setAttributeDetailsFunction(visitAttributeDetailsFunction(ctx.attributeDetailsFunction()));
        else {
            attributeDetails.setId(ctx.ID().getText());
            attributeDetails.setValue(visitValue(ctx.value()));
        }

        return attributeDetails;
    }

    @Override
    public AttributeDetailsFunction visitAttributeDetailsFunction(ReactParser.AttributeDetailsFunctionContext ctx) {
        AttributeDetailsFunction attributeDetailsFunction = new AttributeDetailsFunction();

        attributeDetailsFunction.setFunc(ctx.ID(0).getText());
        if(ctx.ID(1)!=null)
            attributeDetailsFunction.setId(ctx.ID(1).getText());
        else
            attributeDetailsFunction.setValue(visitValue(ctx.value()));

        return attributeDetailsFunction;
    }

    @Override
    public AttributeDetailsAttribute visitAttributeDetailsAttribute(ReactParser.AttributeDetailsAttributeContext ctx) {
        AttributeDetailsAttribute attributeDetailsAttribute = new AttributeDetailsAttribute();

        attributeDetailsAttribute.setId(ctx.ID(0).getText());
        if(ctx.ID(1)!=null)
            attributeDetailsAttribute.setAttribute(ctx.ID(1).getText());

        return attributeDetailsAttribute;
    }

    @Override
    public Component visitComponent(ReactParser.ComponentContext ctx) {
        Component component = new Component();

        component.setComponent(ctx.ID().getText());
        Row row = new Row();
        row.setType("Component");
        row.setValue(component.getComponent());
        this.symbolTable.getRows().add(row);
        for(int i=0;i<ctx.props().size();i++){
            if(ctx.props(i)!=null)
                component.getPropsList().add(visitProps(ctx.props(i)));
        }

        return component;
    }

    @Override
    public Props visitProps(ReactParser.PropsContext ctx) {
        Props props = new Props();

        props.setPropName(ctx.ID().getText());
        props.setPropValue(visitProp_value(ctx.prop_value()));

        Row row = new Row();
        row.setType("Prop");
        row.setValue(props.getPropName());
        this.symbolTable.getRows().add(row);

        return  props;
    }

    @Override
    public PropValue visitProp_value(ReactParser.Prop_valueContext ctx) {
        PropValue propValue = new PropValue();

        if(ctx.ID()!=null)
            propValue.setId(ctx.ID().getText());
        else
            propValue.setValue(visitValue(ctx.value()));

        return propValue;
    }

    @Override
    public ShortIf visitShortIf(ReactParser.ShortIfContext ctx) {
        ShortIf shortIf = new ShortIf();

        if(ctx.ID(0)!=null)
            shortIf.setConditionId(ctx.ID(0).getText());
        else
            shortIf.setConditionComponent(visitComponent(ctx.component(0)));

        for(int i=1;i<ctx.ID().size();i++)
            if(ctx.ID(i)!=null)
                shortIf.getIds().add(ctx.ID(i).getText());

        for(int i=1;i<ctx.component().size();i++)
            if(ctx.component(i)!=null)
                shortIf.getComponentList().add(visitComponent(ctx.component(i)));


        return shortIf;
    }

//
//    // Add a print_ast method
//    public void print_ast(Program root) {
//        System.out.println("Abstract Syntax Tree:");
//
//        // Start the recursive traversal
//        print_ast_recursive(root, 0);
//    }
//
//    // Recursive method to traverse and print the AST
//    private void print_ast_recursive(Node node, int depth) {
//        if (node != null) {
//            // Print current node
//            System.out.println(getIndent(depth) + node);
//
//            // Recursively print child nodes
//            for (Node child : node.()) {
//                print_ast_recursive(child, depth + 1);
//            }
//        }
//    }
//
//    // Helper method to generate indentation based on depth
//    private String getIndent(int depth) {
//        StringBuilder indent = new StringBuilder();
//        for (int i = 0; i < depth; i++) {
//            indent.append("  "); // Adjust the number of spaces for indentation
//        }
//        return indent.toString();
//    }
}
