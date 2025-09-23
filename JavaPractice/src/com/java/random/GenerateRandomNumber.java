package com.java.random;

import java.util.Random;
import java.util.Scanner;

public class GenerateRandomNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
//		********************
		// Approach 1 - ramdom class  , is best 
		
		
		 
		Random rand = new Random();
		int rand_int = rand.nextInt(10);
		System.out.println(rand_int);
		
		
		
		
//		**********************
		
//		Approach 2  - Math class 
		
//		System.out.println(Math.random()); 
		
//		***********************
		
		
		
//		Approach 3 - Apache common-lang API
//		http://commons.apache.org/    
//		used for projects, download jar file 
		
		
		/*
		String randNum = RandomStringUtils.randomNumberic(10);
		System.out.println(randNum);
		*/
		
//		************************
		
		
	}
}
