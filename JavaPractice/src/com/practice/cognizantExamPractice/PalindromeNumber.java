package com.practice.cognizantExamPractice;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int num = sc.nextInt();

		int rev = 0;

		int org_num = num;

		if (org_num <= 0) {
			System.out.println("Invalid input");
			return;
		}

		while (num > 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;

		}
		if (org_num == rev) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}

	}
}
