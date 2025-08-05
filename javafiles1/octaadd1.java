import java.util.*;
public class octaadd1{
static String octaadd(String a,String b){
StringBuilder result=new StringBuilder();
int i=a.length()-1;
int j=b.length()-1;
int carry=0;
while(i>=0||j>=0||carry>0){
int sum=carry;
if(i>=0){
sum+=(a.charAt(i)-'0');
i--;
}
if(j>=0){
sum+=(b.charAt(j)-'0');
j--;
	 
}
result.append(sum%8);
carry=sum/8;
} 
return result.reverse().toString();
}
public static void main (String[]args){
Scanner sc =new Scanner(System.in);
System.out.print("enter the string:");
String a = sc.nextLine();
System.out.print("enter the string:");
String b = sc.nextLine();
sc.close();
String word="whatha ithan da output uh";
String binary=octaadd(a,b);
System.out.println(binary);
-System.out.println(word);
}
}
