package mediator.examples.airtrafficcontroller;

public class Flight implements Command {
    private ControlTower mediator; 
  
    public Flight(ControlTower mediator) { 
        this.mediator = mediator; 
    } 
  
    public void land() { 
        if (mediator.isLandingOk()) { 
            System.out.println("Successfully Landed."); 
            mediator.setLandingStatus(true); 
        
        } else {
            System.out.println("Waiting for landing.");
        }
    } 
  
    public void getReady() { 
        System.out.println("Ready for landing."); 
    }
}