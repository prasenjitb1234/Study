package com.practice.June_25.Problems;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {30,10,40,80,60,20,90,100};
		
		System.out.println(Arrays.toString(arr) +" \n");
		
		System.out.println("Enter an element to search in array : ");
		int key = sc.nextInt();
		
		boolean status = false;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i] == key) {
					System.out.println(key+" element found at index : "+i);
					status = true;
					break;
				}
			}
		}
		if(status == false) {
			System.out.println(key+ " Element not found in array ! ");
		}
		
		
		
		
	}
}
