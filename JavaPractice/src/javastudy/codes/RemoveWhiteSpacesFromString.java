package javastudy.codes;

public class RemoveWhiteSpacesFromString {
	public static void main(String[] args) {

		String str = "I Love Java";

		System.out.println("before  remvoving white spaces : ");

		System.out.println(str);

		str = str.replaceAll("\\s", "");

		System.out.println("after remvoving white spaces : ");

		System.out.println(str);

	}
}
