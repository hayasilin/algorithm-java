package leetcode;

public class RemoveElement {
	static int[] data = {1, 2, 2, 3, 2, 4};
	
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
	
	public static void main(String[] args) {
		int newLength = removeElement(data, data.length, 2);
		System.out.println(newLength);
	}
}
