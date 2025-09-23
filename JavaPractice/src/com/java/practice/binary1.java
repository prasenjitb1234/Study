package com.java.practice;

public class binary1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {10,20,30,40,50,60,70,80,90};
		
		int key = 30;
		
		boolean flag = false;
		
		int low = 0;
		int high = a.length;
		
		while(low < high) {
			int mid = low + (high - low)/2;
			
			if(a[mid]==key) {
				System.out.println(a[mid]+" : Element found in array ");
				flag = true;
				break;
			}
			if(a[mid] < key) {
				low = mid + 1;
			}
			if(a[mid] > key) {
				high = mid -1;
			}
		}
		
		if(flag == false) {
			System.out.println("Element NOT found");
		}
	}

}
