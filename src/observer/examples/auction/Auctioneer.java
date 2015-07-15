package observer.examples.auction;

import observer.pattern.Event;
import observer.pattern.Observer;
import observer.pattern.Subject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by luisburgos on 15/07/15.
 */
public class Auctioneer extends Subject{

    private final HashMap<Integer, LinkedList<Observer>> observers;

    public Auctioneer(){
        observers = new HashMap();
    }

    private LinkedList<Observer> getList(int type) {
        if (!observers.containsKey(type)) {
            observers.put(type, new LinkedList<Observer>());
        }
        return observers.get(type);
    }

    @Override
    public void attach(int eventTpye, Observer newObserver) {
        getList(eventTpye).add(newObserver);
    }

    @Override
    public void detach(int eventTpye, Observer observer) {
        getList(eventTpye).remove(observer);
    }

    @Override
    public void notifyObserver(int eventTpye, Event event) {
        if (observers.containsKey(eventTpye)){
            Iterator<Observer> iterator = observers.get(eventTpye).iterator();
            while(iterator.hasNext()){
                iterator.next().update(event);
            }
        }
    }

}
