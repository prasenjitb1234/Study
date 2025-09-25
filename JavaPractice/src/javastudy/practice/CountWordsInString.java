package javastudy.practice;

public class CountWordsInString {
	public static void main(String[] args) {

		String str = "India is my country";
		
		String words[] = str.trim().split("\\s+");
		
		int count = words.length;
		
		System.out.println("Total count : "+count);
		
		
		
		
		
	}
}
