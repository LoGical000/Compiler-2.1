package AST;

public class PureReact {
    private String id ;
    private Attributes attributes;
    private PureReact pureReact;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public PureReact getPureReact() {
        return pureReact;
    }

    public void setPureReact(PureReact pureReact) {
        this.pureReact = pureReact;
    }

    @Override
    public String toString() {
        return "PureReact{" +
                "id='" + id + '\'' +
                ", attributes=" + attributes +
                ", pureReact=" + pureReact +
                '}';
    }
}
