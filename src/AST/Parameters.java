package AST;

import java.util.ArrayList;
import java.util.List;

public class Parameters {
    List<String> ids = new ArrayList<>();

    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    @Override
    public String toString() {
        return "Parameters{" +
                "\nids=" + ids +
                "\n}";
    }
}
