package com.ExceptionHandling.mechanisms;

public class FinallyBlockDemo {
	public static void main(String[] args) {

		try {

			int a = 100, b = 2, c;
			c = a / b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println("Exception : " + e);
		} finally {
			
			System.out.println("I'm in finally block");
		}

		

		
		
		
	}
}
