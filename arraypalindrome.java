import java.util.*;
public class arraypalindrome {
    public static void main (String args[]){
    Scanner sc =new Scanner(System.in);
    int n =sc.nextInt();
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
    
    }
}
