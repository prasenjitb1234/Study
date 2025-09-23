package com.java.extra;

public class RemoveJunkCharacters {
	public static void main(String args[]) {
		
		String s = "!*?+%*(@ #latin string 01234567890";
		
		String s1 = "!*?#!$%&*-+%*(@ #latin string 01234567890";
		
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		
		s1 = s1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s1);
		
	}
}
