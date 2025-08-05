import java.util.*;
public class equilibrium{
public static void main (String[]args){
int n []={};
Scanner sc = new Scanner(System.in);
System.out.print("enter the size of the array:");
int size =sc.nextInt();
n = new int[size];
System.out.print("enter the number:");
for(int i=0;i<size;i++){
n[i]=sc.nextInt();
}
int totalsum=0;
int leftsum=0;
int a=n.length-1;
for(int digit:n)
totalsum+=digit;
for(int i =0;i<a;i++){
int rightsum=totalsum-leftsum-n[i];
if(rightsum==leftsum){
System.out.println(i);
return;
}
leftsum+=n[i];
}
System.out.println("no equilibrium");
}
}