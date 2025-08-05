import java.util.*;
public class rec {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=5;
        for(int i = 1; i < 2; i++){
            for(int j = 1;j < n;j++){
                System.out.print(" "+j*j);
                count++;
            }
             System.out.println();
        }
    }
}
