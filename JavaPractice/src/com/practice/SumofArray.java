package com.practice;

import java.util.Scanner;

public class SumofArray {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a[] = { 5, 2, 7, 9, 6 }; // n-5
		int sum = 0;

		for (int i = 0; i <= a.length - 1; i++) {
			sum = sum + a[i];
		}
		System.out.println("Sum of Arrays elements : " + sum);

	}
}
