package interviewQuestions;

import java.util.ArrayList;

public class ArrayDemo {

	public static void main(String[] args) {

		int[] basicArray = new int[10]; // 利用new指令產生物件
		for (int i = 0; i < basicArray.length; i++) { 
			basicArray[i] = i;
		}
		System.out.println("basicArray = " + basicArray);

		int[] a1 = { 1, 2, 3, 4, 5 };
		Object[] a2 = new Object[] { new Integer(47), new Long(10), new Float(3.14), new Double(11.11) };

		System.out.println("a1 = " + a1);
		System.out.println("a2 = " + a2);

		// ArrayList
		ArrayList<String> myList = new ArrayList<String>(); // 指定是String的型態
//		ArrayList myList1 = new ArrayList(); // 也可以不指定

		String s = new String("haha");
		myList.add(s);
		int theSize = myList.size();
		System.out.println("theSize: " + theSize);

		boolean isIn = myList.contains(s); // 若用上面的例子 因為有s字串 所以回傳true
		System.out.println(isIn ? "true" : "false");
		
		int idx = myList.indexOf(s); // 會回傳0 表第0個位置
		System.out.println("idx = " + idx);
		
		boolean empty = myList.isEmpty(); // 因為有一個元素 會回傳false
		System.out.println(empty ? "true" : "false");
		
		myList.remove(s);
		int newSize = myList.size();
		System.out.println("newSize: " + newSize);
	}
}
