package semantic;

import ast.Program;
import ast.definitions.FuncDefinition;
import ast.definitions.VarDefinition;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;

public interface Visitor<TP, TR> {

    public TR visit(Program p, TP param);

    public TR visit(FuncDefinition funcDefinition, TP param);

    public TR visit(VarDefinition varDefinition, TP param);

    /*
        ------------------------------------ EXPRESSIONS --------------------------------------------
     */

    public TR visit(Arithmetic arithmetic, TP param);

    public TR visit(ArrayAccess arrayAccess, TP param);

    public TR visit(Cast cast, TP param);

    public TR visit(CharLiteral charLiteral, TP param);

    public TR visit(Comparison comparison, TP param);

    public TR visit(DoubleLiteral doubleLiteral, TP param);

    public TR visit(FieldAccess fieldAccess, TP param);

    public TR visit(FunctionInvocation functionInvocation, TP param);

    public TR visit(IntLiteral intLiteral, TP param);

    public TR visit(Logical logical, TP param);

    public TR visit(Modulus modulus, TP param);

    public TR visit(UnaryMinus unaryMinus, TP param);

    public TR visit(UnaryNot unaryNot, TP param);

    public TR visit(Variable variable, TP param);

    /*
        ------------------------------------ STATEMENTS --------------------------------------------
     */

    public TR visit(Assignment assignment, TP param);


    public TR visit(If_Else if_else, TP param);

    public TR visit(Read read, TP param);

    public TR visit(Return aReturn, TP param);

    public TR visit(While aWhile, TP param);

    public TR visit(Write write, TP param);

    /*
        ------------------------------------ TYPES --------------------------------------------
     */

    public TR visit(ArrayType arrayType, TP param);

    public TR visit(CharType charType, TP param);

    public TR visit(DoubleType doubleType, TP param);

    public TR visit(ErrorType errorType, TP param);

    public TR visit(FunctionType functionType, TP param);

    public TR visit(IntType intType, TP param);

    public TR visit(RecordField recordField, TP param);

    public TR visit(RecordType recordType, TP param);

    public TR visit(VoidType voidType, TP param);
}
