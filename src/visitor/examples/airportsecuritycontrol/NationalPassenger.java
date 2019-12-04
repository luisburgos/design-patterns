package visitor.examples.airportsecuritycontrol;

import java.util.List;

public class NationalPassenger implements Passenger{
	private String identityDocument;
	private List<String> belongings;
	
	public NationalPassenger(String identityDocument, List<String> belongings) {
		this.identityDocument = identityDocument;
		this.belongings = belongings;
	}

	public String getIdentityDocument() {
		return identityDocument;
	}

	public List<String> getBelongings() {
		return belongings;
	}

	@Override
    public boolean accept(PoliceOfficer visitor) { 
        return visitor.visit(this); 
    }
}