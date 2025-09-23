package com.practice.one;

public class MaximumAndMinimumElementInArray {
	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40, 50 };

		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("maximum element in array is : " + max);

		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}

		System.out.println("minimum element in array is : " + min);

	}
}
