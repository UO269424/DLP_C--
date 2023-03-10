package ast.types;

import semantic.Visitor;

public class IntType extends AbstractType{

    public IntType(int line, int column) {
        super(line, column);
    }

    @Override
    public String toString() {
        return "IntType";
    }


    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
