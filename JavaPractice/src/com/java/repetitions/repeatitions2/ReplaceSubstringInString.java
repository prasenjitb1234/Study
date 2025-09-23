package com.java.repetitions.repeatitions2;

import java.util.Scanner;

public class ReplaceSubstringInString {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string : ");
		String s1 = sc.nextLine();
		
		System.out.println("Enter string to be replaced : ");
		String old_string = sc.nextLine();
		
		System.out.println("Enter new String : ");
		String new_string = sc.nextLine();
		
		String replaced_string = s1.replace(old_string, new_string);
		System.out.println("The new String is : "+replaced_string);
		
		
		
	}
}
