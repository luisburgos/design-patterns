package adapter.pattern;

/**
 * Created by luisburgos on 11/08/15.
 */
public class Adaptee {

    private String name;

    public Adaptee(String name){
        this.name = name;
    }

    public void specificRequest() {
        System.out.println("Called specific request on Adaptee " + name);
    }
}
