package upc.edu.cep.Interpreter;

import java.util.Map;

/**
 * Created by osboxes on 24/05/17.
 */
public interface Interpreter {

    String interpret(InterpreterContext context) throws InterpreterException;

    Map<String, String> interpretToMap(InterpreterContext context) throws InterpreterException;
}
