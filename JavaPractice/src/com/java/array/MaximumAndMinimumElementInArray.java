package com.java.array;

public class MaximumAndMinimumElementInArray {

	public static void main(String[] args) {
		
		
		int a[] = {50,30,40,20,60,70};
		
		
		
		// first declare first index as maximum 
		int max = a[0];  // 50 
		
		for(int i=1;i<a.length;i++)  //  30 > 50   40> 50f
		{
			// check if arrayElement is greater than our max 
			if(a[i]> max) {
				max = a[i];  //  50 50 60 70
			}
		}
		
		System.out.println("maximum element in array is : "+max);
		
		
		
		
		
//		**********************************************
//		find minimum element in array : 

		int min = a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("Minimum element is : "+min);
		
		
		
		
		
		
		
		
	}

}
