import java.util.*;
public class movie{
public static void main (String[]args){
Scanner sc = new Scanner(System.in);
System.out.print("enter the no of pizzas:");
int pizza = sc.nextInt();
System.out.print("enter the no of puffs:");
int puffs = sc.nextInt();
System.out.print("enter the no of cool drinks:");
int drinks = sc.nextInt();
int total=0;
total+=pizza*100;
total+=puffs*20;
total+=drinks*10;
System.out.println("Total price="+total);
System.out.println("ENJOY THE SHOW!!!");
}
}
