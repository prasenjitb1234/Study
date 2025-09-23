package com.java.repetitions.repeatitions2;

import java.util.Arrays;

public class BubbleSort01 {
	public static void main(String[] args) {
		
		// bubble sort 
		
		int arr[] = {9,1,5,7,2,3,6,8,4,10};
		
		for(int i=0;i<arr.length - 1;i++) {
			for(int j=0;j<arr.length - 1;j++) {
				if(arr[j] > arr[j+1]) {
					// swap
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		
	}
}	
