import java.util.*;
public class prime1{
public static void main (String[]args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the value lesser than next Input :");
int a =sc.nextInt();
System.out.print("Enter the value greater than previous Input:");
int b =sc.nextInt();
while(b>0){
if(a<b){
for(int j=a;j<=b;j++){
int count=0;
for(int i=2;i<=j/2;i++){
if(j%i==0){
count=1;
break;
}
}
if(count==0){
System.out.println(j);
}
}
break;
}
else{
System.out.println("provide valid input");
}
break;
}
}
}
