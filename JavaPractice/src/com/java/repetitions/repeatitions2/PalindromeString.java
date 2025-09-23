package com.java.repetitions.repeatitions2;

public class PalindromeString {
	public static void main(String[] args) {
		
		String str = "mom";
		
		String rev = "";
		
		int len = str.length();
		
		String org_str = str;
		
		
		for(int i=len - 1;i>=0;i--) {
			rev = rev + str.charAt(i);
		}
		if(org_str.equals(rev)) {
			System.out.println("Its Palindrome string");
		}else {
			System.out.println("Its not palindrome String");
		}
		
		
		
	}
}
