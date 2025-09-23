package com.java.repetitions.repeatitions2;

public class CountCharacterOccurance {
	public static void main(String[] args) {
		
		// count character occurance in string 
		
		String s = "Tech Mahindra is a Leading IT Company in India";
		
		int totalCount =  s.length();
		
		int totalCountAfterRemove = s.replace("a","").length();
		
		int count = totalCount - totalCountAfterRemove;
		
		System.out.println("Number of Occurance of 'a' is  : "+count);
		
	}
}
