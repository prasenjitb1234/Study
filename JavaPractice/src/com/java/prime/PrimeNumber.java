package com.java.prime;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		Condition: 
//		  Number > 1 ; 
//		  number only has 2 factors : 1 and itself ;
//		 **********************

		int num = 3;
		int count = 0;

		if (num > 1) {

			for (int i = 1; i <= num; i++) {
				
				if (num % i == 0) {
					count++;
				}
			}

			if (count == 2) {
				System.out.println("Prime number");
			} else {
				System.out.println("Not Prime Number");
			}
		} 
		else {
			System.out.println("Not Prime Number");
		}

		
		
		
	}

}
