import java.util.*;
public class subset{
public static void main (String[]args){
int n1 []={};
int n2 []={};
Scanner sc = new Scanner(System.in);
System.out.print("enter the size of the array:");
int size1 =sc.nextInt();
int size2 =sc.nextInt();
n1 = new int[size1];
n2 = new int[size2];
System.out.print("enter the number:");
for(int i=0;i<size1;i++){
n1[i]=sc.nextInt();
}
System.out.print("enter the number:");
for(int i=0;i<size2;i++){
n1[i]=sc.nextInt();
}
boolean result=issubset(n1,n2);
System.out.println(result);
}
public static boolean issubset(int n1[],int n2[]){
Arrays.sort(n1);
Arrays.sort(n2);
int i=0;
int j=0;
while(i<n1.length && j<n2.length){
if(n1[i]==n2[j]){
j++;
}
i++;
}
return false;
}
}
