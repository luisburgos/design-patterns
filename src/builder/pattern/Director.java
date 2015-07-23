package builder.pattern;

/**
 * Created by luisburgos on 22/07/15.
 */
public class Director {

    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public void makeProduct(){
        builder.buildPartOne();
        builder.buildPartTwo();
        builder.buildPartThree();
    }

    public Product getProduct(){
        return builder.getProduct();
    }
}
