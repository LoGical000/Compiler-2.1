package AST;

public class UseAttribute {
    String object;
    String attribute;

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    @Override
    public String toString() {
        return "UseAttribute{" +
                "\nobject='" + object +
                "\n,attribute='" + attribute +
                "\n}";
    }
}
