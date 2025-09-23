package com.practice.cognizantExamPractice;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		
		int arr[] = {20,50,60,10,40,30};
		
		System.out.println("Before Sorting : "+Arrays.toString(arr));
		
		for(int i=0;i<arr.length - 1;i++) {
			for(int j=0;j<arr.length - 1;j++) {
				if(arr[j] > arr[j + 1]) {
					// swap
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println("After Sorting : "+Arrays.toString(arr));
		
	}
}
