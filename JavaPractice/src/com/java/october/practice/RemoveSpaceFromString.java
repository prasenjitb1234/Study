package com.java.october.practice;

public class RemoveSpaceFromString {

	public static void main(String[] args) {
		
		String str = "My 	Name 		    is Prasenjit		Bhosale";
		System.out.println("Before Remove : "+str);
		
		str = str.replaceAll("[\\s]", "");
		System.out.println("After remove : "+str);

	}

}
