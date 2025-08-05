import java.util.*;
import java.util.InputMismatchException;
import java.util.Scanner;
public class javaprogram7 {
public static void main(String[] args) {
Scanner scan =  new Scanner(System.in);
System.out.println("enter the integer:");
int n = scan.nextInt();
if((n|1)==0) {
System.out.println("even");
}
else {
System.out.println("odd");
}
}
}

 