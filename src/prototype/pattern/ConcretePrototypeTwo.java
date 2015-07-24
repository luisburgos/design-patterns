package prototype.pattern;

/**
 * Created by luisburgos on 23/07/15.
 */
public class ConcretePrototypeTwo implements Prototype {
    @Override
    public Prototype clone() {

        ConcretePrototypeTwo copyObject = null;

        try{
            copyObject = (ConcretePrototypeTwo)super.clone();
        }catch(CloneNotSupportedException ex){
            ex.printStackTrace();
        }

        return copyObject;
    }

    @Override
    public String toString() {
        return "Concrete Prototype Two";
    }
}
