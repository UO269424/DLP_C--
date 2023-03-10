package ast.types;

import semantic.Visitor;

public class CharType extends AbstractType{

    public CharType(int line, int column) {
        super(line, column);
    }

    @Override
    public String toString() {
        return "CharType";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
