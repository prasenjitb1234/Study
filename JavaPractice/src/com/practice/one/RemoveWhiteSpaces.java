package com.practice.one;

public class RemoveWhiteSpaces {
	public static void main(String[] args) {
		
		String s = "My name is Prasenjit";
		
		s = s.replaceAll(" ", "");	
		
		System.out.println("After removing white spaces : "+s);
	}
}
