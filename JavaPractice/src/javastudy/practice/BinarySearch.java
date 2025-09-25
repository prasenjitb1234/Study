package javastudy.practice;

public class BinarySearch {
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		
		int target = 7;
		
		int low = 0;
		int high = arr.length - 1;
		
		boolean status = false;
		while(low<=high) {
			int mid = low + (high - low)/2;
			
			if(arr[mid] == target) {
				System.out.println(target+" found at index : "+mid);
				status = true;
				break;
			}
			else if(arr[mid] < target) {
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
		}
		
		if(!status) {
			System.out.println(target+" Element not found in Array !");
		}
		
		
	}
}
