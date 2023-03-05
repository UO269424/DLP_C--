package ast.expressions;

import ast.Expression;

public class FieldAccess extends AbstractExpression{

    private String fieldName;
    private Expression expression;

    public FieldAccess(int line, int column, Expression expression, String fieldName) {
        super(line, column);
        this.fieldName = fieldName;
        this.expression = expression;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return String.format("%s.%s", expression.toString(), fieldName);
    }
}
