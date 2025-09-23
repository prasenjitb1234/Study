package com.practice.June_25.Problems;

public class FindMissingNumberInArray {
	public static void main(String[] args) {
		
		int arr[] = { 1,2,4,5};
		int n = 5;
		
		int sum1 = 0;
		for(int i=0;i<arr.length;i++) {
			sum1 = sum1 + arr[i];
		}
		
		System.out.println("sum of element in array : "+sum1);
		
//		int sum2 = 0;
//		for(int i=1;i<=5;i++) {
//			sum2 = sum2 + i;
//		}
		
		int sum2 = n * ( n + 1) /2;
		
		System.out.println("sum of range of elements : "+sum2);
		
		System.out.println("Missing number is : "+(sum2 - sum1));
		
	}
}
