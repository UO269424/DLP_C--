package ast.definitions;

import ast.Statement;
import ast.Type;
import ast.types.FunctionType;
import semantic.Visitor;

import java.util.ArrayList;
import java.util.List;

public class FuncDefinition extends AbstractDefinition implements Statement {


    private List<Statement> body;

    public FuncDefinition(int line, int column, String name, FunctionType functionType, List<Statement> body) {
        super(line, column, name, functionType);
        this.body = body;
    }

    public List<Statement> getBody() {
        return new ArrayList<>(body);
    }

    public void setBody(List<Statement> body) {
        this.body = new ArrayList<>(body);
    }

    @Override
    public String toString() {
        String params = "";
        List<VarDefinition> list = ((FunctionType) this.getType()).getParams();
        if (list.size() > 0) {
            for (int i = 0; i < list.size()-1; i ++)
                params += list.get(i).toString() + ", ";
            params += list.get(list.size()-1).toString();
        }

        return String.format("FunctionDefinition [%s : %s]: %s %s(%s)",
                getLine(),
                getColumn(),
                ((FunctionType) this.getType()).getReturnType(),
                this.getName(),
                params);
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
