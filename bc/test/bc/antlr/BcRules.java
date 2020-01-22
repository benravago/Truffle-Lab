package bc.antlr;

import java.math.BigDecimal;

import static bc.antlr.bcParser.*;

class BcRules extends Rules { // from bcParserRules.java

  // grammar bc;

  // options { 
  //  superClass = bc.antlr.ContextParser; 
  //  contextSuperClass = bc.antlr.ContextParserRule;
  // }

  // program
  //  : bcStatement+
  //  ;
  void onProgram(ProgramContext ctx) {
    ctx.setUserData(userData(ctx.children));
    on(ctx);
  }

  // bcStatement
  //  : bcStatementCase ';'?
  //  ;
  void onBcStatement(BcStatementContext ctx) {
    ctx.setUserData(ctx.userData(0));
  }
  
  // bcStatementCase : bcIf | bcWhile | bcFor | bcBlock | bcFunctionDefinition | bcBreak | bcContinue | bcReturn | bcHalt | bcPrint | bcExpr ;
  void onBcStatementCase(BcStatementCaseContext ctx) {}

  // bcIf
  //  : 'if' '(' bcExpr ')' bcStatement ( 'else' bcStatement )?
  //  ; 
  void onBcIf(BcIfContext ctx) {
    ctx.setUserData(as(ctx.token(0),ctx.userData(2),ctx.userData(4),ctx.userData(6)));
  }

  // bcWhile
  //  : 'while' '(' bcExpr ')' bcStatement
  //  ;
  void onBcWhile(BcWhileContext ctx) {
    ctx.setUserData(as(ctx.token(0),ctx.userData(2),ctx.userData(4)));
  }

  // bcFor
  //  : 'for' '(' bcExpr? ';' bcExpr? ';' bcExpr? ')' bcStatement
  //  ;
  void onBcFor(BcForContext ctx) {
    ctx.setUserData(as(ctx.token(0),ctx.userData(2),ctx.userData(4),ctx.userData(6),ctx.userData(8)));  
  }

  // bcBreak
  //  : 'break'
  //  ;
  void onBcBreak(BcBreakContext ctx) {
    ctx.setUserData(as(ctx.token(0)));
  }

  // bcContinue
  //  : 'continue'
  //  ;
  void onBcContinue(BcContinueContext ctx) {
    ctx.setUserData(as(ctx.token(0)));
  }

  // bcHalt
  //  : 'halt'
  //  ;
  void onBcHalt(BcHaltContext ctx) { 
    ctx.setUserData(as(ctx.token(0)));
  }

  // bcReturn
  //  : 'return' bcExpr?
  //  ;
  void onBcReturn(BcReturnContext ctx) {
    ctx.setUserData(as(ctx.token(0),ctx.userData(1)));
  }

  // bcBlock
  // : '{' bcStatement* '}'
  // ;
  void onBcBlock(BcBlockContext ctx) {
    ctx.setUserData(as("{}",userData(ctx.children)));
  }

  // bcFunctionDefinition
  //  : 'define' 'void'? Identifier '(' parameters? ')' '{' bcAutoList? bcStatement* '}'
  //  ; 0        1       2           3  4            5   6  7           8            9
  void onBcFunctionDefinition(BcFunctionDefinitionContext ctx) {
    var op = ctx.token(0);
    var func = ctx.token(1);
    if ("void".equals(func)) {
      func = ctx.token(2)+":void";
    } else {
      func = func+":?";
    }
    var args = userData(ctx.children,"(",")");
    var stmt = userData(ctx.children,"{","}");
    ctx.setUserData(as(op,func,args,stmt));
  }
  
  // bcPrint
  //  : 'print' '('? printArg ( ',' printArg )* ')'?
  //  ;
  void onBcPrint(BcPrintContext ctx) {
    ctx.setUserData(as(ctx.token(0),userData(ctx.children)));
  }

  // printArg : bcExpr | StringLiteral ;
  void onPrintArg(PrintArgContext ctx) {}

