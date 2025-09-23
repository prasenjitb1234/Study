package com.java.october.practice;

import java.util.Scanner;

public class CountSumofDigitsInNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		int num = 1234;
//		int num = sc.nextInt();   // 1234
		
		int sum = 0;
		
		while(num > 0) {
			sum = sum + num % 10;
			num = num / 10;
		}
		System.out.println("sum of digits: "+sum);
		
		
	}

}
