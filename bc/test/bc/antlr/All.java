package bc.antlr;
class All {
  static Eval bc = new BcEval(null);
  static void exec(String file) throws Exception { bc.exec(file); }
}
