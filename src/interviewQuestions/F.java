package interviewQuestions;

abstract class D {

	String s1 = "D";

	String getS1() {
		return s1;
	};
}

class E extends D {

	String s1 = "E";

	String getS1() {
		System.out.println("s1 = " + s1);
		return s1;
	};
}

public class F {

	public static void main(String[] args) {
		
		D x = new E();
		System.out.print(x.s1 + x.getS1());
	}
}
