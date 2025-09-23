package com.practice.one;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {100,20,50,10,70,30,80,40,90,60};
		
		System.out.println("Array Before Sortin : "+Arrays.toString(arr));
		
		for(int i = 0;i<arr.length - 1;i++) {
			for(int j = 0;j<arr.length - 1;j++) {
				if(arr[j] > arr[j + 1]) {
					// swap 
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println("Array after sorting : "+Arrays.toString(arr));
		
		
		
	}
}
