import java.util.*;
public class triangle{
public static void main (String[]args){
Scanner sc = new Scanner(System.in);
int a=sc.nextInt();
for(int i=0;i<a;i++){
for(int j=i;j<a ;j++){
System.out.print(" ");
}
for(int k=0;k<i;k++){
System.out.print("9 ");
}
System.out.println();
}
for(int i=0;i<a;i++){
for(int j=0;j<i ;j++){
System.out.print(" ");
}
for(int k=i;k<a;k++){
System.out.print("8 ");
}
System.out.println();
}
}


}