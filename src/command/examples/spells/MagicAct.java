package command.examples.spells;

import command.examples.spells.commands.AgeSpell;
import command.examples.spells.commands.InvisibilitySpell;
import command.examples.spells.commands.ShrinkSpell;

/**
 * Main Magic Act.
 * Created by luisburgos on 14/08/15.
 */
public class MagicAct {

    public static void main(String[] args) {
        Wizard wizard = new Wizard();
        Assistant assistant = new Assistant();

        assistant.printStatus();

        wizard.castSpell(new ShrinkSpell(), assistant);
        assistant.printStatus();

        wizard.castSpell(new InvisibilitySpell(), assistant);
        assistant.printStatus();

        wizard.undoLastSpell();
        assistant.printStatus();

        wizard.undoLastSpell();
        assistant.printStatus();

        wizard.redoLastSpell();
        assistant.printStatus();

        wizard.redoLastSpell();
        assistant.printStatus();

        ///Add a new spell
        wizard.castSpell(new AgeSpell(), assistant);
        assistant.printStatus();
    }

}
