package semantic;

import ast.Program;
import ast.definitions.FuncDefinition;
import ast.definitions.VarDefinition;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;

public class AbstractVisitor<TP, TR> implements Visitor<TP, TR>{

    /*
        ------------------------------------ DEFINITIONS --------------------------------------------
     */

    @Override
    public TR visit(Program p, TP param) {
        p.getDefinitions().forEach(def -> def.accept(this, param));
        return null;
    }

    @Override
    public TR visit(FuncDefinition funcDefinition, TP param) {
        funcDefinition.getType().accept(this, param);
        funcDefinition.getBody().forEach(st -> st.accept(this, param));
        return null;
    }

    @Override
    public TR visit(VarDefinition varDefinition, TP param) {
        varDefinition.getType().accept(this, param);
        return null;
    }


    /*
        ------------------------------------ EXPRESSIONS --------------------------------------------
     */


    @Override
    public TR visit(Arithmetic arithmetic, TP param) {
        arithmetic.getLeft().accept(this, param);
        arithmetic.getRight().accept(this, param);
        return null;
    }

    @Override
    public TR visit(ArrayAccess arrayAccess, TP param) {
        arrayAccess.getArray().accept(this, param);
        arrayAccess.getIndex().accept(this, param);
        return null;
    }

    @Override
    public TR visit(Cast cast, TP param) {
        cast.getOperand().accept(this, param);
        cast.getTargetType().accept(this, param);
        return null;
    }

    @Override
    public TR visit(CharLiteral charLiteral, TP param) {
        return null;
    }

    @Override
    public TR visit(Comparison comparison, TP param) {
        comparison.getLeft().accept(this, param);
        comparison.getRight().accept(this, param);
        return null;
    }

    @Override
    public TR visit(DoubleLiteral doubleLiteral, TP param) {
        return null;
    }

    @Override
    public TR visit(FieldAccess fieldAccess, TP param) {
        fieldAccess.getExpression().accept(this, param);
        return null;
    }

    @Override
    public TR visit(FunctionInvocation functionInvocation, TP param) {
        functionInvocation.getFunction().accept(this, param);
        functionInvocation.getArgs().forEach( arg -> arg.accept(this, param));
        return null;
    }

    @Override
    public TR visit(IntLiteral intLiteral, TP param) {
        return null;
    }

    @Override
    public TR visit(Logical logical, TP param) {
        logical.getLeft().accept(this, param);
        logical.getRight().accept(this, param);
        return null;
    }

    @Override
    public TR visit(Modulus modulus, TP param) {
        modulus.getLeft().accept(this, param);
        modulus.getRight().accept(this, param);
        return null;
    }

    @Override
    public TR visit(UnaryMinus unaryMinus, TP param) {
        unaryMinus.getOperand().accept(this, param);
        return null;
    }

    @Override
    public TR visit(UnaryNot unaryNot, TP param) {
        unaryNot.getOperand().accept(this, param);
        return null;
    }

    @Override
    public TR visit(Variable variable, TP param) {
        return null;
    }


    /*
        ------------------------------------ STATEMENTS --------------------------------------------
     */

    @Override
    public TR visit(Assignment assignment, TP param) {
        assignment.getLeft().accept(this, param);
        assignment.getRight().accept(this, param);
        return null;
    }

    @Override
    public TR visit(If_Else if_else, TP param) {
        if_else.getCondition().accept(this, param);
        if_else.getIfBody().forEach(st -> st.accept(this, param));
        if(!if_else.getElseBody().isEmpty())
            if_else.getElseBody().forEach(statement -> statement.accept(this, param));
        return null;
    }

    @Override
    public TR visit(Read read, TP param) {
        read.getExpression().accept(this, param);
        return null;
    }

    @Override
    public TR visit(Return aReturn, TP param) {
        aReturn.getValue().accept(this, param);
        return null;
    }

    @Override
    public TR visit(While aWhile, TP param) {
        aWhile.getCondition().accept(this, param);
        aWhile.getBody().forEach(statement -> statement.accept(this, param));
        return null;
    }

    @Override
    public TR visit(Write write, TP param) {
        write.getExpression().accept(this, param);
        return null;
    }


    /*
        ------------------------------------ TYPES --------------------------------------------
     */

    @Override
    public TR visit(ArrayType arrayType, TP param) {
        arrayType.getType().accept(this, param);
        return null;
    }

    @Override
    public TR visit(CharType charType, TP param) {
        return null;
    }

    @Override
    public TR visit(DoubleType doubleType, TP param) {
        return null;
    }

    @Override
    public TR visit(ErrorType errorType, TP param) {
        return null;
    }

    @Override
    public TR visit(FunctionType functionType, TP param) {
        functionType.getReturnType().accept(this, param);
        functionType.getParams().forEach(vd -> vd.accept(this, param));
        return null;
    }

    @Override
    public TR visit(IntType intType, TP param) {
        return null;
    }

    @Override
    public TR visit(RecordField recordField, TP param) {
        recordField.getType().accept(this, param);
        return null;
    }

    @Override
    public TR visit(RecordType recordType, TP param) {
        recordType.getFields().forEach(rf -> rf.accept(this, param));
        return null;
    }

    @Override
    public TR visit(VoidType voidType, TP param) {
        return null;
    }
}
