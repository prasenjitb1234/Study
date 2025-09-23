package com.practice.one;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String to Check Palindrome : ");
		String str = sc.next();
		
		String rev = "";
		int len = str.length();
		
		String org_str = str;
		
		for(int i = len - 1;i>=0;i--) {
			rev = rev + str.charAt(i);
		}
		if(org_str.equals(rev)) {
			System.out.println(org_str+ " : is Palindrome String ");
		}else {
			System.out.println(org_str+ " :  is Not a Palidrome String");
		}
		
		
		
		
		
	} 
	
}	
