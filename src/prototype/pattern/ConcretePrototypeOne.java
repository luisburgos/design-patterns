package prototype.pattern;

/**
 * Created by luisburgos on 23/07/15.
 */
public class ConcretePrototypeOne implements Prototype {
    @Override
    public ConcretePrototypeOne clone() {

        ConcretePrototypeOne copyObject = null;

        try{
            copyObject = (ConcretePrototypeOne)super.clone();
        }catch(CloneNotSupportedException ex){
            ex.printStackTrace();
        }

        return copyObject;
    }

    @Override
    public String toString() {
        return "Concrete Prototype One";
    }
}
