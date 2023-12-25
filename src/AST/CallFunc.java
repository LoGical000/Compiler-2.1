package AST;

import java.util.ArrayList;
import java.util.List;

public class CallFunc {
    String funcName;
    List<String> arguments = new ArrayList<>();

    public String getFuncName() {
        return funcName;
    }

    public void setFuncName(String funcName) {
        this.funcName = funcName;
    }

    public List<String> getArguments() {
        return arguments;
    }

    public void setArguments(List<String> arguments) {
        this.arguments = arguments;
    }

    @Override
    public String toString() {
        return "CallFunc{" +
                "\n funcName='" + funcName + '\'' +
                "\n arguments=" + arguments +
                '}';
    }
}
