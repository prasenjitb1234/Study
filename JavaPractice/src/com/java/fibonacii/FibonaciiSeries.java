package com.java.fibonacii;

public class FibonaciiSeries {

	public static void main(String[] args) {

//	 series  : 0 1 		1 2 3 5 8 13 21 34

		int n1 = 0;
		int n2 = 1;
		int sum = 0;

		System.out.println(n1 + " " + n2); // 0 1

		for (int i = 2; i < 10; i++) {
			sum = n1 + n2; // 1
			System.out.println(" " + sum);
			n1 = n2;
			n2 = sum;
		}
		
		

	}

}
