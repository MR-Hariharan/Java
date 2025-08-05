import java.util.*;
public class neon{
public static void main (String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("enter the number");
int n = sc.nextInt();
int sum=0;
int temp=n;
int mul=temp*temp;
while(mul>0){
int digit=mul%10;
sum+=digit;
mul/=10;
}
System.out.println(sum);
if(sum==n){
System.out.println("neon");
}
else{
System.out.println("not a neon");
}
}
}
