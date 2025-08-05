import java.util.*;

public class test3 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        int[] digits = new int[n];
        for(int i = 0; i < n; i++){
            digits[i] = sc.nextInt();
        }
       int value = 0;
        for(int i = 0; i < digits.length; i++){
            value = value*10+digits[i];
        }
        value = value+1;
        char[] num= Integer.toString(value).toCharArray();
        System.out.println(Arrays.toString(num));
        }
}
