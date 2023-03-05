import ast.Definition;
import ast.Program;
import ast.Statement;
import ast.Type;
import introspector.model.IntrospectorModel;
import introspector.view.IntrospectorView;
import parser.*;

import org.antlr.v4.runtime.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String... args) throws Exception {
		   if (args.length<1) {
		        System.err.println("Please, pass me the input file.");
		        return;
		    }
		   		 			
		 // create a lexer that feeds off of input CharStream
		CharStream input = CharStreams.fromFileName(args[0]);
		CmmLexer lexer = new CmmLexer(input);

		// create a parser that feeds off the tokens buffer
		CommonTokenStream tokens = new CommonTokenStream(lexer); 
		CmmParser parser = new CmmParser(tokens);	
		//parser.program();

		Program ast = parser.program().ast;

		//Type ast = parser.type().ast;

		//List<Statement> ast = parser.statement().ast;

		//List<Definition> ast = parser.definition().ast;

		IntrospectorModel model=new IntrospectorModel("Type", ast);
		new IntrospectorView("Introspector", model);

	}
	

}
