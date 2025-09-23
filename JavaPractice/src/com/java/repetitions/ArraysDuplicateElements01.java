package com.java.repetitions;

import java.util.Scanner;

public class ArraysDuplicateElements01 {
	public static void main(String[] args) {
		// find duplicate elements in an array

		Scanner sc = new Scanner(System.in);

		String arr[] = { "java", "python", "javascript", "c", "c++", "rust", "go", "c", "sql", "go","java" };

		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("Duplicate Element found : " + arr[i]);
					flag = true;

				}
			}
		}
		if (flag == false) {
			System.out.println("No Duplicate Element found");
		}

	}
}
