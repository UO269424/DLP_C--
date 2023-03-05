package ast.expressions;

import ast.Expression;

public class ArrayAccess extends AbstractExpression{

    private Expression array;
    private Expression index;

    public ArrayAccess(int line, int column, Expression array, Expression index) {
        super(line, column);
        this.array = array;
        this.index = index;
    }

    public Expression getArray() {
        return array;
    }

    public void setArray(Expression array) {
        this.array = array;
    }

    public Expression getIndex() {
        return index;
    }

    public void setIndex(Expression index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return String.format("ArrayAccess [%s : %s] : array=[ %s ] index=[ %s ]",
                getLine(),
                getColumn(),
                array,
                index);
    }
}
