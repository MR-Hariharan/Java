import java.util.*;
public class arraypalindrome {
    public static void main (String args[]){
        /* 
    int n =808;
    int digit=0;
    int rev=0;
    while(n>0){
        digit=n%10;
        rev=rev*10+digit;
        n=n/10;
    }
    if(rev != n)
        System.out.println("palindrome:yes");
  
else
    System.out.println("palindrome:no");
    */
    String n =("abccba");
    String digit=0;
    String rev=0;
    while(n>0){
        digit=n%10;
        rev=rev*10+digit;
        n=n/10;
    }
    if(rev != n)
        System.out.println("palindrome:yes");
  
else
    System.out.println("palindrome:no");
}
}
