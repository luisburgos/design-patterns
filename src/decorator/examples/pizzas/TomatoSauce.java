package decorator.examples.pizzas;

/**
 * Created by luisburgos on 11/08/15.
 */
public class TomatoSauce extends ToppingDecorator {

    public TomatoSauce(Pizza temporalPizza) {
        super(temporalPizza);
        System.out.println("Adding Tomato Sauce");
    }

    @Override
    public String getDescription() {
        return temporalPizza.getDescription() + ", tomato sauce";
    }

    @Override
    public double getPrice() {
        System.out.println("Price of tomato sauce: " + 2.50);
        return temporalPizza.getPrice() + 2.50;
    }

}

