
grammar Gramatica;

@header{
  import java.util.HashMap;
  import java.util.Map;
}

@parser::members{
//   Map <String,Integer> tabSimb = new HashMap<String,Integer>();                 
}

programa: 'Class' ID ';' (decVars|decConsts)* decFuncs* main 
    ;
decVars: tipo ':' listaIDs ';'
       ;
tipo returns[int t]
    : 'Int'   {$t=1;}
    | 'Str'   {$t=2;}
    | 'Bool'  {$t=3;}
    | 'Float' {$t=4;}
    ;
listaIDs: ID (',' ID)*
        ;
decConsts: 'final' tipo ID '=' valor ';'
         ;
valor: INT
     | REAL
     | STRING
     ;
decFuncs: tipoRetorno ID '(' listaParam ')' '{' (decVars|decConsts)* comandos* retorno? '}' // Garantir que tenha retorno
                                                                                            // O retorno pode estar no meio da função, arrumar isso.
        ;
listaParam: (tipo ID (',' tipo ID)*)?
          ;
retorno: 'return' (expre)? ';'
      ;
tipoRetorno: tipo 
           | 'Void'
           ;
main: 'Main' '{' comandos* '}'
    ;
comandos: print ';'
        | read ';'
        | chamFuncs ';'
        | atribuicao ';' /* =,++, -- */
        | controle /* ifelse, for */
        ;
print: 'print' '(' listaExpre? ')'
     ;
read: 'read' '(' listaIDs ')'
    ;
chamFuncs: ID '(' (listaExpre)? ')'
         ;
listaExpre: expre(',' expre)*
          ;
expre: ID /* Aqui tem que imprimir o valor associado ao ID, e não o ID -- Tratar se for Null*/
     | valor
     | funcMath
     ;
atribuicao: ID '=' expre  // Ver o apendice do livro, atribuição a = x > y || z > c;
          | ID '++'
          | ID '--'
          ;
funcMath: funcMath ('+'|'-') term 
        | term
        ;
term: term ('*'|'/') fator
    | fator
    ;
fator: '(' funcMath ')'
     | '-'?(INT|REAL|ID|chamFuncs)
     ;

controle: 'if' '(' testeLogic ')' '{' comandos* retorno? '}' ('else' '{' comandos* retorno? '}')?
        | 'for' '(' varControl ';' testeLogic ';' incrementos ')' '{' comandos*/*|break  */ '}' 
        ;
varControl: (ID | ID '=' INT)(',' (ID | ID '=' INT))*
          ;
testeLogic: '!' testeLogic
          | testeLogic ('&&'|'||') testeLogic
          | '(' testeLogic ')'
          | expre opLogic expre
          ;
opLogic: '=='
       | '=!'
       | '>='
       | '<='
       |'<'
       |'>'
       ;
incrementos:(atribuicao)(',' atribuicao)* // Aceitar incrementos maiores que 1? (Teria que ser uma atribuição ex. a=a+2)
           ;


                                  
                              
Tk_Class: 'Class';
Tk_Main: 'Main';
Tk_PtVirg: ';';
Tk_Virg: ',';
Tk_DoisPonts: ':';
Tk_AbrePar: '(';
Tk_FechPar: ')';
Tk_Int: 'Int';
Tk_Float: 'Float';
Tk_Bool: 'Bool';
Tk_Str: 'Str';
Tk_Neg: '!';
Tk_E: '&&';
TK_OU: '||';
Tk_MaiorQ: '>';
Tk_MenorQ: '<';
Tk_MaiorIgual: '>=';
Tk_MenorIgual: '<=';
Tk_Dif: '=!';
Tk_Igual: '==';
Tk_AbreChaves: '{';
Tk_FechaChaves: '}';
Tk_MULT: '*';
Tk_DIV: '/';
TK_SUB: '-';
Tk_SOMA: '+';
Tk_IF: 'if';
Tk_FOR: 'for';
Tk_ELSE: 'else';
Tk_Incre: '++';
Tk_Decre: '--';
Tk_PRINT: 'print';
Tk_READ: 'read';
Tk_VOID: 'Void';
Tk_RETURN: 'return';
Tk_FINAL: 'final';
Tk_Atribu: '=';

ID: [A-Za-z][A-Za-z0-9]* ;
INT: [0-9]+ ;
REAL: [0-9]+'.'[0-9]+ ;
STRING: '"' .*? '"' ;
COMMENT_LINE: '//' .*? '\r'? '\n' -> skip;
COMMENT: '/*' .*? '*/' -> skip;
WS: [ \t\r\n] -> skip;
