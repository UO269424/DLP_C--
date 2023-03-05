package ast.expressions;

import ast.Expression;

public class UnaryNot extends AbstractExpression{

    private Expression operand;

    public UnaryNot(int line, int column, Expression operand) {
        super(line, column);
        this.operand = operand;
    }

    public Expression getOperand() {
        return operand;
    }

    public void setOperand(Expression operand) {
        this.operand = operand;
    }

    @Override
    public String toString() {
        return String.format("!%s", operand);
    }
}
