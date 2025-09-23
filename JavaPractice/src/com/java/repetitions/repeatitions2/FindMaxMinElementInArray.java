package com.java.repetitions.repeatitions2;

public class FindMaxMinElementInArray {
	public static void main(String[] args) {
		
		
		int arr[] = {90,40,50,20,30,10,60,80,60};
		
		int max = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		int min = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
			
		System.out.println("Max element is  : "+max);
		System.out.println("Min element is : "+min);
		
	}
}
