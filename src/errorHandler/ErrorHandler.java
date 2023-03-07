package errorHandler;

import ast.types.ErrorType;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class ErrorHandler {

    private static ErrorHandler instance = null;
    private List<ErrorType> errors;

    public static ErrorHandler getInstance()    {
        if(instance == null)
            instance = new ErrorHandler();
        return instance;
    }

    private ErrorHandler()  {
        errors = new ArrayList<>();
    }

    public boolean anyErrors()  {
        return !errors.isEmpty();
    }

    public void showErrors(PrintStream out)    {
        out.println(String.format("%s Errors found: \n", errors.size()));
        errors.forEach(e -> {out.println(e);});
    }

    public void addError(ErrorType et)  {
        errors.add(et);
    }


}
