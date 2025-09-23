package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int nums[] = {2, 7, 11, 15};
        int target = 9;
        
        TwoSum obj = new TwoSum();
        
     // Call the twoSum method and store the result
        int[] result = obj.twoSum(nums, target);

        // Print the result
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");

	}
	
	// Method to find two numbers that add up to the target
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store numbers and their indices
        Map<Integer, Integer> map = new HashMap<>();

        // Loop through the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement
            int complement = target - nums[i];

            // Check if the complement is already in the map
            if (map.containsKey(complement)) {
                // Return the indices of the complement and current number
                return new int[]{map.get(complement), i};
            }

            // Add the current number and its index to the map
            map.put(nums[i], i);
        }

        // Return an empty array if no solution is found (not required in this problem)
        return new int[0];
    }

}
