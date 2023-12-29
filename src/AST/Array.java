package AST;

public class Array {
    ArrayObjects arrayObjects;
    ArrayValues arrayValues;

    public ArrayObjects getArrayObjects() {
        return arrayObjects;
    }

    public void setArrayObjects(ArrayObjects arrayObjects) {
        this.arrayObjects = arrayObjects;
    }

    public ArrayValues getArrayValues() {
        return arrayValues;
    }

    public void setArrayValues(ArrayValues arrayValues) {
        this.arrayValues = arrayValues;
    }

    @Override
    public String toString() {
        if (arrayObjects != null)
            return "Array{" +
                    "\narrayObjects=" + arrayObjects +
                    "\n}";

        return "Array{" +
                "\narrayValues=" + arrayValues +
                "\n}";
    }
}


