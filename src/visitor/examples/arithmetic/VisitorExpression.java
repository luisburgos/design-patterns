package visitor.examples.arithmetic;

public class VisitorExpression {
	
	private String _resultado;
	
	public void visitVariable(Variable v) { 
		_resultado = v._variable; 
	}

	public void visitConstant(Constant c) {
		_resultado = String.valueOf(c._valor); 
	}

	private void visitOpBinary(OpBinary op, String pOperacion) {
		op._izq.aceptar(this);
		String pIzq = obtenerResultado();

		op._der.aceptar(this);
		String pDer = obtenerResultado();

		_resultado = "(" + pIzq + pOperacion + pDer + ")";
	}

	public void visitSum(Sum s) { 
		visitOpBinary(s, "+");
	}
	
	public void visitMult(Mult m) { 
		visitOpBinary(m, "*"); 
	}

	public String obtenerResultado() { 
		return _resultado; 
	}
}