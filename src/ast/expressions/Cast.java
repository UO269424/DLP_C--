package ast.expressions;

import ast.Expression;
import ast.Type;

public class Cast extends AbstractExpression{

    private Type targetType;
    private Expression operand;

    public Cast(int line, int column, Type type, Expression operand) {
        super(line, column);
        this.targetType = type;
        this.operand = operand;
    }

    public Type getTargetType() {
        return targetType;
    }

    public void setTargetType(Type targetType) {
        this.targetType = targetType;
    }

    public Expression getOperand() {
        return operand;
    }

    public void setOperand(Expression operand) {
        this.operand = operand;
    }
}
