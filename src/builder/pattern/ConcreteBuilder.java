package builder.pattern;

/**
 * Created by luisburgos on 22/07/15.
 */
public class ConcreteBuilder implements Builder{

    private Product product;

    @Override
    public void buildPart() {

    }

    public Product getResult(){
        return product;
    }
}
