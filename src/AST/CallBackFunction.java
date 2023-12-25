package AST;

public class CallBackFunction {
    Parameters parameters;
    FunctionBody functionBody;

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
        return "CallBackFunction{" +
                "\n parameters=" + parameters +
                "\n functionBody=" + functionBody +
                "\n}";
    }
}
