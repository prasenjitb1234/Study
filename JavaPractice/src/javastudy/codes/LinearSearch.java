package javastudy.codes;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {

		int arr[] = { 1, 2, 5, 3, 10, 6, 8, 7, 9, 4 };

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter element to search : ");
		int target = sc.nextInt();

		boolean status = false;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				System.out.println(target + " Element found at index : " + i);
				status = true;
				break;
			}

		}

		if (!status) {
			System.out.println(target + " not found in array");
		}

	}
}
