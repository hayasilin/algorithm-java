package sort;

public class InsertSort {

	static void insertSort(int[] data) {

		int i, j;
		int count = data.length;
		int temp;

		for (i = 1; i < count; i++) {
			temp = data[i];
			j = i - 1;
			// 空出一個插入的位置
			while (j >= 0 && temp < data[j]) {
				data[j + 1] = data[j];
				j--;
			}

			data[j + 1] = temp;
			// 顯示
			for (int k = 0; k < data.length; k++){
				System.out.print("[" + data[k] + "]");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) throws Exception {

		int[] data = { 6, 4, 1, 3, 2};
		insertSort(data);
		
		System.out.println("排序後字串：" + data);
	}
}
