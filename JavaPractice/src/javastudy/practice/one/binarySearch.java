package javastudy.practice.one;

import java.util.Scanner;

public class binarySearch {
	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number to search : ");
		int target = sc.nextInt();

		int low = 0;
		int high = arr.length - 1;

		boolean status = false;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] == target) {
				System.out.println(target + " Element found at index : " + mid);
				status = true;
				break;
			}
			if (arr[mid] < target) {
				low = mid + 1;
			}
			if (arr[mid] > target) {
				high = mid - 1;
			}
		}

		if (status == false) {
			System.out.println(target + " Element not found in the array ");

		}

	}

}
