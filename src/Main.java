
import AST.Program;
import Visitor.BaseVisitor;
import gen.ReactLexer;
import gen.ReactParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {

    public static void main(String[] args) throws IOException {
        String source="samples/samples.txt";
        CharStream cs=fromFileName(source);
        ReactLexer lexer= new ReactLexer(cs);
//        CommonTokenStream tokenStream=new CommonTokenStream(lexer);
//        ReactParser parser= new ReactParser(tokenStream);
//        ParseTree tree =parser.program();
//        Program doc=(Program) new BaseVisitor().visit(tree);
//        System.out.println("\n\n\n\n\n");
//        System.out.println(doc);
    }

}