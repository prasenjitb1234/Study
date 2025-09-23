package com.practice.wiproInterviewPractice;

import java.util.Scanner;

public class palindromeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number to check Palindrome : ");
		int num = sc.nextInt();
		
		int rev = 0;
		
		int org_num = num; 
		
		while( num > 0) {
			rev = rev * 10 + num % 10; 
			num = num/ 10;
			
			
		}
		if(org_num == rev) {
			System.out.println(org_num+" is a Palindrome number");
		}else {
			System.out.println(org_num+" is NOT A Palindrome Number ");
		}
		
	}
}
