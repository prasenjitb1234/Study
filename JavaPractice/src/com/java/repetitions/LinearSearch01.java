package com.java.repetitions;

import java.util.Scanner;

public class LinearSearch01 {
	public static void main(String[] args) {
		// Search an element in Array using linear search 
		
		Scanner sc = new Scanner(System.in);
		int arr[] = {7, 3, 10, 1, 6, 8, 2, 9, 4, 5};
		
		System.out.println("Enter search element : ");
		int key = sc.nextInt();
		
		boolean flag = false;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == key) {
				flag = true;
				System.out.println(key+ " : Element found in the Array at index "+i);
				break;
			}
		}
		
		if(flag == false) {
			System.out.println("Element Not found in the Array ");
		}
		
		
		
	}
}
