package AST;

public class AttributeDetails {
    String string;
    String id;
    Value value;
    AttributeDetailsAttribute attributeDetailsAttribute;
    AttributeDetailsFunction attributeDetailsFunction;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
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

    public AttributeDetailsAttribute getAttributeDetailsAttribute() {
        return attributeDetailsAttribute;
    }

    public void setAttributeDetailsAttribute(AttributeDetailsAttribute attributeDetailsAttribute) {
        this.attributeDetailsAttribute = attributeDetailsAttribute;
    }

    public AttributeDetailsFunction getAttributeDetailsFunction() {
        return attributeDetailsFunction;
    }

    public void setAttributeDetailsFunction(AttributeDetailsFunction attributeDetailsFunction) {
        this.attributeDetailsFunction = attributeDetailsFunction;
    }


    @Override
    public String toString() {
        if(string != null)
            return "AttributeDetails{" +
                "\nstring='" + string + '\'' +
                "\n}";
        else if (attributeDetailsAttribute != null)
            return "AttributeDetails{" +
                    "\nattributeDetailsAttribute='" + attributeDetailsAttribute + '\'' +
                    "\n}";
        else if (attributeDetailsFunction != null)
            return "AttributeDetails{" +
                    "\nattributeDetailsFunction='" + attributeDetailsFunction + '\'' +
                    "\n}";
        return "AttributeDetails{" +
                "\n id='" + id + '\'' +
                "\n, value=" + value +
                "\n}";
    }
}
