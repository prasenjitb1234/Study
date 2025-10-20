package javastudy.practice.one;

public class ReverseStringOne {
	public static void main(String[] args) {
		
		String str = "I love India";
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(str);
		sb = sb.reverse();
		System.out.println("StringBuilder : : "+sb);
		
		
		
		
	}
}
