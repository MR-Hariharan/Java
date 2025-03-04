import java.util.*;
public class arrayintreverse {
    public static void main (String args[]){
        System.out.println("  ");
                System.out.println(add(24,1));
    }
    static int add(int x,int y){
        int reversesum =rev(x) + rev(y);
        //System.out.println(r);
        return rev(reversesum);
    }
    static int rev(int value){
        int sum=0;
        while(value>0){
            int digit=value%10;
            sum = sum*10+digit;
            value=value/10;
        }
        return sum;
    }
}     
