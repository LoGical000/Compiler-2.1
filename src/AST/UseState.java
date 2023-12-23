package AST;

import java.util.ArrayList;
import java.util.List;

public class UseState {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "UseState{" +
                "id='" + id + '\'' +
                '}';
    }
}
