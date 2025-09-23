package com.java.october.practice;

import java.util.Scanner;

public class armstrongNumber {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		int org_num, rem, result = 0;
		
		org_num = num;
		
		while(org_num != 0) {
			rem = org_num  % 10;
			result += Math.pow(rem, 3);
			org_num /= 10;
		}
		
		if(result == num) {
			System.out.println(num+" is armstrong");
		}
		else {
			System.out.println(num+" is not armstrong");
		}

	}

}
