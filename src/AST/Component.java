package AST;

import java.util.ArrayList;
import java.util.List;

public class Component {
    String component;
    List<Props> propsList= new ArrayList<>();

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public List<Props> getPropsList() {
        return propsList;
    }

    public void setPropsList(List<Props> propsList) {
        this.propsList = propsList;
    }

    @Override
    public String toString() {
        if (propsList!=null)
            return "Component{" +
                    "\ncomponent='" + component +
                    "\n, propsList=" + propsList +
                    "\n}";
        return "Component{" +
                "\ncomponent='" + component +
                "\n}";
    }
}
