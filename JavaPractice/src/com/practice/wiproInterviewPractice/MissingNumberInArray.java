package com.practice.wiproInterviewPractice;

public class MissingNumberInArray {
	public static void main(String[] args) {
		
		int arr[] = {1,2,4,5};
		
		int sum1 = 0;
		for(int i=0;i<arr.length;i++) {
			sum1 = sum1 + arr[i];
		}
		
		System.out.println("Sum of elements in array is : "+sum1);
		
		int sum2 = 0;
		
		for(int i=1;i<=5;i++) {
			sum2 = sum2 + i;
		}
		System.out.println("sum of range of elements in array is : "+sum2);
		
		System.out.println("Missing Number is : " +(sum2 - sum1));
		
	}
}
