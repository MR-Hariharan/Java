public class spiral2d {
     static void spiralarr(int[][] matrix){
        int top =0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        int[][] result = new int[top][];
        while(top <= bottom && left <= right){
            for(int i = left;i <=right; i++){
                System.out.print(matrix[top][i]+",");
            }
            top++;
            for(int i = top; i<= bottom; i++){
                System.out.print(matrix[i][right]+",");
            }
            right--;
            for(int i = right; i >=left; i--){
                System.out.print(matrix[bottom][i]+",");
            }
            bottom--;
            for(int i = bottom; i >= top; i--){
                System.out.print(matrix[i][left]+",");
            }
            left++;
        }
    }
    public static void main (String[] args){
        int[][] matrix = {{1,6,7},{9,18,15},{21,8,14}};
        spiralarr(matrix);
    }
}
