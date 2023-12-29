package AST;

public class ValueIndex {
    String arrayName;
    String index;

    public String getArrayName() {
        return arrayName;
    }

    public void setArrayName(String arrayName) {
        this.arrayName = arrayName;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "ValueIndex{" +
                "\narrayName='" + arrayName + '\'' +
                "\n, index='" + index + '\'' +
                "\n}";
    }
}
