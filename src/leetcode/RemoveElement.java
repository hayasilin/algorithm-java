package leetcode;

public class RemoveElement {
	static int[] data = {1, 1, 2, 3};
	
	static int removeElement(int[] data, int n, int element) {
		int i = 0;
		int j = 0;
		for (i=0; i < n; i++) {
			if (data[i] == element) {
				continue;
			}
			
			data[j] = data[i];
			j++;
		}
		
		return j;
	}
	
	static int removeDuplicatesFromSortedArray(int[] nums, int n) {
		if (n == 0) {
			return 0;
		}
		
		int j = 0;
		for (int i = 1; i < n; i++) {
			if (nums[j] != nums[i]) {
				nums[++j] = nums[i];
			}
		}
		return j+1;
	}
	
	public static void main(String[] args) {
		//int newLength = removeElement(data, data.length, 2);
		//System.out.println(newLength);
		
		int result = removeDuplicatesFromSortedArray(data, data.length);
		System.out.println(result);
	}
}
