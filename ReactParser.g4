parser grammar ReactParser ;

options {tokenVocab=ReactLexer;}
//PROGRAM
program : (importStatement)* (functionDeclaration | variableDeclaration)* export?;

// 4 MAIN PARTS
importStatement: IMPORT ID? COMMA? LEFTCURLY? ((USEEFFECT|USESTATE|ID) COMMA?)* RIGHTCURLY? FROM STRING SEMI;

export : EXPORT DEFAULT ID SEMI ;

variableDeclaration : (VAR | CONST | LET) ID EQUAL (value|functionDeclaration|array|ID) SEMI? ;

functionDeclaration : regularFunction | callBackFunction ;

//FUNCTIONS
regularFunction : FUNCTION ID LEFTPAREN parameters? RIGHTPAREN LEFTCURLY functionbody RIGHTCURLY ;

callBackFunction : LEFTPAREN parameters?  RIGHTPAREN ARROW LEFTCURLY? functionbody RIGHTCURLY ;

parameters: (LEFTCURLY? ID (COMMA ID)* RIGHTCURLY?);

functionbody : funcStatement* returnStatement? ;

funcStatement : useEffect|useState|useRef|variableDeclaration|print|callFunc|jsx_element;

callFunc: ID LEFTPAREN (ID COMMA?)* RIGHTPAREN SEMI? ;

returnStatement:RETURN LEFTPAREN (jsx_element)* RIGHTPAREN SEMI;

//USES
useRef : USEREF LEFTPAREN (STRING COMMA?)* RIGHTPAREN ;

useState: CONST LEFTBRACKET ID COMMA  ID RIGHTBRACKET EQUAL USESTATE LEFTPAREN value RIGHTPAREN SEMI;

useEffect: USEEFFECT LEFTPAREN callBackFunction COMMA LEFTBRACKET (ID COMMA?)* RIGHTBRACKET RIGHTPAREN SEMI;



////map
map:LEFTCURLY ID DOT ID LEFTPAREN LEFTPAREN ID RIGHTPAREN ARROW LEFTPAREN jsx_element* RIGHTPAREN RIGHTPAREN RIGHTCURLY;


////////this for the html code
jsx_element : LESSTHAN ID (jsx_attribute)* GREATERTHAN content* LESSTHAN DIVISION ID GREATERTHAN;

content:jsx_element|shortIf|map|useAttribute|component|ID|COLON|DOT;

//access value of the object
useAttribute:LEFTCURLY ID DOT ID RIGHTCURLY;

//this for css style or event handlers funciton.
jsx_attribute :
ID EQUAL (LEFTCURLY LEFTCURLY? attributeDetails+ RIGHTCURLY RIGHTCURLY?);

/// attribute detalis
// the first section is for the styling
attributeDetails:(STRING|COMMA ID COLON value |ID COLON value| attributeDetailsFunction|attributeDetailsFunction );
//onClick - OnChange .....
attributeDetailsFunction:LEFTPAREN RIGHTPAREN ARROW ID LEFTPAREN (ID|value) RIGHTPAREN ;

attributeDetailsAttribute: ID (DOT ID)?;

///   attribute details     ///
// if i have another component here i can add it to add to the app.jsx file
component:LESSTHAN ID props*  SELF_CLOSED;
//this three rule is for the component and if it take props
props:name_prop EQUAL LEFTCURLY prop_value  RIGHTCURLY;
name_prop:ID;
prop_value:ID|value;
// Rendering a component conditionally
//{condition && <ComponentToShow />}
shortIf: LEFTCURLY (component|ID ) ((AND|OR|LESSEQUAL|GREATEREQUAL|EQ) (component|ID ))+ RIGHTCURLY;

/////

value:(STRING|BOOL|DOUBLE|INT|NULL);

array: arrayObjects | arrayValues;

arrayObjects: LEFTBRACKET (object)* RIGHTBRACKET;

arrayValues : LEFTBRACKET (value COMMA?)* RIGHTBRACKET;

object:LEFTCURLY element*  RIGHTCURLY COMMA?;

element:ID COLON value COMMA? ;

print : CONSOLE DOT LOG LEFTPAREN (ID | STRING  | INT)* RIGHTPAREN SEMI ;

