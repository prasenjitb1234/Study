package com.java.repetitions;

import java.util.Scanner;

public class CountNumberofDigitsInNumber01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// count number of digits in a number 
		
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int org_num = num;
		int count = 0;
		
		while(num > 0) {
			num = num / 10;
			count++;
		}
		System.out.println("Number of digits in "+org_num+" are : "+count);
		
		
	}
}
