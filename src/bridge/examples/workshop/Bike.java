package bridge.examples.workshop;

public class Bike extends Vehicle { 
	
    public Bike(Workshop workShop1, Workshop workShop2) { 
        super(workShop1, workShop2); 
    } 
  
    @Override
    public void manufacture() { 
        System.out.print("Bike "); 
        workShop1.work(); 
        workShop2.work(); 
    } 
} 
