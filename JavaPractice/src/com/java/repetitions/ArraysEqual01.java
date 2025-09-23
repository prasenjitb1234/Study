package com.java.repetitions;

public class ArraysEqual01 {
	public static void main(String[] args) {

		// check if two arrays are equal

		int a1[] = { 1, 2, 3, 4, 5 };
		int a2[] = { 1, 2, 3, 4, 5};

		boolean status = true;
		if (a1.length == a2.length) {
			// check rest
			for (int i = 0; i < a1.length; i++) {
				if (a1[i] != a2[i]) {

					status = false;

				}
			}
		} else {
			status = false;
		}

		if (status == true) {
			System.out.println("Arrays are equal");
		} else {
			System.out.println("Arrays are not equal ");
		}

	}
}
