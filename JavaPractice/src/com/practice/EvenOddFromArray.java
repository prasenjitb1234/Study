package com.practice;

public class EvenOddFromArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6 };

		// extracting even nums
		System.out.println("Even numbers is array : ");
		for (int i = 0; i < a.length; i++) { // 6
			if (a[i] % 2 == 0) {
				System.out.println(a[i]);
			}
		}
		System.out.println("Odd numbers is array : ");

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				System.out.println(a[i]);
			}
		}

	}

}
