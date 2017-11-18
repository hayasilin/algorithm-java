package Stacks;

public class StackArrayMain {

	public static void main(String[] args){
		int[] data = {1, 2, 3, 4, 5, 6};
		StackArray st = new StackArray(6);
		System.out.print("存入Stack資料順序：");
		
		for (int i = 0; i < 6; i++){
			st.push(data[i]);
			System.out.println("[" + data[i] + "]");
		}
		
		System.out.print("\n 取出Stack資料的順序：");
		while(!st.isStackEmpty()){
			System.out.println("[" + st.pop() + "]");
		}

	} 
}
