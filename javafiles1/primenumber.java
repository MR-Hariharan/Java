import java.util.*;
public class primenumber{
public static void main (String[]args){
Scanner sc = new Scanner(System.in);
System.out.print("enter the number:");
int n = sc.nextInt();
int count =0;
for(int i=2;i<=Math.sqrt(n);i++){
if(n%i==0){
count=1;
}
}
if(count==0){
System.    out.print("prime");
}
else{
System.out.print("not a prime");
}
}
}