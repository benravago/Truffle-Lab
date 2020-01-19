
grammar bc;

// options { 
//   superClass = bc.antlr.ContextParser; 
//   contextSuperClass = bc.antlr.ContextParserRule;
// }

program
  : bcStatement+
  ;

bcStatement
  : bcStatementCase ';'?
  ;

bcStatementCase
  : bcIf
  | bcWhile
  | bcFor
  | bcBlock
  | bcFunctionDefinition
  | bcBreak
  | bcContinue
  | bcReturn
  | bcHalt
  | bcPrint
  | bcExpr
  ;

bcIf
  : 'if' '(' bcExpr ')' bcStatement ( 'else' bcStatement )?
  ;

bcWhile
  : 'while' '(' bcExpr ')' bcStatement
  ;

bcFor
  : 'for' '(' bcExpr? ';' bcExpr? ';' bcExpr? ')' bcStatement
  ;

bcBreak
  : 'break'
  ;

bcContinue
  : 'continue'
  ;

bcHalt
  : 'halt'
  ;

bcReturn
  : 'return' bcExpr?
  ;

bcBlock
  : '{' bcStatement* '}'
  ;

bcFunctionDefinition
  : 'define' 'void'? Identifier '(' parameters? ')' '{' bcAutoList? bcStatement* '}'
  ;

bcPrint
  : 'print' printArg ( ',' printArg )*
  | 'print' '(' printArg ( ',' printArg )* ')'
  ;

printArg
  : bcExpr
  | StringLiteral
  ;

parameters
  : bcVarDecl ( ',' bcVarDecl )*
  ;

bcAutoList
  : 'auto' parameters
  ;

bcVarDecl
  : Identifier '[]'?
  ;

bcAssignment
  : bcVarAccess '=' bcExpr
  ;

bcExpr
  : bcLogicalOrExpr
  ;

bcLogicalOrExpr
  : bcLogicalOrExpr '||' bcLogicalAndExpr
  | bcLogicalAndExpr
  ;

bcLogicalAndExpr
  : bcLogicalAndExpr '&&' bcLogicalNotExpr
  | bcLogicalNotExpr
  ;

bcLogicalNotExpr
  : '!' bcLogicalNotExpr
  | bcRelationalOpExpr
  ;

bcRelationalOpExpr
  : bcRelationalOpExpr '==' bcAssignmentOpExpr
  | bcRelationalOpExpr '!=' bcAssignmentOpExpr
  | bcRelationalOpExpr '<=' bcAssignmentOpExpr
  | bcRelationalOpExpr '>=' bcAssignmentOpExpr
  | bcRelationalOpExpr '<' bcAssignmentOpExpr
  | bcRelationalOpExpr '>' bcAssignmentOpExpr
  | bcAssignmentOpExpr
  ;

bcAssignmentOpExpr
  : bcVarAccess '=' bcAdditiveExpr
  | bcVarAccess '+=' bcAdditiveExpr
  | bcVarAccess '-=' bcAdditiveExpr
  | bcVarAccess '/=' bcAdditiveExpr
  | bcVarAccess '*=' bcAdditiveExpr
  | bcVarAccess '%=' bcAdditiveExpr
  | bcVarAccess '^=' bcAdditiveExpr
  | bcAdditiveExpr
  ;

bcAdditiveExpr
  : bcAdditiveExpr '+' bcMultiplicativeExpr
  | bcAdditiveExpr '-' bcMultiplicativeExpr
  | bcMultiplicativeExpr
  ;

bcMultiplicativeExpr
  : bcMultiplicativeExpr '*' bcPowerExpr
  | bcMultiplicativeExpr '/' bcPowerExpr
  | bcMultiplicativeExpr '%' bcPowerExpr
  | bcPowerExpr
  ;

bcPowerExpr
  : bcPowerExpr '^' bcIncDecExpr
  | bcIncDecExpr
  ;

bcIncDecExpr
  : '++' bcVarAccess
  | '--' bcVarAccess
  | bcVarAccess '++'
  | bcVarAccess '--'
  | bcNegExpr
  ;

bcNegExpr
  : ( '-' | '+' ) bcNegExpr
  | bcPostFixExpr
  ;

bcPostFixExpr
  : bcFunctionCall
  | bcVarAccess
  | bcPrimaryExpr
  ;

bcVarAccess
  : Identifier ( '[' bcExpr ']' )?
  ;

bcFunctionCall
  : Identifier '(' bcArgs? ')'
  ;

bcArgs
  : bcArg ( ',' bcArg )*
  ;

bcArg
  : Identifier '[]'
  | bcExpr
  ;

bcPrimaryExpr
  : bcNumber
  | bcString
  | bcParExpr
  ;

bcParExpr
  : '(' bcExpr ')'
  ;

bcNumber : BigNumberLiteral ;

BigNumberLiteral
  : ([0-9]+([.][0-9]*)?|[.][0-9]+)([E][0-9]+)?
  ;

bcString : StringLiteral ;

StringLiteral
  : '"' ( ~( '"' | '\\' ) | '\\' . )* '"'
  ;

Identifier
  : [a-z]+
  ;

DropWS
  : ( [ \t\f\r\n]+ | '\\\n' | '\\\r\n' ) -> skip
  ;

