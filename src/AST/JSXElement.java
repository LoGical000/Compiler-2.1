package AST;

import java.util.ArrayList;
import java.util.List;

public class JSXElement {
    String jsxElementName;
    List<JSXAttribute> jsxAttributeList = new ArrayList<>();
    List<JSXClass> jsxClassList = new ArrayList<>();
    List<Content> contentList = new ArrayList<>();

    public List<JSXAttribute> getJsxAttributeList() {
        return jsxAttributeList;
    }

    public void setJsxAttributeList(List<JSXAttribute> jsxAttributeList) {
        this.jsxAttributeList = jsxAttributeList;
    }

    public List<Content> getContentList() {
        return contentList;
    }

    public void setContentList(List<Content> contentList) {
        this.contentList = contentList;
    }

    public List<JSXClass> getJsxClassList() {
        return jsxClassList;
    }

    public void setJsxClassList(List<JSXClass> jsxClassList) {
        this.jsxClassList = jsxClassList;
    }

    public String getJsxElementName() {
        return jsxElementName;
    }

    public void setJsxElementName(String jsxElementName) {
        this.jsxElementName = jsxElementName;
    }

    @Override
    public String toString() {
        if(jsxElementName!=null && contentList!=null && jsxAttributeList!=null)
            return "JSXElement{" +
                    "\njsxElementName=" + jsxElementName +
                    "\njsxAttributeList=" + jsxAttributeList +
                    "\n, contentList=" + contentList +
                    "\n}";
        else if (jsxElementName!=null && contentList!=null && jsxClassList!=null)
            return "JSXElement{" +
                    "\njsxElementName=" + jsxElementName +
                    "\njsxClassList=" + jsxClassList +
                    "\n, contentList=" + contentList +
                    "\n}";
        else if (jsxElementName!=null && jsxClassList!=null)
            return "JSXElement{" +
                    "\njsxElementName=" + jsxElementName +
                    "\njsxClassList=" + jsxClassList +
                    "\n}";
        else if (jsxElementName!=null && jsxAttributeList!=null)
            return "JSXElement{" +
                    "\njsxElementName=" + jsxElementName +
                    "\njsxAttributeList=" + jsxAttributeList +
                    "\n}";
        else if (jsxElementName!=null && contentList!=null)
            return "JSXElement{" +
                    "\njsxElementName=" + jsxElementName +
                    "\ncontentList=" + contentList +
                    "\n}";
        else if (contentList!=null && jsxAttributeList!=null)
            return "JSXElement{" +
                    "\ncontentList=" + contentList +
                    "\njsxAttributeList=" + jsxAttributeList +
                    "\n}";
        else if (contentList!=null && jsxClassList!=null)
            return "JSXElement{" +
                    "\ncontentList=" + contentList +
                    "\njsxClassList=" + jsxClassList +
                    "\n}";
        return "JSXElement{" +
                "\njsxElementName=" + jsxElementName +
                "\n}";
    }
}
