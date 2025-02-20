import java.util.*;
import java.util.InputMismatchException;
import java.util.Scanner;
public class javaprogram3 {
public static void main(String[] args) {
    System.out.print("enter the integer:");
Scanner scan =  new Scanner(System.in);
int a = scan.nextInt();
int b = scan.nextInt();
 a=a+b;
b=a-b;
a=a-b;
System.out.println("int:"+a); 
System.out.println("int:"+b); 
scan.close();
}
}

