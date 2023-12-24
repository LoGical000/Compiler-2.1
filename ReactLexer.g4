lexer grammar ReactLexer;

options { superClass=org.antlr.v4.runtime.Lexer; }

EXPENSES:'expenses';
CONST: 'const';
FUNCTION: 'function';
RETURN: 'return';
IF: 'if';
ELSE: 'else';
FOR: 'for';
WHILE: 'while';
CLASS: 'class';
VAR: 'var';
LET: 'let';
EXPORT: 'export' ;
DEFAULT: 'default';
IMPORT: 'import';
DOCUMENT: 'document';
FROM: 'from';

WS: [ \t\r\n]+ -> skip;
COMMENT: '//' ~[\r\n]*;

TYPE: 'type';
DATATYPE_:'string' |'number';
REACT_:'React' ;
CREATE_ELEMENT : 'createElement';
REACTDOM: 'ReactDOM';
USE_STATE:'useState';
USE_EFFECT:'useEffect';
USE_REF:'useRef';
CONSOLE_:'console';
LOG_:'log';
INPUT_:'input';
ONCHANGE_:'onChange';
VALUE_:'value';
PLACEHOLDER_:'placeholder';
DISABLED_:'disabled ';
ONFOCUS_:'onFocus';
ONCLICK_:'onclick';

HEIGHT: 'height';
WIDTH: 'width';
BUTTON_:'button';
MAP_:'map';
CLASS_NAME:'className';

JSX_OPEN: '<';
JSX_CLOSE: '>';
JSX_SLASH: '/';


COMMA: ',';
OPEN_SQUARE: '[';
CLOSE_SQUARE: ']';
OPEN_CURLY: '{';
CLOSE_CURLY: '}';
OPEN_PAREN: '(' ;
CLOSE_PAREN: ')';
COLON: ':';
DOT: '.';
ARROW: '=>';
EQUAL: '=';
MINUS: '-';
NEQUAL: '!=';
NOT: '!';
OR: '||';
AND: '&&';
PLUS: '+';
PLE: '+=';
PLPL: '++';
QUESTION: '?';
SEMI: ';';
DOLLAR: '$';
MULTI: '*';
S_C: '\'' ;
D_C : '"';

OPERATION:PLUS|MINUS|PLPL|'--'|PLE|'-='|MULTI|'==';
HTML_SYNTAX : 'div' |'li' |'p' |'ul' |SIZE_FONT | 'main' | 'BrowserRouter' | 'Switch' | 'Route' | 'img';
//FUNCTION_NAME : WORD+  ;
NUMBER:DIGIT+;
STRING: '\'' (~['\\])* '\'';
HEX_NUMBER : '0x' HEX_DIGIT+ | '0X' HEX_DIGIT+ ;



fragment DIGIT : '0' .. '9' ;
SingleLineString : StringDQ | StringSQ | 'r\'' (~('\'' | '\n' | '\r'))* '\'' | 'r"' (~('"' | '\n' | '\r'))* '"' ;
MultiLineString : '"""' StringContentTDQ*? '"""' | '\'\'\'' StringContentTSQ*? '\'\'\'' | 'r"""' (~'"' | '"' ~'"' | '""' ~'"')* '"""' | 'r\'\'\'' (~'\'' | '\'' ~'\'' | '\'\'' ~'\'')* '\'\'\'' ;
fragment StringDQ : '"' StringContentDQ*? '"';
fragment StringContentDQ : ~('\\' | '"' | '\n' | '\r' | '$') | '\\' ~('\n' | '\r') | StringDQ | '${' StringContentDQ*? '}' | '$';

fragment StringSQ : '\'' StringContentSQ*? '\'' ;
fragment StringContentSQ : ~('\\' | '\'' | '\n' | '\r' | '$') | '\\' ~('\n' | '\r') | StringSQ | '${' StringContentSQ*? '}' | '$';
fragment StringContentTDQ : ~('\\' | '"') | '"' ~'"' | '""' ~'"' ;
fragment StringContentTSQ : '\'' ~'\'' | '\'\'' ~'\'' | . ;
fragment HEX_DIGIT : 'a' .. 'f' | 'A' .. 'F' | DIGIT ;
fragment SIZE_FONT : 'h1'|'h2'|'h3'|'h4'|'h5'|'h6' ;
fragment NEWLINE : '\n' | '\r' | '\r\n' ;

ID: [a-zA-Z_][a-zA-Z0-9_]*;