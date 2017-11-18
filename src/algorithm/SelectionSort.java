package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SelectionSort {

	static void selectionSort(char[] data){
		int i, j, pos;//pos是最小字元索引
		int count = data.length;
		char temp;
		
		for(i = 0; i < count - 1; i++){
			pos = i;
			temp = data[pos];
			//找尋最小字元的迴圈
			for(j = 1; j < count; j++){
				if(data[j] < temp){//是否更小
					pos = j;
					temp = data[j];
				}
				data[pos] = data[i];//交換2個字元
				data[i] = temp;
				System.out.println(i + 1 + ":" + new String(data));
			}
		}
	}
	
	public static void main(String[] args) throws Exception{
		String str;
		int len;
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("請輸入排序字串：");
		System.out.flush();
		str = input.readLine();
		input.close();
		len = str.length();
		char[] data = new char[len];
		data = str.toCharArray();
		selectionSort(data);
		
		System.out.println("排序後字串：" + new String(data));
	}
}
