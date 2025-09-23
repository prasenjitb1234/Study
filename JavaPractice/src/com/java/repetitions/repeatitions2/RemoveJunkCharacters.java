package com.java.repetitions.repeatitions2;

public class RemoveJunkCharacters {
	public static void main(String[] args) {
		
		String s = "%#@ ^*_()<>?!~`01234567890abcdefg";
		
		s = s.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(s);
		
		
		
		
		
	}
}
