grammar Cmm;	


expression: //Parenthesis
            '('e1=expression')'
            //Function invocation
            | funcInvocation
            //Array Access
            |e1=expression '[' e2=expression ']'
            //Field Access
            |e1=expression '.' ID
            //Cast
            | '('t1=type')' e1=expression
            //Unary minus
            | '-' e1=expression
            //Unary not
            | '!' e1 = expression
            //Arithmetic and modulus
            | e1=expression ('*' | '/' | '%') e2=expression
            | e1=expression ('+' | '-') e2=expression
            //Comparisons
            | e1=expression ('<' | '<='| '>'| '>='| '!='| '==') e2=expression
            //Logical
            | e1=expression ('&&' | '||') e2=expression
            |INT_CONSTANT
            |CHAR_CONSTANT
            |REAL_CONSTANT
            |ID
       ;

statement:  //Assignment
            e1=expression '=' e2=expression ';'
            //Function Invocation
            funcInvocation';'
            //If
            |'if' '(' e1=expression ')' block
            //If-else
            |'if' '(' e1=expression ')' block 'else' block
            //Read
            | 'read' e1=expression (',' e2=expression)* ';'
            //Return
            | 'return' e1=expression ';'
            //Write
            | 'write' e1=expression (',' e2=expression)* ';'
            //While loop
            |'while' '(' e1=expression ')' block
        ;

builtInType:    //Integer Type
                'int'
                //Double Type
                | 'double'
                //Char Type
                | 'char'
    ;

recordField: t1= type ID (',' ID)*';'
            ;

type:   //Built In type
        builtInType
        // Void Type
        | 'void'
        //Record Type
        | 'struct' '{'(recordField)* '}'
        //Array Type
        | t1=type '[' INT_CONSTANT ']' ('[' INT_CONSTANT ']')*
        //Function Type
//        | builtInType ID '(' (varDefinition (',' varDefinition)*)?')'
//        | 'void' ID '(' (varDefinition (',' varDefinition)*)?')'
    ;


block: statement
        | '{' statement* '}'
        ;

funcInvocation: ID'('( e1=expression (',' e2=expression)* )?')'
                ;


definition:
            ;

/*
----------------------------------------------------LEXER RULES---------------------------------------------------------
*/

fragment
DIGIT: [0-9]
        ;

fragment
LETTER: [a-zA-Z]
        ;

fragment
REAL: INT_CONSTANT? '.' DIGIT+ // This summarizes the productions for INT . DECIMAL and .DECIMAL
        | INT_CONSTANT '.'
        ;

ID: (LETTER | '_') (LETTER | DIGIT | '_')*
                ;

INT_CONSTANT: '0'
             |  [1-9]+ DIGIT*
                ;

REAL_CONSTANT: REAL
                | INT_CONSTANT
               	| (REAL | INT_CONSTANT) ('e' | 'E') '-'? INT_CONSTANT
               	;

CHAR_CONSTANT:  '\''  . '\''
                |  '\'' '\\' INT_CONSTANT '\''
                | '\'' ('\\t' | '\\n') '\'' //It's not possible to use the square-brackets-OR ([\t\n]) because it would recognize \ or t or \ or n
                ;

SL_COMMENT: '//' .*? ('\n' | '\r' | EOF)  -> skip
            ;

ML_COMMENT: '/*' .*?  '*/' -> skip
            ;

BLANKS: (' ' | '\t' | '\r' | '\n')+ -> skip
	   ;