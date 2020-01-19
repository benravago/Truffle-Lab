var className = System.getProperty("className");
var parser = Class.forName(className);
var ruleNames = (String[]) parser.getField("ruleNames").get(null);

System.out.format(
  "package %1$s;\n"+
  "import static %1$s.%2$s.*;\n"+
  "import static bc.antlr.Tools.*;\n"+
  "class %2$sRules {\n",
  parser.getPackageName(), parser.getSimpleName() 
  );
for (var rule:ruleNames) {
  var name = Character.toUpperCase(rule.charAt(0)) + rule.substring(1);
  System.out.format("  void on%1$s(%1$sContext ctx) { on(ctx); }\n",name);
}
System.out.println("}");
