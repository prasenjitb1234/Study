package com.practice.one;

import java.util.Scanner;

public class ReplaceSubstringInString {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		String s = sc.nextLine();
		System.out.println("Enter String to be Replaced : ");
		String oldString = sc.nextLine();
		System.out.println("Enter new String : ");
		String newString = sc.nextLine();
		
		String replaceString = s.replace(oldString,newString);
		System.out.println("New String is : "+replaceString);
		
		
		
		
		
	}
}
