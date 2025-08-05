public class pyramid{
public static void main (String[]args){
int n =5;
int count=6;
for(int i=0;i<=n;i++){
count--;
for(int j=0;j<=i;j++){
System.out.print("  "); 
}
for(int j=i;j<n;j++){
System.out.print(" "+count+"  ");
}
System.out.println();
}
}
}
