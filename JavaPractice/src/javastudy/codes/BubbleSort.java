package javastudy.codes;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		
		int arr[] = {10,2,5,1,4,9,7,6,8,3};
		
		
		System.out.println("Before sort : "+Arrays.toString(arr));
		
		for(int i = 0 ;i<arr.length - 1;i++) {
			for(int j = 0;j<arr.length - 1;j++) {
				if(arr[j] > arr[j + 1]) {
					// swap
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
		System.out.println("After sorting: "+Arrays.toString(arr));
		
		
	}
}
