package com.java.repetitions.repeatitions2;

public class FactorialofNum {
	public static void main(String[] args) {
		
		int num = 5;
		
		long factorial = 1;
		
		for(int i=1;i<=num;i++) {
			factorial = factorial * i;
		}
		
		System.out.println("factorial : "+factorial);  
		//  5! = 5 x 4 x 3 x 2 x 1 => 120
		
	}
}
