package Queue;

public class QueueArrayMain {
	public static void main(String[] args){
		int[] data = {1, 2, 3, 4, 5, 6};
		QueueArray q = new QueueArray(10);
		
		System.out.println("存入Queue資料的順序：");
		for(int i = 0; i < data.length; i++){
			q.enqueue(data[i]);
			System.out.println("[" + data[i] + "]");
		}
		
		System.out.println("取出Queue資料的順序：");
		while(!q.isQueueEmpty()){
			System.out.println("[" + q.dequeue() + "]");
		}
	}
}
