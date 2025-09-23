package com.java.october.practice;

import java.util.Scanner;

public class CountWordsInString {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter a string to count words : ");
		String s = sc.nextLine();
		
		int count = 1;
		
		for(int i=0;i<s.length();i++) {
			if((s.charAt(i) == ' ') && (s.charAt(i+1) != ' ')) {
				count++;
			}
		}
		System.out.println("Number of words : " +count);

	}

}
