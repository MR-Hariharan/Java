import java.util.*;
public class factorial1{
public static void main (String[]args){
Scanner sc = new Scanner(System.in);
System.out.print("enter the number:");
int n = sc.nextInt();
int fact=1;
for(int i=1;i<=n;i++){
fact=mul(fact,i);
}
System.out.println(fact);
System.out.println("output vanthurichi");
}
static int mul(int a,int b){
int result=0;
for(int i=0;i<b;i++){
result+=a;
}
return result;
}
}
