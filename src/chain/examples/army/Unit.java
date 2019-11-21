package chain.examples.army;

public abstract class Unit {

	private Unit _command;
    private String _name;
	
    public Unit(String name) { 
        _command = null; 
        _name = name;
    }

    public String toString() { 
    	return _name; 
    }

    public void setCommand(Unit command) { 
    	_command = command; 
    }

    public String order() {
        return (_command != null ? _command.order() : "(sin orden)"); 
    }
}
