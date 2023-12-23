package Visitor;

import AST.*;
import gen.ReactParser;
import gen.ReactParserBaseVisitor;

public class BaseVisitor extends ReactParserBaseVisitor {

    ///PROGRAM
    @Override
    public Program visitProgram(ReactParser.ProgramContext ctx) {
        Program program = new Program();
        for (int i=0;i<ctx.importStatment().size();i++) {
            if(ctx.importStatment(i)!=null)
            {
                program.getImportStatementList().add(visitImportStatment(ctx.importStatment(i)));
            }
        }
        for (int i=0;i<ctx.variableDeclaration().size();i++) {
            if(ctx.variableDeclaration(i)!=null)
            {
                program.getVariableDeclarationList().add(visitVariableDeclaration(ctx.variableDeclaration(i)));
            }
        }
        for (int i=0;i<ctx.regularFunction().size();i++) {
            if(ctx.regularFunction(i)!=null)
            {
                program.getRegularFunctionList().add(visitRegularFunction(ctx.regularFunction(i)));
            }
        }
        for (int i=0;i<ctx.export().size();i++) {
            if(ctx.export(i)!=null)
            {
                program.getExportList().add(visitExport(ctx.export(i)));
            }
        }
        return program;

    }

    ///IMPORT
    @Override
    public ImportStatement visitImportStatment(ReactParser.ImportStatmentContext ctx) {
        ImportStatement importStatement=new ImportStatement();
        return importStatement;
    }

    ///VARIABLE DECLARATION
    @Override
    public VariableDeclaration visitVariableDeclaration(ReactParser.VariableDeclarationContext ctx) {
        VariableDeclaration variableDeclaration = new VariableDeclaration();
        return variableDeclaration;

    }


    ///REGULAR FUNCTION
    @Override
    public RegularFunction visitRegularFunction(ReactParser.RegularFunctionContext ctx) {
        RegularFunction regularFunction = new RegularFunction();
        regularFunction.setFunctionName(ctx.ID(0).getText());

        for (int i=1;i<ctx.ID().size();i++){
            if (ctx.ID(i)!=null)
                regularFunction.getParameterList().add(ctx.ID(i).getText());
        }
        regularFunction.setBody(visitFunctionbody(ctx.functionbody()));

        return regularFunction;

    }

    ///EXPORT
    @Override
    public Export visitExport(ReactParser.ExportContext ctx) {
        Export export=new Export();
        return export;

    }

    @Override
    public FunctionBody visitFunctionbody(ReactParser.FunctionbodyContext ctx) {
        FunctionBody functionBody = new FunctionBody();
        return functionBody;
    }
}
