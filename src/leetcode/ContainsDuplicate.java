package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
	public static boolean linearSearch(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] == nums[i]) return true;  
            }
        }
    		return false;
    }
	
	public static boolean sorting(int[] nums) {
		Arrays.sort(nums);
		for (int i = 0; i < nums.length + 1; ++i) {
			if (nums[i] == nums[i+1]) return true;
		}
		return false;
	}
	
	public static boolean hashTable(int[] nums) {
		Set<Integer> set = new HashSet<>(nums.length);
		for (int x: nums) {
			if (set.contains(x)) return true;
			set.add(x);
		}
		return false;
	}
	
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(i > k) {
            		int g = i-k-1;
            		System.out.println(g);
            		set.remove(nums[i-k-1]);
            }
            if(!set.add(nums[i])) return true;
        }
        return false;
    }
	
	public static void main(String[] args) {
		int[] nums = {1,2,3,1};
		
//		System.out.println(linearSearch(nums));
//		System.out.println(sorting(nums));
//		System.out.println(hashTable(nums));
		
		System.out.println(containsNearbyDuplicate(nums, 1));
	}
}
