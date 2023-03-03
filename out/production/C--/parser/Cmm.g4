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
            | f1 = funcInvocation   {$ast = $f1.ast;}
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

statement returns [List<Statement> ast = new ArrayList<>()]:
            //Assignment
            e1=expression '=' e2=expression ';' {$ast.add(new Assignment($e1.ast.getLine(), $e2.ast.getColumn(), $e1.ast, $e2.ast));}
            //Function Invocation as procedure
            | funcInvocation';'
            //If
            |i='if' '(' e1=expression ')' b=block   {$ast.add(new If_Else($i.getLine(), $i.getCharPositionInLine()+1, $e1.ast, $b.ast));}
            //If-else
            |i='if' '(' e1=expression ')' b1=block 'else' b2=block  {$ast.add(new If_Else($i.getLine(), $i.getCharPositionInLine()+1, $e1.ast, $b1.ast, $b2.ast));}
            //Read
            | r='read' e1=expression {$ast.add(new Read($r.getLine(), $r.getCharPositionInLine()+1, $e1.ast));}
                (',' e2=expression   {$ast.add(new Read($r.getLine(), $r.getCharPositionInLine()+1, $e2.ast));})* ';'
            //Return
            | r='return' e1=expression    {$ast.add(new Return($r.getLine(),$r.getCharPositionInLine()+1, $e1.ast));}';'
            //Write
            | w='write' e1=expression {$ast.add(new Write($w.getLine(), $w.getCharPositionInLine()+1, $e1.ast));}
                (',' e2=expression {$ast.add(new Write($w.getLine(), $w.getCharPositionInLine()+1, $e2.ast));})* ';'
            //While loop
            |w='while' '(' e1=expression ')' b=block    {$ast.add(new While($w.getLine(), $w.getCharPositionInLine()+1, $e1.ast, $b.ast));}
        ;

/*
------------------------------------------------------------------------------------------------------------------------
                                                            TYPES
------------------------------------------------------------------------------------------------------------------------
*/

type returns [Type ast, List<Integer> dimensions= new ArrayList<>()]:
        //Built In type
        b=builtInType {$ast = $b.ast;}
        // Void Type
        | v='void' {$ast = new VoidType($v.getLine(), $v.getCharPositionInLine()+1);}
        //Record Type
        | rt=recordType    {$ast = $rt.ast;}
        //Array Type
        | t1=type ('[' ic=INT_CONSTANT ']' {$dimensions.add(Integer.parseInt($ic.text));})+
                                           {$ast = ParserHelper.buildArrayType($t1.ast, $dimensions);}
    ;

builtInType returns [Type ast]:
                //Integer Type
                i='int'   {$ast = new IntType($i.getLine(), $i.getCharPositionInLine()+1);}
                //Double Type
                | d='double'    {$ast = new DoubleType($d.getLine(), $d.getCharPositionInLine()+1);}
                //Char Type
                | c='char'  {$ast = new CharType($c.getLine(), $c.getCharPositionInLine()+1);}
    ;

recordType returns [RecordType ast, List<RecordField> fields = new ArrayList<>()]:
            s='struct' '{'(rf=recordField {$fields.addAll($rf.ast);})* '}'    {$ast = new RecordType($s.getLine(), $s.getCharPositionInLine()+1, $fields);}
            ;

recordField returns [List<RecordField> ast = new ArrayList<>()]:
                t1= type id1=ID (',' id2=ID {$ast.add(new RecordField($t1.ast.getLine(), $id2.getCharPositionInLine()+1, $t1.ast, $id2.text));} )*';'
                                            {$ast.add(new RecordField($t1.ast.getLine(), $id1.getCharPositionInLine()+1, $t1.ast, $id1.text));}
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

block returns [List<Statement> ast = new ArrayList<>()]:
        st1=statement   {$ast.addAll($st1.ast);}
        | '{' (st2=statement {$ast.addAll($st2.ast);})* '}'
        ;

funcInvocation returns [FunctionInvocation ast]:
                ID'('args')' {$ast = new FunctionInvocation($ID.getLine(), $ID.getCharPositionInLine()+1,
                                                                  new Variable($ID.getLine(), $ID.getCharPositionInLine()+1, $ID.text),
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
    ( e1=expression {$ast.add($e1.ast);}(',' e2=expression {$ast.add($e2.ast);})* )
    |
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