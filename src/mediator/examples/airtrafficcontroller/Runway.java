package mediator.examples.airtrafficcontroller;

public class Runway implements Command { 
    private ControlTower mediator; 
  
    public Runway(ControlTower mediator) { 
        this.mediator = mediator; 
        mediator.setLandingStatus(false); 
    } 
  
    @Override
    public void land() { 
        System.out.println("Landing permission granted."); 
        mediator.setLandingStatus(true); 
    } 
}