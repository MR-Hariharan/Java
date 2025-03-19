import java.util.Arrays;
public class program01 {
    public int removeElement(int[] nums, int val) {
        int k = 0; 
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; 
                k++; 
            }
        }  
        return k; 
    }
    public static void main(String[] args) {
        program01 solution = new program01();
        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        int k1 = solution.removeElement(nums1, val1);
        System.out.println("Output: " + k1); // Output: 2
        Arrays.sort(nums1, 0, k1);
        System.out.println("Modified array: " + Arrays.toString(Arrays.copyOf(nums1, k1))); 
        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int val2 = 2;
        int k2 = solution.removeElement(nums2, val2);
        System.out.println("Output: " + k2); 
        Arrays.sort(nums2, 0, k2); 
        System.out.println("Modified array: " + Arrays.toString(Arrays.copyOf(nums2, k2))); 
    }
}

