import java.util.*;
public class swaparray{
public static void main (String[] args){
Scanner sc = new Scanner(System.in);
int[] arr = new int[4];
for(int i = 0;i < arr.length; i++){
arr[i] = sc.nextInt();
}
swap(arr,1,2);
System.out.println(Arrays.toString(arr));
}
static void swap(int[] arr,int index1, int index2){
int temp = arr[index1];
arr[index1] = arr[index2];
arr[index2] = temp;
}
}














