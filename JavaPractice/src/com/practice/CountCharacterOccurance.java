package com.practice;

public class CountCharacterOccurance {

	public static void main(String[] args) {
		String s = "Java Programming Java OOPs";
		
		int totalcount = s.length(); 
		
		int totalcount_afterRemove =  s.replace("a", "").length();
		
		int count = totalcount - totalcount_afterRemove;
		
		System.out.println("Number of occurances of a is : "+count);

	}

}
