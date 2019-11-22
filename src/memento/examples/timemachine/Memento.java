package memento.examples.timemachine;

public class Memento {
	
    private final String time; 

    public Memento(String timeToSave) { 
        time = timeToSave; 
    } 

    public String getSavedTime() { 
        return time; 
    } 
}
