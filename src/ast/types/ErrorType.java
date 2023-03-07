package ast.types;

public class ErrorType extends AbstractType{

    private String message;

    public ErrorType(int line, int column, String message) {
        super(line, column);
        this.message=message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return String.format("ERROR [%s, %s]: %s", this.getLine(), this.getColumn(), this.message);
    }
}
