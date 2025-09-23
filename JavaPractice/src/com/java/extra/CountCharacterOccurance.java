package com.java.extra;

public class CountCharacterOccurance {
	public static void main(String args[]) {
		
		String s = "Java Programming Java oops";
		
		int totalcount = s.length(); // total length
		
		int totalcount_afterRemove = s.replace("a", "").length(); // total length after removing a's 
		
		
		int count = totalcount - totalcount_afterRemove;
		System.out.println("Number of occurances of a : "+count);
		
		
	}
}
