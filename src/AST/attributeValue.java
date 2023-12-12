package AST;

public class attributeValue {

   String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public attributeValue(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "attributeValue{" +
                "id='" + id + '\'' +
                '}';
    }
}
