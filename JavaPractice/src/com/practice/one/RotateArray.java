package com.practice.one;

import java.util.Arrays;

public class RotateArray {
	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int k = 3;

		rotate(arr, k);
		System.out.println("Rotated Array is : " + Arrays.toString(arr));

	}

	public static void rotate(int arr[], int k) {
		int n = arr.length;
		k = k % n;

		reverseNums(arr, 0, n - 1);
		reverseNums(arr, 0, k - 1);
		reverseNums(arr, k, n - 1);

	}

	public static void reverseNums(int arr[], int start, int end) {
		while(start < end) {
			
		
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		start++;
		end--;
		}
	}
}
