package mediator.examples.airtrafficcontroller;

public class Client {
	
	public static void main(String args[]) { 
  
        ControlTower mediator = new ControlTower(); 
        
        Flight sparrow101 = new Flight(mediator); 
        Runway mainRunway = new Runway(mediator);
        
        mediator.registerFlight(sparrow101); 
        mediator.registerRunway(mainRunway);
        
        sparrow101.getReady();
        
        mainRunway.land(); 
        sparrow101.land();
    }
}