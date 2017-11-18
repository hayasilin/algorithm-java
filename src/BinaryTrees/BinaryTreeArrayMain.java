package BinaryTrees;

public class BinaryTreeArrayMain {
	
	public static void main(String[] args){
		int[] data = {0, 5, 6, 4, 8, 2, 3, 7, 1, 9};
		
		BinaryTreeArray bt = new BinaryTreeArray(16, data);
		
		bt.printBinaryTree();
		
	}
}
