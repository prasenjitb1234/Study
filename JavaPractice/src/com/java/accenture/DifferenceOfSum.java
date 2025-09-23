package com.java.accenture;

import java.util.Scanner;

//******Question **************
//implement the following function def DifferenceofSum(n,m)
// find the sum of numbers range from 1 to m(both inclusive)that are not divisible by n.
// return diff. betn sum of integers not divisible by n , with sum of numbers divisible by n.
//***********************

public class DifferenceOfSum {
	
	public static int differenceofSums(int m,int n) {
		int sum1 = 0; 
		int sum2 = 0;
		for(int i=1;i<=m;i++) {
			if(i%n==0) {
				sum1 = sum1 + i;
			}else {
				sum2 = sum2 + i;
			}
		}
		return Math.abs(sum1 - sum2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		System.out.println(differenceofSums(m,n));
		

	}

}
