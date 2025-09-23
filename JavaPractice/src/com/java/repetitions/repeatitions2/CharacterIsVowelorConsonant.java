package com.java.repetitions.repeatitions2;

import java.util.Scanner;

public class CharacterIsVowelorConsonant {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Character : ");
		char c = sc.next().charAt(0);
		
		
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='I' || c=='O' || c=='E' || c=='U') {
			System.out.println(c +" is a vowel");
		}
		else if((c >= 'A' && c<='Z' || (c>='a' && c<='z'))) {
			System.out.println(c+" is a consonant");
		}
		else {
			System.out.println("NOT an alphabet");
		}
		
		
	}
}
