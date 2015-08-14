package command.pattern;

/**
 * Created by luisburgos on 13/08/15.
 */
public class Client {

    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        ConcreteReceiver receiver = new ConcreteReceiver();

        invoker.executeCommand(new ConcreteCommand(), receiver);
    }

}
