package Graphs;

public class Vertex {

	int data;//頂點資料
	Vertex next; //下一個頂點的指標
	
	public Vertex(int data){
		this.data = data;
		next = null;
	}
}
