package builder.examples.pizza;

/**
 * Created by luisburgos on 22/07/15.
 */
public enum Dough {

    CROSS, PANBAKED;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
