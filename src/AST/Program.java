package AST;

import java.util.ArrayList;
import java.util.List;

public class Program {
    List<ImportStatement> importStatementList = new ArrayList<ImportStatement>();
    List<VariableDeclaration> variableDeclarationList = new ArrayList<VariableDeclaration>();
    List<FunctionDeclaration> functionDeclarationList = new ArrayList<FunctionDeclaration>();
    Export export;

    public List<ImportStatement> getImportStatementList() {
        return importStatementList;
    }

    public void setImportStatementList(List<ImportStatement> importStatementList) {
        this.importStatementList = importStatementList;
    }

    public List<VariableDeclaration> getVariableDeclarationList() {
        return variableDeclarationList;
    }

    public void setVariableDeclarationList(List<VariableDeclaration> variableDeclarationList) {
        this.variableDeclarationList = variableDeclarationList;
    }

    public List<FunctionDeclaration> getFunctionDeclarationList() {
        return functionDeclarationList;
    }

    public void setFunctionDeclarationList(List<FunctionDeclaration> functionDeclarationList) {
        this.functionDeclarationList = functionDeclarationList;
    }

    public Export getExport() {
        return export;
    }

    public void setExport(Export export) {
        this.export = export;
    }

    @Override
    public String toString() {
        return "Program{" +
                "\n importStatementList=" + importStatementList +
                "\n variableDeclarationList=" + variableDeclarationList +
                "\n functionDeclarationList=" + functionDeclarationList +
                "\n export=" + export +
                "\n}";
    }
}
