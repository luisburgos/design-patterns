package facade.examples.bank;

/**
 * Created by luisburgos on 12/08/15.
 */
public class AccountNumberCheck {

    private int accountNumber = 1234567890;

    public int getAccountNumber() { return accountNumber; }

    public boolean isAccountActive(int accountNumberToCheck){
        if(accountNumberToCheck == getAccountNumber()) {
            return true;
        } else {
            return false;
        }
    }
}
