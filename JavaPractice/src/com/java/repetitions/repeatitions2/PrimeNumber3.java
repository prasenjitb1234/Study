package com.java.repetitions.repeatitions2;

import java.util.Scanner;

public class PrimeNumber3 {
	public static void main(String[] args) {
		
		// waf to check prime number
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a num : ");
		int num = sc.nextInt();
		
		boolean result = isPrime(num);
		
		if(result) {
			System.out.println(num+" is prime");
		}else {
			System.out.println(num+" is not prime");
		}
		
		
	}
	public static boolean isPrime(int num) {
		
		if(num <= 1) {
			return false;
		}
		
		for(int i= 2;i<=Math.sqrt(num);i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
