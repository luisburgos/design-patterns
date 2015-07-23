package builder.examples.pizza;

/**
 * Created by luisburgos on 22/07/15.
 */
public class HawaiianPizzaBuilder extends PizzaBuilder{

    public HawaiianPizzaBuilder(){
        this.createNewPizzaProduct();
        this.setDough(Dough.CROSS);
        this.setSauce(Sauce.MILD);
    }

    @Override
    public PizzaBuilder setTopping(Ingredients topping) {
        pizza.setTopping(topping);
        return this;
    }

}
