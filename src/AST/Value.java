package AST;

public class Value {
    String string;
    String aBoolean;
    String aNull;
    String aDouble;
    String integer;
    ValueIndex valueIndex;

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

    public ValueIndex getValueIndex() {
        return valueIndex;
    }

    public void setValueIndex(ValueIndex valueIndex) {
        this.valueIndex = valueIndex;
    }

    @Override
    public String toString() {
        if(string != null)
            return "Value{" +
                    "\nstring='" + string +
                    "\n}";

        if(aBoolean != null)
            return "Value{" +
                    "\naBoolean='" + aBoolean +
                    "\n}";

        if(aNull != null)
            return "Value{" +
                    "\naNull='" + aNull +
                    "\n}";

        if(aDouble != null)
            return "Value{" +
                    "\naDouble='" + aDouble +
                    "\n}";

        if(valueIndex != null)
            return "Value{" +
                    "\nValueIndex='" + valueIndex +
                    "\n}";

        return "Value{" +
                "\ninteger='" + integer +
                "\n}";
    }
}
