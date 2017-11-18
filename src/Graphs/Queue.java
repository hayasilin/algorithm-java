package Graphs;

class Node {
	int data; // 節點資料
	Node next; // 下一個節點

	public Node(int data) {
		this.data = data;
		next = null;
	}
}

public class Queue {

	public Node front; // Queue的前端
	public Node rear; // Queue的尾端

	public Queue() {
		front = null; //
		rear = null;
	}

	// 存入Queue資料
	public void enqueue(int d) {
		Node new_node = new Node(d); // 建立節點
		// 檢查Queue是否是空的
		if (isQueueEmpty())
			front = new_node; // 插入成為第一個節點
		else
			rear.next = new_node; // 新增在結尾
		rear = new_node; // 更新尾端指標
	}

	// 取出Queue資料
	public int dequeue() {
		int d;

		if (!isQueueEmpty()) {
			if (front == rear) // 最後節點的特殊情況
				rear = null; // 更新尾端指標
			d = front.data; // 取得Queue資料
			front = front.next; // 刪除第一個節點
			return d; // 傳回節點資料
		} else
			return -1; // Queue是空的
	}

	public boolean isQueueEmpty() {
		return front == null;
	}

}
