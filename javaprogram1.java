
import java.util.*;
import java.util.InputMismatchException;
import java.util.Scanner;
public class javaprogram1 {
public static void main(String[] args) {
Scanner scan =  new Scanner(System.in);
System.out.println("enter the 5 strings:");
String bad = scan.next();
String hari = scan.next();
String vino = scan.next();
String bala = scan.next();
String arjun = scan.next();
System.out.println("enter the 6 integers:");
int a = scan.nextInt();
int b = scan.nextInt();
int c = scan.nextInt();
int d = scan.nextInt();
int e = scan.nextInt();
int f = scan.nextInt();
System.out.println("enter the float and double:");
float g = scan.nextFloat();
double h= scan.nextDouble();
System.out.println("String:"+bad); 
System.out.println("String:"+vino); 
System.out.println("String:"+bala); 
System.out.println("String:"+arjun); 
System.out.println("int:"+a); 
System.out.println("int:"+b); 
System.out.println("int:"+c); 
System.out.println("int:"+d); 
System.out.println("int:"+e); 
System.out.println("int:"+f); 
System.out.println("double:"+h); 
System.out.println("float:"+g); 
scan.close();
}
}

