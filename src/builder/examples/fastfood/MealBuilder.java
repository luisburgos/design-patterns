package builder.examples.fastfood;

/**
 * Created by luisburgos on 22/07/15.
 */
public interface MealBuilder {

    public void buildBurger();
    public void buildDrink();
    public void buildComplement();
    public void buildToy();
    public Meal getMeal();
}
