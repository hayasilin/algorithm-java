package interviewQuestions;

public class StringDemo {
	
	public static void main(String[] args){
		
		StringBuffer sb = new StringBuffer("程式");
		System.out.println("sb: " + sb);
		
		sb.append("-");
		System.out.println("sb: " + sb);
		
		sb.append("最佳教材");
		System.out.println("sb: " + sb);
		
		sb.delete(0, 2);
		System.out.println("sb: " + sb);
		
		sb.insert(3, "設計");
		System.out.println("sb: " + sb);
	}
}
