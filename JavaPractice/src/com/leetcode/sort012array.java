package com.leetcode;

import java.util.Scanner;

public class sort012array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		int arr[] = new int[size];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		sort012(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

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
