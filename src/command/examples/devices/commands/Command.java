package command.examples.devices.commands;

/**
 * Created by luisburgos on 13/08/15.
 */
public interface Command {
    public void execute();
    public void undo();
}
