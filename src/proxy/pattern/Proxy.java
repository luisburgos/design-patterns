package proxy.pattern;

/**
 * Created by luisburgos on 20/09/15.
 */
public class Proxy implements Subject {

    private Subject wrapee;

    public Proxy(Subject wrapee){
        this.wrapee = wrapee;
    }

    @Override
    public void doService() {
        anotherFunctionality();
        if(wrapee == null){
            wrapee = new RealSubject(); //Just for this pattern example
        }
        wrapee.doService();
    }

    private void anotherFunctionality() {
        System.out.println("Doing another functionality from Proxy...");
    }

}
