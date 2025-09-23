package com.java.sort;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int a[] = {4,2,1,5,3};
		System.out.println("before sorting : "+ Arrays.toString(a));
		
		int n = a.length;
		
		for(int i=0;i<n-1;i++) { // number of passes
			for(int j = 0;j<n-1;j++) {  // iterations in each pass
				if(a[j] > a[j+1]) {
					// swap
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
		
		System.out.println("After soring: "+Arrays.toString(a));
		
		
		
	}
}
