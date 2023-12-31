lexer grammar ReactLexer;
//tokens
WS                : [ \n\t\r]+ -> skip;
FUNCTION          : 'function' ;
CONSOLE           : 'console';
LOG               : 'log';
VAR               : 'var' ;
LET               : 'let' ;
CONST             : 'const' ;
IF                : 'if' ;
ELSE              : 'else' ;
FOR               : 'for' ;
WHILE             : 'while' ;
RETURN            : 'return' ;
IMPORT            :'import';
EXPORT            :'export';
DEFAULT           :'default';
FROM              :'from';
USESTATE          :'useState';
USEEFFECT         :'useEffect';
USEREF            :'useRef';
NULL              :'null';
ARROW             :'=>';
EQUAL             : '=' ;
PLUS              : '+' ;
MINUS             : '-' ;
STAR              : '*' ;
DIVISION          : '/' ;
PERCENT           : '%' ;
COMMA             : ',' ;
SEMI              : ';' ;
COLON             : ':' ;
LEFTPAREN         : '(' ;
RIGHTPAREN        : ')' ;
LEFTBRACKET       : '[' ;
RIGHTBRACKET      : ']' ;
LEFTCURLY         : '{' ;
RIGHTCURLY        : '}' ;
LESSTHAN          : '<' ;
GREATERTHAN       : '>' ;
//SELF_CLOSED       : '/>';
LESSEQUAL         : '<=';
GREATEREQUAL      : '>=';
EQ                : '==';
NEQ               : '!=';
AND               : '&&';
OR                : '||';
PLUSPLUS          : '++';
MINUSMINUS        : '--';
SQ                : '\'';
DQ                : '"';
DOT               : '.';
// value
BOOL :'true' | 'false' ;
ID   :[a-zA-Z]+|[_a-zA-Z][a-zA-Z0-9]*;
STRING: ( '"' ( ESCAPE | ~["\\] )* '"' ) | ( '\'' ( ESCAPE | ~['\\] )* '\'' );
fragment ESCAPE: '\\' [\\"'];
INT :   [0-9]+ ;
DOUBLE :   [0-9]+ ('.' [0-9]+)? ;


mode PrintMode;

PRINT_START: 'console.log(' -> pushMode(PrintMode);

PRINT_CONTENT: ~[)]+;

PRINT_END: ')' -> popMode;