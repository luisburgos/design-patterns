package builder.examples.pizza;

/**
 * Created by luisburgos on 22/07/15.
 */
public class Pizza {

    private Dough dough;
    private Sauce sauce;
    private Ingredients topping;

    public Pizza(){}

    public Dough getDough() {
        return dough;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public Ingredients getTopping() {
        return topping;
    }

    public void setTopping(Ingredients topping) {
        this.topping = topping;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();

        output.append("This is a Pizza with " + getDough() + " dough, " + getSauce() + " ,sauce");

        if(topping != null){
            output.append(" and " + topping);
        }

        output.append(".");

        return output.toString();
    }
}
