package memento.pattern;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
	
	private List<Memento> savedStates = new ArrayList<Memento>();
	 
	public void addMemento(Memento m) { 
		savedStates.add(m); 
	}
	
	public Memento getMemento(int index) { 
		return savedStates.get(index); 
	}
}
