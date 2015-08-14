package command.examples.spells;

import command.examples.spells.commands.Age;
import command.examples.spells.commands.Size;
import command.examples.spells.commands.Visibility;

/**
 * The RECEIVER
 * Created by luisburgos on 14/08/15.
 */
public class Assistant extends Target {

    public Assistant() {
        setSize(Size.NORMAL);
        setVisibility(Visibility.VISIBLE);
        setAge(Age.ADULT);
    }

    @Override
    public String toString() {
        return "Assistant";
    }

}