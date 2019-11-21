package flyweight.examples.counterstrike;

public class CounterTerrorist implements Player { 
    // Intrinsic Attribute 
    private final String TASK; 
  
    // Extrinsic Attribute 
    private String weapon; 
  
    public CounterTerrorist() { 
        TASK = "DIFFUSE BOMB"; 
    } 
    
    public void assignWeapon(String weapon) { 
        this.weapon = weapon; 
    } 
    
    public void mission() { 
        System.out.println("["+System.identityHashCode(this) + "] Counter Terrorist with weapon " + weapon + " | Task is " + TASK); 
    } 
}
