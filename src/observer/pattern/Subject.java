package observer.pattern;

/**
 * Created by luisburgos on 15/07/15.
 */
public abstract class Subject {

    public abstract void attach(int eventTpye, Observer observer);
    public abstract void detach(int eventTpye, Observer observer);
    public abstract void notifyObserver(int eventTpye, Event event);

}
