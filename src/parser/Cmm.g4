grammar Cmm;

@header {
    import ast.*;
    import ast.definitions.*;
    import ast.expressions.*;
    import ast.statements.*;
    import ast.types.*;
}



program:    (definition)* main EOF
        ;

main:   'void' 'main' '(' ')' functionBody
        ;



/*
------------------------------------------------------------------------------------------------------------------------
                                                            EXPRESSIONS
------------------------------------------------------------------------------------------------------------------------
*/
expression returns [Expression ast]:
            //Parenthesis
            '('e1=expression')'     {$ast = $e1.ast;}
            //Function invocation as expression
            | f1 = funcInvocation   {$ast = $f1.ast}
            //Array Access
            |e1=expression '[' e2=expression ']'    {$ast = new ArrayAccess($e1.ast.getLine(), $e1.ast.getColumn(), $e1.ast, $e2.ast);}
            //Field Access
            |e1=expression '.' ID   {$ast = new FieldAccess($e1.ast.getLine(), $e1.ast.getColumn(), $e1.ast, $ID.text);}
            //Cast
            | '('t1=type')' e1=expression   {$ast = new Cast($t1.ast.getLine(), $t1.ast.getColumn(), $t1.ast, $e1.ast);}
            //Unary minus
            | '-' e1 = expression   {$ast = new UnaryMinus($e1.ast.getLine(), $e1.ast.getColumn(), $e1.ast);}
            //Unary not
            | '!' e1 = expression   {$ast = new UnaryNot($e1.ast.getLine(), $e1.ast.getColumn(), $e1.ast);}
            //Arithmetic and modulus
            | e1=expression op=('*' | '/' | '%') e2=expression  {$ast= ParserHelper.highOrderArithmetic($e1.ast.getLine(), $e1.ast.getColumn(), $e1.ast, $e2.ast, $op.text);}
            | e1=expression op=('+' | '-') e2=expression        {$ast= new Arithmetic($e1.ast.getLine(), $e1.ast.getColumn(), $e1.ast, $e2.ast, $op.text);}
            //Comparisons
            | e1=expression op=('<' | '<='| '>'| '>='| '!='| '==') e2=expression   {$ast = new Comparison($e1.ast.getLine(), $e1.ast.getColumn(), $e1.ast, $e2.ast, $op.text);}
            //Logical
            | e1=expression ('&&' | '||') e2=expression {$ast = new Logical($e1.ast.getLine(), $e1.ast.getColumn(), $e1.ast, $e2.ast, $op.text);}
            //Constants
            |i1=INT_CONSTANT    {$ast = new IntLiteral($i1.getLine(), $i1.getCharPositionInLine()+1, LexerHelper.lexemeToInt($i1.text));}
            |i1=CHAR_CONSTANT   {$ast = new CharLiteral($i1.getLine(), $i1.getCharPositionInLine()+1, LexerHelper.lexemeToChar($i1.text));}
            |i1=REAL_CONSTANT   {$ast = new DoubleLiteral($i1.getLine(), $i1.getCharPositionInLine()+1, LexerHelper.lexemeToReal($i1.text));}
            //Variable
            |ID {$ast = new Variable($ID.getLine(), $ID.getCharPositionInLine()+1, $ID.text);}
       ;

/*
------------------------------------------------------------------------------------------------------------------------
                                                            STATEMENTS
------------------------------------------------------------------------------------------------------------------------
*/

statement:  //Assignment
            e1=expression '=' e2=expression ';'
            //Function Invocation as procedure
            | funcInvocation';'
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

/*
------------------------------------------------------------------------------------------------------------------------
                                                            TYPES
------------------------------------------------------------------------------------------------------------------------
*/

type returns [Type ast]:
        //Built In type
        builtInType
        // Void Type
        | 'void'
        //Record Type
        | 'struct' '{'(recordField)* '}'
        //Array Type
        | t1=type '[' INT_CONSTANT ']' ('[' INT_CONSTANT ']')*
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

/*
------------------------------------------------------------------------------------------------------------------------
                                                            DEFINITIONS
------------------------------------------------------------------------------------------------------------------------
*/


definition:   //Function Definition
              functionDefinition
              //Variable Definition
            | variableDefinition
            ;

functionDefinition: //Params must be built-in, return type can be buil-In or void (description.txt)
                    t1=builtInType idF=ID '(' (params)?')' functionBody
                    | 'void' idF=ID '(' (params)?')' functionBody
                    ;


variableDefinition: type id1=ID (',' id2=ID)* ';'
                    ;


/*
------------------------------------------------------------------------------------------------------------------------
                                                            AUX
------------------------------------------------------------------------------------------------------------------------
*/

block: statement
        | '{' statement* '}'
        ;

funcInvocation returns [FunctionInvocation ast]:
                ID'('args')' {$ast = new FunctionInvocation($ID.getLine(), $ID.getCharPositionInLine()+1,
                                                                  new Variable($ID.getLine(), $ID.getCharPositionInLine()+1)),
                                                                    $args.ast);}
                ;


functionBody:   '{'
                    (variableDefinition)*
                    (statement)*
                '}'
                ;

params: t1=builtInType id1=ID (',' t2=builtInType id2=ID )*
        ;

args returns [List<Expression> ast = new ArrayList<>()]:
    ( e1=expression {$ast.add($e1.ast)}(',' e2=expression {$ast.add($e2.ast)})* )
    |
    ;

highOrderArithmetic:
                    //
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