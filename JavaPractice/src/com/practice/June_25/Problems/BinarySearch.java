package com.practice.June_25.Problems;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("Enter an element to search : ");
		int target = sc.nextInt();
		
		int low = 0;
		int high = arr.length - 1;
		
		boolean status = false;
		
		while(low <= high) {
			int mid = low + (high - low)/2;
			
			if(arr[mid] == target) {
				System.out.println(target+" element found at index "+mid);
				status = true;
				break;
			}
			if(arr[mid] < target) {
				low = mid + 1;
			}
			if(arr[mid] > target) {
				high = mid - 1;
			}
		}
		
		if(status == false) {
			System.out.println(target+" Element not found in array ! ");
		}
		
	}
}
