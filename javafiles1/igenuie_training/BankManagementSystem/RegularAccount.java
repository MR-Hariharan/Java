package BankManagementSystem;

public class RegularAccount extends User implements BankInterface{
static final double MIN_BALANCE =1000;
public RegularAccount(String name,double initialDeposit){
    super(name,initialDeposit);
}
public void createAccount(String name,double initialDeposit){
}
public void deposit(double amount){
    setBalance(getBalance() + amount);
    System.out.println("deposited successfully:balance="+getBalance());
}
public void withdraw(double amount) throws Exception{
    if (amount > getBalance()) {
        throw new Exception("insufficient balance");
    }
    setBalance(getBalance() - amount);
    System.out.println("withdrawal successfull:balance="+getBalance());
}
public void displayDetails(){
    System.out.println("accountholder name:"+getAccountHolderName());
    System.out.println("accountnumer"+getAccountNumber());
    System.out.println("balance"+getBalance());
}
}
