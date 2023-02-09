package ast.types;

import java.util.ArrayList;
import java.util.List;

public class RecordType extends AbstractType{

    private List<RecordField> fields;

    public RecordType(int line, int column, List<RecordField> fields) {
        super(line, column);
        this.fields = new ArrayList<>(fields);
    }

    public List<RecordField> getFields() {
        return new ArrayList<>(fields);
    }
}
