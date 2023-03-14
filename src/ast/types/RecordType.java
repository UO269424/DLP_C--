package ast.types;

import errorHandler.ErrorHandler;
import semantic.Visitor;

import java.util.ArrayList;
import java.util.List;

public class RecordType extends AbstractType{

    private List<RecordField> fields;

    public RecordType(int line, int column, List<RecordField> fields) {
        super(line, column);
        this.fields = new ArrayList<>(fields);
        List<RecordField> check = new ArrayList<>(this.fields);
        fields.forEach(rf -> {  int counter=0;
                                for(RecordField other : check) {
                                    if(other.getField().equals(rf.getField()) && other.getType().equals(rf.getType())) {
                                        counter++;
                                    }

                                }
                                check.remove(rf);
                                if(counter>=2)  {
                                    new ErrorType(rf.getLine(), rf.getColumn(), String.format("There are duplicated fields in struct"));
                                }
        });
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

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
