import java.util.*;
public class matrix {
    public static void main (String[]args){
        int [][]a={{1,2,3,4,},{1,2,3,4}};
        int [][]b={{1,2,3,4,},{1,2,3,4}};
        int row=a.length;
        int col=a[0].length;
        for(int[] r:a){
            System.out.println(Arrays.toString(r));
        }
    
    }
}
