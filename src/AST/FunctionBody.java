package AST;

import java.util.ArrayList;
import java.util.List;

public class FunctionBody {
    List<FuncStatement> funcStatementList= new ArrayList<>();
    ReturnStatement returnStatement;

    public List<FuncStatement> getFuncStatementList() {
        return funcStatementList;
    }

    public void setFuncStatementList(List<FuncStatement> funcStatementList) {
        this.funcStatementList = funcStatementList;
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
                "\n funcStatementList=" + funcStatementList +
                "\n returnStatement=" + returnStatement +
                "\n }";
    }
}
