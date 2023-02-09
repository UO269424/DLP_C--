package ast.definitions;

import ast.Statement;
import ast.Type;
import ast.types.FunctionType;

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
}
