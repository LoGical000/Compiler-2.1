package AST;



public class Element {
    String id;
    Value value;
    Array array;


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

    public Array getArray() {
        return array;
    }

    public void setArray(Array array) {
        this.array = array;
    }

    @Override
    public String toString() {
        if (value != null){
            return "Element{" +
                    "id='" + id + '\'' +
                    "\n, value=" + value +
                    "\n }";
    }
        else {
            return "Element{" +
                    "id='" + id + '\'' +
                    "\n, array=" + array +
                    "\n }";
        }
    }
}
