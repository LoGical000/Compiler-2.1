package AST;

import java.util.ArrayList;
import java.util.List;

public class OBJECT {
    List<Element> elementList = new ArrayList<>();

    public List<Element> getElementList() {
        return elementList;
    }

    public void setElementList(List<Element> elementList) {
        this.elementList = elementList;
    }

    @Override
    public String toString() {
        return "OBJECT{" +
                "elementList=" + elementList +
                '}';
    }
}
