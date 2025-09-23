package com.practice;

import java.util.Arrays;
import java.util.Scanner;

public class SearchElementBinarySearch {

	public static void main(String[] args) {
		// elements needed to be in a sorted order
		Scanner sc = new Scanner(System.in);

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.println(Arrays.toString(a));

		System.out.println("Enter element to search : ");
		int key = sc.nextInt();

		int low = 0;
		int high = a.length - 1;

		boolean flag = false;

		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (a[mid] == key) {
				System.out.println(key + " : Element found in array at index :  "+mid);
				flag = true;
				break;
			}
			if (a[mid] < key) {
				low = mid + 1;
			}
			if (a[mid] > key) {
				high = mid - 1;
			}

		}
		if (flag == false) {
			System.out.println("Element Not found in array ");
		}

	}

}
