import java.util.*;
public class emptyarr{
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
int [] n1= new int[n.length];
int a=n.length-1;
int d=0;
for(int i=0;i<a;i++){
if(n[i]!=0){
n1[d]=n[i];
d++;
}
}
System.out.println(Arrays.toString(n1));
}
}