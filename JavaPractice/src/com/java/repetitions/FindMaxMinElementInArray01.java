package com.java.repetitions;

import java.util.Arrays;

public class FindMaxMinElementInArray01 {
	public static void main(String[] args) {

		int arr[] = { 50, 10, 60, 20, 40, 30, 100, 70, 90, 80 };
		
		System.out.println(Arrays.toString(arr));
		System.out.println("*****\n");
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}

		System.out.println("Max element is : " + max);
		System.out.println("Min element is : " + min);

	}
}
