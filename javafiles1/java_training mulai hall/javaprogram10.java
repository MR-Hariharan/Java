import java.util.*;
public class javaprogram10 {
public static void main(String[] args) {
int n = 123456789;
int sum = 0;
int digit;
while(n >0){
digit = n%10;
if( digit%2!=0){
sum =digit+sum;
}
n = n/10;
}
System.out.println("number:"+sum);
}
}
