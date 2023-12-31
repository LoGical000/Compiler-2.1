package AST;

public class JSXClass {
    String id;
    Value value;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "JSXClass{" +
                "\nid='" + id + '\'' +
                "\n, value=" + value +
                "\n }";
    }
}
