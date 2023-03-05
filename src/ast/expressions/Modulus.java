package ast.expressions;

import ast.Expression;

public class Modulus extends AbstractExpression{

    private Expression left;
    private Expression right;

    public Modulus(int line, int column, Expression left, Expression right) {
        super(line, column);
        this.left = left;
        this.right = right;
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

    @Override
    public String toString() {
        return String.format("%s % %s", left, right);
    }
}
