package com.GFG.array;

import java.util.Scanner;


public class Sort012Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		int arr[] = new int[size];

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		sort012(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	// Method to sort an array of 0s, 1s, and 2s

	public static void sort012(int arr[]) {

		int zero = 0;
		int one = 0;
		int two = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				zero++;
			}
			if (arr[i] == 1) {
				one++;
			}
			if (arr[i] == 2) {
				two++;
			}
		}

		for (int i = 0; i < zero; i++) {
			arr[i] = 0;
		}
		for (int i = zero; i < one + zero; i++) {

			arr[i] = 1;
		}
		for (int i = one + zero; i < arr.length; i++) {
			arr[i] = 2;
		}

	}

}
