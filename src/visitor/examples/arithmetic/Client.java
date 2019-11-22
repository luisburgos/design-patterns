package visitor.examples.arithmetic;

public class Client {
	
	public static void main(String argv[]) {
	    // Construcción de una expresión (a+5)*(b+1)
		Expression expresion = new Mult( new Sum( new Variable("a"),
	                                              new Constant(5) ), 
	                                    new Sum( new Variable("b"),
	                                              new Constant(1) ));

	    VisitorExpression expr = new VisitorExpression();
	    expresion.aceptar(expr);     

	    // Visualizacion de resultados
	    System.out.println("Resultado: " + expr.obtenerResultado());
	}
}
