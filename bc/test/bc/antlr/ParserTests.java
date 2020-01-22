package bc.antlr;
class ParserTests extends BcFiles {
  static Eval bc = new BcEval();
  @Override void exec(String file) throws Exception { bc.exec(file); }
}
