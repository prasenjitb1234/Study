package com.GFG;

public class findPeakElement {

	public static void main(String[] args) {
		int arr[]  = {4,2,5,7,8,2,9};
		
		int n = arr.length;
		
		
		int peak = peakElement(arr, n);
        System.out.println("Peak Element index: " + peak + ", Value: " + arr[peak]);
		
	}
	
	public static int peakElement(int arr[], int n) {
		
		int low = 0;
		int high = n-1;
		
		while(low < high) {
			int mid = low + (high-low)/2;
			
			if(arr[mid] > arr[mid+1]) {
				high = mid;
			}
			else {
				low = mid +1;
			}
			
		}
		
		
		return low;
	}

}

//output
//Peak Element index: 6, Value: 9

