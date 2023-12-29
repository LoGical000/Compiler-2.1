package AST;

import java.util.ArrayList;
import java.util.List;

public class JSXAttribute {
    String name;
    List<AttributeDetails> attributeDetailsList = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<AttributeDetails> getAttributeDetailsList() {
        return attributeDetailsList;
    }

    public void setAttributeDetailsList(List<AttributeDetails> attributeDetailsList) {
        this.attributeDetailsList = attributeDetailsList;
    }

    @Override
    public String toString() {
        return "JSXAttribute{" +
                "\nname='" + name + '\'' +
                "\n, attributeDetailsList=" + attributeDetailsList +
                "\n}";
    }
}
