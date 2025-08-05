import java.util.*;
public class term{
public static void main (String[]args){
int n []={};
Scanner sc =new Scanner(System.in);
System.out.print("enter the size of the array:");
int size=sc.nextInt();
n=new int[size];
System.out.print("enter the array:");
for(int i=0;i<size;i++){
n[i]=sc.nextInt();
}
int total=0;
for(int i=0;i<n.length;i++){
if(n[i+1]%6==0){
i++;
}
if(n[i-1]%7==0){
i++;
}
}
System.out.println(Arrays.toString(n));
}
}
