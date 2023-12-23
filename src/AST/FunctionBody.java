package AST;



import java.util.ArrayList;
import java.util.List;

public class FunctionBody {
    List<VariableDeclaration> variableDeclarationList = new ArrayList<>();
    List<Print> printList = new ArrayList<>();
    List<CallFun> callFunList = new ArrayList<>();
    ReturnStatement returnStatement;

    public List<VariableDeclaration> getVariableDeclarationList() {
        return variableDeclarationList;
    }

    public void setVariableDeclarationList(List<VariableDeclaration> variableDeclarationList) {
        this.variableDeclarationList = variableDeclarationList;
    }

    public List<Print> getPrintList() {
        return printList;
    }

    public void setPrintList(List<Print> printList) {
        this.printList = printList;
    }

    public List<CallFun> getCallFunList() {
        return callFunList;
    }

    public void setCallFunList(List<CallFun> callFunList) {
        this.callFunList = callFunList;
    }

    public ReturnStatement getReturnStatement() {
        return returnStatement;
    }

    public void setReturnStatement(ReturnStatement returnStatement) {
        this.returnStatement = returnStatement;
    }

    @Override
    public String toString() {
        return "FunctionBody{" +
                "variableDeclarationList=" + variableDeclarationList +
                ", printList=" + printList +
                ", callFunList=" + callFunList +
                ", returnStatement=" + returnStatement +
                '}';
    }
}
