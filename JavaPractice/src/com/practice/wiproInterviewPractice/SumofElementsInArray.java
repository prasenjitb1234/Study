package com.practice.wiproInterviewPractice;

public class SumofElementsInArray {
	public static void main(String[] args) {
		
		int arr[] = {4,2,5,1,3};
		
		int sum = 0;
		
		for(int i=0;i<=arr.length - 1;i++) {
			sum = sum + arr[i];
		}
		
		System.out.println("sum of elements is : "+sum);
		
	}
}
