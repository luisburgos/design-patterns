package factory.pattern;

/**
 * Created by luisburgos on 15/07/15.
 */
public abstract class Product {

    private String name;
    private String description;

    public Product(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract String getInformation();

}
