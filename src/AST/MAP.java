package AST;

import java.util.ArrayList;
import java.util.List;

public class MAP {
    String objectsListName;
    String mapType;
    String object;
    List<JSXElement> jsxElementList = new ArrayList<>();

    public String getObjectsList() {
        return objectsListName;
    }

    public void setObjectsList(String objectsListName) {
        this.objectsListName = objectsListName;
    }

    public String getMapType() {
        return mapType;
    }

    public void setMapType(String mapType) {
        this.mapType = mapType;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public List<JSXElement> getJsxElementList() {
        return jsxElementList;
    }

    public void setJsxElementList(List<JSXElement> jsxElementList) {
        this.jsxElementList = jsxElementList;
    }

    @Override
    public String toString() {
        return "MAP{" +
                "objectsListName='" + objectsListName + '\'' +
                ", mapType='" + mapType + '\'' +
                ", object='" + object + '\'' +
                ", jsxElementList=" + jsxElementList +
                '}';
    }
}
