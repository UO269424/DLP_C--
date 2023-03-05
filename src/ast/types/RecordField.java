package ast.types;

import ast.Type;

public class RecordField extends AbstractType{

    private Type type;
    private String field;

    public RecordField(int line, int column, Type type, String field) {
        super(line, column);
        this.type = type;
        this.field = field;
    }

    public Type getType() {
        return type;
    }

    public String getField() {
        return field;
    }

    @Override
    public String toString()    {
        return String.format("Record field: %s %s", type, field);
    }
}
