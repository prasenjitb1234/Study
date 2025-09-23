package com.practice.June_25.Problems;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// wap to check palindrome string 
		
		System.out.println("Enter a string to check palindrome : ");
		String str = sc.nextLine();
		
		String rev = "";
		
		int len = str.length();
		
		String org_str = str;
		
		for(int i = len - 1;i>= 0;i--) {
			rev = rev + str.charAt(i);
		}
		if(org_str.equals(rev)) {
			System.out.println(org_str+" is palindrome string !");
		}else {
			System.out.println(org_str+" is not palindrome string ! ");
		}
		
		
		
	}
}
