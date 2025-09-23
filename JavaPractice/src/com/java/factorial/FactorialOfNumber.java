package com.java.factorial;

import java.util.Scanner;

public class FactorialOfNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		// 5 ! = 1 * 2 * 3 * 4 * 5 = 120
		
		
		int num = 5;
		
		long factorial = 1;
		
		for(int i=1;i<=num;i++) {
			factorial = factorial * i; 		 // 1 2 6 24 120
			
		}
		System.out.println("Factorial of Number is : "+factorial);
		
		
		
		
		
	}
}
