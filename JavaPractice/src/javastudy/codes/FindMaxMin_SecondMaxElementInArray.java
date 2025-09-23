package javastudy.codes;

public class FindMaxMin_SecondMaxElementInArray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		System.out.println("Max element is : " + max);

		int secondmax = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > secondmax && arr[i] < max) {
				secondmax = arr[i];
			}
		}

		System.out.println("SecondMax element is : " + secondmax);

		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}

		System.out.println("min element is : " + min);

	}

}
