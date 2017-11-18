package Graphs;

class Graph_DFS extends Graph_List { 
	private int[] visited; //走訪記錄陣列
	
	//使用邊線陣列建立圖形
	public Graph_DFS(int size, int[][] edge) {
		super(size, edge); //使用父類別的建構子
		visited = new int[size];
		for (int i = 1; i < size; i++)
			visited[i] = 0; //設定走訪初值
	}

	//圖形的深度優先搜尋法
	public void dfs(int vertex) {
		Vertex ptr;
		visited[vertex] = 1; //記錄已走訪過
		// 顯示走訪的頂點值
		System.out.print("[V" + vertex + "] ");
		ptr = head[vertex].next; //頂點指標
		while (ptr != null) { //走訪至串列尾
			if (visited[ptr.data] == 0) //是否走訪過
				dfs(ptr.data); //遞回呼叫走訪
			ptr = ptr.next; //下一個頂點
		}
	}
}

public class GraphDFS {
	
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
		Graph_DFS g = new Graph_DFS(10, edge);  //建立圖形
		System.out.println("圖形G的鄰接矩陣內容：");
		g.printGraph();  //顯示圖形
		System.out.println("圖形的深度優先走訪");
		g.dfs(1);        //顯示走訪過程
		System.out.println();
	}
}
