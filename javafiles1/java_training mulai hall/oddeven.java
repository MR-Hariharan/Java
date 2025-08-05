/*import java.util.*;
public class oddeven{
public static void main (String[]args){
Scanner sc = new Scanner(System.in);
System.out.print("enter the number:");
int n = sc.nextInt();
if(n%2==0){
System.out.println("even");
}
else if(n%1==0){
System.out.println("odd");
}
}
}*/
import java.util.*;
public class oddeven{
public static void main (String[]args){
Scanner sc = new Scanner(System.in);
System.out.print("enter the number:");
int n = sc.nextInt();
if((n<<1)==0)
{
System.out.print("even");
}
else{
System.out.print("odd");
}
}
}

