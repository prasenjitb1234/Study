package javastudy.practice.one;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {

	public static boolean isAnagram(String s1, String s2) {

		String str1 = s1.replaceAll("\\s", "");
		String str2 = s2.replaceAll("\\s", "");

		if (s1.length() != s2.length()) {
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

		System.out.println("Enter first String : ");
		String s1 = sc.nextLine();

		System.out.println("Enter second string : ");
		String s2 = sc.nextLine();

		boolean anagramcheck = isAnagram(s1, s2);

		if (anagramcheck) {
			System.out.println("Given strings are anagram");
		} else {
			System.out.println("Given Strigs are NOT anagram");
		}

	}
}
