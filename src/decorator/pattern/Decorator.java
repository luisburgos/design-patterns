package decorator.pattern;

/**
 * Created by luisburgos on 11/08/15.
 */
public abstract class Decorator implements Component {

    protected Component component;

    public Decorator(Component component){
        this.component = component;
    }

    @Override
    public void doOperation() {
        component.doOperation();
    }
}
