package com.java.repetitions;

import java.util.Scanner;

public class PrimeNumber01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// enter a number to check if its prime or not

		System.out.println("Enter a number : ");
		int num = sc.nextInt();

		int count = 0;

		if (num > 1) {
			// check rest
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println("Prime number");
			} else {
				System.out.println("Not a Prime number");
			}
		} else {
			System.out.println("Not a prime number");
		}

	}
}
