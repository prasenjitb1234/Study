package com.practice.wiproInterviewPractice;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number to check Prime Number or not : ");
		int num = sc.nextInt();
		
		boolean result = isPrime(num);
		
		if(result) {
			System.out.println(num+" is Prime Number");
		}else {
			System.out.println(num+" is Not Prime Number");
		}
		
		
	}
	public static  boolean isPrime(int num) {
		
		if(num <=1 ) {
			return false;
		}
		
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
		
		
	}
}
