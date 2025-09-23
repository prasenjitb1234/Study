package com.practice.June_25.Problems;

import java.util.Scanner;

public class ReverseAString {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// wap to reverse a string 
		
		System.out.println("Enter a string to reverse : ");
		String str = sc.nextLine();
		
		String rev = "";
		
		int len = str.length();
		
		for(int i=len - 1;i>=0;i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println("Reversed String is : "+rev);
		
		
		
		
	}
}
