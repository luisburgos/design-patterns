package command.pattern;

/**
 * Created by luisburgos on 13/08/15.
 */
public class Invoker {
    public void executeCommand(Command command, Receiver receiver){
        command.execute(receiver);
    }
}
