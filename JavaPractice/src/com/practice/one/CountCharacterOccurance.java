package com.practice.one;

public class CountCharacterOccurance {
	public static void main(String[] args) {
		
		String str = "Java Programming Java OOP";
		
		int totalCount = str.length();
		
		int totalCountAfterRemove = str.replace("a","").length();
		
		int count = totalCount - totalCountAfterRemove;
		System.out.println(count);
		
		
		
	}
}
