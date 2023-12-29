package AST;

public class PropValue {
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
        if(id != null)
            return "PropValue{" +
                    "\nid='" + id +
                    "\n}";

        return "PropValue{" +
                "\nvalue='" + value +
                "\n}";
    }
}

