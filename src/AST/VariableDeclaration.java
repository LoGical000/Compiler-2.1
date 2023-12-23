package AST;

import AST.ASTNode;

public class VariableDeclaration extends ASTNode {
    private String declarationType;  // VAR, CONST, or LET
    private String identifier;       // Variable identifier
    private ASTNode initialValue;    // Initial value, which can be various types

    // Constructors, getters, and setters


    public String getDeclarationType() {
        return declarationType;
    }

    public void setDeclarationType(String declarationType) {
        this.declarationType = declarationType;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public ASTNode getInitialValue() {
        return initialValue;
    }

    public void setInitialValue(ASTNode initialValue) {
        this.initialValue = initialValue;
    }

    @Override
    public String toString() {
        return "VariableDeclaration{" +
                "declarationType='" + declarationType + '\'' +
                ", identifier='" + identifier + '\'' +
                ", initialValue=" + initialValue +
                '}';
    }
}
