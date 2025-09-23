package com.java.october.practice;

import java.util.Scanner;

public class CountCharacterInString {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		
		String str = "Accenture is mine";
		
		int count = 0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println(count);
	}
}
