package com.java.conversion;

import java.util.Scanner;

public class BinaryToDecimal {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter binary number: ");
		int binary = sc.nextInt();
		
		int decimal = 0;
		
		int n = 0;
		
		while(binary > 0) {
			int temp = binary % 10;  // get last digit 
			decimal += temp * Math.pow(2, n);
			binary = binary / 10;
			n++;
		}
		System.out.println("Decimal number is : "+ decimal);
		
		
	}
}
