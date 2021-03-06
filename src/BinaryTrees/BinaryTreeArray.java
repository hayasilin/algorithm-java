package BinaryTrees;

class BinaryTreeDemo {

	private int[] binaryTree;
	
	public BinaryTreeDemo(int size, int[] array){
		int level;//樹的階層
		binaryTree = new int[size];
		
		//清除陣列元素
		for(int i = 0; i < size; i++){
			binaryTree[i] = -1;
		}
		
		binaryTree[1] = array[1];
		
		//使用迴圈新增二元樹的其他節點
		for(int i = 2; i < array.length; i++){
			level = 1;
			while(binaryTree[level] != -1){//是否有子樹
				if(array[i] > binaryTree[level]){
					//是左或又子樹
					level = level * 2 + 1;
				}else{
					level = level * 2;
				}
			}
			binaryTree[level] = array[i];
		}
	}
	
	public void printBinaryTree(){
		for(int i = 1; i < binaryTree.length; i++){
			if(binaryTree[i] != -1){
				System.out.println("[" + i + ":" + binaryTree[i] + "]");
			}
		}
	}
}

public class BinaryTreeArray {
	
	public static void main(String[] args){
		int[] data = {0, 5, 6, 4, 8, 2, 3, 7, 1, 9};
		
		BinaryTreeDemo bt = new BinaryTreeDemo(16, data);
		
		bt.printBinaryTree();
		
	}
}

