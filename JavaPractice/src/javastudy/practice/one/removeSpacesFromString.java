package javastudy.practice.one;

public class removeSpacesFromString {
	public static void main(String[] args) {
		
		String str = "India is my country";
		
		str = str.replaceAll("\\s","");
		
		System.out.println("after removing spaces : "+str);
		
		
		
	}
}
