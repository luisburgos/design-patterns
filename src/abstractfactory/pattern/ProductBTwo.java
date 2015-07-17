package abstractfactory.pattern;

/**
 * Created by luisburgos on 16/07/15.
 */
public class ProductBTwo extends AbstractProductB  {

    public ProductBTwo(String name, String description){
        super(name, description);
    }

    public ProductBTwo(){
        setName("Product B - Part Two");
        setDescription("Description of Product B - Part Two");
    }

}
