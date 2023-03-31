public class Costumer{
    public void init(ATM taller, int accountNumber, double amount){
        taller.withdrawCash(accountNumber, amount);
    }
}