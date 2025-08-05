import java.util.*;
public class a{
public static void main (String[]args){
Scanner sc = new Scanner(System.in);
System.out.print("enter the integer:");
int n = sc.nextInt();
int temp=n;
int sum=0;
int place=1;
while(n>0){
int digit=n%8;
sum+=digit*place;
place*=10;
n/=8;
}
System.out.println(sum);
}
}

						