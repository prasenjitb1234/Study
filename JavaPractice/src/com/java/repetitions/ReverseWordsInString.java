package com.java.repetitions;

import java.util.Scanner;

public class ReverseWordsInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter a Sentence to reverse : ");
		String s = sc.nextLine();
		
		ReverseWordsInString obj = new ReverseWordsInString();
		System.out.println("Reversed Sentence : "+obj.reverseWords(s));
		
		

	}
	
	public String reverseWords(String s) {
		
		String words[] = s.trim().split(" +");
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=words.length - 1;i>=0;i--) {
			sb.append(words[i]);
			if(i != 0) {
				sb.append(" ");
			}
		}
		return sb.toString();
	}

}
