import java.util.*;
public class harshad{
public static void main (String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("enter the number:");
int n = sc.nextInt();
int temp=n;
int sum=0;
while(temp>0){
int digit=temp%10;
sum+=digit;
temp=temp/10;
}
if(n%sum==0){
System.out.println("harshad");
}
else{
System.out.println("not a harshad");
}
System.out.println(sum);
}
}

