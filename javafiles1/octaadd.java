import java.lang.*;
import java.util.*;
public class octaadd{
public static void main (String[]args){
Scanner sc =new Scanner(System.in);
System.out.print("enter the string:");
String a1 = sc.nextLine();
System.out.print("enter the string:");
String a2 = sc.nextLine();
int n1=Integer.parseInt(a1,8);
int n2=Integer.parseInt(a2,8);
int sum = n1+n2;
String octasum=Integer.toOctalString(sum);
System.out.println(octasum);
}
}

