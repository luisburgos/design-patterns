package decorator.examples.pizzas;

/**
 * Created by luisburgos on 11/08/15.
 */
public class Mozzarella extends ToppingDecorator {

    public Mozzarella(Pizza temporalPizza) {
        super(temporalPizza);
        System.out.println("Adding Mozzarella");
    }

    @Override
    public String getDescription() {
        return temporalPizza.getDescription() + ", mozzarella";
    }

    @Override
    public double getPrice() {
        System.out.println("Price of mozarrella: " + .50);
        return temporalPizza.getPrice() + .50;
    }

}
