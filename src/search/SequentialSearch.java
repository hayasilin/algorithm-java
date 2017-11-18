package search;

public class SequentialSearch {

	static boolean sequential(int[] data, int len, int k){
		
		for(int i = 0; i < len; i++){
			if(data[i] == k){
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args){
		
		int[] data = {9, 25, 33, 74, 90, 15, 1, 8, 42, 66, 81};
		
		int key = 33;
		int len = data.length;
		System.out.println("原始陣列：");
		for(int i = 0; i < len; i++){
			System.out.println("[" + data[i] + "]");
		}
		
		if (sequential(data, len, key)){
			System.out.println("搜尋到Key: " + key);
		}else{
			System.out.println("沒有搜尋到Key: " + key);
		}
	}
}
