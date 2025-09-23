package com.java.array;

public class MissingNumberInArray {

	public static void main(String[] args) {
		
		// array should not contain any duplicates 
		// array no need to be in sorted order
		// values should be in range 
		
		
		int a[] = {1,2,4,5};
		
		// 1 + 2 + 4 + 5 = 12     sum1  .. sum of elements in array 
		// 1 + 2 + 3 + 4 + 5 = 15 	sum2  .. sum of values within range
		// sum2 - sum1 = 3 ... missing number 
		
		
		int sum1 = 0;
		for(int i=0;i<a.length;i++) {
			sum1 = sum1 + a[i];
		}
		System.out.println("sum of elements in array : "+sum1);
		
		
		int sum2 = 0;
		for(int i=1;i<=5;i++) {
			sum2 = sum2 + i;
		}
		
		System.out.println("sum of range of elements "+sum2);
		
		System.out.println("Missing number is : "+(sum2-sum1));
		
		
		
		

	}

}
