import java.util.*;
class prime{
    static boolean number(int n){ 
        if(n<=1)
        return false;
        for (int i=2;i<n;i++){
            if(n%i==0)
            return false;
        }
            return true;
    }
    static boolean circular(int N){
        int count = 0, temp = N;
        while (temp>0) {
            count++;
            temp /= 10;
        }
        int num = N;
        while (number(num)) {
        int rem = num % 10;
        int div = num / 10;
        num = (int)((Math.pow(10, count - 1)) * rem)
                                             + div;
        if (num == N)
            return true;
        }
 
        return false;
        }
    }
public class circularprimenumber {
    public static void main(String[]args){
        //Scanner sc=new Scanner(System.in);
        //System.out.print("enter the integer:");
        //int N=sc.nextInt();
       // prime s=new prime();
       int N=1193;
        if(circular(N))
        System.out.println("yes");
        else
        System.out.println("no");
}
}
