package com.java.count;

import java.util.Scanner;

public class CountNumOfDigitsInNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		int num = 123456;
		int count = 0;
		
		while(num > 0) {
			num = num / 10;
			count++;
		}
		
		System.out.println("Number of Digits: "+count);
		
		
		
		
		
	}

}
