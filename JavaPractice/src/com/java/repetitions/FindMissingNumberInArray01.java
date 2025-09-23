package com.java.repetitions;

import java.util.Arrays;

public class FindMissingNumberInArray01 {
	public static void main(String[] args) {
		// find missing number in an array 
		
		int arr[] = {1,2,3,4,5,6,8,9,10};
		
		System.out.println(Arrays.toString(arr));
		
		int sum1 =0;
		
		for(int i=0;i<arr.length;i++) {
			sum1 = sum1 + arr[i];
		}
		System.out.println("Sum of elements if array is : "+sum1);
		
		int sum2 = 0;
		
		for(int i=1;i<=10;i++) {
			sum2 = sum2 + i;
		}
		System.out.println("Sum of range of elements : "+sum2);
		
		System.out.println("Missing number is : "+(sum2 - sum1));
		
		
	}
}
