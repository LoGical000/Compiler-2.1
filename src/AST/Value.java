package AST;

public class Value {
    String string;
    String aBoolean;
    String aNull;
    String aDouble;
    String integer;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public String getaBoolean() {
        return aBoolean;
    }

    public void setaBoolean(String aBoolean) {
        this.aBoolean = aBoolean;
    }

    public String getaNull() {
        return aNull;
    }

    public void setaNull(String aNull) {
        this.aNull = aNull;
    }

    public String getaDouble() {
        return aDouble;
    }

    public void setaDouble(String aDouble) {
        this.aDouble = aDouble;
    }

    public String getInteger() {
        return integer;
    }

    public void setInteger(String integer) {
        this.integer = integer;
    }

    @Override
    public String toString() {
        return "Value{" +
                "string='" + string + '\'' +
                ", aBoolean=" + aBoolean +
                ", aNull='" + aNull + '\'' +
                ", aDouble=" + aDouble +
                ", integer=" + integer +
                '}';
    }
}
