import java.util.*;
public class charcount{
public static void main (String[]args){
Scanner sc = new Scanner(System.in);
System.out.print("enter the String:");
String a= sc.nextLine();
System.out.print("enter the String:");
String b= sc.nextLine();
int count=0;
char c[] =a.toCharArray();
char d[] =b.toCharArray();
for(char a1:c){
for(char b1:d){
if(a1==b1){
count++;
}
}
}
System.out.println(count);
}
}

