package javastudy.practice;

public class BubbleSort {
	public static void main(String[] args) {
		
		int arr[] = {10,1,5,9,3,6,4,2,7,8};
		
		
		for(int i = 0;i<arr.length - 1;i++) {
			for(int j = 0;j<arr.length - 1;j++) {
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println("Sorted array is : ");
		for(int i= 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		
		
	}
}
