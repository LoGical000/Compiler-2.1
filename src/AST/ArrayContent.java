package AST;

import java.util.ArrayList;
import java.util.List;

public class ArrayContent {
    List<String> IDs = new ArrayList<>();
    List<Map> mapList = new ArrayList<>();

    public List<String> getIDs() {
        return IDs;
    }

    public void setIDs(List<String> IDs) {
        this.IDs = IDs;
    }

    public List<Map> getMapList() {
        return mapList;
    }

    public void setMapList(List<Map> mapList) {
        this.mapList = mapList;
    }

    @Override
    public String toString() {
        return "ArrayContent{" +
                "IDs=" + IDs +
                ", mapList=" + mapList +
                '}';
    }
}
