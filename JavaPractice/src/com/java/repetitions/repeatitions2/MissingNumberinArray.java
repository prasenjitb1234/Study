package com.java.repetitions.repeatitions2;

public class MissingNumberinArray {
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,8,9,10};
		
		int sum1 = 0;
		
		for(int i=0;i<arr.length;i++) {
			sum1 = sum1 + arr[i];
		}
		
		System.out.println("sum of elements is : "+sum1);
		
		int sum2 = 0;
		
		for(int i=1;i<=10;i++) {
			sum2 = sum2 + i;
		}
		
		System.out.println("sum of range of elements is : "+sum2);
		
		
		System.out.println("Missing number is : "+(sum2 - sum1));
		
		
	}
}
