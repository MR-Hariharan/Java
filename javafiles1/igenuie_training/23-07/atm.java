import java.util.*;
public class atm {
    private static int balance = 100000;
    private static Scanner sc = new Scanner(System.in);
    public static void main (String[] args){
        System.out.println("WELCOME TO THE ATM");
        while(true){
            displaymenu();
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                checkbalance();
                break;
                case 2:
                withdraw();
                break;
                case 3:
                deposit();
                break;
                case 4:
                pinchange();
                break;
                case 5:
                System.out.println("thankyou for visiting the atm");
                return;
                default:
                System.out.println("invalid choice.please try again");
            }
            System.out.println();
            }
        }
    
    private static void displaymenu(){
        System.out.println("CHECK BALANCE:");
        System.out.println("WITHDRAW CASH:");
        System.out.println("DEPOSIT CASH:");
        System.out.println("pinchange:");
        System.out.println("EXIT");
        System.out.print("ENTER YOUR CHOICE:");
    }
    private static void checkbalance(){
        System.out.println("your current balancr:"+balance);
    }
    private static void withdraw(){
        System.out.println("enter the amount to be withdraw:");
        int amount = sc.nextInt();
        if(amount <= 0){
            System.out.println("Amount should be in positive");
        }
        else if(amount > balance){
            System.out.println("You don't ahve sufficient balance");
        }
        else{
            balance = amount - balance;
            System.out.println("Collect the cash");
            System.out.println("Your remaining balance:"+balance);
        }

    }
    private static void deposit(){
        System.out.println("enter the amount to deposit:");
        int amount = sc.nextInt();
        if(amount <= 0){
            System.out.println("deposit amount should be positive");
        }
        else{
            balance = amount+balance;
            System.out.println("deposit successfull");
        }
    }
    private static void pinchange(){

    }

}
