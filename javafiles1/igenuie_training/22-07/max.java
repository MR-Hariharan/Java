import java.util.*;
public class max {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        /*int[] a = {99,99,120,120};
        int max =0;
        for(int i = 1;i < a.length;i++ ){
           if( a[0] < a[i] ){
            max = a[i];
           } }
           System.out.println(max);
           */
          System.out.println("enter four number: ");
          int a = sc.nextInt();
          int b = sc.nextInt();
          int c = sc.nextInt();
          int d = sc.nextInt();
          int max = a;
          if(max > b){
            System.out.println("a is greatest");
          }
            if(b > c){
                System.out.println("b is greatest");
            }
                if(c > d){
                    System.out.println(" c is greatest");
                }
                if( d > max){
                        System.out.println("d is greatest");
                    }
                    else if(a == b && b == c && c == d){
                        System.out.println("all are equal");
                    }
                }
}
