package com.java.practice;

public class countCharacterOccurances1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "India is the greatest country in the world";
		
		int total_count =  s.length();
		
		
		
		int total_count_afterRemove = s.replace("i", "").length();
		
		int count = total_count - total_count_afterRemove ;
		
		System.out.println(count);
		
		

	}

}
