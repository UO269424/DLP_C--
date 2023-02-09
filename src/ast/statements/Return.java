package ast.statements;

import ast.Expression;

public class Return extends AbstractStatement{

    private Expression value;

    public Return(int line, int column, Expression value) {
        super(line, column);
        this.value = value;
    }

    public Expression getValue() {
        return value;
    }

    public void setValue(Expression value) {
        this.value = value;
    }
}
