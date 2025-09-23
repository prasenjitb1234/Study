package com.java.october.practice;

import java.util.Scanner;

public class ReverseANumber {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		// reverse a number 
		
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		int rev = 0;
		
		while(num !=0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("Reversed number is : "+rev);
		
	}
	

}
