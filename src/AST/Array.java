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
        return "Array{" +
                "arrayObjects=" + arrayObjects +
                ", arrayValues=" + arrayValues +
                '}';
    }
}
