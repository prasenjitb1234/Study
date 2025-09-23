package com.practice;

import java.util.Scanner;

public class palindromeNumber {

	public static void main(String[] args) {
		// check whether the number is palindrome or not 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		
		int org_num = num;
        int rev = 0;

        // Loop to reverse the number
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }

        // Check if the original number and reversed number are the same
        if (org_num == rev) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }

	}

}
