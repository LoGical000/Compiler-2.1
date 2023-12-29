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
        if(useState != null)
            return "FuncStatement{" +
                    "\nuseState=" + useState +
                    "\n}";

        if(useRef != null)
            return "FuncStatement{" +
                    "\nuseRef=" + useRef +
                    "\n}";

        if(useEffect != null)
            return "FuncStatement{" +
                    "\nuseEffect=" + useEffect +
                    "\n}";

        if(variableDeclaration != null)
            return "FuncStatement{" +
                    "\nvariableDeclaration=" + variableDeclaration +
                    "\n}";

        if(print != null)
            return "FuncStatement{" +
                    "\nprint=" + print +
                    "\n}";

        if(callFunc != null)
            return "FuncStatement{" +
                    "\ncallFunc=" + callFunc +
                    "\n}";

        return "FuncStatement{" +
                "\njsxElement=" + jsxElement +
                "\n}";
    }
}
