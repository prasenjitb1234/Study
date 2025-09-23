package com.leetcode;

import java.util.Scanner;

public class SearchInRotatedSortedArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		System.out.println("Enter array elements (rotated) : ");
		int nums[] = new int[size];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}

		System.out.println("Enter element to search: ");
		int target = sc.nextInt();

		// store the result and print it

		int result = search(nums, target);
		if (result != -1) {
			System.out.println("Element found at index: " + result);
		} else {
			System.out.println("Element not found.");
		}

	}

	public static int search(int[] nums, int target) {
		int start = 0;
		int end = nums.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (nums[mid] == target) {
				return mid;
			}

			if (nums[start] <= nums[mid]) {
				if (nums[start] <= target && target <= nums[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			} else {
				if (nums[mid] <= target && target <= nums[end]) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			}

		}
		return -1;
	}

}
