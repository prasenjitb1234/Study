package com.java.october.practice;

public class RemoveJunkInString {

	public static void main(String[] args) {
		
		String s = "!*?+%*(@ #latin string 01234567890";
		
		s = s.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(s);
	}

}
