package AST;

import java.util.ArrayList;
import java.util.List;

public class CallFun {
    private String functionName;
    private List<String> parameters = new ArrayList<>();

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public List<String> getParameters() {
        return parameters;
    }

    public void setParameters(List<String> parameters) {
        this.parameters = parameters;
    }

    @Override
    public String toString() {
        return "CallFun{" +
                "functionName='" + functionName + '\'' +
                ", parameters=" + parameters +
                '}';
    }
}
