package com.GFG.array;

import java.util.Arrays;

public class moveNegativetoOneSide {

	public static void main(String[] args) {
		int arr[] = {-1,2,-3,4,5,6,-7,8,9,-6,3};
		
		int left = 0;
		int right = arr.length-1;
		
		while(left < right) {
			while(arr[left]<0) {
				left++;  //left +ve
			}
			while(arr[right]>0) {
				right--; // right -ve
			}
			
			// left right
			if(left>=right) {
				break;
			}
			
			// swap
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
