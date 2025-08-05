public class urlr{
public static void main (String[]args){
int n =5;
int count=7;
for(int i=0;i<=n;i++){
count--;
for(int j=0;j<=i;j++){
System.out.print(" "+count);
}
System.out.println();
}
for(int i=0;i<=n;i++){
count++;
for(int j=i;j<n;j++){
System.out.print(" "+count);
}
System.out.println();
}
}
}