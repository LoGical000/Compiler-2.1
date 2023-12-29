package AST;

public class AttributeDetailsAttribute {
    String id;
    String attribute;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    @Override
    public String toString() {
        if(attribute!=null)
            return "AttributeDetailsAttribute{" +
                    "\n id='" + id + '\'' +
                    "\n, attribute='" + attribute + '\'' +
                    "\n }";
        return "AttributeDetailsAttribute{" +
                "\n id='" + id + '\'' +
                "\n }";
    }
}
