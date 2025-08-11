package BankManagementSystem;

public abstract class User {
    private String accountHolderName;
    private int accountNumber;
    private double balance;
    static int userCount = 0;
User(String name,double initialDeposit){
    userCount++;
    this.accountHolderName=name;
    this.accountNumber=1000 + (userCount);
    this.balance=initialDeposit;
}
public String getAccountHolderName() {
    return accountHolderName;
}
public void setAccountHolderName(String accountHolderName) {
    this.accountHolderName = accountHolderName;
}
public int getAccountNumber() {
    return accountNumber;
}
public void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;
}
public double getBalance() {
    return balance;
}
public void setBalance(double balance) {
    this.balance = balance;
}
public static int getUserCount() {
    return userCount;
}
public static void setUserCount(int userCount) {
    User.userCount = userCount;
}
public abstract void displayDetails();
}
