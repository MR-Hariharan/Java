import java.util.*;
public class gcd {
static int hcf(int a,int b){
return (b!=0) ? hcf(b,a%b):a;
}
static int lcm(int a,int b){
return a*b/hcf(a,b);
}
public static void main (String []args){
Scanner sc = new Scanner(System.in);
System.out.print("enter the number:");
int a = sc.nextInt();
System.out.print("enter the number:");
int b = sc.nextInt();
System.out.println(lcm(a,b));
System.out.println(hcf(a,b));
}}





