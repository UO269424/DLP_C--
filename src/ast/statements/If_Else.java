package ast.statements;

import ast.Expression;
import ast.Statement;

import java.util.ArrayList;
import java.util.List;

public class If_Else extends AbstractStatement{

    private Expression condition;
    private List<Statement> ifBody;
    private List<Statement> elseBody;

    public If_Else(int line, int column, Expression condition, List<Statement> ifBody) {
        super(line, column);
        this.condition = condition;
        this.ifBody = new ArrayList<>(ifBody);
        this.elseBody= new ArrayList<>();
    }

    public If_Else(int line, int column, Expression condition, List<Statement> ifBody, List<Statement> elseBody) {
        this(line, column, condition, ifBody);
        this.elseBody = new ArrayList<>(elseBody);
    }

    public Expression getCondition() {
        return condition;
    }

    public void setCondition(Expression condition) {
        this.condition = condition;
    }

    public List<Statement> getIfBody() {
        return new ArrayList<>(ifBody);
    }

    public void setIfBody(List<Statement> ifBody) {
        this.ifBody = new ArrayList<>(ifBody);
    }

    public List<Statement> getElseBody() {
        if(elseBody==null)
            return new ArrayList<Statement>();
        return new ArrayList<>(elseBody);
    }

    public void setElseBody(List<Statement> elseBody) {
        this.elseBody = new ArrayList<>(elseBody);
    }
}
