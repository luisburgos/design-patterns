package command.examples.spells.commands;

/**
 * Created by luisburgos on 14/08/15.
 */
public enum Age {
    CHILD("small"), ADULT("adult"), ELDER("elder"), UNDEFINED("");

    private String title;

    Age(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
