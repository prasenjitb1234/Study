package com.java.prime;

public class PrimeNumberOptimized {
	public static void main(String[] args) {
		
		int num = 3;   // number to check
		
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
			System.out.println(num+" is prime number");
		}else {
			System.out.println(num+" is Not prime number");
		}
		
		
	}
}
