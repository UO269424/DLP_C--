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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(function.getName());
        sb.append("(");

        if (args.size() > 0) {
            sb.append(args.get(0).toString());
            for (int i = 1; i < args.size(); i ++)
                sb.append(", " + args.get(i));
        }

        sb.append(")");
        return sb.toString();
    }
}
