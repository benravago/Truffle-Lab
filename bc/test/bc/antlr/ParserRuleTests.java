package bc.antlr;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.TokenStream;

class ParserRuleTests extends BcFiles {

  static Eval bc = new BcEval() {
    @Override
    protected Parser parser(TokenStream input) {
      var parser = super.parser(input);
      if (parser instanceof ContextParser) {
        ((ContextParser)parser).setContextListener(new BcRules());
      }
      return parser;
    }
  };

  @Override void exec(String file) throws Exception { bc.exec(file); }
}
