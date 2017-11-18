package algorithm;

public class SequentialSearch {

	private static int sequentialSearch(int[] data, int target) {
		for (int i = 0; i < data.length; i++) {
			if (data[i] == target) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int[] data = { 89, 34, 78, 45, 12, 99, 23 };
		int i, index;

		System.out.print("原始陣列: ");
		for (i = 0; i < data.length; i++) {
			System.out.print("[" + data[i] + "]");
		}
		
		System.out.println(" ");

		int target = 99;
		index = sequentialSearch(data, target);
		if (index != -1) {
			System.out.println("搜尋到key: " + target + "index = " + index);
		} else {
			System.out.println("沒有搜尋到值");
		}

	}
}
