import java.util.*;
public class checkpalindrome {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        return s.equals(rev);
    }
      public static boolean isPalindromeUsingString(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);  
    }
    public static boolean isPalindromeUsingStringBuffer(String str2) {
        StringBuffer sb = new StringBuffer(str2);
        sb.reverse();
        return str2.equals(sb.toString());
    }
    public static boolean isPalindromeWithoutBuiltInMethods(String str3) {
        int left = 0;
        int right = str3.length() - 1;
        while (left < right) {
            if (str3.charAt(left) != str3.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
            return true;
        }
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the desire String-1:");
        String s =sc.nextLine();
        System.out.print("Enter the desire String-2:");
        String str =sc.nextLine();
        System.out.print("Enter the desire String-3:");
        String str2 =sc.nextLine();
        System.out.print("Enter the desire String-4:");
        String str3 =sc.nextLine();
        boolean res = isPalindrome(s);
        boolean reversed = isPalindromeUsingString(str);
        boolean sb = isPalindromeUsingStringBuffer(str2);
        sc.close();
        if (res) {
            System.out.println( s + " is a palindrome.");
        }
        else{
            System.out.println( s + " is not a palindrome.");
        }
        if (reversed){
            System.out.println(str +" is a palindrome.");
        }
        else{
            System.out.println(str + " is not a palindrome.");
        }
        if(sb){
            System.out.println(str2 +" is a palindrome.");
        }
         else {
            System.out.println(str2 + " is not a palindrome.");
        }
     if (isPalindromeWithoutBuiltInMethods(str3)) {
        System.out.println(str3 +" is a palindrome.");
    } else {
        System.out.println(str3 +" is not a palindrome.");
    }
}
}



