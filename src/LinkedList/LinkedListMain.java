package LinkedList;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LinkedListMain {

	public static void main(String[] args) throws Exception{
		
		int temp;
		int[] data = {1, 2, 3, 4, 5, 6};
		SinglyLinked s1 = new SinglyLinked(data);
		System.out.println("原來的串列：");
		s1.printList();
		System.out.println("串列是空的：" + s1.isListEmpty());
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		temp = 0;
		while(temp != -1){
			System.out.println("輸入搜尋郵寄編號(-1 結束)==>");
			System.out.flush();//清除緩衝區
			
			//讀取一列，轉換成整數
			temp = Integer.parseInt(input.readLine());
			if(temp != -1){
				if(s1.searchNode(temp) != null){
					System.out.println("串列包含節點[" + temp + "]");
				}else{
					System.out.println("串列不包含節點[" + temp + "]");
				}
			}
		}
		input.close();
	}
}
