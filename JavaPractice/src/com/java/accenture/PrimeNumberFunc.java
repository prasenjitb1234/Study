package com.java.accenture;

import java.util.Scanner;

public class PrimeNumberFunc {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		
		if(Prime(n)) {
			System.out.println(n+" is Prime number ");
		}
		else {
			System.out.println(n+" is NOT PRIME number");
		}
	}
	
	public static boolean Prime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2;i<Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}
