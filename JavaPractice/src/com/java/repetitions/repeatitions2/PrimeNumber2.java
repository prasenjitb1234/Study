package com.java.repetitions.repeatitions2;

public class PrimeNumber2 {
	public static void main(String[] args) {
		
		int num = 3;
		
		boolean status = true;
		
		if(num <=1) {
			status = false;
		}
		
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num % i == 0) {
				status = false;
			}
		}
		
		if(status == true) {
			System.out.println(num+" : is a prime number");
		}else {
			System.out.println(num+" : is Not a prime number ");
		}
		
		
	}
}
