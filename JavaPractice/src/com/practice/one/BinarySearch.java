package com.practice.one;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {10,20,30,40,50,60,70,80,90,100};
		
		System.out.println("Array is  : "+Arrays.toString(arr));
		
		System.out.println("Enter an Element to Search in the Array : ");
		int key = sc.nextInt();
		
		int low = 0;
		int high = arr.length - 1;
		
		boolean flag = false;
		
		while(low <= high) {
			int mid = low + (high - low)/2;
			
			if(arr[mid] == key) {
				System.out.println(key+ " : Element found at index : "+mid);
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
			System.out.println(key + " : Element Not found in the Array !");
		}
		
		
		
	}
}
