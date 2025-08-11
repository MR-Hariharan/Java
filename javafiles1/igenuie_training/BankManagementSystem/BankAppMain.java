package BankManagementSystem;
import java.util.*;
public class BankAppMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------------welcome to enga sir bank--------------------");
        while (true) {
            System.out.println("1.Create Account\n2.Deposit\n3.Withdtraw\n4.CheckBalance\n5.Exit");
            System.out.println("enter the choice: ");
            int choice = 0;
            try{
                choice = sc.nextInt();
                sc.nextLine();
            }catch(Exception e){
                System.out.println("Invlaid input.please enter a number:");
                sc.nextLine();
                TransactionUtils.printSeparator();
                System.out.println("Transaction completed.");
                continue;
            }
            try{if(choice == 1){
            if(User.userCount >=5){
                System.out.println("maximum limit reached");
                }
                System.out.println("enter the accountholdername:");
                String name = sc.nextLine();
                System.out.println("enter the initial deposit:");
                double deposit = sc.nextDouble();
                sc.nextLine();
                System.out.println("enter the acc type (regular -1 ,premium - 2)");
                int type = sc.nextInt();
                sc.nextLine();
                User user =null;
                if(type == 1){
                    user = new RegularAccount("", deposit);
                }else if(type == 2){ 
                    user = new PremiumAccount("", deposit);
                }
                else{
                    System.out.println("Invalid account type.");
                }
                if(user !=  null){
                BankManager.adduser(user);
                System.out.println("account number:"+user.getAccountNumber());
            }
        }
            else if(choice == 2){
                System.out.println("enter the account number:");
                int accno = sc.nextInt();
                User user = BankManager.getaccountno(accno);
                if(user != null){
                    System.out.println("entet the amount to deposit:");
                    double amt = sc.nextDouble();
                    ((BankInterface) user).deposit(amt);
                }
                else{
                    System.out.println("account not found");
                }
            }
            else if(choice==3){
                System.out.println("enter account number:");
                int accno = sc.nextInt();
                User user = BankManager.getaccountno(accno);
                if(user != null){
                    System.out.println("enter amount to withdraw:");
                    double amt = sc.nextDouble();
                    ((BankInterface) user).withdraw(amt);
                }
                else{
                    System.out.println("account not found");
                }
            }
                 else if (choice == 4) {
                    System.out.print("Enter Account Number: ");
                    int accno = sc.nextInt();
                    User user = BankManager.getaccountno(accno);

                    if (user != null) {
                        user.displayDetails();
                    } else {
                        System.out.println("Account not found.");
                    }

                } else if (choice == 5) {
                    System.out.println("Thank you for banking with us!");
                    break;

                } else {
                    System.out.println("Invalid choice.");
                }
            }
             catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                TransactionUtils.printSeparator();
                System.out.println("Transaction completed.");
            }
        }

        sc.close();
            }

        }
    
    
    
