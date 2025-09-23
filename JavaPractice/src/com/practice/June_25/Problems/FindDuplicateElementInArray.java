package com.practice.June_25.Problems;

public class FindDuplicateElementInArray {
	public static void main(String[] args) {
		
		String arr[] = {"java","python","c++","c","go","rust","c++","python" };
		
		boolean status = false;
		for(int i=0;i<arr.length;i++) {
			for(int j = i + 1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					System.out.println("Found Duplicate Element : "+arr[i]);
					status = true;
				}
			}
		}
		if(status == false) {
			System.out.println("No Duplicate element found in array !");
		}
		
		
	}
}
