package command.examples.spells.commands;

/**
 * Created by luisburgos on 14/08/15.
 */
public enum Visibility {

    VISIBLE("visible"), INVISIBLE("invisible"), UNDEFINED("");

    private String title;

    Visibility(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}