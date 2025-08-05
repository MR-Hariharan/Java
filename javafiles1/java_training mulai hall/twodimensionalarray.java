import java.util.*;
public class twodimensionalarray{
public static void main (String [] args){
Scanner sc =  new Scanner(System.in);
/*int[][] arr = {{1,2,3},{4,5},{6,7,8,9}};
System.out.println(Arrays.deepToString(arr[1]));
int[][] a = new int[3][3];
for(int row = 0; row < a.length; row++){
for(int col = 0; col < a[row].length; col++){
a[row][col] = sc.nextInt();
} 
}
for(int row = 0; row < a.length; row++){
for(int col = 0; col < a[row].length; col++){
System.out.print(a[row][col]+" ");
}
System.out.println();
}

///using the collection to print

for(int row = 0; row < a.length; row++){
System.out.println(Arrays.toString(a[row]));
}

//enhanced for loop
 
for(int[] ar : a){
System.out.println(Arrays.toString(ar));
}*/
int[][] arr = {{1,2,3,4},{1,1},{5,6,7}}; 
for(int i = 0; i < arr.length; i++){
for(int j =0; j < arr[i].length; j++){
System.out.print(arr[i][j]+" ");
}
System.out.println();
}  






}
}