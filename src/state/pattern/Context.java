package state.pattern;

public class Context {
	private State state;
	 
 	public void setState( State state ){
 		this.state = state;
 	}
 
 	public State getState(){
 		return state;
 	}
 
 	public void request() {
 		state.handle();
 	}
}
