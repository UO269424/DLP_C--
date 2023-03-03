package parser;

import ast.Expression;
import ast.Type;
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

    public static ArrayType buildArrayType(Type t, List<Integer> lengths)  {
        int iteration = 0;

        ArrayType at = buildArrayTypeRecursive(t, lengths, iteration);

        return at;
    }

    private static ArrayType buildArrayTypeRecursive(Type t, List<Integer> lengths, int iteration) {
        ArrayType a = new ArrayType(t.getLine(), t.getColumn(), lengths.get(lengths.size()-1-iteration), t);
        if(iteration< lengths.size()-1)
            a = buildArrayTypeRecursive(a,lengths, iteration+1);

        return a;
    }
}
