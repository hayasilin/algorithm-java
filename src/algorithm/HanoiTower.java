package algorithm;

public class HanoiTower {
	
	static void hanoiTower(int dishs, int peg1, int peg2, int peg3) {
		if ( dishs == 1 )  // 終止條件
			System.out.println("盤子從 "+peg1+" 移動到 "+peg3);
		else {
			hanoiTower(dishs-1,peg1,peg3,peg2); // 第1步驟
			System.out.println("盤子從 "+peg1+" 移動到 "+peg3);
			hanoiTower(dishs-1,peg2,peg1,peg3); // 第3步驟
		}     
	}

	
	
	public static void main(String[] args) {
		int dishs = 3;
		
		hanoiTower(dishs, 1, 2, 3);
	}
}
