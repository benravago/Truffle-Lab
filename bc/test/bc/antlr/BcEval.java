package bc.antlr;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.TokenStream;

public class BcEval extends Eval {

    Object listener;
    
    // public BcEval() {
    //   this(new BcRules());
    // }
    
    BcEval(Object listener) {
        this.listener = listener;
    }
    
    Path dir = Paths.get("test/data");
    
    @Override
    protected Path resolve(String file) {
        return dir.resolve(file);
    }

    @Override
    protected Lexer lexer(CharStream input) {
        return new bcLexer(input);
    }

    @Override
    protected Parser parser(TokenStream input) {
        var parser = new bcParser(input);
        // if (parser instanceof ContextParser && listener != null) {
        //   ((ContextParser)parser).setContextListener(listener);
        // }
        return parser;
    }

    public static void main(String... args) throws Exception {
        REPL.main("bc.antlr.BcEval");
    }
}
