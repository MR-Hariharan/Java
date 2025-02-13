import java.util.*;
import java.util.InputMismatchException;
import java.util.Scanner;
public class javaprogram2 {
public static void main(String[] args) {
Scanner scan =  new Scanner(System.in);
System.out.println("enter the two strings:");
int a = scan.nextInt();
int b = scan.nextInt();
int temp;
temp=a;
a=b;
b=temp;
System.out.println("int:"+a); 
System.out.println("int:"+b); 
scan.close();
}
}

