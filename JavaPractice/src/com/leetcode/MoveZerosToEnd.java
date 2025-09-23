package com.leetcode;

import java.util.Arrays;

public class MoveZerosToEnd {
	public static void main(String[] args) {
		
		
		int nums[] = {1,0,2,0,3,0,4,0,5,0,6};
		
		System.out.println("Before moving zeros : "+Arrays.toString(nums));
		
		moveZeros(nums);
		
		System.out.println("Ater moving zeros : "+ Arrays.toString(nums));
	}
	
	public static void moveZeros(int nums[]) {
		int insertPosition = 0;
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i] != 0) {
				nums[insertPosition] = nums[i];
				insertPosition++;
			}
		}
		while(insertPosition < nums.length) {
			nums[insertPosition] = 0;
			insertPosition++;
		}
	}
}
