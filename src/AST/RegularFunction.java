package AST;

public class RegularFunction {
    String functionName;
    Parameters parameters;
    FunctionBody functionBody;

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public Parameters getParameters() {
        return parameters;
    }

    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }

    public FunctionBody getFunctionBody() {
        return functionBody;
    }

    public void setFunctionBody(FunctionBody functionBody) {
        this.functionBody = functionBody;
    }

    @Override
    public String toString() {
        return "RegularFunction{" +
                "\n functionName='" + functionName + '\'' +
                "\n parameters=" + parameters +
                "\n functionBody=" + functionBody +
                "\n }";
    }
}
