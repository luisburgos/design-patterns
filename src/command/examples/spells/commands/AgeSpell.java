package command.examples.spells.commands;

import command.examples.spells.Target;

/**
 * Created by luisburgos on 14/08/15.
 */
public class AgeSpell extends Command {

    private Age previousAge;
    private Target target;


    @Override
    public void execute(Target target) {
        previousAge = target.getAge();
        target.setAge(Age.ELDER);
        this.target = target;
    }

    @Override
    public void undo() {
        if (previousAge != null && target != null) {
            Age temp = target.getAge();
            target.setAge(previousAge);
            previousAge = temp;
        }
    }

    @Override
    public void redo() {
        undo();
    }

    @Override
    public String toString() {
        return "Age Spell";
    }
}
