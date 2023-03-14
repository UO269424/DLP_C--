package ast.types;

import ast.Type;
import ast.definitions.VarDefinition;
import semantic.Visitor;

import java.util.ArrayList;
import java.util.List;

public class FunctionType extends AbstractType{

    private List<VarDefinition> params;
    private Type returnType;

    public FunctionType(int line, int column, List<VarDefinition> params, Type returnType) {
        super(line, column);
        this.params = new ArrayList<>(params);
        this.returnType = returnType;
    }
    public FunctionType(int line, int column, Type returnType) {
        this(line, column,new ArrayList<>(), returnType);
    }

    public List<VarDefinition> getParams() {
        return params;
    }

    public void setParams(List<VarDefinition> params) {
        this.params = params;
    }

    public Type getReturnType() {
        return returnType;
    }

    public void setReturnType(Type returnType) {
        this.returnType = returnType;
    }

    @Override
    public String toString() {

        String strParams = "";
        if (params.size() > 0) {
            strParams += params.get(0).toString();
            for (int i = 1; i < params.size(); i ++)
                strParams += (", " + params.get(i).toString());
        }

        return String.format("FunctionType: returnType=%s, params=( %s )",
                returnType, strParams);
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
