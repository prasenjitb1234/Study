package com.leetcode;

import java.util.Arrays;

// Leetcode 34 - > using binary search 
public class FindFirstAndLastElementInSortedArray_02_BinarySearch {

	public static void main(String[] args) {

		int[] nums = { 1, 3, 5, 5, 5, 5, 67, 123, 125 };
		int target = 5;
		
		// Create an instance of the class to invoke non-static methods
        FindFirstAndLastElementInSortedArray_02_BinarySearch solution = new FindFirstAndLastElementInSortedArray_02_BinarySearch();
        int[] result = solution.searchRange(nums, target);

        // Print the result
        System.out.println(Arrays.toString(result)); // Expected Output: [2, 5]

	}

	public int[] searchRange(int[] nums, int target) {

		int left = findLeftBound(nums, target);
		int right = findRightBound(nums, target);

		return new int[] { left, right };

	}

	private int findLeftBound(int[] nums, int target) {
		int index = -1;
		int low = 0;
		int high = nums.length - 1;

		// standard binary search
		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (nums[mid] == target) {
				index = mid;
				high = mid - 1; // look in left sub array
			} else if (nums[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return index;
	}

	public int findRightBound(int[] nums, int target) {
		int index = -1;
		int low = 0;
		int high = nums.length - 1;

		// standard binary search
		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (nums[mid] == target) {
				index = mid;
				low = mid + 1; // look in the right sub array
			} else if (nums[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return index;
	}

}
