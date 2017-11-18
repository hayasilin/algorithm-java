package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class QuickSort {
	
	static int[] data = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};
	
	static void quickSort1(int[] data, int left, int right) {
		if (left > right) {
			return;
		}
		int i, j, t, temp;

		temp = data[left];// temp中存的是基準數
		i = left;
		j = right;
		while (i != j) {
			//順序很重要，先從右往左找
			while(data[j] >= temp && i < j){
				j--;
			}
			//再從左往右找
			while(data[i] <= temp && i < j){
				i++;
			}
			
			if (i < j){
				t = data[i];
				data[i] = data[j];
				data[j] = t;
			}
		}
		
		//最終將基準數歸位
		data[left] = data[i];
		data[i] = temp;
		
		quickSort1(data, left, i-1);
		quickSort1(data, i+1, right);
	}

	static void quickSort2(char[] data, int left, int right) {
		char partition; // 分割的字元
		char temp;
		int i, j, k;

		if (left < right) {
			i = left;// 分割的最左索引
			j = right + 1;// 分割的最右索引
			partition = data[left];// 取第一個元素
			do {
				do {
					i++;
				} while (i <= right && data[i] < partition);
				do {
					j--;
				} while (j >= 0 && data[j] > partition);

				if (i < j) {
					temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			} while (i < j);

			temp = data[left];
			data[left] = data[j];
			data[j] = temp;

			System.out.println("輸出結果：");
			for (k = left; k <= right; k++) {
				System.out.println(data[k]);
			}

			quickSort2(data, left, j - 1);
			quickSort2(data, j + 1, right);
		}
	}

	public static void main(String[] args) throws Exception {
//		String str;
//		int len;
//
//		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("請輸入排序字串：");
//		System.out.flush();
//		str = input.readLine();
//		input.close();
//		len = str.length();
//		char[] data = new char[len];
//		data = str.toCharArray();
//		quickSort(data, 0, data.length - 1);
//
//		System.out.println("排序後字串：" + new String(data));
		
		quickSort1(data, 0, 9);
		
		for(int i = 0; i <= 9; i++){
			System.out.println("[" + data[i] + "]");
		}
	}
}
