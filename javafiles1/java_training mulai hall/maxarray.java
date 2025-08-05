import java.util.*;
public class maxarray{
public static void main (String[] args){
Scanner sc = new Scanner(System.in);
int[] arr = new int[5];
for(int i = 0; i < arr.length; i++){
arr[i] = sc.nextInt();
}
System.out.println("The maximum value is "+max(arr));
}
static int max(int[] arr){
int maxval = arr[0];
for(int i = 1; i < arr.length; i++){
if(arr[i] > maxval){
maxval = arr[i];
}
}
return maxval;
}
}
