package javastudy.practice;

public class FindMissingNumberInArray {
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,8,9,10};
		
		int n = arr.length + 1;
		
		int sum1 = 0;
		for(int i = 0;i<arr.length;i++) {
			sum1 = sum1 + arr[i];
		}
		
		int sum2 = n * (n + 1)/2;
		
		int missingNum = sum2 - sum1;
		
		System.out.println("missing number is : "+missingNum);
		
	}
}
