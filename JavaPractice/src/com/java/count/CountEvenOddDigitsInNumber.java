package com.java.count;

import java.util.Scanner;

public class CountEvenOddDigitsInNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		// 1 extracting last digit from num ...
		// 2 check if even odd ,, increast even odd count
		// 3 divide and extract using modular division operator

		
		
		int num = 1234; 

		int even_count = 0;
		int odd_count = 0;
		
		while(num>0)   // 1234   123  12  1
		{ 
			int rem = num  % 10;  // 4  3  2  1
			
			if(rem % 2==0)
			{
				even_count++;   // 1   2 
			}else {
				odd_count++;   // 1  2 
			}
			
			num = num / 10;  // 123   12  1  0
		}
		
		System.out.println("Number of even numbers: "+even_count);
		System.out.println("Number of odd numbers: "+odd_count);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}
}
