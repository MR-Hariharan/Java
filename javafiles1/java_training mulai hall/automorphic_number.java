 import java.util.*;
 class automorphic {
    public boolean number(int a){
        int sq=a*a;
        while(a>0){
            if(a%10!=sq%10)
             return false;
             a/=10;
             sq/=10;
    }
    return true;
}
 }
public class  automorphic_number{
    public static void main (String[]args){
        automorphic s=new automorphic();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the integer:");
        int a=sc.nextInt();
        if(s.number(a))
        System.out.println(a+" is automorphic number");
        else
        System.out.println(a+" is not a automorphic");
        //System.out.print(s.number(a));
    }
}
