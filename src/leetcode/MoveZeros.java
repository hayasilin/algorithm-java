package leetcode;

public class MoveZeros {
	public static void moveZeroes(int[] nums) {
        int l = 0, r = 0;
        while(r < nums.length) {
            while(r < nums.length - 1 && nums[r] == 0) r++;
            int t = nums[l];
            nums[l++] = nums[r];
            nums[r++] = t;
        }
    }
	
	public static void main(String[] args) {
		int[] nums = {0,1,0,3,12};
		
		moveZeroes(nums);
	}
}
