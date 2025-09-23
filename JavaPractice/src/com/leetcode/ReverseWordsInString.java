package com.leetcode;

// Leetcode 151
public class ReverseWordsInString {

	public static void main(String[] args) {
		
		System.out.println(reverseWords("the sky is blue"));

	}
	
	static String reverseWords(String s) {
	    String[] words = s.trim().split(" +"); // Splits on one or more spaces
	    StringBuilder sb = new StringBuilder();

	    for (int i = words.length - 1; i >= 0; i--) {
	        sb.append(words[i]);
	        if (i != 0) { // Add a space only if it's not the last word
	            sb.append(" ");
	        }
	    }
	    return sb.toString(); 
	}

	

}
