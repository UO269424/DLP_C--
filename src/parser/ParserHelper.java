package parser;

import ast.Expression;
import ast.expressions.Arithmetic;
import ast.expressions.Modulus;

public class ParserHelper {

    private Expression highOrderArithmetic(int line, int column, Expression left, Expression right, String op)  {
        if(op.equals("%"))
            return new Modulus(line, column, left, right);
        else
            return new Arithmetic(line, column, left, right, op);
    }
}
