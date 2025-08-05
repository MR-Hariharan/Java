/*import java.util.Scanner;
import java.lang.Math;
public class armstrong {
public static void main (String []args){
Scanner sc = new Scanner(System.in);
System.out.println("enter the number:");
int n = sc.nextInt();
int sum =0;
int temp=n;
int temp1=n;
int power=0;
while(temp1>0){
temp1=temp1/10;
power++;
}
while(temp>0){
int rem = temp%10;
sum +=(int)Math.pow(rem,power);
temp=temp/10;
}
if(sum==n){
      System.out.println("armstrong");
        }
        else{
            System.out.println("not a armstrong");
        }
System.out.println(sum);
    }
}*/
import java.util.Scanner;
import java.lang.Math;
public class armstrong {
public static void main (String []args){
Scanner sc = new Scanner(System.in);
System.out.println("enter the number:");
int n = sc.nextInt();
int sum =0;
int temp=n;
int temp1=n;
int power=0;
while(temp1>0){
temp1/=10;
power++;
}
while(temp>0){
int rem=temp%10;
sum+=(int)Math.pow(rem,power);
temp/=10;
}
System.out.println(sum);
}
}
