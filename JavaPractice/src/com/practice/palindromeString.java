package com.practice;

import java.util.Scanner;

public class palindromeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// wap to to check palindrome string

		System.out.println("Enter a String : ");
		String str = sc.next();

		int len = str.length();

		String rev = "";

		String org_str = str;

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if (org_str.equals(rev)) {
			System.out.println("Palinrome ");
		} else {
			System.out.println("Not a palindrome ");

		}

	}

}
