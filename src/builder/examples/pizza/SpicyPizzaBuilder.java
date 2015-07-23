package builder.examples.pizza;

/**
 * Created by luisburgos on 22/07/15.
 */
public class SpicyPizzaBuilder extends PizzaBuilder {

    public SpicyPizzaBuilder(){
        this.createNewPizzaProduct();
        this.setDough(Dough.PANBAKED);
        this.setSauce(Sauce.HOT);
    }

    @Override
    public PizzaBuilder setTopping(Ingredients topping) {
        pizza.setTopping(topping);
        return this;
    }
}
