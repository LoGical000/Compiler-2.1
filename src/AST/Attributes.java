package AST;

import java.util.ArrayList;
import java.util.List;

public class Attributes {

    List<Attribute> attributeList = new ArrayList<>();
    public List<Attribute> getAttributeList() {
        return attributeList;
    }

    public void setAttributeList(List<Attribute> attributeList) {
        this.attributeList = attributeList;
    }

    @Override
    public String toString() {
        return "Attributes{" +
                "attributeList=" + attributeList +
                '}';
    }
}
