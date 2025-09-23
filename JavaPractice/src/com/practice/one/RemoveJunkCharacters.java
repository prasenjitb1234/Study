package com.practice.one;

public class RemoveJunkCharacters {
	public static void main(String[] args) {
		
		String s = "!*?+%*(@ #latin string 01234567890";
		
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("cleaned string is : "+s);
		
		
		
	}
}
