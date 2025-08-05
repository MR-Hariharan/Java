import java.util.*;
public class doctor{
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
if(n[i]<17){
total+=200;
}
else if(n[i]>=17 && n[i]<=40) {
total+=400;
}
else if(n[i]>40 && n[i]<120){
total+=300;
}
}
System.out.println("total income "+total+" INR");
}
}
