package Visitor;

import AST.*;
import gen.ReactParser;
import gen.ReactParserBaseVisitor;

public class BaseVisitor extends ReactParserBaseVisitor {

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
        return program;

    }

    ///IMPORT
    @Override
    public ImportStatement visitImportStatement(ReactParser.ImportStatementContext ctx) {
        ImportStatement importStatement=new ImportStatement();
        return importStatement;
    }

    ///VARIABLE DECLARATION
    @Override
    public VariableDeclaration visitVariableDeclaration(ReactParser.VariableDeclarationContext ctx) {
        VariableDeclaration variableDeclaration = new VariableDeclaration();
        return variableDeclaration;

    }

    ///FUNCTION DECLARATION
    @Override
    public FunctionDeclaration visitFunctionDeclaration(ReactParser.FunctionDeclarationContext ctx) {
        FunctionDeclaration functionDeclaration=new FunctionDeclaration();
        if (ctx.regularFunction()!=null)
            functionDeclaration.setRegularFunction(visitRegularFunction(ctx.regularFunction()));
        if (ctx.callBackFunction()!=null)
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
      //  regularFunction.setFunctionBody(visitFunctionbody(ctx.functionbody()));

        return regularFunction;
    }
    ///CALLBACK FUNCTION
    @Override
    public CallBackFunction visitCallBackFunction(ReactParser.CallBackFunctionContext ctx) {
        CallBackFunction callBackFunction = new CallBackFunction();

        if (ctx.parameters()!=null)
            callBackFunction.setParameters(visitParameters(ctx.parameters()));
      //  callBackFunction.setFunctionBody(visitFunctionbody(ctx.functionbody()));

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

//    ///FUNCTION BODY
//    @Override
//    public FunctionBody visitFunctionbody(ReactParser.FunctionbodyContext ctx) {
//        FunctionBody functionBody = new FunctionBody();
//        if(ctx.returnStatement()!=null){
//            functionBody.setReturnStatement(visitReturnStatement(ctx.returnStatement()));
//        }
//        return functionBody;
//    }
//
//    @Override
//    public CallFun visitCallFun(ReactParser.CallFunContext ctx) {
//        CallFun callFun = new CallFun();
//        return callFun;
//    }
//
//    @Override
//    public Print visitPrint(ReactParser.PrintContext ctx) {
//        Print print = new Print();
//        for(int i=0;i<ctx.SingleLineString().size();i++){
//            if(ctx.SingleLineString(i)!=null)
//                print.getArguments().add(ctx.SingleLineString(i).getText());
//        }
//        return print;
//    }

//    @Override
//    public ReturnStatement visitReturnStatement(ReactParser.ReturnStatementContext ctx) {
//        ReturnStatement returnStatement = new ReturnStatement();
//        return returnStatement;
//    }
}
