package flyweight.examples.counterstrike;

public class Terrorist implements Player { 
    // Intrinsic Attribute 
    private final String TASK; 
  
    // Extrinsic Attribute 
    private String weapon; 
  
    public Terrorist() { 
        TASK = "PLANT A BOMB"; 
    } 
    
    public void assignWeapon(String weapon) { 
        this.weapon = weapon; 
    } 
    
    public void mission() { 
        System.out.println("["+System.identityHashCode(this) + "] Terrorist with weapon " + weapon + " | Task is " + TASK); 
    } 
}
