package com.java.repetitions;

import java.util.Scanner;

public class CountEvenOddDigitsInNumber01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number (min 2 digits) : ");
		int num = sc.nextInt();
		
		int even_count = 0;
		int odd_count = 0;
		
		while(num > 0) {
			int rem = num % 10;
			if(rem % 2 ==0) {
				even_count++;
			}
			else {
				odd_count++;
			}
			num = num / 10;
		}
		System.out.println("Even : "+even_count);
		System.out.println("Odds : "+odd_count);
		
		
		
		
		
		
		
	}
}
