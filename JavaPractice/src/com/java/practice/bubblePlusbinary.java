package com.java.practice;

import java.util.Arrays;
import java.util.Scanner;

public class bubblePlusbinary {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int arr[] = { 14, 7, 19, 2, 10, 15, 4, 18, 1, 11, 6, 20, 8, 5, 12, 3, 13, 16, 17, 9 };

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		System.out.println("sorted : " + Arrays.toString(arr));

		System.out.println("Enter a num : ");
		int key = sc.nextInt();

		int low = 0;
		int high = arr.length - 1;
		boolean flag = false;

		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (arr[mid] == key) {
				System.out.println(arr[mid] + " Element found at index : " + mid);
				flag = true;
				break;
			}

			if (arr[mid] < key) {
				low = mid + 1;
			}
			if (arr[mid] > key) {
				high = mid - 1;
			}
		}
		if (flag == false) {
			System.out.println("Element not found");
		}
	}
}
