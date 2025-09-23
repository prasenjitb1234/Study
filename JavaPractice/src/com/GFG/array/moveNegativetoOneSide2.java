package com.GFG.array;
import java.util.*;
public class moveNegativetoOneSide2 {

	public static void main(String[] args) {
		int arr[] = {-1,2,-3,4,5,6,-7,8,9,-6,3};
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] <0) {
				if(i!=j) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				j++;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
