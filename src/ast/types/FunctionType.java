package ast.types;

import ast.Type;
import ast.definitions.VarDefinition;

import java.util.List;

public class FunctionType extends AbstractType{

    private List<VarDefinition> params;
    private Type returnType;

    public FunctionType(int line, int column, List<VarDefinition> params, Type returnType) {
        super(line, column);
        this.params = params;
        this.returnType = returnType;
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
}
