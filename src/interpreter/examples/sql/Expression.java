package interpreter.examples.sql;

import java.util.List;

public interface  Expression {
	List<String> interpret(Context ctx);
}
