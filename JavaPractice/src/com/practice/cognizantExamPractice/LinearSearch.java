package com.practice.cognizantExamPractice;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {20,10,40,30,50};
		System.out.println("Arrays is : "+Arrays.toString(arr));
		
		System.out.println("Enter an element to search : ");
		int key = sc.nextInt();
		
		boolean status = false;
		
		
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == key) {
				System.out.println("Element found at index : "+i);
				status = true;
				break;
			}
		}
		
		if(status == false) {
			System.out.println("Element Not found in the array ! ");
		}
		
		
	}
}
