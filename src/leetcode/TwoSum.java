package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement)) {
				int[] result = {map.get(complement), i};
				return result;
			}
			map.put(nums[i], i);
		}
		throw new IllegalArgumentException("illeagal argument error");
	}
	
	
	public static void main(String[] args) {
		int[] nums = {2, 7, 8, 9};
		
		System.out.println(twoSum(nums, 9));
	}

}
