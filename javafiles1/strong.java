import java.util.*;
public class strong{
public static void main (String[]args){
Scanner sc = new Scanner(System.in);
System.out.print("enter the number:");
int n = sc.nextInt();
int sum=0;
int temp=n;
while(temp>0){
int digit=temp%10;
int fact=1;
for(int i=1;i<=digit;i++){
fact*=i;
}
sum+=fact;
temp=temp/10;
}
if(sum==n){
System.out.println("strong");
}
else{
System.out.println("not a strong");
}
System.out.println(sum);
}
}


