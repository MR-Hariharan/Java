import java.util.*;
    public class SimpleSubset {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        printSubsets(arr, 0, "");
    }

    static void printSubsets(int[] arr, int index, String subset) {
        if (index == arr.length) {
            System.out.println("[" + subset.trim() + "]");
            return;
        }
        printSubsets(arr, index + 1, subset + arr[index] + " ");
        printSubsets(arr, index + 1, subset);
    }
}

