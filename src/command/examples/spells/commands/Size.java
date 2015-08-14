package command.examples.spells.commands;

/**
 * Created by luisburgos on 14/08/15.
 */
public enum Size {

    SMALL("small"), NORMAL("normal"), LARGE("large"), UNDEFINED("");

    private String title;

    Size(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}