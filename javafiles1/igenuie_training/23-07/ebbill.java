import java.util.*;
public class ebbill{
    static void home(int units){
        int amount = 100;
        if(amount <= units){
            System.out.println("amount = free");
        }
        else if(amount < units && units <= 200){
            units = units*5;
            System.out.println("amount ="+units);
        }
        else if(amount < units && units <=300){
            units = units*10;
            System.out.println("amount="+units);
        }
    }
        static void commercial(int units){
            int amount = 100;
        if(amount <= units){
            amount = amount*10;
            System.out.println("amount ="+amount);
        }
        else if(amount > units && units <= 200){
            amount = amount*20;
            System.out.println("amount ="+amount);
        }
        else if(amount > units && units <=300){
            amount = amount*30;
            System.out.println("amount="+amount);
        }
        
         }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the units:");
        int units = sc.nextInt();
        System.out.println("enter the bill type home - 1 or other - 2:");
        int type = sc.nextInt();
        if(type == 1){
            home(units);
        }
        else if(type == 2){
            commercial(units);
        }   
    }
}
