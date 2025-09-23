package com.java.search;

// binary search is faster than linear search

import java.util.Scanner;
public class BinarySearch {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		// array should be in sorted order 
		// startIndex  	MinIndex 	EndInd
		
		/*
		 case 1:   key == mid
		 case 2:   key > mid 	  L = mid +1
		 case 3:   key < mid 	  H = mid -1
		*/
//		****************
		
		
		int a[] = {1,2,3,4,5,6,7,8,9,10};  // sorted order
		
		boolean flag = false;
		int key = 5;  //  element to  search
		
		int l = 0;
		int h = a.length-1;
		
		while(l<=h) {
			int m = (l + h )/2;
			
			if(a[m] == key) {
				System.out.println("Element found");
				flag = true;
				break;
			}
			
			if(a[m] < key) {
				l = m+1;
			}
			if(a[m] > key) {
				h = m-1;
			}
		}
		
		if(flag == false) {
			System.out.println("Element not found");
		}
		
		
		
		
		
		
		
		
	}

}
