package AST;

import java.util.ArrayList;
import java.util.List;

public class RegularFunction extends ASTNode {
    private String functionName;
    private List<String> parameterList = new ArrayList<>();
    private FunctionBody body ;

    // Constructors, getters, and setters

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public List<String> getParameterList() {
        return parameterList;
    }

    public void setParameterList(List<String> parameterList) {
        this.parameterList = parameterList;
    }

    public FunctionBody getBody() {
        return body;
    }

    public void setBody(FunctionBody body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "RegularFunction{" +
                "\n functionName='" + functionName + '\'' +
                "\n , parameterList=" + parameterList +
                "\n , body=" + body +
                "\n }";
    }
}
