package com.practice.one;

public class MissingNumberInArray2 {
	public static void main(String[] args) {
		

		int arr[] = {10,20,40,50,60,70,80,90,100};  // here the values are muliples of 10
		int n = 10;
		
		int sum1 = 0;
		for(int i=0;i<arr.length;i++) {
			sum1 = sum1 + arr[i];
		}
		
		System.out.println("Sum of elements in Array is : "+sum1);
		
		int sum2 = 10 *  n * (n + 1)/2;
		
		System.out.println("sum of range of elements of array is : "+sum2);
		
		System.out.println("Missing Number is : "+ (sum2 - sum1));
		
	}
}
