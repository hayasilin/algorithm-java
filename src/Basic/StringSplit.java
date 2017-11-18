package Basic;

public class StringSplit {

	public static void main(String[] args) {
		
		String mustSplitString = "A,B,C,D,E,F,G,H";
		String[] AfterSplit = mustSplitString.split(",", 5);
		for (int i = 0; i < AfterSplit.length; i++)
		    System.out.println(AfterSplit[i]);
	}
	
}
