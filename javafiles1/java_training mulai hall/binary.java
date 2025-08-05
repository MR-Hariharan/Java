/*import java.util.*;
public class binary{
public static void main (String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("enter the number:");
int n = sc.nextInt();
int temp=n;
StringBuilder bin =new StringBuilder();
while(temp>0){
bin.append(temp%2);
temp/=2;
}
System.out.println(bin.reverse().toString());
System.out.println("Is the binary value is right or wrong");
}
}
*/
import java.util.*;
public class binary{
public static void main (String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("enter the number:");
int n = sc.nextInt();
int temp=n;
int sum=0;
int place=1;
while(temp!=0){
int rem = temp%2;
sum+=rem*place;
place*=10;
temp/=2;
}
System.out.println(sum);
}
}

