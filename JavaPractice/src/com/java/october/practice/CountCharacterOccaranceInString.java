package com.java.october.practice;

public class CountCharacterOccaranceInString {

	public static void main(String[] args) {
		
		// count 'a' character occurrence.
		
		String s = "My name is Prasenjit Bhosale";
		
		int totalCount = s.length();
		
		int totalCount_AfterRemove = s.replace("a", "").length();
		
		int count = totalCount - totalCount_AfterRemove;
		
		System.out.println("Number of occarance  : "+count);
		

	}

}
