package builder.examples.pizza;

/**
 * Created by luisburgos on 22/07/15.
 */
public class PizzaDirector {

    private PizzaBuilder pizzaBuilder;

    public PizzaDirector(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public Pizza getPizza(){
        return pizzaBuilder.getPizza();
    }

    public PizzaDirector makePizza(Ingredients topping){
        pizzaBuilder.createNewPizzaProduct();
        pizzaBuilder.setTopping(topping);
        return this;
    }

}
