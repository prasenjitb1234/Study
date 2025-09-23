package com.practice.cognizantExamPractice;

import java.util.Scanner;

public class reverseAString {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String  to Reverse : ");
		String s = sc.nextLine();
		
		String rev = "";
		
		int len = s.length();
		
		for(int i=len - 1;i>=0;i--) {
			rev = rev + s.charAt(i);
		}
		
		System.out.println("Reversed  String is : "+rev);
		
		
		
	}
}
