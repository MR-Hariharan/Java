public class arrayofsumingdiagonal {
public static void main (String[]args){
int [][]matrix={{1,2,3},{4,5,6},{7,8,9}};
//int row1sum=0;
int row2sum=0;
int row3sum=0;
for(int i=0;i<matrix.length;i++){
row2sum += matrix[1][i];
row3sum += matrix[i][matrix.length-1-i];
}
System.out.println(row2sum+" "+row3sum);
}
} 