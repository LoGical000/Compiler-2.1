package AST;

import java.util.ArrayList;
import java.util.List;

public class ArrayObjects {
    List<OBJECT> objectList = new ArrayList<>();

    public List<OBJECT> getObjectList() {
        return objectList;
    }

    public void setObjectList(List<OBJECT> objectList) {
        this.objectList = objectList;
    }

    @Override
    public String toString() {
        return "ArrayObjects{" +
                "\n objectList=" + objectList +
                "\n}";
    }
}
