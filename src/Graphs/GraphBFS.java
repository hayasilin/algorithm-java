package Graphs;

class Graph_BFS extends Graph_List { 
	   private int[] visited; //走訪記錄陣列
	   
	   //使用邊線陣列建立圖形
	   public Graph_BFS(int size, int[][] edge) {
	      super(size, edge);    //父類別
	      visited = new int[size];
	      for ( int i = 1; i < size; i++ )
	         visited[i] = 0; //設定走訪初值
	   }
	  
	   public void bfs(int vertex) {
	      Vertex ptr;
	      Queue q = new Queue();         //建立Queue物件
	      // ≥B≤z≤ƒ§@≠”≥ª¬I
	      visited[vertex] = 1;           //紀錄已走訪過
	      q.enqueue(vertex);             //將頂點存入Queue
	      // ≈„•‹®´≥X™∫≥ª¬I≠»
	      System.out.print("[V" + vertex + "] ");
	      while ( !q.isQueueEmpty() ) {  //Queue是否已空
	         vertex = q.dequeue();       //將頂點從Queue取出
	         ptr = head[vertex].next;    //頂點指標
	         while ( ptr != null ) {     //走訪至串列尾
	            if ( visited[ptr.data]==0 ) {//是否走訪過
	               q.enqueue(ptr.data);  //存入Queue
	               visited[ptr.data] = 1;//記錄已走訪過
	               //顯示走訪的頂點值
	               System.out.print("[V" + ptr.data + "] ");
	            }
	            ptr = ptr.next;          //下一個頂點
	         }
	      }
	   }
	}

public class GraphBFS {

	public static void main(String[] args) {
		int edge[][] = { {1, 2}, {2, 1},  //邊線陣列
				{1, 3}, {3, 1},
				{2, 4}, {4, 2},
				{2, 5}, {5, 2},
				{3, 6}, {6, 3},
				{3, 7}, {7, 3},
				{4, 8}, {8, 4},
				{5, 8}, {8, 5},
				{6, 8}, {8, 6},
				{7, 8}, {8, 7} };
		Graph_BFS g = new Graph_BFS(10, edge);  //建立圖形
		System.out.println("圖形G的鄰接矩陣內容");
		g.printGraph();  // 顯示圖形
		System.out.println("圖形的寬度優先走訪");
		g.bfs(1);        // 顯示走訪過程
		System.out.println();
	}
}
