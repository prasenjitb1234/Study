package com.practice.one;

public class ReverseWords {
	public static void main(String[] args) {
		
		String str = "Hello World";
		
		reverseWords(str);
		
	}
	public static void reverseWords(String str) {
		String words[] = str.split(" ");
		
		for(int i=words.length - 1;i>=0;i--) {
			System.out.print(words[i] +" ");
		}
		
		
		
	}
}
