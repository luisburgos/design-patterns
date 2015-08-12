package decorator.pattern;

/**
 * Created by luisburgos on 11/08/15.
 */
public class Client {

    public static void main(String[] args) {

        Component component = new ConcreteDecoratorOne(new ConcreteComponent());
        component.doOperation();
        System.out.println("Adding concrete component two...");
        component = new ConcreteDecoratorOne(new ConcreteDecoratorTwo(new ConcreteComponent()));
        component.doOperation();
    }

}
