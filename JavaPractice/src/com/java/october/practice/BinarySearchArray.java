package com.java.october.practice;

import java.util.Scanner;

public class BinarySearchArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("Enter ele to search : ");
		int key = sc.nextInt();
		
		int low = 0;
		int high = arr.length - 1;
		
		boolean flag = false;
		
		while(low < high) {
			int mid = low + (high - low) / 2;
			
			if(arr[mid] == key) {
				System.out.println(key + " Element found at index : "+mid);
				flag = true;
				break;
			}
			if(arr[mid] < key) {
				low = mid + 1;
			}
			if(arr[mid] > key) {
				high = mid - 1;
			}
		}
		if(flag == false) {
			System.out.println("Element not found in array ");
		}

	}

}
