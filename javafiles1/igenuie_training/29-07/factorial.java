import java.util.*;
public class factorial {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int op = fact(num);  
    System.out.println(op);  
    int op1 = recursion(num);
    System.out.println(op1);
    }
    public static int fact(int n){
        int fact =1;
        for(int i = 2; i<=n; i++){
            fact*=i;
        }
        return fact;
    }
    public static int recursion(int n){
        if(n<=1){
            return 1;
        }
        return n*recursion(n-1);
    }
}
