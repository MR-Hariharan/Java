import java.util.*;
public class test1 {
    public static void main (String[] args){
       
        int[] a = {1,3,0,14,0,8,0};
        int left =0;
        int right = a.length-1;
        for(int i = 0; i < a.length; i++){
            if(a[i] != 0){
                a[left] = a[i];
                left++;
            }
        }
        while(left < a.length){
            a[left] = 0;
            left++;
        }
        System.out.println(Arrays.toString(a));
    }
}
