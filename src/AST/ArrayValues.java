package AST;

import java.util.ArrayList;
import java.util.List;

public class ArrayValues {
    List<Value> valueList = new ArrayList<>();

    public List<Value> getValueList() {
        return valueList;
    }

    public void setValueList(List<Value> valueList) {
        this.valueList = valueList;
    }

    @Override
    public String toString() {
        return "ArrayValues{" +
                "\n valueList=" + valueList +
                "\n }";
    }
}
