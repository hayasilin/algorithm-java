package algorithm;

public class FizzBuzz {

	private static void fizzBuzz(int num){
		
		for (int i = 1; i <= num; i++){
			if (i % 15 == 0){
				System.out.println("FizzBuzz");
			}
			else if (i % 3 == 0){
				System.out.println("Fizz");
			}
			else if (i % 5 == 0){
				System.out.println("Buzz");
			}
			else{
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args){
		fizzBuzz(20);
	}
}
