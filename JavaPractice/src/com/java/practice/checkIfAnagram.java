package com.java.practice;

import java.util.Arrays;
import java.util.Scanner;

public class checkIfAnagram {

	public static boolean isAnagram(String s1, String s2) {
		
		String str1 = s1.replace("\\s","");
		String str2 = s2.replace("\\s", "");
		
		if(str1.length() != str2.length()) {
			return false;
		}
		
		char c1[] = str1.toLowerCase().toCharArray();
		char c2[] = str2.toLowerCase().toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		return Arrays.equals(c1, c2);
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first string : ");
		String s1 = sc.next();
		System.out.println("Enter second string : ");
		String s2 = sc.next();
		
		boolean status = isAnagram(s1,s2);
		
		if(status == true) {
			System.out.println(s1 + " and  "+s2+" are Anagram ");
		}
		else {
			System.out.println(s1 + " and  "+s2+" are NOT !  Anagram ");
		}
	}

}
