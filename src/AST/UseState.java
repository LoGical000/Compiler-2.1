package AST;

public class UseState {
    String id1;
    String id2;
    Value value;

    public String getId1() {
        return id1;
    }

    public void setId1(String id1) {
        this.id1 = id1;
    }

    public String getId2() {
        return id2;
    }

    public void setId2(String id2) {
        this.id2 = id2;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "UseState{" +
                "id1='" + id1 + '\'' +
                ", id2='" + id2 + '\'' +
                "\n values=" + value +
                '}';
    }
}
