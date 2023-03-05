package ast.expressions;

import ast.Expression;

public class UnaryMinus extends AbstractExpression{

    private Expression operand;

    public UnaryMinus(int line, int column, Expression operand) {
        super(line, column);
        this.operand = operand;
    }

    @Override
    public String toString() {
        return String.format("-%s", operand);
    }


}
