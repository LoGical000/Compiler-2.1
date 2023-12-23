package AST;

public class HtmlHtml {
    private String id;
    private Html html;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Html getHtml() {
        return html;
    }

    public void setHtml(Html html) {
        this.html = html;
    }

    @Override
    public String toString() {
        return "HtmlHtml{" +
                "id='" + id + '\'' +
                ", html=" + html +
                '}';
    }
}
