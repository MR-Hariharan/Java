public class recursion {
    public static void main(String[] args) {
        int n = 5;
        printnum(1,n);
        System.out.println();
        String s = "dad";
        palindrome(s,0,s.length()-1);
        System.out.println(palindrome(s, 0, 0));
        int num = 1023408010;
        System.out.println(countzero(num));

    }
    public static void printnum(int cu,int n){
        if(cu>n)
        return;
         System.out.println(cu+" ");
        printnum(cu+1,n);
       
    }
    public static boolean palindrome(String s,int start, int end){
         if(s.charAt(start)!=s.charAt(end))
            return false;
         
         if(start>=end)
         return true;
    return false;
    }
    public static int countzero(int num){
        int count =0;
        while(num>0){
            int digit = num%10;
            int value = digit;
            if(value==0)
            count++;
            num=num/10;
        }
        return count;
    }
}
