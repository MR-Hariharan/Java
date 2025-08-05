import java.util.Scanner;
import java.lang.Math;
public class armstrong {
    public static void main (String []args){
         Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        int sum =0;
        int temp=i;
            while(temp>0){
                int digit = temp%10;
                sum +=(int)Math.pow(digit,3);
                temp=n/10;
            }
        }
        if(sum==i){
            System.out.println("armstrong");
        }
        else{
            System.out.println("not a armstrong");
        }
        System.out.println(temp);
    }
}
}
