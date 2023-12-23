package AST;

public class OnClick {
    private CallBackFunction callBackFunction;

    public CallBackFunction getCallBackFunction() {
        return callBackFunction;
    }

    public void setCallBackFunction(CallBackFunction callBackFunction) {
        this.callBackFunction = callBackFunction;
    }

    @Override
    public String toString() {
        return "OnClick{" +
                "callBackFunction=" + callBackFunction +
                '}';
    }
}
