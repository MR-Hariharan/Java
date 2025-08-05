import java.util.*;
public class fuel{
public static void main (String[]args){
Scanner sc = new Scanner(System.in);
System.out.print("enter the no of litres to fill the tank:");
double a =sc.nextDouble();
System.out.print("enter the distance covered:");
double b =sc.nextDouble();
if(a<0){
System.out.println(Math.round(a)+" is an invalid input");
}
else if(b<0){
System.out.println(Math.round(b)+" is an invalid input");
}
else{
double n=(a/b)*100;
System.out.println("liters/100KM");
System.out.printf("%,.2f",n);
double miles =b*0.6214;
double gallons=a*0.2642;
double m=miles/gallons;
System.out.println("\nmiles/gallons");
System.out.printf("%,.2f",m);
}
}
}
