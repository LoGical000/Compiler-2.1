package AST;

public class AttributeValue {

   private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AttributeValue(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "attributeValue{" +
                "id='" + id + '\'' +
                '}';
    }
}
