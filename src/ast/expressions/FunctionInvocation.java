package ast.expressions;

import ast.Expression;
import ast.Statement;

import java.util.ArrayList;
import java.util.List;

public class FunctionInvocation extends AbstractExpression implements Statement {

    private Variable function;
    private List<Expression> args;

    public FunctionInvocation(int line, int column, Variable function, List<Expression> args) {
        super(line, column);
        this.function = function;
        this.args = new ArrayList<>(args);
    }

    public Variable getFunction() {
        return function;
    }

    public void setFunction(Variable function) {
        this.function = function;
    }

    public List<Expression> getArgs() {
        return args;
    }

    public void setArgs(List<Expression> args) {
        this.args = args;
    }
}
