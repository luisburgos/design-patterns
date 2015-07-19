package singleton.pattern;

/**
 * Created by luisburgos on 19/07/15.
 */
public class Test {

    public static void main(String[] args) {

        Singleton singletonOne = Singleton.getInstance();
        Singleton singletonTwo = Singleton.getInstance();

        if(singletonOne == singletonTwo){
            System.out.println("Objects are the same instance");
            System.out.println("    Singleton one hash code: " + System.identityHashCode(singletonOne));
            System.out.println("    Singleton two hash code: " + System.identityHashCode(singletonTwo));
        }
    }

}
