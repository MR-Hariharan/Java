import java.util.*;
public class prime2{
public static void main (String[]args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the value lesser than next Input :");
int a =sc.nextInt();
System.out.print("Enter the value greater than previous Input:");
int b =sc.nextInt();
while(b>0){
for(int i=a;i<=b;i++){
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
break;
}
}
}
