package com.java.count.sum;
import java.util.Scanner;
public class SumofDigitsInNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		// num = 1234 
		// sum = 0
		// get last digit from num   ... num %10
		// add that digit in existing sum   
		// extract rest of num ...  num / 10
		
		
		int num = 1234;
		int sum = 0;
		
		while(num > 0) {  // 12
			// extract last digit 
			sum  = sum + num % 10;  // 4+3+2+1  
			num = num /10;   		 // 123 12 1 0
			
		}
		System.out.println("sum of digits: "+sum);
		
		
		
		
		
		
		
		
	}
}
