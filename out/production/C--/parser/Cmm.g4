grammar Cmm;	

program: CHAR_CONSTANT+
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

IDENTIFIER: (LETTER | '_') (LETTER | DIGIT | '_')*
                ;

INT_CONSTANT: '0'
             |  [1-9]+ DIGIT*
                ;

REAL_CONSTANT: REAL ([Ee] INT_CONSTANT)?
                ;

CHAR_CONSTANT:  '\'' . '\''
                |  '\'' '\\' INT_CONSTANT '\''
                | '\'' ('\\t' | '\\n') '\'' //It's not possible to use the [] OR ([\t\n]) because
                ;

BLANKS: (' ' | '\t' | '\r' | '\n')+ -> skip
	   ;

SL_COMMENT: '//' .*? ('\n' | '\r' | EOF)  -> skip
            ;

ML_COMMENT: '/*' .*? ('/*' | EOF) -> skip
            ;