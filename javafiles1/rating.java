import java.util.*;
public class rating{
public static void main (String[]args){
Scanner sc = new Scanner(System.in);
System.out.print("enter the salary:");
double a = sc.nextDouble();
System.out.print("enter the performance appraisal rating:");
double b =sc.nextDouble();
if(a>0 || b>5){
System.out.println("invalid input");
}
else{
if(b>=1 && b<=3){
a=a*(1+0.10);
System.out.println(Math.round(a));
}
else if(b>=3 && b<=4){
a=a*(1+0.25);
System.out.println(Math.round(a));
}
else if(b>=4 && b<=5){
a=a*(1+0.30);
System.out.println(Math.round(a));
}
}
}
}

