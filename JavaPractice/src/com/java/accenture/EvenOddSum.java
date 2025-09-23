package com.java.accenture;

import java.util.Scanner;

public class EvenOddSum {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int num[] = {1,2,3,4,5,6};
//					 0 1 2 3 4 5
		
		int even = 0;
		int odd = 0;
		
		for(int i=0;i<num.length;i++) {
			if(i%2==0) {
				even += num[i];
			}
			else {
				odd += num[i];
			}
		}
		
		System.out.println("Even index positions sum  : "+even);
		System.out.println("Odd index positions sum : "+odd);
	}
}
