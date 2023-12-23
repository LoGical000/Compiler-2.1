package AST;

public class Array {
    private String type;
    private ArrayContent arrayContent;
    private UseState useState;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayContent getArrayContent() {
        return arrayContent;
    }

    public void setArrayContent(ArrayContent arrayContent) {
        this.arrayContent = arrayContent;
    }

    public UseState getUseState() {
        return useState;
    }

    public void setUseState(UseState useState) {
        this.useState = useState;
    }

    @Override
    public String toString() {
        return "Array{" +
                "type='" + type + '\'' +
                ", arrayContent=" + arrayContent +
                ", useState=" + useState +
                '}';
    }
}
