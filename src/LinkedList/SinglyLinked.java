package LinkedList;

public class SinglyLinked extends List {

	// 建構子：建立單向鏈結串列
	public SinglyLinked(int[] array) {

		Node newnode;
		first = null;
		for (int i = 0; i < array.length; i++) {
			// 建立節點物件
			newnode = new Node(array[i]);// 建立節點
			newnode.next = first; // 設定第一個節點
			first = newnode;// 重設開頭指標
		}
	}

	public boolean isListEmpty() {
		if (first == null) {
			return true;
		} else {
			return false;
		}
	}

	public void printList() {
		Node current = first; //目前的串列指標
		while (current != null){
			System.out.println("[" + current.data + "]");
			current = current.next;//下一個節點
		}
		
		System.out.println();
	}

	public Node searchNode(int d) {
		Node current = first; //目前的串列指標
		while(current != null){
			if (current.data == d){
				return current;
			}else{
				current = current.next;
			}
		}
		return null;
	}

}
