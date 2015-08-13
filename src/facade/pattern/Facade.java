package facade.pattern;

/**
 * Created by luisburgos on 12/08/15.
 */
public class Facade {

    private ConcreteActionOne one;
    private ConcreteActionTwo two;

    public Facade() {
        System.out.println("This is the FACADE pattern...");
        this.one = new ConcreteActionOne();
        this.two = new ConcreteActionTwo();
    }

    public void doSomethingInOne() {
        System.out.println("Calling doSomething in action ONE:");
        one.doSomething();
    }

    public void doSomethingInOTwo() {
        System.out.println("Calling doSomething in action TWO:");
        two.doSomething();
    }

    public void doSomethingInOneAndTwo() {
        System.out.println("Calling doSomething in action ONE and TWO:");
        one.doSomething();
        two.doSomething();
    }
}
