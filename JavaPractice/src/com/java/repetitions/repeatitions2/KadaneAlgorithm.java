package com.java.repetitions.repeatitions2;

public class KadaneAlgorithm {
	public static void main(String[] args) {
		
		
		int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
		
		int maxSum = maximumSubarray(nums);
		
		System.out.println("Maximum Subarray Sum: " + maxSum);
		
	}
	
	public static int maximumSubarray(int nums[]) {
		
		int sum = 0;
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<nums.length;i++) {
			sum = sum + nums[i];
			max = Math.max(max, sum);
			
			if(sum < 0) {
				sum = 0;
			}
		}
		
		return max;
		
	}
}
