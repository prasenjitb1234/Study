package com.java.character;

import java.util.Scanner;

public class CharacterIsVowelOrConsonant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a character : ");
		char c = sc.next().charAt(0);

		if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o'
				|| c == 'u') {
			System.out.println("Vowel");
		}
		
		else if((c >= 'A' && c <='Z' || (c >='a' && c<='z'))) {
			System.out.println("consonant");
		}
		else {
			System.out.println("Not an alphabet");
		}

	}

}
