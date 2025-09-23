package com.java.october.practice;

import java.util.Scanner;

public class CountNumofDigitsInNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int num = 123456;
		int count = 0;
		
		while(num > 0) {
			num = num / 10;
			count++;
		}
		System.out.println("num of digits : "+count);
		
		
	}
}
