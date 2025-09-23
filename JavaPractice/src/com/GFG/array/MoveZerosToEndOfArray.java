package com.GFG.array;

import java.util.Scanner;

public class MoveZerosToEndOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array : ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter array elements : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		// display the origin array
		System.out.println("Original Array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();

		// Move zeros to the end
		movezeros(arr);

		// Display the modified array
		System.out.println("Array after moving zeros to the end: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void movezeros(int arr[]) {
		int insertPosition = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[insertPosition] = arr[i];
				insertPosition++;
			}
		}

		while (insertPosition < arr.length) {
			arr[insertPosition++] = 0;
		}

	}

}
