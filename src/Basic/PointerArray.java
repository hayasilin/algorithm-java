package Basic;

public class PointerArray {
	
	public static void main(String[] args){
		final int ROW = 6; //列數
		final int COLUMN = 5; //欄數
		
		int[] data = {
				0, 2, 0, 2, 0,
				5, 0, 5, 0, 5,
				1, 4, 1, 4, 1,
				3, 0, 3, 0, 3,
				0, 0, 0, 0 ,0
		};
		
		//指標陣列
		int[] pointer = {0, 10, 5, 20, 15, 20};
		
		int sum = 0;//上課總節數
		
		for (int i = 0; i < data.length; i++){
			System.out.println(i + ":" + data[i] + " ");
		}
		
		for (int i = 0; i < ROW; i++){
			for (int j = 0; j< COLUMN; j++){
				if (data[pointer[i] + j] != 0){
					//是否有課
					sum++;;
				}
			}
		}
		
		//顯示上課總節數
		System.out.println("上課總節數= " + sum);
		
	}
}
