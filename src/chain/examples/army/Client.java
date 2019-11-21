package chain.examples.army;

public class Client {
	
	public static void main(String argv[]) {
		Unit smith  = new Officer("Smith", "Descanse");
	    Unit truman = new Officer("Truman", "Tomar posición enemiga");
	    Unit ryan   = new Soldier("Ryan");
	    Unit rambo  = new Soldier("Rambo");
	      
	    System.out.println(rambo.order());    // rambo -> ?
	
	    rambo.setCommand(truman);
	    System.out.println(rambo.order());    // rambo -> truman
	
	    ryan.setCommand(rambo);
	    System.out.println(ryan.order());     // ryan -> rambo -> truman
	      
	    truman.setCommand(smith);
	    System.out.println(ryan.order());     // ryan -> rambo -> truman -> smith
	    
	}
}
