package com.practice;

import java.util.Random;

public class GenerateRandomNumberAndStrings {

	public static void main(String[] args) {
		
//		Approach 1 
		Random rand = new Random();
		
		// number - int 
		int rand_int = rand.nextInt(11); // 0 to 10
		System.out.println(rand_int);
		
//		double rand_dbl = rand.nextDouble(); //  range 0.0 to 1.0
//		System.out.println(rand_dbl);
		
		// Approach 2 - Math 
		
//		System.out.println(Math.random());
		
		
		
	}

}
