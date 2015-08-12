package decorator.examples.pizzas;

/**
 * Created by luisburgos on 11/08/15.
 */
public abstract class ToppingDecorator implements Pizza {

    protected Pizza temporalPizza;

    public ToppingDecorator(Pizza temporalPizza) {
        this.temporalPizza = temporalPizza;
    }

    @Override
    public String getDescription() {
        return temporalPizza.getDescription();
    }

    @Override
    public double getPrice() {
        return temporalPizza.getPrice();
    }
}
