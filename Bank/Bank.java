public class Bank{

    Check theCheck = new Check();
    ChekingAccount account = new ChekingAccount();

    public void init(){
        double amount = theCheck.getAmount();
        double balance = account.getBalance();

        int checkNumber = theCheck.getNumber();

        if (balance >= amount){
            account.addDebitTransaction(0,amount);
            account.storePhotoOfCheck(theCheck);
        } else {
            account.addInsuffientFundFree();
            account.noteReturnedCheck(theCheck);
            this.returnCheck(theCheck);
        }
    }

    public void returnCheck(Check theCheck){

    }

    public static void main(String[] args) {
        Bank bank = Bank();
        bank.init();
    }

}