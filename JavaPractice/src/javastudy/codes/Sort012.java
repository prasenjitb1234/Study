package javastudy.codes;

public class Sort012 {

	public static void dutch(int arr[]) {

		int zero = 0;
		int one = 0;
		int two = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				zero++;
			}
			if (arr[i] == 1) {
				one++;
			}
			if (arr[i] == 2) {
				two++;
			}
		}

		for (int i = 0; i < zero; i++) {
			arr[i] = 0;
		}
		for (int i = zero; i < one + zero; i++) {
			arr[i] = 1;
		}
		for (int i = one + zero; i < arr.length; i++) {
			arr[i] = 2;
		}

	}

	public static void main(String[] args) {
		// dutch national flag
		int arr[] = { 1, 1, 1, 0, 2, 0, 2, 0, 2 };
		
		// call function
		dutch(arr);
		
		// print sorted array 
		
		for(int num : arr) {
			System.out.print(num+" ");
		}
		
	}
}
