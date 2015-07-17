package abstractfactory.pattern;

/**
 * Created by luisburgos on 16/07/15.
 */
public abstract class AbstractProductA {

    private String name;
    private String description;

    public AbstractProductA() {
    }

    public AbstractProductA(String name, String description) {
        this.name = name;
        this.description = description;
    }

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

    public String getInformation(){
        return "Product: " + getName() + " | Description: " + getDescription();
    }
}
