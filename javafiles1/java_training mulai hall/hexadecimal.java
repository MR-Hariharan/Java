import java.util.*;
public class hexadecimal{
public static void main (String[]args){
Scanner sc = new Scanner(System.in);
System.out.print("enter the number:");
int n =sc.nextInt();
int temp=n;
String hex="";
while(temp>0){
int rem=temp%16;
if(rem<10){
hex=rem+hex;
}
else{
hex=(char)(rem-10+'A')+hex; 
}
temp/=16;
}
System.out.println(hex); 
}
}