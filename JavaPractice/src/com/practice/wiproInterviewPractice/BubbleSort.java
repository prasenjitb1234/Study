package com.practice.wiproInterviewPractice;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {1, 10, 5, 2, 9, 3, 8, 4, 7, 6};
		
		System.out.println("Before Sorging : "+Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length - 1;j++) {
				if(arr[j] > arr[j+1]) {
					// swap 
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println("After Sorting : "+ Arrays.toString(arr));
		

	}
}
