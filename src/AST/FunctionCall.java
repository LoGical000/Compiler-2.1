package AST;

public class FunctionCall {

    private String id;
    private String string;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "FunctionCall{" +
                "id='" + id + '\'' +
                ", string='" + string + '\'' +
                '}';
    }
}
