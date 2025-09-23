package com.practice;

public class RemoveJunk {

	public static void main(String[] args) {
		
		String s = "@#%$!^&*()_+1234ABCabc<>?/.,;:~`|}{][";
		
		s = s.replaceAll("[^a-zA-Z0-9]","");
		
		System.out.println(s);

	}

}
