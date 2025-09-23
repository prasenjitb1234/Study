package com.practice.one;

public class MissingNumberInArray {
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,7,8,9,10};
		
		int sum1 = 0;
		for(int i = 0;i<arr.length;i++) {
			sum1 = sum1 + arr[i];
		}
		System.out.println("Sum of Elements in Array is : "+sum1);
		
		int sum2 = 0;
		for(int i=1;i<=10;i++) {
			sum2 = sum2 + i;
		}
		
		System.out.println("Sum of Range of Elements in the Array is : "+sum2);
		
		System.out.println("Missing Number is : "+(sum2 - sum1));
		
		
	}
}
