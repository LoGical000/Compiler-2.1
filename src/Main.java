import AST.Program;
import Visitor.BaseVisitor;
import gen.ReactLexer;
import gen.ReactParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {

    public static void main(String[] args) throws IOException {
        String source="src/tests/test1.txt";
        CharStream cs=fromFileName(source);
        ReactLexer lexer = new ReactLexer(cs);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        ReactParser parser= new ReactParser(tokenStream);
        ParseTree tree =parser.program();
        Program doc=(Program) new BaseVisitor().visit(tree);
        System.out.println("\n\n\n\n");
        System.out.println("******** AST TREE:\n");
        print_ast(tree,0);
        System.out.println("\n\n\n\n");
        System.out.println("******** PROGRAM:\n");
        System.out.println(doc);
    }

    static void print_ast(ParseTree tree, int depth) {
        if (tree.getChildCount() == 0) {
            TerminalNode terminalNode = (TerminalNode) tree;
            System.out.println(getIndent(depth) + "TerminalNode: " + terminalNode.getSymbol().getText());
        } else {
            System.out.println(getIndent(depth) + "Non-terminal: " + tree.getClass().getSimpleName());

            for (int i = 0; i < tree.getChildCount(); i++) {
                print_ast(tree.getChild(i), depth + 1);
            }
        }
    }

    // indentation based on depth
    private static String getIndent(int depth) {
        String indent = "";
        for (int i = 0; i < depth; i++) {
            indent = indent+"\t";
        }
        return indent;
    }
}