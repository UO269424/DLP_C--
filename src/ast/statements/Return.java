package ast.statements;

import ast.Expression;
import semantic.Visitor;

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

    @Override
    public String toString() {
        return String.format("Return %s", value);
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
