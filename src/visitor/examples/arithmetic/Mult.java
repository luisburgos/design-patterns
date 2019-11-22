package visitor.examples.arithmetic;

public class Mult extends OpBinary {
	public Mult(Expression izq, Expression der) { 
		super(izq, der); 
	}
	
	public void aceptar(VisitorExpression v) { 
		v.visitMult(this); 
	}
}
