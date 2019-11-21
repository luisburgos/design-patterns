
package chain.examples.army;

public class Officer extends Unit {

	private String _order;

    public Officer(String name, String order) {
	    super(name);
	    _order = order;
    }

    public String order() {
    	String result=null;
    	
    	if(super.order()!=null && !super.order().equals("(sin orden)")) {
    		result = super.order();
    	
    	}else if (_order != null) {
    		result = _order;
    	}
    	
    	return result;

    }

    public String toString() { 
    	return ("Oficial " + super.toString()); 
    }
}
