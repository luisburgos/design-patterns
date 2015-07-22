package builder.examples.fastfood;

/**
 * Created by luisburgos on 22/07/15.
 */
public class Costumer {

    private Cashier cashier;

    public Costumer(){
        cashier = new Cashier(new ChildrensMealBuilder());
    }

    public Meal getMeal(){
        return cashier.getMeal();
    }

    public void orderMeal(){
        cashier.makeMeal();
    }

};