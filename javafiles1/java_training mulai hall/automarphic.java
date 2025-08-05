import java.util.*;
public class automarphic{
static Boolean isnum(int n){
int temp = n;
int sqrt=temp*temp;
Boolean flag=true;
System.out.println(sqrt);
while(n>0){
if(n%10!=sqrt%10){
flag=false;
break;
}
n/=10;
sqrt/=10;
}
return flag;
}
public static void main (String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the number:");
    int n =sc.nextInt();
    System.out.println(isnum(n)?"automorphic":"not a automorphic");
}
}