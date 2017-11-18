package Graphs;

class Graph_Matrix {

	private int[][] graph; // 圖形宣告列陣
	
	//使用邊線列陣建立圖形
	public Graph_Matrix(int size, int[][] edge) {
		int i, j;
		int from, to; //邊線的起點跟終點
		graph = new int[size][]; //建立2維列陣
		for (i = 0; i < graph.length; i++)
			graph[i] = new int[size];
		for (i = 1; i < size; i++)
			for (j = 1; j < size; j++)
				graph[i][j] = 0; //清除鄰接矩陣
		for (i = 0; i < edge.length; i++) {//讀取邊線的迴圈
			from = edge[i][0]; //邊線的起點
			to = edge[i][1]; //邊線的終點
			graph[from][to] = 1; //存入圖形的邊線
		}
	}

	//顯示徒刑
	public void printGraph() {
		for (int i = 1; i < graph.length; i++) {
			for (int j = 1; j < graph[i].length; j++)
				System.out.print(" " + graph[i][j] + " ");
			System.out.println();
		}
	}
}

public class GraphMatrix {

	public static void main(String[] args) {
	      int edge[][] = { {1, 2}, {2, 1},  //邊線陣列
	                       {1, 3}, {3, 1},
	                       {2, 3}, {3, 2},
	                       {2, 4}, {4, 2},
	                       {3, 5}, {5, 3},
	                       {4, 5}, {5, 4} };
	      Graph_Matrix g = new Graph_Matrix(6,edge);//建立圖形
	      System.out.println("圖形G的鄰接矩陣內容");
	      g.printGraph();  //顯示圖形
	}
}
