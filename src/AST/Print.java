package AST;

import java.util.ArrayList;
import java.util.List;

public class Print {

    List<String> arguments = new ArrayList<>();

    public List<String> getArguments() {
        return arguments;
    }

    public void setArguments(List<String> arguments) {
        this.arguments = arguments;
    }

    @Override
    public String toString() {
        return "Print{" +
                "arguments=" + arguments +
                '}';
    }
}
