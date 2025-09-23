package com.java.extra;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		
		
	String str = "Java  Programming        selenium  automation";
	System.out.println("before removing white spaces: "+str);
	str = str.replaceAll("[\\s]", "");
	
	System.out.println("After removing white spaces: "+str);
	
	
		

	}

}
