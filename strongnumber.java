import java.util.*;
public class strongnumber {
public static void main (String args[]){
  Scanner sc =new Scanner(System.in);
  System.out.print("enter the integer:");
  int n =sc.nextInt();
  int OGnum=n;
  int sum=0;
  int digit;
  while(n>0){
    digit=n%10;
    sum += factorial(digit);
    n/=10;      
  }
  System.out.println("sum of given factorial value:"+sum);
  if(sum==OGnum)
  System.out.println(OGnum+" is a strong number");
  else
  System.out.println(OGnum+" is not a strong number");
}
static int factorial(int num){
  int res=1;
  for(int i=1;i<=num;i++){
    res *=i;
  }
  return res;
}
}