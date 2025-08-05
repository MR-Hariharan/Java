import java.util.*;
public class largestdigitnumber{
public static void main (String[]args){
Scanner sc = new Scanner(System.in);
System.out.print("enter the number:");
int n =sc.nextInt();
int largest=0;
int smallest=9;
while(n!=0){
int rem=n%10;
largest=Math.max(rem,largest);
smallest=Math.min(rem,smallest);
n/=10;
}
System.out.println("largest number is "+largest);
System.out.println("smallest number is "+smallest);
}
}

