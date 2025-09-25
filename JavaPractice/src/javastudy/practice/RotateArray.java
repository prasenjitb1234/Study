package javastudy.practice;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {

	public static void rotatearr(int arr[], int k) {

		int n = arr.length;

		k = k % n;

		reverseNums(arr, 0, n - 1);
		reverseNums(arr, 0, k - 1);
		reverseNums(arr, k, n - 1);

	}

	public static void reverseNums(int arr[], int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };

		System.out.println(Arrays.toString(arr));

		System.out.println("Enter k : ");
		int k = sc.nextInt();

		rotatearr(arr, k);

		System.out.println("Rotated array is : "+Arrays.toString(arr));
	}
}
