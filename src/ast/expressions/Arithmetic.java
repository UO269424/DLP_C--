package ast.expressions;

import ast.Expression;

public class Arithmetic extends AbstractExpression{

    private Expression left;
    private Expression right;
    private String operator;

    public Arithmetic(int line, int column,Expression left, Expression right, String operator) {
        super(line, column);
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    public Expression getLeft() {
        return left;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    public Expression getRight() {
        return right;
    }

    public void setRight(Expression right) {
        this.right = right;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", left, operator, right);
    }
}
