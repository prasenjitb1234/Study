package com.practice.wiproInterviewPractice;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String to check Palindrome : ");
		String str = sc.next();
		
		String rev = "";
		int len = str.length();
		
		String org_str = str;
		
		for(int i = len - 1;i>=0;i--) {
			rev = rev + str.charAt(i);
		}
		if(org_str.equals(rev)) {
			System.out.println(str+" is a palindrome ");
		}else {
			System.out.println(str+" is not a palindrome");
		}
		
		
		
	}
}
