package AST;

public class FunctionDeclaration {
    RegularFunction regularFunction;
    CallBackFunction callBackFunction;

    public RegularFunction getRegularFunction() {
        return regularFunction;
    }

    public void setRegularFunction(RegularFunction regularFunction) {
        this.regularFunction = regularFunction;
    }

    public CallBackFunction getCallBackFunction() {
        return callBackFunction;
    }

    public void setCallBackFunction(CallBackFunction callBackFunction) {
        this.callBackFunction = callBackFunction;
    }

    @Override
    public String toString() {
        if(regularFunction != null)
            return "FunctionDeclaration{" +
                    "\n regularFunction=" + regularFunction +
                    "\n }";

        return "callBackFunction{" +
                "\n callBackFunction=" + callBackFunction +
                "\n }";
    }
}
