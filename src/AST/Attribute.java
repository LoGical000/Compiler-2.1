package AST;

public class Attribute {
    private String Id ;
    private AttributeValue attributeValue;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public AttributeValue getAttributeValue() {
        return attributeValue;
    }

    public void setAttributeValue(AttributeValue attributeValue) {
        this.attributeValue = attributeValue;
    }

    @Override
    public String toString() {
        return "Attribute{" +
                "Id='" + Id + '\'' +
                ", attributeValue=" + attributeValue +
                '}';
    }
}
