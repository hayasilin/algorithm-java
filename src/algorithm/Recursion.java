package algorithm;

public class Recursion {

	// 遞迴方法：計算階層函數值
	static int factorial(int n) {
		if (n == 1) {
			return 1;
		} else {
			System.out.println("factorial n: " + n);
			return n * factorial(n - 1);
		}
	}
	
	//計算加總函數
	static int factorialSum(int n) {
		if (n <= 0) {
			return 0;
		} else {
			System.out.println("factorialSum n: " + n);
			return n + factorialSum(n - 1);
		}
	}

	public static void main(String[] args) {
		System.out.println(factorial(4));
		System.out.println(factorialSum(5));
	}
}
