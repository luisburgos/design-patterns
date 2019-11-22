package visitor.examples.airportsecuritycontrol;

import java.util.List;

public class InternationalPassenger implements Passenger{
	private String passport;
	private Boolean visa;
	private List<String> belongings;
	
	public InternationalPassenger(String passport, Boolean visa, List<String> belongings) {
		this.passport = passport;
		this.visa = visa;
		this.belongings = belongings;
	}

	public String getPassport() {
		return passport;
	}
	
	public Boolean getVisa() {
		return visa;
	}

	public List<String> getBelongings() {
		return belongings;
	}

	@Override
    public boolean accept(PoliceOfficer visitor) { 
        return visitor.visit(this); 
    }
}
