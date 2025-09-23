package com.java.array;

import java.util.Scanner;

public class SumofElementsInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a[] = {5,2,7,9,6};     // n-5  			n-1 = 4
		
		int sum = 0;
		
		for(int i=0;i<=a.length-1;i++)  // 0 1 2 3 4   .5 //  a.length will return 5.. exactly 4
		{
			sum = sum + a[i]; // 5+2+7+9+6
			
		}
		System.out.println("sum of array elements:"+sum);
		
		

	}

}
