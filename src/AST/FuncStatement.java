package AST;

public class FuncStatement {
    UseState useState;
    UseRef useRef;
    UseEffect useEffect;
    VariableDeclaration variableDeclaration;
    Print print;
    CallFunc callFunc;
    JSXElement jsxElement;

    public UseState getUseState() {
        return useState;
    }

    public void setUseState(UseState useState) {
        this.useState = useState;
    }

    public UseRef getUseRef() {
        return useRef;
    }

    public void setUseRef(UseRef useRef) {
        this.useRef = useRef;
    }

    public UseEffect getUseEffect() {
        return useEffect;
    }

    public void setUseEffect(UseEffect useEffect) {
        this.useEffect = useEffect;
    }

    public VariableDeclaration getVariableDeclaration() {
        return variableDeclaration;
    }

    public void setVariableDeclaration(VariableDeclaration variableDeclaration) {
        this.variableDeclaration = variableDeclaration;
    }

    public Print getPrint() {
        return print;
    }

    public void setPrint(Print print) {
        this.print = print;
    }

    public CallFunc getCallFunc() {
        return callFunc;
    }

    public void setCallFunc(CallFunc callFunc) {
        this.callFunc = callFunc;
    }

    public JSXElement getJsxElement() {
        return jsxElement;
    }

    public void setJsxElement(JSXElement jsxElement) {
        this.jsxElement = jsxElement;
    }

    @Override
    public String toString() {
        if(useState!=null)
            return "FuncStatement{" +
                    " useState=" + useState +
                    "}";
        else if(useEffect!=null)
            return "FuncStatement{" +
                    " useEffect=" + useEffect +
                    "}";
        else if(useRef!=null)
            return "FuncStatement{" +
                    " useRef=" + useRef +
                    "}";
        else if(variableDeclaration!=null)
            return "FuncStatement{" +
                    " variableDeclaration=" + variableDeclaration +
                    "}";
        else if(callFunc!=null)
            return "FuncStatement{" +
                    " callFunc=" + callFunc +
                    "}";
        else if(print!=null)
            return "FuncStatement{" +
                    " print=" + print +
                    "}";
        else
            return "FuncStatement{" +
                    " jsxElement=" + jsxElement +
                    "}";

    }
}
