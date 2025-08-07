package BankManagementSystem;

public class PremiumAccount extends RegularAccount {
    public PremiumAccount(String name,double initialDeposit){
        super(name, initialDeposit);
    }
    public void withdraw(double amount) throws Exception{
        if(amount > getBalance()){
            throw new Exception("insufficient balance");
        }
        setBalance(getBalance() - amount);
        if(getBalance() < MIN_BALANCE){
            System.out.println("warning:minimum balance required");
        }
        System.out.println("withdrawal sucessfully:balance="+getBalance());
    }
    public void getBonus(){
        System.out.println("Bonus features available in premium account");
    }
    
}
