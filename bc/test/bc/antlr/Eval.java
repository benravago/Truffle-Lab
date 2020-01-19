package bc.antlr;

import java.io.Reader;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Path;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStream;

public abstract class Eval {

    protected abstract Path resolve(String file);
    protected abstract Lexer lexer(CharStream input);
    protected abstract Parser parser(TokenStream input);

    public void exec(String file) throws Exception {
        var path = resolve(file);
        var result = eval(Files.newBufferedReader(path));
        System.out.println(file+' '+result.children.size());
    }
    
    public ParserRuleContext eval(Reader reader) throws Exception {

        var in = CharStreams.fromReader(reader);
        var lexer = lexer(in);
        var tokens = new CommonTokenStream(lexer);
        tokens.fill();
        var parser = parser(tokens);

        var syntax = new SyntaxErrorListener();
        lexer.removeErrorListeners();
        lexer.addErrorListener(syntax);
        parser.removeErrorListeners();
        parser.addErrorListener(syntax);

        var main = parser.getRuleNames()[0];
        var result = parser.getClass().getMethod(main).invoke(parser);

        if (syntax.err.length() > 0) {
            throw new SyntaxError(syntax.err.toString());
        }
        return (ParserRuleContext)result;
    }

    public void eval(String text) throws Exception {
        var result = eval(new StringReader(text));
        System.out.println(text+" => "+result.children.size());
    }

    static class SyntaxErrorListener extends BaseErrorListener {
        @Override
        public void syntaxError(
            Recognizer<?, ?> recognizer,
            Object offendingSymbol,
            int line,
            int charPositionInLine,
            String msg,
            RecognitionException e)
        {
            err.append("\nline " + line + ":" + charPositionInLine + " " + msg);
        }
        StringBuilder err = new StringBuilder();
    }

    static class SyntaxError extends RuntimeException {
        SyntaxError(String msg) { super(msg,null,false,false); }
        private static final long serialVersionUID = 1L;
    }

}
