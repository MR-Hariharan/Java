import java.util.*;
public class transpose2d {
   public static void main (String[] args){
    int[][] num = {{1,6,7},{9,18,15},{21,8,14}};
    int[][] transposed = new int[num.length][num[0].length];
    for(int row = 0; row < num.length; row++){
        for(int col = 0; col < num[0].length; col++){
            transposed[col][row] = num[row][col];
        }
    }
    for(int i = 0; i < transposed.length; i++){
        
    }
    System.out.println(Arrays.deepToString(transposed));
   } 
}
