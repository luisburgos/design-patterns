package facade.examples.bank;

/**
 * Created by luisburgos on 12/08/15.
 */
public class BankFacade {

    private int accountNumber;
    private int securityCode;

    private AccountNumberCheck accountChecker;
    private SecurityCodeCheck codeChecker;
    private FundsCheck fundsChecker;

    private WelcomeMessage bankWelcome;

    public BankFacade(int accountNumber, int securityCode){

        this.accountNumber = accountNumber;
        this.securityCode  = securityCode;

        bankWelcome    = new WelcomeMessage();
        accountChecker = new AccountNumberCheck();
        codeChecker    = new SecurityCodeCheck();
        fundsChecker   = new FundsCheck();

    }

    private int getAccountNumber() { return accountNumber; }

    private int getSecurityCode() { return securityCode; }

    public void withdrawCash(double cashAmount){

        if(canWithdraw(cashAmount)) {
            System.out.println("Transaction Complete\n");
        } else {
            System.out.println("Transaction Failed\n");
        }

    }


    public void depositCash(double cashAmount){
        if(canDeposit(cashAmount)) {
            fundsChecker.makeDeposit(cashAmount);
            System.out.println("Transaction Complete\n");
        } else {
            System.out.println("Transaction Failed\n");
        }
    }

    private boolean canWithdraw(double cashAmount){
        return accountChecker.isAccountActive(getAccountNumber()) &&
                codeChecker.isCodeCorrect(getSecurityCode()) &&
                fundsChecker.haveEnoughMoney(cashAmount);
    }

    private boolean canDeposit(double cashAmount){
        return accountChecker.isAccountActive(getAccountNumber()) &&
                codeChecker.isCodeCorrect(getSecurityCode());
    }

}
