import java.util.*;
public class happynum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        isHappy(n);
    }
    static void isHappy(int n) {
        int sum = 0;
        int product = 1;
        while(n>0){
            int digit = n %10;
            product =digit*digit;
            sum +=product;
            n/=10;
        }
        System.out.println(sum);
    }
}
