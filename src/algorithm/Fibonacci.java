package algorithm;

public class Fibonacci {

	//方法：費氏數列
	static void fibonacci(int n){
		int fn;//F(n)變數
		int fn2;//F(n-2)變數
		int fn1;//F(n-1)變數
		
		int i;
		if (n <= 1){
			System.out.println("[" + n + "]");
		}
		else{
			fn2 = 0;
			fn1 = 1;
			System.out.println("[0][1]");
			
			for (i = 2; i <= n; i++)
			{
				fn = fn2 + fn1;
				System.out.println("[" + fn + "]");
				fn2 = fn1;
				fn1 = fn;
			}
		}
	}
	
	public static void main(String[] args) throws Exception{
		
		fibonacci(10);
	}
}
