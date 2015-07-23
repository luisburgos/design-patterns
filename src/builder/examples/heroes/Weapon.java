package builder.examples.heroes;

/**
 * Created by luisburgos on 22/07/15.
 */
public enum Weapon {

    DAGGER, SWORD, AXE, WARHAMMER, BOW;

    @Override
    public String toString() {
        return name().toLowerCase();
    }

}
