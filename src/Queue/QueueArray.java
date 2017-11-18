package Queue;

public class QueueArray implements QueueInterface {

	private int[] queue;
	private int front;
	private int rear;
	
	public QueueArray(int size){
		queue = new int[size];
		front = -1;
		rear = -1;
	}
	
	public boolean isQueueEmpty(){
		if(front == rear)
		{
			return true;
		}else{
			return false;
		}
	}
	
	public boolean enqueue(int d){
		if (rear >= queue.length){
			return false;
		}else{
			queue[++rear] = d;
			return true;
		}
	}
	
	public int dequeue(){
		if (isQueueEmpty()){
			return -1;
		}else{
			return queue[++front];
		}
	}
}
