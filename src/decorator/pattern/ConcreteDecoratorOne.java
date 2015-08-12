package decorator.pattern;

/**
 * Created by luisburgos on 11/08/15.
 */
public class ConcreteDecoratorOne extends Decorator {

    public ConcreteDecoratorOne(Component component) {
        super(component);
    }

    @Override
    public void doOperation() {
        super.doOperation();
        doAdditionalOperation();
    }

    public void doAdditionalOperation() {
        System.out.println("Doing additional operation concrete decorator ONE.");
    }

}
