/*import java.util.*;
public class printprime{
static void isprime(int n){
int count;
for(int i=2;i<=n;i++){
Boolean flag=true;
for(int j=2;j<=i/2;j++){
if(i%j==0){
flag=false;
break;
}
}
if(flag){
System.out.println(i);
}
}
}
public static void main (String[]args){
Scanner sc = new Scanner(System.in);
System.out.print("enter the number:");
int n =sc.nextInt();
isprime(n);
sc.close();
}
}*/
public class printprime{
public static void main (String[]args){
int n =50;
for(int i=2;i<=n;i++){
int count=0;
for(int j=2;j<=i/2;j++){
if(i%j==0){
count=1;
break;
}
}
if(count==0){
System.out.println(i);
}
}
}
}
