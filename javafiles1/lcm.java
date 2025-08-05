import java.util.*;
public class lcm {
public static void main (String []args){
Scanner sc = new Scanner(System.in);
System.out.print("enter the number:");
int a = sc.nextInt();
System.out.print("enter the number:");
int b = sc.nextInt();
int lcm = 0;
int ans = (a>b)?a:b;
for(int i=ans;i<=a*b;i++){
if(i%a==0 && i%b==0){
lcm=i;
break;
}
}
System.out.println(lcm);
}
}




