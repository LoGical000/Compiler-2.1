package AST;

import java.util.ArrayList;
import java.util.List;

public class ImportStatement {
    List<String> imports = new ArrayList<String>();
    String from;

    public List<String> getImports() {
        return imports;
    }

    public void setImports(List<String> imports) {
        this.imports = imports;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    @Override
    public String toString() {
        return "ImportStatement{" +
                "\n imports=" + imports +
                "\n from='" + from + '\'' +
                "\n }";
    }
}
