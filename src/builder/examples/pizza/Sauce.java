package builder.examples.pizza;

/**
 * Created by luisburgos on 22/07/15.
 */
public enum Sauce {

    HOT, MILD;

    @Override
    public String toString() {
        return name().toLowerCase();
    }

}
