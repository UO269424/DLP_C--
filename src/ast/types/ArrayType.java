package ast.types;

import ast.Type;
import semantic.Visitor;

public class ArrayType extends AbstractType{

    private int length;
    private Type type;

    public ArrayType(int line, int column, int length, Type type) {
        super(line, column);
        this.length = length;
        this.type = type;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("ArrayType [%s, %s]", this.length, this.type);
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