  // parameters
  //  : bcVarDecl ( ',' bcVarDecl )*
  //  ;
  void onParameters(ParametersContext ctx) {
    ctx.setUserData(as("()",userData(ctx.children)));
  }

  // bcAutoList
  //  : 'auto' parameters
  //  ;
  void onBcAutoList(BcAutoListContext ctx) {
    ctx.setUserData(as(ctx.token(0),ctx.userData(1)));
  }

  // bcVarDecl
  //  : Identifier '[]'?
  //  ;
  void onBcVarDecl(BcVarDeclContext ctx) {
    var op = ctx.getChildCount() > 1 ? "??" : "?";
    ctx.setUserData(as(op,ctx.token(0)));
  }

  // bcAssignment
  //  : bcVarAccess '=' bcExpr
  //  ;
  void onBcAssignment(BcAssignmentContext ctx) {
    binaryOp(ctx); //  on(ctx);
  }

  // bcExpr : bcLogicalOrExpr ;
  void onBcExpr(BcExprContext ctx) {}

  // bcLogicalOrExpr
  //  : bcLogicalOrExpr '||' bcLogicalAndExpr
  //  | bcLogicalAndExpr
  //  ;
  void onBcLogicalOrExpr(BcLogicalOrExprContext ctx) {
    binaryOp(ctx);
  }

  // bcLogicalAndExpr
  //  : bcLogicalAndExpr '&&' bcLogicalNotExpr
  //  | bcLogicalNotExpr
  //  ;
  void onBcLogicalAndExpr(BcLogicalAndExprContext ctx) {
    binaryOp(ctx);
  }

  // bcLogicalNotExpr
  //  : '!' bcLogicalNotExpr
  //  | bcRelationalOpExpr
  //  ;
  void onBcLogicalNotExpr(BcLogicalNotExprContext ctx) {
    unaryOp(ctx);
  }
  
  // bcRelationalOpExpr
  //  : bcRelationalOpExpr '==' bcAssignmentOpExpr
  //  | bcRelationalOpExpr '!=' bcAssignmentOpExpr
  //  | bcRelationalOpExpr '<=' bcAssignmentOpExpr
  //  | bcRelationalOpExpr '>=' bcAssignmentOpExpr
  //  | bcRelationalOpExpr '<' bcAssignmentOpExpr
  //  | bcRelationalOpExpr '>' bcAssignmentOpExpr
  //  | bcAssignmentOpExpr
  //  ;
  void onBcRelationalOpExpr(BcRelationalOpExprContext ctx) {
    binaryOp(ctx);
  }

  // bcAssignmentOpExpr 
  //  : bcVarAccess '=' bcAdditiveExpr
  //  | bcVarAccess '+=' bcAdditiveExpr
  //  | bcVarAccess '-=' bcAdditiveExpr
  //  | bcVarAccess '/=' bcAdditiveExpr
  //  | bcVarAccess '*=' bcAdditiveExpr
  //  | bcVarAccess '%=' bcAdditiveExpr
  //  | bcVarAccess '^=' bcAdditiveExpr
  //  | bcAdditiveExpr 
  //  ;
  void onBcAssignmentOpExpr(BcAssignmentOpExprContext ctx) {
    binaryOp(ctx);
  }

  // bcAdditiveExpr
  //  : bcAdditiveExpr '+' bcMultiplicativeExpr
  //  | bcAdditiveExpr '-' bcMultiplicativeExpr
  //  | bcMultiplicativeExpr
  //  ;
  void onBcAdditiveExpr(BcAdditiveExprContext ctx) {
    binaryOp(ctx);
  }  

  // bcMultiplicativeExpr
  //  : bcMultiplicativeExpr '*' bcPowerExpr
  //  | bcMultiplicativeExpr '/' bcPowerExpr
  //  | bcMultiplicativeExpr '%' bcPowerExpr
  //  | bcPowerExpr
  //  ;
  void onBcMultiplicativeExpr(BcMultiplicativeExprContext ctx) {
    binaryOp(ctx);
  }
  
