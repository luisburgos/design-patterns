package prototype.pattern;


/**
 * Created by luisburgos on 23/07/15.
 */
public class Client {

    public static void main(String[] args) {

        PrototypeFactory factory = new PrototypeFactory();

        Prototype object = new ConcretePrototypeOne();
        ConcretePrototypeOne clonedObject = (ConcretePrototypeOne) factory.getClone(object);

        System.out.println(object);
        System.out.println(clonedObject);
        System.out.println("Object: " + System.identityHashCode(System.identityHashCode(object)));
        System.out.println("Cloned Object HashCode: " + System.identityHashCode(System.identityHashCode(clonedObject)));

    }

}
