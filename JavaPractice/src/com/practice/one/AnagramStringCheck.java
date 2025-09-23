package com.practice.one;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramStringCheck {
	
	public static boolean isAnagram(String s1,String s2) {
		String str1 = s1.replaceAll("\\s", "");
		String str2 = s2.replaceAll("\\s","");
		
		if(str1.length() != str2.length()) {
			return false;
		}
		else {
			char c1[] = str1.toLowerCase().toCharArray();
			char c2[] = str2.toLowerCase().toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			return Arrays.equals(c1, c2);
			
		}
		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First String : ");
		String s1 = sc.next();
		
		System.out.println("Enter Second String : ");
		String s2 = sc.next();
		
		boolean status = isAnagram(s1,s2);
		
		if(status) {
			System.out.println(s1+" and "+s2+" are Anagram");
		}else {
			System.out.println(s1+" and "+s2 +" are NOT Anagram");
		}
		
		
		
		
		
		
	}
}
