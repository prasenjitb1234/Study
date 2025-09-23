package com.practice;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("Before swapping : num1 & num2 : "+ num1 +" " + num2);
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("After swapping : : num1 : "+ num1);
		System.out.println("After swapping : : num2 : "+num2);
		
	}

}
