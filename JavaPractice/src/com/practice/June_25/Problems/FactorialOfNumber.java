package com.practice.June_25.Problems;

public class FactorialOfNumber {

	public static void main(String[] args) {
		int num = 5;
		long factorial = 1;

		for (int i = 1; i <= num; i++) {
			factorial = factorial * i;
		}

		System.out.println("Factorial of Number is : " + factorial);
	}

}
