import java.lang.*;
import java.util.*;
public class hexaadd{
public static void main (String[]args){
Scanner sc =new Scanner(System.in);
System.out.print("enter the string:");
String a1 = sc.nextLine();
System.out.print("enter the string:");
String a2 = sc.nextLine();
int n1=Integer.parseInt(a1,16);
int n2=Integer.parseInt(a2,16);
int sum = n1+n2;
String hexsum=Integer.toHexString(sum).toUpperCase();
System.out.println(hexsum);
}
}
