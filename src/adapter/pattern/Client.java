package adapter.pattern;

/**
 * Created by luisburgos on 11/08/15.
 */
public class Client {

    public static void main(String[] args) {
        Target target; //What client expects
        target = new Adapter(new Adaptee("Adaptee One"));
        target.request();
    }
}
