package com.practice;

public class SearchElementLinearSearch {

	public static void main(String[] args) {

		// elements can be in sorted, unsorted , or in any order ==> linear search

		int a[] = { 10, 20, 40, 50, 30 };
		int key = 50;

		boolean flag = false;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == key) {
				System.out.println(key + " Element found at index : " + i);
				flag = true;
				break;
			}

		}
		if (flag == false) {
			System.out.println("Element Not found");
		}

	}

}
