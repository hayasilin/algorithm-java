package algorithm;

import java.util.Arrays;

public class Permute {
    // swap 2 elements of an array,
    void swap(int[] nums, int first, int i) {
        int temp = nums[first];
        nums[first] = nums[i];
        nums[i] = temp;
    }

    void permute(int[] nums) {
        permute(nums, 0, nums.length);
    }

    /**
     * print permutations of array
     * @param arr
     *            original int array,
     * @param i
     *            start index
     * @param n
     *            end index
     */
    void permute(int[] nums, int first, int n) {
        if (first == n)
            System.out.println(Arrays.toString(nums));
        else {
            for (int i = first; i < n; i++) {
                swap(nums, first, i);
                permute(nums, first + 1, n);// backtrack
                swap(nums, first, i); 
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4 };
        new Permute().permute(nums);
    }
}
