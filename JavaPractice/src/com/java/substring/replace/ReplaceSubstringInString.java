package com.java.substring.replace;

import java.util.Scanner;

public class ReplaceSubstringInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string : ");
		String s1 = sc.nextLine();
		System.out.println("Enter String to be replaced : ");
		String old_string = sc.nextLine();
		System.out.println("Enter new String : ");
		String new_string = sc.nextLine();

		String replaceString = s1.replace(old_string, new_string);
		System.out.println("New String is : " + replaceString);

	}

}
