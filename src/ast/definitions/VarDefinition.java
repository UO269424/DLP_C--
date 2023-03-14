package ast.definitions;

import ast.Statement;
import ast.Type;
import semantic.Visitor;

public class VarDefinition extends AbstractDefinition implements Statement {


    public VarDefinition(int line, int column, String name, Type type) {
        super(line, column, name, type);
    }

    @Override
    public String toString() {
        return String.format("%s %s",
                this.getType(),
                this.getName());
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
