package com.java.october.practice;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {10,20,30,40,50};
		
		int key = 30;
		boolean flag = false;
		for(int i=0;i<arr.length;i++) {
			if(key == arr[i]) {
				System.out.println(key+" found at index : "+i);
				flag = true;
				break;
			}
		}
		
		if(flag == false) {
			System.out.println("Element not found in array. ");
		}
		
		
		

	}

}
