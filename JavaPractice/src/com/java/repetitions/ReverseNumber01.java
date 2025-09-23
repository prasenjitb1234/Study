package com.java.repetitions;

import java.util.Scanner;

public class ReverseNumber01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// wap to reverse a number by taking i/p from user 
		
		System.out.println("Enter a num to reverse : ");
		int num = sc.nextInt();
		
		int rev = 0;
		
		while(num > 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("Reversed Number is : "+rev);
		
		
		

	}

}
