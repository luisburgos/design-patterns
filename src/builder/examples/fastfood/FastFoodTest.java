package builder.examples.fastfood;

/**
 * Created by luisburgos on 22/07/15.
 */
public class FastFoodTest {

    public static void main(String[] args) {

        Costumer costumer = new Costumer();
        costumer.orderMeal();

        Meal meal = costumer.getMeal();

        System.out.println("Meal Burger: " + meal.getBurger());
        System.out.println("Meal Drink: " + meal.getDrink());
        System.out.println("Meal Complement: " + meal.getComplement());
        System.out.println("Meal Toy: " + meal.getToy());

    }

}
