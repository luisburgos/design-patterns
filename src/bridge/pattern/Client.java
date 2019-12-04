package bridge.pattern;

public class Client {
	
	public static void main(String[] args) {
		
        Abstraction[] abstracciones = new Abstraction[2];
        abstracciones[0] = new RefinedAbstraction(new ImplementorA());
        abstracciones[1] = new RefinedAbstraction(new ImplementorB());
        
        for(Abstraction abstraccion:abstracciones) {
            abstraccion.operacion();
        }
    }
}
