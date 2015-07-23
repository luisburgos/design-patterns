package builder.examples.pizza;

/**
 * Created by luisburgos on 22/07/15.
 */
public class PizzaTest {

    public static void main(String[] args) {

        Pizza pizza = new PizzaDirector(new SpicyPizzaBuilder())
                .makePizza(Ingredients.HAM)
                .getPizza();

        System.out.println(pizza.toString());

    }

}
