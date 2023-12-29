package AST;

public class Props {
    String propName;
    PropValue propValue;

    public String getPropName() {
        return propName;
    }

    public void setPropName(String propName) {
        this.propName = propName;
    }

    public PropValue getPropValue() {
        return propValue;
    }

    public void setPropValue(PropValue propValue) {
        this.propValue = propValue;
    }

    @Override
    public String toString() {
        return "Props{" +
                "\npropName=" + propName +
                "\n, propValue=" + propValue +
                "\n}";
    }
}
