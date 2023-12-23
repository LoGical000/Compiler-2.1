package AST;

public class UseEffect {
    private CallBackFunction callBackFunction;
    private ArrayContent arrayContent;

    public CallBackFunction getCallBackFunction() {
        return callBackFunction;
    }

    public void setCallBackFunction(CallBackFunction callBackFunction) {
        this.callBackFunction = callBackFunction;
    }

    public ArrayContent getArrayContent() {
        return arrayContent;
    }

    public void setArrayContent(ArrayContent arrayContent) {
        this.arrayContent = arrayContent;
    }

    @Override
    public String toString() {
        return "UseEffect{" +
                "callBackFunction=" + callBackFunction +
                ", arrayContent=" + arrayContent +
                '}';
    }
}
