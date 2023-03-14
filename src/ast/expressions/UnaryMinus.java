package ast.expressions;

import ast.Expression;
import semantic.Visitor;

public class UnaryMinus extends AbstractExpression{

    private Expression operand;

    public UnaryMinus(int line, int column, Expression operand) {
        super(line, column);
        this.operand = operand;
    }

    public Expression getOperand() {
        return operand;
    }

    @Override
    public String toString() {
        return String.format("-%s", operand);
    }


    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
