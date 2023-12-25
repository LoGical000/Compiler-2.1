package AST;

import java.util.ArrayList;
import java.util.List;

public class UseEffect {
    CallBackFunction callBackFunction;
    List<String> ids = new ArrayList<>();

    public CallBackFunction getCallBackFunction() {
        return callBackFunction;
    }

    public void setCallBackFunction(CallBackFunction callBackFunction) {
        this.callBackFunction = callBackFunction;
    }

    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    @Override
    public String toString() {
        return "UseEffect{" +
                "callBackFunction=" + callBackFunction +
                ", ids=" + ids +
                '}';
    }
}
