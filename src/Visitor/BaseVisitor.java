package Visitor;

import AST.*;
import SymbolTable.*;
import gen.ReactParser;
import gen.ReactParserBaseVisitor;

public class BaseVisitor extends ReactParserBaseVisitor {

    SymbolTable symbolTable = new SymbolTable();
    Row row = new Row();

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
        if(ctx.VAR()!=null)
            variableDeclaration.setType(ctx.VAR().getText());
        else if(ctx.CONST()!=null)
            variableDeclaration.setType(ctx.CONST().getText());
        else
            variableDeclaration.setType(ctx.LET().getText());

        //variable
        variableDeclaration.setVariable(ctx.ID(0).getText());

        //value
        if(ctx.ID(1)!=null)
            variableDeclaration.setId(ctx.ID(1).getText());
        else if(ctx.functionDeclaration()!=null)
            variableDeclaration.setFunctionDeclaration(visitFunctionDeclaration(ctx.functionDeclaration()));
        else if(ctx.array()!=null)
            variableDeclaration.setArray(visitArray(ctx.array()));
        else
            variableDeclaration.setValue(visitValue(ctx.value()));



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
        row.setType("FuncNAME");
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

        if(ctx.STRING()!=null)
            value.setString(ctx.STRING().getText());
        else if(ctx.INT()!=null)
            value.setInteger(ctx.INT().getText());
        else if(ctx.DOUBLE()!=null)
            value.setaDouble(ctx.DOUBLE().getText());
        else if(ctx.NULL()!=null)
            value.setaNull(ctx.NULL().getText());
        else if(ctx.BOOL()!=null)
            value.setaBoolean(ctx.BOOL().getText());

        return value;
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

        return map;
    }

    @Override
    public JSXElement visitJsx_element(ReactParser.Jsx_elementContext ctx) {
        JSXElement jsxElement = new JSXElement();
        return jsxElement;
    }
}
