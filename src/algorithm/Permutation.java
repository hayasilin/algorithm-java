package algorithm;

import java.util.ArrayList;

public class Permutation {

	public static void main(String[] args) {
		char[] data = { 'a', 'b', 'c'};
		permutation(data, 0, 2);

//		permutation("abc");
		
//		String[] data = {"a", "b", "c"};
//		permutationWithRepeatition(data);
	}
	
	public static void permutationWithRepeatition(String[] data){
		for (int i = 0; i< data.length; i++){
			String firstString = data[i];
			for (int j = 0; j < data.length; j++){
				String secondString = data[j];
				for (int z = 0; z < data.length; z++){
					String thirdString = data[z];
					
					ArrayList<String> myList = new ArrayList<String>(); // 指定是String的型態
					myList.add(firstString);
					myList.add(secondString);
					myList.add(thirdString);
					System.out.println(myList);
				}
			}	
		}
	}
	
	public static void permutation(char[] data, int from, int to) {
		if (to <= 1) {
			return;
		}

		if (from == to) {
			System.out.println(data);
		} else {
			for (int i = from; i <= to; i++) {
				swap(data, i, from);
				permutation(data, from+1, to);
				swap(data, from, i);
			}
		}
	}

	public static void swap(char[] data, int i, int j) {
		char temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}

//	public static void permutation(String str) {
//		permutation("", str);
//	}
//
//	private static void permutation(String prefix, String str) {
//		int n = str.length();
//		if (n == 0)
//			System.out.println(prefix);
//		else {
//			for (int i = 0; i < n; i++)
//				permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
//		}
//	}
}