  // bcPowerExpr
  //  : bcPowerExpr '^' bcIncDecExpr
  //  | bcIncDecExpr
  //  ;
  void onBcPowerExpr(BcPowerExprContext ctx) {
    binaryOp(ctx);
  }

  // bcIncDecExpr
  //  : '++' bcVarAccess
  //  | '--' bcVarAccess
  //  | bcVarAccess '++'
  //  | bcVarAccess '--'
  //  | bcNegExpr
  //  ;
  void onBcIncDecExpr(BcIncDecExprContext ctx) {
    if (ctx.getChildCount() == 2) {
      var op = ctx.token(0);
      if (op != null) {
        ctx.setUserData(as(op+'?',ctx.userData(1)));
      } else {
        op = ctx.token(1);
        if (op != null) {
          ctx.setUserData(as('?'+op,ctx.userData(0)));
        }
      }
    }
  }

  // bcNegExpr
  //  : ( '-' | '+' ) bcNegExpr
  //  | bcPostFixExpr
  //  ;
  void onBcNegExpr(BcNegExprContext ctx) {
    unaryOp(ctx);
  }

  // bcPostFixExpr : bcFunctionCall | bcVarAccess | bcPrimaryExpr ;
  void onBcPostFixExpr(BcPostFixExprContext ctx) {} 

  // bcVarAccess
  //  : Identifier ( '[' bcExpr ']' )?
  //  ;
  void onBcVarAccess(BcVarAccessContext ctx) { 
    var n = ctx.getChildCount();
    if (n == 1) {
      ctx.setUserData(ctx.token(0));
    } else if (n == 4) {
      ctx.setUserData(as("->",ctx.token(0),ctx.userData(2)));
    }
  }

  // bcFunctionCall
  //  : Identifier '(' bcArgs? ')'
  //  ;
  void onBcFunctionCall(BcFunctionCallContext ctx) {
    ctx.setUserData(as("call",ctx.token(0),ctx.userData(2)));  
  }

  // bcArgs
  //  : bcArg ( ',' bcArg )*
  //  ;
  void onBcArgs(BcArgsContext ctx) {
    ctx.setUserData(as("args",userData(ctx.children)));
  }
  
  // bcArg
  // : Identifier '[]'
  // | bcExpr
  // ;
  void onBcArg(BcArgContext ctx) {
    if (ctx.getChildCount() == 2) {
      ctx.setUserData(as("??",ctx.token(0)));
    }
  }
  
  // bcPrimaryExpr : bcNumber | bcString | bcParExpr ;
  void onBcPrimaryExpr(BcPrimaryExprContext ctx) {}

  // bcParExpr 
  //  : '(' bcExpr ')'
  //  ;
  void onBcParExpr(BcParExprContext ctx) {
    ctx.setUserData(as("()",ctx.userData(1)));  
  }

  // bcNumber : BigNumberLiteral ;
  // BigNumberLiteral : ([0-9]+([.][0-9]*)?|[.][0-9]+)([E][0-9]+)? ;
  void onBcNumber(BcNumberContext ctx) {
    ctx.setUserData(new BigDecimal(ctx.token(0)));  
  }
  
  // bcString : StringLiteral ;
  // StringLiteral : '"' ( ~( '"' | '\\' ) | '\\' . )* '"' ;
  void onBcString(BcStringContext ctx) {
    ctx.setUserData(ctx.token(0));
  }

  // Identifier : [a-z]+ ;

  // DropWS : ( [ \t\f\r\n]+ | '\\\n' | '\\\r\n' ) -> skip ;
 
  static void binaryOp(ContextParserRule ctx) {
    if (ctx.getChildCount() == 3) {
      ctx.setUserData(as(ctx.token(1),ctx.userData(0),ctx.userData(2)));
    }
  }
  static void unaryOp(ContextParserRule ctx) {
    if (ctx.getChildCount() == 2) {
      ctx.setUserData(as(ctx.token(0),ctx.userData(1)));
    }
  }
  
}
