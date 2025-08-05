import java.util.*;
public class arr {
    public static void main (String[] args){
        int[] a = {1,2,3,4,5,6};
        int rows = 2;
        int cols = 3;
        int[][] n= new int[rows][cols];
        for(int i = 0; i < a.length; i++){
            int row = i/cols;
            int col = i%cols;
            n[row][col] = a[i];
        }
        //for(int i = 0; i<rows;i++){
        //    for(int j = 0; j<cols;j++){
         //       System.out.print(n[i][j]);
          //  }
        //System.out.println();
        //}
        System.out.println(Arrays.deepToString(n));
    }
    
}
