import java.util.*;
public class fibo{
public static void main (String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("enter the number:");
int n = sc.nextInt();
int sum=0,num1=0,num2=1;
for(int i=0;i<=n;i++){
int num3=num1+num2;
System.out.println(num1);
num1=num2;
num2=num3;
}
}
}
 