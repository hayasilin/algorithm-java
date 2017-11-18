package algorithm;

public class BubbleSort {

	private static void bubbleSort(int[] data) {
		int i, j, temp;

		for (j = data.length; j > 1; j--) {
			for (i = 0; i < j - 1; i++) {
				if (data[i + 1] < data[i]) {
					temp = data[i + 1];
					data[i + 1] = data[i];
					data[i] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {

		int[] data = { 89, 34, 78, 45 };
		int i;

		System.out.print("原始陣列: ");
		for (i = 0; i < data.length; i++) {
			System.out.print("[" + data[i] + "]");
		}

		System.out.println(" ");

		bubbleSort(data);
		System.out.print("排序後陣列");
		for (i = 0; i < data.length; i++) {
			System.out.print("[" + data[i] + "]");
		}
	}
}
