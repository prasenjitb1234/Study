package com.practice.one;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] =  {90,10,50,30,20,40,60,70,80,100};
		
		System.out.println("Array is : "+ Arrays.toString(arr));
		
		System.out.println("Enter an Element to Search in Array : ");
		int key = sc.nextInt();
		boolean flag = false;
		
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] == key) {
				System.out.println(key+" Element Found at index : "+i);
				flag = true;
				break;
			}
		}
		
		if(flag == false) {
			System.out.println(key+" Element Not Found the Array ");
		}
		
		
		
		
	}
}	
