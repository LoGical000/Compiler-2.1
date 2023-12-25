package AST;

public class Value {
    String string;
    Boolean aBoolean;
    String aNull;
    Double aDouble;
    Integer integer;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public Boolean getaBoolean() {
        return aBoolean;
    }

    public void setaBoolean(Boolean aBoolean) {
        this.aBoolean = aBoolean;
    }

    public String getaNull() {
        return aNull;
    }

    public void setaNull(String aNull) {
        this.aNull = aNull;
    }

    public Double getaDouble() {
        return aDouble;
    }

    public void setaDouble(Double aDouble) {
        this.aDouble = aDouble;
    }

    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
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
