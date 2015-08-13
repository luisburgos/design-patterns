package facade.pattern;

/**
 * Created by luisburgos on 12/08/15.
 */
public class Client {

    public static void main(String[] args) {

        Facade facade = new Facade();
        facade.doSomethingInOne();
        facade.doSomethingInOTwo();
        facade.doSomethingInOneAndTwo();

    }
}
