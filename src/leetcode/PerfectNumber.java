package leetcode;

public class PerfectNumber {
	
	public static void printAllPerfectNumber(int num) {
        if (num <= 0) {
        		return;
        }
        for (int j = 1; j < num + 1; j++) {
        		int sum = 0;
            for (int i = 1; i < j; i++) {
                if (j % i == 0) {
                    sum += i;
                }
            }
            if (sum == j) {
            		System.out.println(j);
            }
        }
    }
	
	public static boolean checkPerfectNumber(int num) {
        if (num <= 0) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }

        }
        return sum == num;
    }
	
	public static boolean checkPerfectNumberFaster(int num) {
        if (num <= 0) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i * i != num) {
                    sum += num / i;
                }

            }
        }
        return sum - num == num;
    }
	
	public static void main(String[] args) {
		System.out.println(checkPerfectNumber(28));
		printAllPerfectNumber(500);
		System.out.println(checkPerfectNumberFaster(28));
		
	}
}
