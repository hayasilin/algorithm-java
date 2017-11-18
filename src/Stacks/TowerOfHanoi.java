package Stacks;

public class TowerOfHanoi {

	private static int count = 0;
	
	static void hanoiTower(int dishs, int peg1, int peg2, int peg3){
		if(dishs == 1){
			System.out.println("盤子從" + peg1 + "移到" + peg3);
		}else{
			hanoiTower(dishs-1, peg1, peg3, peg2);//第1步驟
			count+=1;
			System.out.println("盤子從" + peg1 + "移到" + peg3);
			hanoiTower(dishs-1, peg2, peg1, peg3);//第3步驟
			count+=1;
		}
	}
	
	public static void main(String[] args){
		int dishs = 3;
		hanoiTower(dishs, 1, 2, 3);
		
		System.out.println("count= " + count);
	}
}
