parser grammar ReactParser ;

options {tokenVocab=ReactLexer;}

program : (importStatment)* (regularFunction | variableDeclaration)* export*;

importStatment:IMPORT
(((USE_STATE | USE_REF | USE_EFFECT |ID | REACT_ | REACTDOM )FROM COMMA)* OPEN_CURLY?
 (USE_STATE | USE_REF | USE_EFFECT | ID | REACT_ | REACTDOM)( COMMA ID)* CLOSE_CURLY? FROM)?  STRING SEMI;

variableDeclaration : (VAR | CONST | LET) (ID | array_content) EQUAL (callBackFunction | NUMBER | useRef | useState | ID | array_content) SEMI? ;

regularFunction : FUNCTION ID OPEN_PAREN (ID COMMA?)* CLOSE_PAREN OPEN_CURLY functionbody CLOSE_CURLY ;

callBackFunction : OPEN_PAREN (ID COMMA?)*  CLOSE_PAREN ARROW OPEN_CURLY? functionbody CLOSE_CURLY? ;

functionbody : (variableDeclaration | print | callFun )* returnStatment? ;

callFun: ID OPEN_PAREN (ID COMMA?)* CLOSE_PAREN SEMI ;

returnStatment : returnStatment1 | RETURN pureReact;

returnStatment1 : RETURN OPEN_PAREN html? CLOSE_PAREN SEMI ;

syntax: S_C HTML_SYNTAX S_C ;

pureReact : REACT_ DOT CREATE_ELEMENT OPEN_PAREN
(STRING | ID) COMMA attributes COMMA?
((pureReact | SingleLineString)* COMMA?)? CLOSE_PAREN (SEMI | COMMA);

attributes: OPEN_CURLY (attribute COMMA)* CLOSE_CURLY;

attribute: ID COLON attributeValue;

attributeValue: SingleLineString
              | NUMBER
              | ID;

print : CONSOLE_ DOT LOG_ OPEN_PAREN (ID | SingleLineString  | NUMBER)* CLOSE_PAREN SEMI ;

useRef : USE_REF OPEN_PAREN (STRING)* CLOSE_PAREN ;

useState : USE_STATE OPEN_PAREN (ID DOT ID | ID) CLOSE_PAREN ;

array : (VAR | CONST | LET) array_content EQUAL useState SEMI ;

functionCall : ID OPEN_PAREN (STRING)? CLOSE_PAREN ;

useEffet : USE_EFFECT OPEN_PAREN callBackFunction COMMA  array_content CLOSE_PAREN ;

array_content : OPEN_SQUARE ((ID | STRING | map) COMMA?)* CLOSE_SQUARE ;

map: OPEN_CURLY (ID COLON (attributeValue | DOLLAR OPEN_CURLY (SingleLineString | ID) CLOSE_CURLY | array_content) COMMA?)* CLOSE_CURLY ;

onClick: OPEN_CURLY callBackFunction CLOSE_CURLY ;

html: JSX_OPEN (HTML_SYNTAX) (ID)? ((ID | CLASS_NAME) EQUAL OPEN_CURLY? (attributeValue | ID DOT ID | onClick) CLOSE_CURLY?)* JSX_SLASH? JSX_CLOSE
((htmlBody |html* | OPEN_CURLY? (ID* | ID DOT ID) CLOSE_CURLY?) (JSX_OPEN JSX_SLASH HTML_SYNTAX JSX_CLOSE ))?;

htmlBody : OPEN_CURLY (mapMethod | htmlhtml) CLOSE_CURLY;

htmlhtml : ID AND OPEN_PAREN html CLOSE_PAREN;

mapMethod : (ID DOT)* MAP_ OPEN_PAREN OPEN_PAREN (ID COMMA?)*  CLOSE_PAREN ARROW  OPEN_PAREN html CLOSE_PAREN CLOSE_PAREN ;

export : EXPORT DEFAULT ID SEMI ;