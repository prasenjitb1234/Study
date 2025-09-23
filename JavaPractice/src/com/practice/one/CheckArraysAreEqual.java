package com.practice.one;

import java.util.Arrays;

public class CheckArraysAreEqual {
	public static void main(String[] args) {
		
		int arr1[] = {1,2,3,4,5};
		int arr2[] = {1,2,3,4,6};
		
		boolean status = true;
		
		if(arr1.length == arr2.length) {
			// compare rest of elements
			for(int i =0;i<arr1.length;i++) {
				if(arr1[i] != arr2[i]) {
					status = false;
					break;
				}
			}
		}
		else {
			status = false;
		}
		
		if(status == true) {
			System.out.println(Arrays.toString(arr1) + " and \n" + Arrays.toString(arr2) + "\n: Arrays are Equal");
		}
		else {
			System.out.println(Arrays.toString(arr1) + " and \n" + Arrays.toString(arr2) + "\n: Arrays are not Equal");
		}
		
	}
}
