package visitor.examples.arithmetic;

public class Variable extends Expression {
	String _variable;
	
	public Variable(String variable) { 
		_variable = variable; 
	}
	
	public void aceptar(VisitorExpression v) { 
		v.visitVariable(this); 
	}
}