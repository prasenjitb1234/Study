package com.java.repetitions.repeatitions2;

public class FindDuplicateElementInArray {
	public static void main(String[] args) {

		String arr[] = { "java", "python", "c++", "javascript", "c", "java", "python" };

		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				
				if(arr[i] == arr[j]) {
					System.out.println("Duplicate Element found : "+arr[i]);
					flag = true;
				}
			}
		}
		
		if(flag == false) {
			System.out.println("Duplicate Element not found");
		}

	}
}
