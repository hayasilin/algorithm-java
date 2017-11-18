package search;

public class BinarySearch {

	static boolean binary(int[] data, int l, int h, int k){
		
		int m;//中間數
		if(l > h){
			return false;
		}
		else
		{
			m = (1 + h) / 2;
			if (k == data[m]){
				return true;
			}else if (k < data[m]){
				return binary(data, l, m-1, k);
			}else{
				return binary(data, m+1, h, k);
			}
		}
	}
	
	public static void main(String[] args){
		
		int[] data = {1, 8, 9, 15, 25, 33, 42, 66, 74, 81, 90};
		
		int key = 15;
		int len = data.length;
		
		System.out.print("原始陣列：");
		for(int i = 0; i < len; i++){
			System.out.print("[" + data[i] + "]");
		}
		System.out.println();
		
		if (key != -1){
			if (binary(data, 0, len, key)){
				System.out.println("搜尋到鍵值：" + key);
			}else{
				System.out.println("搜尋到鍵值：" + key);
			}
		}
	}
}
