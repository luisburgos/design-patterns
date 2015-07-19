package composite.pattern;

/**
 * Created by luisburgos on 18/07/15.
 */
public abstract class Component {

    protected String name;

    public void add(Component component) {
        throw new UnsupportedOperationException();
    }
    public void remove(Component component) {
        throw new UnsupportedOperationException();
    }
    public abstract void doSomething();

    public String getName() {
        return name;
    }

}
