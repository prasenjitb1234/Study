package com.java.repetitions.repeatitions2;

import java.util.Arrays;

public class DuplicateNumberInArray {
	public static void main(String[] args) {

		int arr[] = { 5, 1, 2, 6, 8, 3, 2, 9 };

		duplicateNumber(arr);

	}

	public static int duplicateNumber(int arr[]) {

		Arrays.sort(arr);

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				System.out.println("Duplicate Number is : " + arr[i]);

			}
		}

		return 0;
	}
}
