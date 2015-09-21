package proxy.examples.atm;

/**
 * Created by luisburgos on 21/09/15.
 */
public class ATMProxy implements GetATMData {

    private GetATMData atmMachine;

    public ATMProxy(GetATMData atmMachine){
        this.atmMachine = atmMachine;
    }

    @Override
    public int getCashInMachine() {
        return atmMachine.getCashInMachine();
    }
}
