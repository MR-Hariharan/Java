import java.util.Scanner;

public class factorial {
    public static void main (String []args){
         Scanner sc=new Scanner(System.in);
        System.out.print("enter the integer:");
        int n=sc.nextInt();
        int res=1;
        for(int i=2;i<=n;i++){
            res *=i;
        }
        sc.close();
        System.out.println("factorial of "+n+" is "+res);
    }
}
