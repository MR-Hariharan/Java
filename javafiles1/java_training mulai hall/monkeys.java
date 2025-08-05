import java.util.*;
public class monkeys{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the total number of monkeys:");
int a=sc.nextInt();
System.out.print("Enter the eatable bananas:");
int b=sc.nextInt();
System.out.print("Enter the eatable peanuts:");
int c=sc.nextInt();
System.out.print("Enter the total number of bananas:");
int d=sc.nextInt();
System.out.print("Enter the total number of peanuts:");
int e=sc.nextInt();
int x=(d/b);
int y=(e/c);
int x1=(d%b);
int y1=(e%c);
int z=0;
if(x1>0||y1>0){
x1=1;
z=a-(x+y+x1);
System.out.println("number of monkeys left on the tree:"+z);
}
else{
z=a-(x+y);
System.out.println("number of monkeys left on the tree:"+z);
}
}
}
