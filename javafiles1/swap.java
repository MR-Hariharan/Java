import java.util.*;
public class swap{
public static void main (String[]args){
Scanner sc = new Scanner(System.in);
System.out.print("enter the number:");
int a = sc.nextInt();
System.out.print("enter the number:");
int b = sc.nextInt();
//a=a+b;
//b=a-b;
//a=a-b;
//b=(a-b)+(a=b);
a=a^b;
b=a^b;
g  a=a^b;
System.out.println(a+","+b);
}
}