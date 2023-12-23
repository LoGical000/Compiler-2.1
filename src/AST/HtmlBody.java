package AST;

public class HtmlBody {
    private HtmlHtml htmlHtml;
    private MapMethod mapMethod;

    public HtmlHtml getHtmlHtml() {
        return htmlHtml;
    }

    public void setHtmlHtml(HtmlHtml htmlhtml) {
        this.htmlHtml = htmlhtml;
    }

    public MapMethod getMapMethod() {
        return mapMethod;
    }

    public void setMapMethod(MapMethod mapMethod) {
        this.mapMethod = mapMethod;
    }

    @Override
    public String toString() {
        return "HtmlBody{" +
                "htmlHtml=" + htmlHtml +
                ", mapMethod=" + mapMethod +
                '}';
    }
}
