import java.util.*;
import java.util.InputMismatchException;
import java.util.Scanner;
public class javaprogram5 {
public static void main(String[] args) {
    System.out.println("enter the integer:");
Scanner scan =  new Scanner(System.in);
int a = scan.nextInt();
int b = scan.nextInt();
b = a-b +(a=b);
System.out.println("int:"+a); 
System.out.println("int:"+b); 
scan.close();
}
}

