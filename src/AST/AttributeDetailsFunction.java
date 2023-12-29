package AST;

public class AttributeDetailsFunction {
    String func;
    String id;
    Value value;

    public String getFunc() {
        return func;
    }

    public void setFunc(String func) {
        this.func = func;
    }

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
        if(value!=null)
            return "AttributeDetailsFunction{" +
                    "\n func='" + func + '\'' +
                    "\n, value=" + value +
                    "\n }";
        return "AttributeDetailsFunction{" +
                "\n func='" + func + '\'' +
                "\n, id='" + id + '\'' +
                "\n }";
    }
}
