package interviewQuestions;

public class A12 {

	public static void main(String[] args) {
		A11[] a1 = new A11[1]; // 1
		A11[][] a2 = new A11[2][]; // 2
		A11[][][] a3 = new A11[3][][];// 3
		a1[0] = new A11(); // 4
		a2[0] = a2[1] = a1; // 5
		a3[0] = a3[1] = a3[2] = a2; // 6
		System.out.println(a3[2][1][0]);// 7
	}
}

class A11 {
	public String toString() {
		return "A11";
	}
}
