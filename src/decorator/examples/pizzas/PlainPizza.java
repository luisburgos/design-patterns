package decorator.examples.pizzas;

/**
 * Created by luisburgos on 11/08/15.
 */
public class PlainPizza implements Pizza {

    public PlainPizza() {
        System.out.println("Adding Thin Dough");
    }

    @Override
    public String getDescription() {
        return "Thin Dough";
    }

    @Override
    public double getPrice() {
        System.out.println("Price of thin dough: " + 4.00);
        return 4.00;
    }
}
