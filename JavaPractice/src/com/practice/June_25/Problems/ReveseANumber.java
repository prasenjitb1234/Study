package com.practice.June_25.Problems;

import java.util.Scanner;

public class ReveseANumber {
	public static void main(String[] args) {
		// wap to reverse a number 
		
		Scanner sc = new Scanner(System.in);
	
		
		System.out.println("Enter a number to rev : ");
		int num = sc.nextInt();
		
		int rev = 0;
		
		while(num > 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		
		System.out.println("Reversed Number is : "+rev);
		
	}
}
