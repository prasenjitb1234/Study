package com.java.repetitions;

import java.util.Arrays;

public class BubbleSort01 {
	public static void main(String[] args) {
		
		int arr[] = {15, 3, 8, 19, 1, 12, 6, 18, 2, 14, 20, 7, 11, 9, 16, 4, 10, 5, 17, 13};
		
		System.out.println("Before sorting : "+Arrays.toString(arr));
		for(int i=0;i<arr.length - 1;i++) {
			for(int j=0;j<arr.length - 1 - i;j++) {
				if(arr[j] > arr[j+1]) {
					// swap
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("After sorting : " +Arrays.toString(arr));
		
		
	}
}
