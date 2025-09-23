package com.java.repetitions;

import java.util.Scanner;

public class palindromeString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		String str = sc.next();
		
		int len = str.length();
		
		String org_str = str;
		String rev = "";
		
		for(int i=len - 1;i>=0;i--) {
			rev = rev + str.charAt(i);
		}
		if(org_str.equals(rev)) {
			System.out.println("Palindrome");
		}else
		{
			System.out.println("Not a palindrome ");
		}
		
		
		
		
	}
}
