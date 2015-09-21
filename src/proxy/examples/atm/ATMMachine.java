package proxy.examples.atm;

/**
 * Created by luisburgos on 21/09/15.
 */
public class ATMMachine implements GetATMData {

    private int cashInMachine;

    public ATMMachine(int cashInMachine){
        this.cashInMachine = cashInMachine;
    }
    @Override
    public int getCashInMachine() {
        return cashInMachine;
    }
}
