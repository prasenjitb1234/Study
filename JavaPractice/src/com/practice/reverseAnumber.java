package com.practice;

import java.util.Scanner;

public class reverseAnumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		// program to reverse a number 
		
		System.out.println("Enter a Number to reverse : ");
		int num = sc.nextInt();
		
		int rev = 0;
		
		while( num > 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		
		System.out.println("Reversed Number is : "+ rev);
		

	}

}
