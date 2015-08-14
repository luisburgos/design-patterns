package command.examples.spells.commands;

import command.examples.spells.Target;

/**
 * Created by luisburgos on 14/08/15.
 */
public abstract class Command {

    public abstract void execute(Target target);
    public abstract void undo();
    public abstract void redo();

    @Override
    public abstract String toString();

}
