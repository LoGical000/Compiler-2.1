package AST;

import java.util.ArrayList;
import java.util.List;

public class ReturnStatement {
    List<JSXElement> jsxElementList = new ArrayList<>();

    public List<JSXElement> getJsxElementList() {
        return jsxElementList;
    }

    public void setJsxElementList(List<JSXElement> jsxElementList) {
        this.jsxElementList = jsxElementList;
    }

    @Override
    public String toString() {
        return "ReturnStatement{" +
                "\n jsxElementList=" + jsxElementList +
                "\n}";
    }
}
