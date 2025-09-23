package com.java.repetitions.repeatitions2;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		
		int orgNum = num;
		int remainder = 0;
		int result = 0;
		
		while(orgNum != 0) {
			remainder = orgNum % 10;
			result += Math.pow(remainder, 3);
			orgNum = orgNum / 10;
		}
		
		if(result == num) {
			System.out.println(num+" is armstrong number");
		}
		else {
			System.out.println(num+" is Not armstrong number");
		}
		
	}
}
