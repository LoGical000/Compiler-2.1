package AST;

public class VariableDeclaration {
    String type;
    String variable;
    String id;
    FunctionDeclaration functionDeclaration;
    Array array;
    Value value;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FunctionDeclaration getFunctionDeclaration() {
        return functionDeclaration;
    }

    public void setFunctionDeclaration(FunctionDeclaration functionDeclaration) {
        this.functionDeclaration = functionDeclaration;
    }

    public Array getArray() {
        return array;
    }

    public void setArray(Array array) {
        this.array = array;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @Override
    public String toString() {
        if (value != null)
            return "VariableDeclaration{" +
                    "type='" + type + '\'' +
                    ", variable='" + variable + '\'' +
                    ", value=" + value +
                    '}';

        else if (functionDeclaration != null)
            return "VariableDeclaration{" +
                    "type='" + type + '\'' +
                    ", variable='" + variable + '\'' +
                    ", functionDeclaration=" + functionDeclaration +
                    '}';

        else if (array != null)
            return "VariableDeclaration{" +
                    "type='" + type + '\'' +
                    ", variable='" + variable + '\'' +
                    ", array=" + array +
                    '}';

        return "VariableDeclaration{" +
                "type='" + type + '\'' +
                ", variable='" + variable + '\'' +
                ", id=" + id +
                '}';
    }
}
