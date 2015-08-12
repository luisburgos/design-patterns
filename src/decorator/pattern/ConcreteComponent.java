package decorator.pattern;

/**
 * Created by luisburgos on 11/08/15.
 */
public class ConcreteComponent implements Component {

    @Override
    public void doOperation() {
        System.out.println("Concrete Component doing operation");
    }

}
