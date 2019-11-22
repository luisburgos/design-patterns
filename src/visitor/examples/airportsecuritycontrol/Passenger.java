package visitor.examples.airportsecuritycontrol;

public interface Passenger {
	boolean accept(PoliceOfficer visitor); 
}
