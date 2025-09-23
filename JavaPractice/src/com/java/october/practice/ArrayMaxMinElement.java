package com.java.october.practice;

public class ArrayMaxMinElement {

	public static void main(String[] args) {
		
		// find max & min ele from array .
		
		int arr[] = {40,20,30,50,10};
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Minimum ele : "+min);
		System.out.println("Maximum ele : "+max);

	}

}
