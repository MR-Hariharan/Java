import java.util.*;
public class octa{
public static void main (String[]args){
Scanner sc = new Scanner(System.in);
System.out.print("enter the number:");
int n =sc.nextInt();
int sum=0;
int temp=n;
int place=1;
while(temp!=0){
sum+=(temp%8*place);
place*=10;
temp/=8;
}
System.out.println(sum);
}
}