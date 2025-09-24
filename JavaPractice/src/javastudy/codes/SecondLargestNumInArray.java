package javastudy.codes;

import java.util.Arrays;

public class SecondLargestNumInArray {
	public static void main(String[] args) {

		int arr[] = { 10, 2, 5, 1, 4, 9, 7, 6, 8, 3 };

		Arrays.sort(arr);

		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		int secondMax = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > secondMax && arr[i] < max) {
				secondMax = arr[i];
			}
		}

		System.out.println("Second largest number in array is : " + secondMax);
	}
}
