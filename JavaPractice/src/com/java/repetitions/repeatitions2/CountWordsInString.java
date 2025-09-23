package com.java.repetitions.repeatitions2;

import java.util.Scanner;

public class CountWordsInString {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// count number of wordsin string 
		
		System.out.println("Enter a string to count words : ");
		String s = sc.nextLine().trim(); 
		
		int count = 1;
		
		for(int i=0;i<s.length();i++) {
			if((s.charAt(i) == ' ' && s.charAt(i + 1) != ' ')) {
				count++;
			}
		}
		
		System.out.println("Number of words in String : "+count);
		
		
	}
}
