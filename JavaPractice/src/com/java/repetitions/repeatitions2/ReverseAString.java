package com.java.repetitions.repeatitions2;

public class ReverseAString {
	public static void main(String[] args) {
		
		String str = "hello";
		
		String rev = "";
		
		int len = str.length();
		
		for(int i=len - 1;i>=0;i--) {
			rev = rev + str.charAt(i);
		}
		
		System.out.println("reversed String is : "+rev);
		
		
	}
}
