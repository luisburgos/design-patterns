package chain.examples.army;

public class Soldier extends Unit {

    public Soldier(String name) {
        super(name);
    }
    
    public String toString() { 
    	return ("Soldado " + super.toString()); 
    }

}
