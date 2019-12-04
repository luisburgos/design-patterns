package bridge.pattern;

public class RefinedAbstraction implements Abstraction{
	
    private Implementor implementador;
    
    public RefinedAbstraction(Implementor implementador){
        this.implementador = implementador;
    }
    public void operacion(){
        implementador.operacion();
    }

}
