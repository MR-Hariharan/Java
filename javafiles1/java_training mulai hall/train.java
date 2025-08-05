import java.util.*;
public class train{
public static void main (String [] args){
Scanner sc = new Scanner(System.in);
System.out.print("enter the number:");
int n =sc.nextInt();
int sum=0;
while(n>0){
int digit=n%10;
int fact=1;
for(int i=1;i<=digit;i++){
fact*=i;
}
sum+=fact;
n/=10;
}
System.out.println(sum);
}
}
