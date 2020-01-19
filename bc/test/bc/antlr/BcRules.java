package bc.antlr;
import static bc.antlr.bcParser.*;
import static bc.antlr.Tools.*;
class BcRules {
  void onProgram(ProgramContext ctx) { on(ctx); }
  void onBcStatement(BcStatementContext ctx) { on(ctx); }
  void onBcStatementCase(BcStatementCaseContext ctx) { on(ctx); }
  void onBcIf(BcIfContext ctx) { on(ctx); }
  void onBcWhile(BcWhileContext ctx) { on(ctx); }
  void onBcFor(BcForContext ctx) { on(ctx); }
  void onBcBreak(BcBreakContext ctx) { on(ctx); }
  void onBcContinue(BcContinueContext ctx) { on(ctx); }
  void onBcHalt(BcHaltContext ctx) { on(ctx); }
  void onBcReturn(BcReturnContext ctx) { on(ctx); }
  void onBcBlock(BcBlockContext ctx) { on(ctx); }
  void onBcFunctionDefinition(BcFunctionDefinitionContext ctx) { on(ctx); }
  void onBcPrint(BcPrintContext ctx) { on(ctx); }
  void onPrintArg(PrintArgContext ctx) { on(ctx); }
  void onParameters(ParametersContext ctx) { on(ctx); }
  void onBcAutoList(BcAutoListContext ctx) { on(ctx); }
  void onBcVarDecl(BcVarDeclContext ctx) { on(ctx); }
  void onBcAssignment(BcAssignmentContext ctx) { on(ctx); }
  void onBcExpr(BcExprContext ctx) { on(ctx); }
  void onBcLogicalOrExpr(BcLogicalOrExprContext ctx) { on(ctx); }
  void onBcLogicalAndExpr(BcLogicalAndExprContext ctx) { on(ctx); }
  void onBcLogicalNotExpr(BcLogicalNotExprContext ctx) { on(ctx); }
  void onBcRelationalOpExpr(BcRelationalOpExprContext ctx) { on(ctx); }
  void onBcAssignmentOpExpr(BcAssignmentOpExprContext ctx) { on(ctx); }
  void onBcAdditiveExpr(BcAdditiveExprContext ctx) { on(ctx); }
  void onBcMultiplicativeExpr(BcMultiplicativeExprContext ctx) { on(ctx); }
  void onBcPowerExpr(BcPowerExprContext ctx) { on(ctx); }
  void onBcIncDecExpr(BcIncDecExprContext ctx) { on(ctx); }
  void onBcNegExpr(BcNegExprContext ctx) { on(ctx); }
  void onBcPostFixExpr(BcPostFixExprContext ctx) { on(ctx); }
  void onBcVarAccess(BcVarAccessContext ctx) { on(ctx); }
  void onBcFunctionCall(BcFunctionCallContext ctx) { on(ctx); }
  void onBcArgs(BcArgsContext ctx) { on(ctx); }
  void onBcArg(BcArgContext ctx) { on(ctx); }
  void onBcPrimaryExpr(BcPrimaryExprContext ctx) { on(ctx); }
  void onBcParExpr(BcParExprContext ctx) { on(ctx); }
  void onBcNumber(BcNumberContext ctx) { on(ctx); }
  void onBcString(BcStringContext ctx) { on(ctx); }
}
