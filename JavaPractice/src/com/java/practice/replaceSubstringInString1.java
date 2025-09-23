package com.java.practice;

import java.util.Scanner;

public class replaceSubstringInString1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter string : ");
		String s1 = sc.next();
		System.out.println("Enter string to be replaced : ");
		String oldString = sc.next();
		System.out.println("Enter new String : ");
		String newString = sc.next();
		
		String replaceString = s1.replace(oldString, newString);
		
		System.out.println("new String is : "+replaceString);
		
		

	}

}
