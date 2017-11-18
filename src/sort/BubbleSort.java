package sort;

public class BubbleSort {

	static void bubbleSort(char[] data) {

		int i, j;
		int count = data.length;
		char temp;

		for (j = count; j > 1; j--) {
			for (i = 0; i < j - 1; i++) {
				if (data[i + 1] < data[i]) {
					temp = data[i + 1];
					data[i + 1] = data[i];
					data[i] = temp;
				}
			}

			System.out.print(count - j + 1);
			System.out.println(": " + new String(data));
		}
	}

	public static void main(String[] args) throws Exception {

		char[] data = { 'k', 'l', 'j', 'o', 'a', 'b' };

		bubbleSort(data);
		System.out.println("排序後字串: " + new String(data));
	}
}
