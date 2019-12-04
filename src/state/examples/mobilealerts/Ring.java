package state.examples.mobilealerts;

public class Ring implements MobileAlertState { 
    @Override
    public void alert(AlertStateContext ctx) { 
         System.out.println("ringing..."); 
    }

}
