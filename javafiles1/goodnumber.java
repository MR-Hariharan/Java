import java.util.*;
public class goodnumber{
public static void main (String[]args){
Scanner sc = new Scanner(System.in);
System.out.print("enter the number:");
int n = sc.nextInt();
int sum=0;
int temp=n;
while(n>0){
int digit=n%10;
sum+=digit;
n/=10;
}
if(temp%sum==0){
System.out.println("Goodnumber");
}

else{
System.out.println("badnumber");
}
System.out.println(sum);
}}
