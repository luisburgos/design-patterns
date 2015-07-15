package factory.pattern;

/**
 * Created by luisburgos on 15/07/15.
 */
public class ConcreteProductOne extends Product{

    public ConcreteProductOne(String name, String description){
        setName(name);
        setDescription(description);
    }

    public ConcreteProductOne(){
        setName("Product One");
        setDescription("Description of product one");
    }

    @Override
    public String getInformation() {
        return "Product name: " + getName() + " , Description: " + getDescription();
    }

}
