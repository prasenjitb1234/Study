package com.leetcode.binary;

public class missingNumber_268 {
	
	public static  int missingNumber(int[]nums) {
		int n = nums.length;
		
		int sum1 = 0;
		for(int i=0;i<n;i++) {
			sum1 = sum1 + nums[i];
		}
		System.out.println("sum of array : "+sum1);
		
		int sum2 = 0;
		
		for (int i = 0; i <= n; i++) { 
            sum2 += i;
        }
		
		return sum2-sum1;
		
	}

	public static void main(String[] args) {
		
		missingNumber_268 miss = new missingNumber_268();
		
		int nums1[] = {0,1,3};
		
		System.out.println(miss.missingNumber(nums1));
		

	}

}
