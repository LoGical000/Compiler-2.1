package AST;

public class Export {
    String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Export{" +
                "\nid='" + id + '\'' +
                "\n}";
    }
}
