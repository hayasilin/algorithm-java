package algorithm;

public class BinarySearch {

	public static int binarySearchWithRecursion(int[] data, int start, int end, int target) {
		int middle = (start + end) / 2;
		if (end < start) {
			return -1;
		}

		if (target == data[middle]) {
			return middle;
		} else if (target < data[middle]) {
			return binarySearchWithRecursion(data, start, middle - 1, target);
		} else {
			return binarySearchWithRecursion(data, middle + 1, end, target);
		}
	}

	// O(log n)
	static boolean binarySearch(int[] data, int key) {
		int low = 0;
		int high = data.length - 1;

		while (high >= low) {
			int middle = (low + high) / 2;
			if (data[middle] == key) {
				System.out.println("result: " + middle);
				return true;
			}
			if (data[middle] < key) {
				low = middle + 1;
			}
			if (data[middle] > key) {
				high = middle - 1;
			}
		}
		return false;
	}

	static void reverseArray(int[] data) {
		int temp;
		for (int i = 0; i < data.length / 2; i++) {
			temp = data[data.length - 1 - i];
			data[data.length - 1 - i] = data[i];
			data[i] = temp;
		}
	}

	public static void main(String[] args) {

		int[] data = { 12, 13, 24, 35, 44, 67, 78, 98 };
		
		int result = binarySearchWithRecursion(data, 0, 7, 98);
		System.out.println(result);

		System.out.println(binarySearch(data, 98) ? "true" : "false");

		reverseArray(data);
		System.out.print("reverse陣列: ");
		for (int j = 0; j < data.length; j++) {
			System.out.print("[" + data[j] + "]");
		}
	}

}
