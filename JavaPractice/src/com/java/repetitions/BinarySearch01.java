package com.java.repetitions;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// search an element in array using binary search

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.println(Arrays.toString(arr));

		System.out.println("Enter a element to search : ");
		int key = sc.nextInt();

		int low = 0;
		int high = arr.length - 1;
		boolean status = false;
		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (arr[mid] == key) {
				System.out.println("Element Found in Array at index : " + mid);
				status = true;
				break;
			}
			if (arr[mid] < key) {
				low = mid + 1;
			}
			if (arr[mid] > key) {
				high = mid - 1;
			}
		}

		if (status == false) {
			System.out.println("Element not found in the Array");
		}

	}
}
