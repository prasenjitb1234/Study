package com.java.repetitions;

import java.util.Scanner;

public class PrimeNumber02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

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
				System.out.println("Not prime number ");
			}
		} else {
			System.out.println("Not a prime number");
		}

	}
}
