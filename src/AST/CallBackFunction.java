package AST;

import java.util.ArrayList;
import java.util.List;

public class CallBackFunction {
    List<String> arguments = new ArrayList<>();
    private FunctionBody body ;

    public List<String> getArguments() {
        return arguments;
    }

    public void setArguments(List<String> arguments) {
        this.arguments = arguments;
    }

    public FunctionBody getBody() {
        return body;
    }

    public void setBody(FunctionBody body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "CallBackFunction{" +
                "arguments=" + arguments +
                ", body=" + body +
                '}';
    }
}
