import java.util.*;
public class dept{
public static void main (String[]args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the no of students placed in CSE:");
int a =sc.nextInt();
System.out.print("Enter the no of students placed in ECE:");
int b =sc.nextInt();
System.out.print("Enter the no of students placed in MECH:");
int c =sc.nextInt();
if(a<0||b<0||c<0){
System.out.println("input is invalid");
}
else{
int max=Math.max(a,Math.max(b,c));
System.out.println("highest placement");
if(a==b && b==c){
System.out.println("none of the dept has got highest placement");
}
if(a==max){
System.out.println("CSE");
}
if(b==max){
System.out.println("ECE");
}
if(c==max){
System.out.println("MECH");
}
}
}
}

