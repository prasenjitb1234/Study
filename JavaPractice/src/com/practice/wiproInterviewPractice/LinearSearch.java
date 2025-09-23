package com.practice.wiproInterviewPractice;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {12, 45, 23, 9, 34, 67, 89, 2, 15, 30};
		
		System.out.println(Arrays.toString(arr) +" \n");
		
		System.out.println("Enter an Element to Search : ");
		int key = sc.nextInt();
		
		boolean status = false;
		
		for(int i=0;i<=arr.length - 1;i++) {
			if(arr[i] == key) {
				System.out.println(key + " Element found at index : "+i);
				status = true;
				break;
			}
		}
		
		if(status == false) {
			System.out.println(key + " Element not found in array ! ");
		}
		
		
		
		
	}
}
