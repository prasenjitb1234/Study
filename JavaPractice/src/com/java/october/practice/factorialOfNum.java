package com.java.october.practice;

import java.util.Scanner;

public class factorialOfNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = 5;
		
		long factorial = 1;
		
		for(int i=1;i<=num;i++) {
			factorial = factorial * i;
		}
		System.out.println("factorial of num : "+factorial);

	}

}
