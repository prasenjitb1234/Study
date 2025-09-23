package com.practice.June_25.Problems;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		
		int arr[] = {9,1,8,5,10,4,2,3,7,6};
		
		System.out.println("Before Sorting : "+ Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length - i - 1;j++) {
				if(arr[j] > arr[j + 1]) {
					// swap 
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
		System.out.println("AFter sorting : "+ Arrays.toString(arr));
		
		
	}
}
