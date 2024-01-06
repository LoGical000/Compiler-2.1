parser grammar ReactParser ;

options {tokenVocab=ReactLexer;}
//PROGRAM
program : (importStatement)* (functionDeclaration | variableDeclaration)* export?;

// 4 MAIN PARTS
importStatement: IMPORT ID? COMMA? LEFTCURLY? ((USEEFFECT|USESTATE|ID) COMMA?)* RIGHTCURLY? FROM? STRING SEMI?;

export : EXPORT DEFAULT ID SEMI? ;

variableDeclaration : (VAR | CONST | LET) ID EQUAL (value|functionDeclaration|array|ID) SEMI? ;

functionDeclaration : regularFunction | callBackFunction ;

//FUNCTIONS
regularFunction : FUNCTION ID LEFTPAREN parameters? RIGHTPAREN LEFTCURLY functionbody RIGHTCURLY ;

callBackFunction : LEFTPAREN parameters?  RIGHTPAREN ARROW LEFTCURLY? functionbody RIGHTCURLY ;

parameters: (LEFTCURLY? ID (COMMA ID)* RIGHTCURLY?);

functionbody : funcStatement* returnStatement? ;

funcStatement : useEffect|useState|useRef|variableDeclaration|print|callFunc|jsx_element;

callFunc: ID LEFTPAREN (ID COMMA?)* RIGHTPAREN SEMI? ;

returnStatement:RETURN LEFTPAREN (jsx_element)* RIGHTPAREN SEMI?;

//USES
useRef : USEREF LEFTPAREN (STRING COMMA?)* RIGHTPAREN ;

useState: CONST LEFTBRACKET ID COMMA  ID RIGHTBRACKET EQUAL USESTATE LEFTPAREN value RIGHTPAREN SEMI;

useEffect: USEEFFECT LEFTPAREN callBackFunction COMMA LEFTBRACKET (ID COMMA?)* RIGHTBRACKET RIGHTPAREN SEMI;



////map
map:LEFTCURLY ID DOT ID LEFTPAREN LEFTPAREN ID RIGHTPAREN ARROW LEFTPAREN jsx_element* RIGHTPAREN RIGHTPAREN RIGHTCURLY;


// for html
jsx_element : LESSTHAN ID? (jsx_attribute|jsx_class)* GREATERTHAN? content* LESSTHAN? DIVISION ID? GREATERTHAN;

content:jsx_element|shortIf|map|useAttribute|component|ID|COLON|DOT;

//access value of the object
useAttribute:LEFTCURLY ID DOT ID RIGHTCURLY;

jsx_attribute :
ID EQUAL (LEFTCURLY? LEFTCURLY? attributeDetails+ RIGHTCURLY? RIGHTCURLY?);
jsx_class : ID EQUAL value;


attributeDetails:(STRING|COMMA ID COLON value |ID COLON value| attributeDetailsFunction|attributeDetailsAttribute );
//onClick - OnChange .....
attributeDetailsFunction:LEFTPAREN RIGHTPAREN ARROW ID LEFTPAREN (ID|value) RIGHTPAREN SEMI?;

attributeDetailsAttribute: ID (DOT ID)?;

component:LESSTHAN ID props*  DIVISION GREATERTHAN;
props:ID EQUAL LEFTCURLY prop_value  RIGHTCURLY;
prop_value:ID|value;
// Rendering a component conditionally
//{condition && <ComponentToShow />}
shortIf: LEFTCURLY (component|ID) ((AND|OR|LESSEQUAL|GREATEREQUAL|EQ) (component|ID))+ RIGHTCURLY;

/////

value:(STRING|BOOL|DOUBLE|INT|NULL|valueIndex);

valueIndex: ID LEFTBRACKET INT RIGHTBRACKET;

array: arrayObjects | arrayValues;

arrayObjects: LEFTBRACKET (object)* RIGHTBRACKET;

arrayValues : LEFTBRACKET (value COMMA?)* RIGHTBRACKET;

object:LEFTCURLY (element COMMA?)*  RIGHTCURLY COMMA?;

element:ID COLON (value|array);

print : CONSOLE DOT LOG LEFTPAREN (ID | STRING  | INT)* RIGHTPAREN SEMI ;

