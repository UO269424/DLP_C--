package parser;

import ast.Expression;
import ast.Type;
import ast.definitions.FuncDefinition;
import ast.definitions.VarDefinition;
import ast.expressions.Arithmetic;
import ast.expressions.Modulus;
import ast.types.ArrayType;

import java.util.List;

public class ParserHelper {

    public static Expression highOrderArithmetic(int line, int column, Expression left, Expression right, String op)  {
        if(op.equals("%"))
            return new Modulus(line, column, left, right);
        else
            return new Arithmetic(line, column, left, right, op);
    }

    public static ArrayType buildArrayType(Type t, int length)  {
        ArrayType at = buildArrayTypeRecursive(t, length);

        return at;
    }

    private static ArrayType buildArrayTypeRecursive(Type t, int length) {
        if (t instanceof ArrayType) {
            ArrayType other = (ArrayType) t;
            other.setType(buildArrayTypeRecursive(other.getType(), length));
            return other;
        }
        else return new ArrayType(t.getLine(), t.getColumn(), length, t);
    }
}
