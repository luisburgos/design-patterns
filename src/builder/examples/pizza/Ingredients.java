package builder.examples.pizza;

/**
 * Created by luisburgos on 22/07/15.
 */
public enum Ingredients {

    PEPPERONI, SALAMI, HAM, MUSHROOMS, PINEAPPLE;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
