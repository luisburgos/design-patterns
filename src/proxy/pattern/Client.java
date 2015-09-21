package proxy.pattern;

/**
 * Created by luisburgos on 20/09/15.
 */
public class Client {

    public static void main(String[] args) {

        Subject proxyToRealSubject = new Proxy(new RealSubject());
        proxyToRealSubject.doService();

    }

}
