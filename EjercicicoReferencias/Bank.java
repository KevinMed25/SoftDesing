public class Bank{

    AccountLedger ledger = new AccountLedger();

    public int getBalance(int accountNumber){
        ChekingAccount account = ledger.retrieveAccount(accountNumber);
        return 0;
    }

    public void debit(int accountNumber, double amount){
        
    }
}