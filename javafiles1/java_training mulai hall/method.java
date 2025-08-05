import java.util.*;
public class method {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int c = sc.nextInt();
        int ans = sum(b,c);
        System.out.print(ans);
    }
    static int sum(int a,int b){
        int Sum = a + b;
        return Sum;
    }
}
