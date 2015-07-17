package abstractfactory.pattern;

/**
 * Created by luisburgos on 16/07/15.
 */
public class ProductBOne extends AbstractProductB {

    public ProductBOne(String name, String description){
        super(name, description);
    }

    public ProductBOne(){
        setName("Product B - Part One");
        setDescription("Description of Product B - Part One");
    }

}
