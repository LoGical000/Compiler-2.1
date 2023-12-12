parser grammar ReactParser ;

options {tokenVocab=ReactLexer;}

app : (importR* (function1 | variableDiclaration)* export)+;
export : EXPORT DEFAULT ID SEMI ;
importR:IMPORT ((USE_STATE | USE_REF | USE_EFFECT |ID | REACT_)  COMMA)* OPEN_CURLY? (USE_STATE | USE_REF | USE_EFFECT | ID | REACT_)( COMMA ID)* CLOSE_CURLY? FROM  STRING SEMI;

variableDiclaration : (VAR | CONST | LET) (ID | arrayy) EQUAL (function2 | NUMBER | useRef | useState | ID | arrayy) SEMI? ;
html: JSX_OPEN (SYNTAX) (ID)? ((ID | CLASS_NAME) EQUAL OPEN_CURLY? (attributeValue | ID DOT ID | onClick) CLOSE_CURLY?)* JSX_SLASH? JSX_CLOSE
((htmlBody |html* | OPEN_CURLY? (ID* | ID DOT ID) CLOSE_CURLY?) (JSX_OPEN JSX_SLASH SYNTAX JSX_CLOSE ))?;

print : CONSOLE_ DOT LOG_ OPEN_PAREN (ID | SingleLineString  | NUMBER)* CLOSE_PAREN SEMI ;

function1 : FUNCTION ID OPEN_PAREN (ID COMMA?)* CLOSE_PAREN OPEN_CURLY functionbody CLOSE_CURLY ;
function2 : OPEN_PAREN (ID COMMA?)*  CLOSE_PAREN ARROW OPEN_CURLY? functionbody CLOSE_CURLY? ;

functionbody : (variableDiclaration | print | callFun )* returnStatment? ;
callFun: ID OPEN_PAREN (ID COMMA?)* CLOSE_PAREN SEMI ;


returnStatment : returnStatment1 | RETURN pureReact;

returnStatment1 : RETURN OPEN_PAREN html? CLOSE_PAREN SEMI ;

syntax: S_C SYNTAX S_C ;

pureReact : REACT_ DOT CREATEELEMENT OPEN_PAREN
(STRING | ID) COMMA attributes COMMA?
((pureReact | SingleLineString)* COMMA?)? CLOSE_PAREN (SEMI | COMMA);

attributes: OPEN_CURLY (attribute COMMA)* CLOSE_CURLY;

attribute: ID COLON attributeValue;

attributeValue: SingleLineString
              | NUMBER
              | ID;

useRef : USE_REF OPEN_PAREN (STRING)* CLOSE_PAREN ;

useState : USE_STATE OPEN_PAREN (ID DOT ID | ID) CLOSE_PAREN ;

array : (VAR | CONST | LET) arrayy EQUAL useState SEMI ;

functionCall : ID OPEN_PAREN (STRING)? CLOSE_PAREN ;

useEffet : USE_EFFECT OPEN_PAREN function2 COMMA  arrayy CLOSE_PAREN ;

arrayy : OPEN_SQUARE ((ID | STRING | map) COMMA?)* CLOSE_SQUARE ;

map: OPEN_CURLY (ID COLON (attributeValue | DOLLAR OPEN_CURLY (SingleLineString | ID) CLOSE_CURLY | arrayy) COMMA?)* CLOSE_CURLY ;

onClick: OPEN_CURLY function2 CLOSE_CURLY ;

htmlBody : OPEN_CURLY (mapMethod | hh) CLOSE_CURLY;

hh : ID AND OPEN_PAREN html CLOSE_PAREN;

mapMethod : (ID DOT)* MAP_ OPEN_PAREN OPEN_PAREN (ID COMMA?)*  CLOSE_PAREN ARROW  OPEN_PAREN html CLOSE_PAREN CLOSE_PAREN ;