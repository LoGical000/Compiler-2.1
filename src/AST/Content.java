package AST;

public class Content {
    JSXElement jsxElement;
    ShortIf shortIf;
    MAP map;
    UseAttribute useAttribute;
    Component component;
    String id;

    public JSXElement getJsxElement() {
        return jsxElement;
    }

    public void setJsxElement(JSXElement jsxElement) {
        this.jsxElement = jsxElement;
    }

    public ShortIf getShortIf() {
        return shortIf;
    }

    public void setShortIf(ShortIf shortIf) {
        this.shortIf = shortIf;
    }

    public MAP getMap() {
        return map;
    }

    public void setMap(MAP map) {
        this.map = map;
    }

    public UseAttribute getUseAtteribute() {
        return useAttribute;
    }

    public void setUseAttribute(UseAttribute useAttribute) {
        this.useAttribute = useAttribute;
    }

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        if(jsxElement != null)
            return "Content{" +
                    "\njsxElement=" + jsxElement +
                    "\n}";

        if(shortIf != null)
            return "Content{" +
                    "\nshortIf=" + shortIf +
                    "\n}";

        if(map != null)
            return "Content{" +
                    "\nmap=" + map +
                    "\n}";

        if(useAttribute != null)
            return "Content{" +
                    "\nuseAttribute=" + useAttribute +
                    "\n}";

        if(component != null)
            return "Content{" +
                    "\ncomponent=" + component +
                    "\n}";

        return "Content{" +
                "\nid=" + id +
                "\n}";


    }
}
