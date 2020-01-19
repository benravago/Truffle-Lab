package bc.antlr;

class REPL {
  public static void main(String... args) throws Exception { 
    if (args.length != 1) {
      System.err.println("usage: REPL <Eval.classname>");
      System.exit(1);
    }
    start((Eval)Class.forName(args[0]).getConstructor().newInstance());
  }
    
  static void start(Eval run) throws Exception {
    var code = new StringBuilder();
    var buf = new byte[256];

    System.err.println("ready");
    for (;;) {
      var n = System.in.read(buf);
      var s = new String(buf,0,n);
      var c = s.trim();
      switch (c) {
        default: {
          if (!c.startsWith("`")) code.append(s);
          break;
        }
        case "`x": {
          code.setLength(0);
          System.err.println("reset");
          break;
        }
        case "`": {
          System.err.println(code);
          try { run.eval(code.toString()); }
          catch (Exception e) { e.printStackTrace(); }
          System.out.println();
          break;
        }
        case "`p": {
          System.err.println(code);
          break;
        }
        case "`q": {
          System.err.println("done");
          System.exit(0);
          break;
        }
      }
    }

  }
}
