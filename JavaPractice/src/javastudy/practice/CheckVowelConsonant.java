package javastudy.practice;

import java.util.Scanner;

public class CheckVowelConsonant {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter an alphabet to check : ");
		char c = sc.next().charAt(0);

		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
				|| c == 'U') {
			System.out.println(c + " is vowel ");
		} else if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
			System.out.println(c + " is consonant");
		} else {
			System.out.println(c + " is not an alphabet");
		}

	}
}
