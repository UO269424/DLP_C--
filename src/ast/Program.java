package ast;

import semantic.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Program extends AbstractASTNode{

    private List<Definition> definitions;

    public Program(int line, int column, List<Definition> defs) {
        super(line, column);
        definitions= new ArrayList<Definition>(defs);
    }

    @Override
    public String toString() {
        return String.format("Program [%s : %s] : with %s definitions",
                getLine(),
                getColumn(),
                definitions.size());
    }

    public List<Definition> getDefinitions() {
        return definitions;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
