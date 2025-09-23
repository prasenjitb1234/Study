package com.practice.wiproInterviewPractice;

public class MaxandMinElementInArray {
	public static void main(String[] args) {
		
		int arr[] = {30,10,100,70,20,40,60,50,90};
		
		int max = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Maximum element is : "+max);
		
		int min = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		
		System.out.println("Minimum element is : "+min);
		
		
		
	}
}
