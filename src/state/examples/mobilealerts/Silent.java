package state.examples.mobilealerts;

public class Silent implements MobileAlertState { 
    @Override
    public void alert(AlertStateContext ctx) { 
        System.out.println("silent..."); 
    }
}