import java.util.*;
import java.util.Arrays;
public class bubblesort {
public static void bubbleSort(int[] arr) {        
int n = arr.length;
boolean swapped;
for (int i = 0; i < n - 1; i++) {
swapped = false; 
for (int j = 0; j < n - 1 - i; j++) {
if (arr[j] > arr[j + 1]) {
int temp = arr[j];
arr[j] = arr[j + 1];
arr[j + 1] = temp;
swapped = true;
}
}
if (!swapped) {              
break;
}
}
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the number of elements:");
    int s = sc.nextInt();
    int []arr = new int[s];
    System.out.print("enter the elements:");
    for(int i=0;i<s;i++){
        arr[i]=sc.nextInt();
    }
//int[] arr = {64, 34, 25, 12, 22, 11, 90};
System.out.println("Original array: " + Arrays.toString(arr));
bubbleSort(arr);
System.out.println("Sorted array: " + Arrays.toString(arr));
}
}
