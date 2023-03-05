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

    public void setFields(List<RecordField> fields) {
        this.fields = fields;
    }

    @Override
    public String toString()    {
        StringBuilder sb = new StringBuilder();
        if(fields.size()>0) {
            sb.append(fields.get(0).toString());

            for (int i = 1; i < fields.size(); i ++)
                sb.append(", " + fields.get(i).toString());
        }
         return String.format("StructType {\n%s\n}", sb.toString());
    }
}
