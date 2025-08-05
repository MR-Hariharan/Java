/*public class palindrome {
        public boolean isPalindrome(int x) {
           if (x < 0 || (x % 10 == 0 && x != 0)) {
                return false;
            }
            int reversedHalf = 0;
            while (x > reversedHalf) {
                reversedHalf = reversedHalf * 10 + x % 10;
                x /= 10;
            }
            return x == reversedHalf || x == reversedHalf / 10;
        }
        public static void main(String[] args) {
            palindrome S = new palindrome();
            
            int x = 121;
            System.out.println(S.isPalindrome(x));  
            x = -121;
            System.out.println(S.isPalindrome(x));  
             x = 10;
            System.out.println(S.isPalindrome(x));  
        }
    }*/
    import java.util.*;
    import java.lang.System;
    public class palindrome{
        static Boolean ispalindrome(int n){
           int rem=0;
           int rev=0;
           int temp=n;
           while(n>0){
            rem = n%10;
            rev =rev*10+rem;
            n=n/10;
           } 
           if(rev==temp){
            return true;
           }
           return false;
        }    
        static boolean Stringpalindrome(String s){
            s=s.toLowerCase();
           /*  String rev = "";
            for(int i=s.length()-1;i>=0;i--){
                rev = rev + s.charAt(i);
            }*/
            /*StringBuilder sb = new StringBuilder(s);
            sb.reverse();*/
            char arr [] = s.toCharArray();
            StringBuilder sb =new StringBuilder();
            for(int i =s.length()-1;i>=0;i--){
                sb.append(arr[i]);
            }
           return s.equals(sb.toString());
        }
                
        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            //System.out.print("enter the number:");
            //int n = sc.nextInt();
            System.out.println("enter a string:");
            String s = sc.nextLine();
            //System.out.println(ispalindrome(n));
            System.out.println(Stringpalindrome(s));
            }
        }
    

