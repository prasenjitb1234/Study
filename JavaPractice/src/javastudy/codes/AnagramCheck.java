package javastudy.codes;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {

	public static boolean isAnagram(String s, String t) {

		String str1 = s.replaceAll("\\s", "");
		String str2 = t.replaceAll("\\s", "");

		if (str1.length() != str2.length()) {
			return false;
		} else {
			char c1[] = str1.toLowerCase().toCharArray();
			char c2[] = str2.toLowerCase().toCharArray();

			Arrays.sort(c1);
			Arrays.sort(c2);

			return Arrays.equals(c1, c2);
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first string : ");
		String s = sc.next();

		System.out.println("Enter second string : ");
		String t = sc.next();

		boolean anagramcheck = isAnagram(s, t);

		if (anagramcheck) {
			System.out.println("The Strings are Anagrams");
		} else {
			System.out.println("The Strings are not anagrams ");
		}

	}
}
