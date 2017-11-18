package interviewQuestions;

public class JaveDemo {

	public static void main(String args[]) {

		// Question No.1
		System.out.println(Long.toHexString(Byte.MAX_VALUE) + ",");
		System.out.println(Long.toHexString(Character.MAX_VALUE) + ",");
		System.out.println(Long.toHexString(Short.MAX_VALUE));

		// Question No.2
		boolean b = true;
		if (b = false) {
			System.out.print("A");
		} else if (b) {
			System.out.print("B");
		} else {
			System.out.println("C");
		}

		// Question No.4
		int i = 0, j = 9;
		while (i++ <= j--) {
			i++;
			if (j < 5)
				break;
		}
		System.out.println(i + "," + j);

		// Question No.6
		for (int g = 0; g < 3; g++) {
			switch (g) {
			case 0:
				break;
			case 1:
				System.out.print("one ");
			case 2:
				System.out.print("two ");
			case 3:
				System.out.print("three ");
			}
		}
		System.out.println("done");

	}

	public static void stringHandling() {
		String S1 = "This is only a" + "simple" + "test";
		StringBuffer aStringBuffer = new StringBuffer("This is only a").append("simple").append("test");

		System.out.println(S1);
		System.out.println(aStringBuffer);

		TestSSB ssb = new TestSSB();
		ssb.test("11");
		ssb.test("22");
		ssb.test("33");

	}
}
