package BankManagementSystem;

public class TransactionUtils {
    static void printSeparator(){
        System.out.println("--------------------------------------------------");
    }
    static boolean isValidAmount(double amount){
        return amount > 0;
    }
}
