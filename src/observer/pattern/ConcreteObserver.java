package observer.pattern;

/**
 * Created by luisburgos on 15/07/15.
 */
public class ConcreteObserver implements Observer {

    private static int ID = 0;

    @Override
    public void update(Event event) {
        System.out.println(
                "ID: " + (++ID) +
                    ", Updating event type: " +  event.getType() +
                        ", Event description: " + event.getDescription());
    }
}
