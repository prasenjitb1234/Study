package com.practice.one;

public class DuplicateElementsInArray {
	public static void main(String[] args) {
		
		String arr[] = {"java","python","c","java","javascript","go","c++","rust","php","sql","javascript","rust"};
		
		boolean status = false;
		
		for(int i=0;i<arr.length;i++) {
			for(int j = i + 1;j<arr.length;j++) {
				
				if(arr[i] == arr[j]) {
					System.out.println("Duplicate Element Found : "+arr[i]);
					status = true;
				}
			}
		}
		
		if(status == false) {
			System.out.println("Duplicate Elements Not found in the array !");
		}
		
				
		
	}
}
