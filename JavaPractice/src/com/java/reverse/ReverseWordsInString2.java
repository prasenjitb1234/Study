package com.java.reverse;

public class ReverseWordsInString2 {
	public static void main(String[] args) {
		// reverse words in string using stringbuiler
		
		String str = "Hello World";
		
		System.out.println(reverseWords(str));
		
	}
	
	public static String reverseWords(String str) {
		
		String words[] = str.trim().split(" +");
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = words.length - 1;i>=0;i--) {
			sb.append(words[i]);
			if(i != 0) {
				sb.append(" ");
			}
		}
		
		return sb.toString();
		
	}
}
