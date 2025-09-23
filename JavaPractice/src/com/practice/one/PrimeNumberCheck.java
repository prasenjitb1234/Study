package com.practice.one;

import java.util.Scanner;

public class PrimeNumberCheck {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number to check if its Prime or Not : ");
		int num = sc.nextInt();
		
		boolean status = true;
		
		if(num <= 1) {
			status = false;
		}
		
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num % i == 0) {
				status = false;
			}
		}
		
		
		if(status == true) {
			System.out.println(num+" : is Prime Number");
		}
		else {
			System.out.println(num+" : is NOT Prime Number");
		}
		
	}
}
