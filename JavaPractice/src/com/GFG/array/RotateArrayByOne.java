package com.GFG.array;

import java.util.Arrays;

public class RotateArrayByOne {

	public static void main(String[] args) {
		

		int arr[] = { 1, 2, 3, 4, 5 };

		rotate(arr);
		System.out.println(Arrays.toString(arr));

	}

	public static void rotate(int arr[]) {

		int n = arr.length;

		rotateArray(arr, 0, n - 1);
		rotateArray(arr, 0, 0);
		rotateArray(arr, 1, n - 1);
	}

	public static void rotateArray(int arr[], int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
}
