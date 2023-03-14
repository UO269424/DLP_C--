package semantic;

import ast.Program;
import ast.definitions.FuncDefinition;
import ast.definitions.VarDefinition;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;

public class TypeCheckingVisitor extends AbstractVisitor<Void, Void>{

    @Override
    public Void visit(ArrayAccess arrayAccess, Void params) {
        super.visit(arrayAccess, params);
        arrayAccess.setLValue(true);
        return null;
    }


    @Override
    public Void visit(FieldAccess fieldAccess, Void params) {
        super.visit(fieldAccess, params);
        fieldAccess.getExpression().setLValue(true);
        return null;
    }


    @Override
    public Void visit(Variable variable, Void param) {
        super.visit(variable, param);
        variable.setLValue(true);
        return null;
    }


    @Override
    public Void visit(Assignment assignment, Void param)  {
        assignment.getLeft().accept(this, null);
        assignment.getRight().accept(this, null);
        if(!assignment.getLeft().getLValue())
            new ErrorType(assignment.getLine(), assignment.getColumn(), "LValue required in the assignment");
        return null;
    }

    @Override
    public Void visit(Read read, Void param)    {
        super.visit(read, param);
        if(!read.getExpression().getLValue())   {
            new ErrorType(read.getLine(), read.getColumn(), "LValue required for reading");
        }
        return null;
    }

}
