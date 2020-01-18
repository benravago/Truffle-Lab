package bc.antlr;

import java.io.Reader;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.BaseErrorListener;

class Any {

    static Path dir = Paths.get("test/data");

    static void exec(String file) throws Exception {
        var path = dir.resolve(file);
        var program = eval(Files.newBufferedReader(path));
        System.out.println(file+' '+program.children.size());
    }

    static bcParser.ProgramContext eval(Reader reader) throws Exception {

        var in = CharStreams.fromReader(reader);
        var lexer = new bcLexer(in);
        var tokens = new CommonTokenStream(lexer);
        tokens.fill();
        var parser = new bcParser(tokens);

        var syntax = new SyntaxErrorListener();
        lexer.removeErrorListeners();
        lexer.addErrorListener(syntax);
        parser.removeErrorListeners();
        parser.addErrorListener(syntax);

        var result = parser.program();

        if (syntax.err.length() > 0) {
            throw new SyntaxError(syntax.err.toString());
        }
        return result;
    }

    static void eval(String text) throws Exception {
        var program = eval(new StringReader(text));
        System.out.println(text+" => "+program.children.size());
    }

    static class SyntaxErrorListener extends BaseErrorListener {
        StringBuilder err = new StringBuilder();
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
    }

    static class SyntaxError extends RuntimeException {
        SyntaxError(String msg) { super(msg,null,false,false); }
        private static final long serialVersionUID = 1L;
    }

}
