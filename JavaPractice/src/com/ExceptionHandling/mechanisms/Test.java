package com.ExceptionHandling.mechanisms;

import java.io.FileInputStream;

public class Test {
	public static void main(String[] args) {

		/*
		 * try { FileInputStream fis = new FileInputStream("d:/abc.txt"); } catch
		 * (Exception e) {
		 * 
		 * System.out.println(e); }
		 * 
		 * System.out.println(" \n Hello,  this is after catch block");
		 * 
		 */
		
//			------------------------
		
		/*
		 * try { Class.forName("com.mysql.jdbc.Driver"); } catch (Exception e) {
		 * 
		 * System.out.println(e); }
		 * System.out.println(" \n Hello this is after catch block ");
		 * 
		 * 
		 */

		try {

			int a = 100;
			int b = 0;
			int c = a / b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			
			e.printStackTrace();
			
			
//			System.out.println(e);
//			System.out.println(e.toString());
//			System.out.println(e.getMessage());
		}
		System.out.println("Hello , this is after exception handling");
		
		
		
//		----- what catch block elements do ---- : 
//		System.out.println(e);: Prints the exception type and message (e.g., java.lang.ArithmeticException: / by zero).
//		System.out.println(e.toString());: Equivalent to e when printed; includes exception type and message.
//		System.out.println(e.getMessage());: Prints only the exception message (/ by zero).

	}
}
