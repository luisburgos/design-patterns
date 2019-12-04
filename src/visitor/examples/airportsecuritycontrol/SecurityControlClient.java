package visitor.examples.airportsecuritycontrol;

import java.util.Arrays;
import java.util.Collections;

public class SecurityControlClient {
	
	public static void main(String[] args) { 
		Passenger[] passengers = new Passenger[] {new NationalPassenger("45874005H", Arrays.asList("Coins","Bag","Sun glasses")),
												  new NationalPassenger(null, Collections.EMPTY_LIST),
												  new InternationalPassenger("4A4585BC", true, Arrays.asList("Cap","False beard","Gun")),
												  new InternationalPassenger("11AB8564", false, Arrays.asList("Suitcase","Coat")),
												  new InternationalPassenger("269LZF74", false, Arrays.asList("Liquids"))};
		
		PoliceOfficer officer = new PoliceOfficer();
		
		for(Passenger p: passengers) {
			if(p.accept(officer)) {
				System.out.println("Access granted");
			}else {
				System.out.println("Access NOT granted");
			}
		}
	}
}
