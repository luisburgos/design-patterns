package proxy.examples.atm;

/**
 * Created by luisburgos on 21/09/15.
 */
public class ATMClient {

    public static void main(String[] args) {

        GetATMData realAtmMachine = new ATMMachine(1000);
        GetATMData atmProxy = new ATMProxy(realAtmMachine);

        System.out.println("ATM Machine, cash available: " + atmProxy.getCashInMachine());


    }
}
