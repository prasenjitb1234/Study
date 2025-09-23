
package com.java.repetitions.repeatitions2;

import java.util.HashSet;

public class FindDuplicateElementInArrayHashSet {
	public static void main(String[] args) {
		String arr[] = { "java", "python", "javascript", "c++", "python", "c", "javascript" };

		HashSet<String> set = new HashSet<>();
		boolean status = false;

		for (String str : arr) {
			if (set.contains(str)) {
				System.out.println("Duplicate element found in array: " + str);
				status = true;
			} else {
				set.add(str);
			}
		}

		if (!status) {
			System.out.println("Duplicate element not found in the array");
		}
	}
}
