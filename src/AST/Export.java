package AST;

public class Export {
    private String Id;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    @Override
    public String toString() {
        return "\n Export{" +
                "\n Id='" + Id + '\'' +
                "\n }";
    }
}
