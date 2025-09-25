package javastudy.practice;

public class RemoveSpacesFromString {
	public static void main(String[] args) {
		
		String str = "India is my country";
		
		str = str.replaceAll("\\s", "");
		
		System.out.println(str);
		
		
		
		
	}
}
