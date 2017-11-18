package Graphs;

class Graph_List { //鄰接串列
	public Vertex[] head; //圖形頂點的物件陣列
	
	//使用邊線陣列建立圖形
	public Graph_List(int size, int[][] edge) {
		int i, from, to; //邊線的起點和終點
		Vertex newnode, ptr;
		head = new Vertex[size]; //建立物件陣列
		for (i = 0; i < head.length; i++)
			head[i] = new Vertex(i);
		for (i = 0; i < edge.length; i++) {//讀取邊線的迴圈
			from = edge[i][0]; //邊線的起點
			to = edge[i][1]; //邊線的終點
			// ´ÿ•ﬂ≥ª¬I™´•Û
			newnode = new Vertex(to);
			ptr = head[from]; //指標陣列的頂點指標
			while (ptr.next != null) //走訪至串列尾
				ptr = ptr.next; //下一個頂點
			ptr.next = newnode; //插入結尾
		}
	}

	public void printGraph() {
		Vertex ptr;
		
		for (int i = 1; i < head.length; i++) {
			ptr = head[i].next; //頂點指標
			if (ptr != null) { //有使用的節點
				System.out.print("≥ª¬IV" + head[i].data);
				System.out.print(" =>");
				while (ptr != null) { //走訪顯示的頂點內容
					System.out.print("V" + ptr.data + " ");
					ptr = ptr.next; //下一個頂點
				}
				System.out.println();
			}
		}
	}
}

public class GraphList {

	public static void main(String[] args) {
	      int edge[][] = { {1, 2}, {2, 1},  //邊線陣列
	                       {1, 3}, {3, 1},
	                       {2, 3}, {3, 2},
	                       {2, 4}, {4, 2},
	                       {3, 5}, {5, 3},
	                       {4, 5}, {5, 4} };
	      Graph_List g = new Graph_List(10, edge);//建立圖形
	      System.out.println("圖形G的鄰接串列內容：");
	      g.printGraph();
	   }
}
