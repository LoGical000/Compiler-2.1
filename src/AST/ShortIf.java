package AST;

import java.util.ArrayList;
import java.util.List;

public class ShortIf {
    String conditionId;
    Component conditionComponent;
    List<String> ids= new ArrayList<>();
    List<Component> componentList = new ArrayList<>();

    public String getConditionId() {
        return conditionId;
    }

    public void setConditionId(String conditionId) {
        this.conditionId = conditionId;
    }

    public Component getConditionComponent() {
        return conditionComponent;
    }

    public void setConditionComponent(Component conditionComponent) {
        this.conditionComponent = conditionComponent;
    }

    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    public List<Component> getComponentList() {
        return componentList;
    }

    public void setComponentList(List<Component> componentList) {
        this.componentList = componentList;
    }

    @Override
    public String toString() {
        return "ShortIf{" +
                "conditionId='" + conditionId + '\'' +
                ", conditionComponent=" + conditionComponent +
                ", ids=" + ids +
                ", componentList=" + componentList +
                '}';
    }
}

