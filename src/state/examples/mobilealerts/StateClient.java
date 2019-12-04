package state.examples.mobilealerts;

public class StateClient {
	
	public static void main(String[] args) { 
        AlertStateContext stateContext = new AlertStateContext(); 
        stateContext.alert(); 
        stateContext.alert(); 
        stateContext.setState(new Silent()); 
        stateContext.alert(); 
        stateContext.alert();
        stateContext.setState(new Ring()); 
        stateContext.alert();         
    }
}
