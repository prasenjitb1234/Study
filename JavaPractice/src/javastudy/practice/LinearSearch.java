package javastudy.practice;

public class LinearSearch {
	public static void main(String[] args) {
		
		int arr[] = {10,2,5,4,1,8,9,6,3,7};
		
		int target = 6;
		
		// linear search
		
		boolean status = false;
		
		for(int i = 0;i<=arr.length;i++) {
			if(arr[i] == target) {
				System.out.println(target+" found at index : "+i);
				status = true;
				break;
			}
		}
		
		if(status == false) {
			System.out.println(target+" not found in array !");
		}
		
		
	}
}
