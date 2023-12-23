package AST;



import java.util.ArrayList;
import java.util.List;

public class Program {
    List<ImportStatement> importStatementList = new ArrayList<ImportStatement>();
    List<RegularFunction> regularFunctionList = new ArrayList<RegularFunction>();
    List<VariableDeclaration> variableDeclarationList = new ArrayList<VariableDeclaration>();
    List<Export> exportList = new ArrayList<Export>();


    public List<ImportStatement> getImportStatementList() {
        return importStatementList;
    }

    public void setImportStatementList(List<ImportStatement> importStatementList) {
        this.importStatementList = importStatementList;
    }

    public List<RegularFunction> getRegularFunctionList() {
        return regularFunctionList;
    }

    public void setRegularFunctionList(List<RegularFunction> regularFunctionList) {
        this.regularFunctionList = regularFunctionList;
    }

    public List<VariableDeclaration> getVariableDeclarationList() {
        return variableDeclarationList;
    }

    public void setVariableDeclarationList(List<VariableDeclaration> variableDeclarationList) {
        this.variableDeclarationList = variableDeclarationList;
    }

    public List<Export> getExportList() {
        return exportList;
    }

    public void setExportList(List<Export> exportList) {
        this.exportList = exportList;
    }

    @Override
    public String toString() {
        return "Program{" +
                "\n importStatementList=" + importStatementList +
                "\n , regularFunctionList=" + regularFunctionList +
                "\n , variableDeclarationList=" + variableDeclarationList +
                "\n , exportList=" + exportList +
                "\n }";
    }
}
