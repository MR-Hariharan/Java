import java.util.Arrays;

public class test2 {
    public static void main (String[] args){
        int[] n = {1,2,3,4};
        for(int i = 1; i < n.length; i++){
            n[i] = n[i-1] + n[i];
        }
       for(int num : n){
        System.out.println(num);
       }
       System.out.println(Arrays.toString(n));
    }
}
