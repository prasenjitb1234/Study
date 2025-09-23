package com.java.repetitions.repeatitions2;

public class BinarySearch01 {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,8,9};
		
		int target = 8;
		
		int low =0;
		int high = arr.length - 1;
		
		
		boolean status = false;
		while(low <= high) {
			int mid = low + (high - low)/2;
			
			if(arr[mid] == target) {
				System.out.println("Element found at index : "+mid);
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
			System.out.println(target + " Element not found in array ");
		}
		
		

	}

}
