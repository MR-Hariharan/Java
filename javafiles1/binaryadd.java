/*import java.util.*;
public class binaryadd{
public static void main (String[]args){
Scanner sc =new Scanner(System.in);
System.out.print("enter the string:");
String bin1 = sc.nextLine();
System.out.print("enter the string:");
String bin2 = sc.nextLine();
int n1=Integer.parseInt(bin1,2);
int n2=Integer.parseInt(bin2,2);
int sum = n1+n2;
String binsum=Integer.toBinaryString(sum);
System.out.println(binsum);
}
}*/
import java.util.*;
public class binaryadd{
static String binadd(String a,String b){
StringBuilder result=new StringBuilder();
int i=a.length()-1;
int j=b.length()-1;
int carry=0;
while(i>=0||j>=0||carry>0){
int sum=carry;
if(i>=0){
sum+=(a.charAt(i)-'0');
i--;
}
if(j>=0){
sum+=(b.charAt(j)-'0');
j--;
}
result.append(sum%2);
carry=sum/2;
}
return result.reverse().toString();
}
public static void main (String[]args){
Scanner sc =new Scanner(System.in);
System.out.print("enter the string:");
String a = sc.nextLine();
System.out.print("enter the string:");
String b = sc.nextLine();
sc.close();
String binary=binadd(a,b);
System.out.println(binary);
}
}
