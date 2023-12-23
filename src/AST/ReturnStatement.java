package AST;

public class ReturnStatement {
    private PureReact pureReact;
    private Html html;

    public PureReact getPureReact() {
        return pureReact;
    }

    public void setPureReact(PureReact pureReact) {
        this.pureReact = pureReact;
    }

    public Html getHtml() {
        return html;
    }

    public void setHtml(Html html) {
        this.html = html;
    }

    @Override
    public String toString() {
        return "ReturnStatement{" +
                "pureReact=" + pureReact +
                ", html=" + html +
                '}';
    }
}
